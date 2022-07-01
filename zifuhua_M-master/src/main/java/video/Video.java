package video;

import org.bytedeco.javacv.FFmpegFrameGrabber;
import org.bytedeco.javacv.Frame;
import org.bytedeco.javacv.Java2DFrameConverter;
import java.awt.image.BufferedImage;
import java.io.*;
import java.util.*;
import java.util.concurrent.locks.ReentrantLock;

import javafx.scene.media.AudioClip;

public class Video implements Serializable {
    private static final long serialVersionUID= 3960073332674427191l;
    public double duration;
    public double rate;
    public int ftp;
    public int finterval;
    public int height;
    public int width;
    public int wsize;
    public File videoFile;
    public List<Flash> flashs;
    public String fileSavePath="D:/save/";
    int flag;

    static Java2DFrameConverter converter = new Java2DFrameConverter();
    public Video(File file)
    {
        videoFile=file;
        flashs=new ArrayList<Flash>();
        flag=0;
        init(file.getPath());

    }
    public Video(String filepath)
    {
        try {
            ObjectInputStream ois=new ObjectInputStream(new FileInputStream(filepath));
            Video video=(Video) ois.readObject();
            this.duration=video.duration;
            this.rate=video.rate;
            this.ftp=video.ftp;
            this.finterval=video.finterval;
            this.height=video.height;
            this.width=video.width;
            this.wsize=video.wsize;
            this.videoFile=video.videoFile;
            this.flashs=video.flashs;
            this.flag=video.flag;
            if(flag<ftp)init(filepath);

        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
    public void save(String filepath)
    {
        try {
            ObjectOutputStream oos=new ObjectOutputStream(new FileOutputStream(filepath+".video"));
            oos.writeObject(this);
            oos.close();
        } catch (FileNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
    public void init(String filepath)
    {
        Frame frame = null;
        FFmpegFrameGrabber fFmpegFrameGrabber = new FFmpegFrameGrabber(videoFile);
        Tm.bufferList.clear();
        while (Tm.bufferList.size()<Tm.xcsl){
            Tm.bufferList.add(new StringBuffer());
        }
        try {
            fFmpegFrameGrabber.start();
            ftp = fFmpegFrameGrabber.getLengthInFrames();
            rate=fFmpegFrameGrabber.getFrameRate();
            duration=ftp / rate;
            finterval=(int)(1000 /rate +0.5);
            System.out.println("时长 " + ftp / rate / 60);
            System.out.println("开始运行视频提取帧，耗时较长");

            frame = fFmpegFrameGrabber.grabImage();
            BufferedImage bfImg=FrameToBufferedImage(frame);
            height=bfImg.getHeight();
            width=bfImg.getWidth();
            wsize=Flash.compressImage(bfImg).getWidth();
            bfImg=null;
            //ftp=40;
            while (flag < ftp) {
                //获取帧
                frame = fFmpegFrameGrabber.grabImage();
                if(flag<flashs.size())continue;
                if(flag/1000>(flag-1)/1000)
                {
                    while (Tm.using>0)Thread.sleep(1000);
                    this.save(filepath+new Date().getTime());
                }
                if (frame != null) {
                    while (Tm.using>=Tm.xcsl)
                    {
                        System.out.println("已完成"+flashs.size()+"/"+ftp);
                        Thread.sleep(1000);
                    }
                    Thread t = new Thread(new Tm(this,new Flash(FrameToBufferedImage(frame),flag)));
                    t.start();
                    flag++;
                }
                else
                {
                    ftp--;
                }
                System.out.println("启动"+flag+"/"+ftp);
                System.gc();
            }

            while (flashs.size()<flag)
            {
                Thread.sleep(1000);
                System.out.println("已完成"+flashs.size()+"/"+flag);
            }
            flashs.sort((o1, o2) -> {
                int i1 = o1.id;
                int i2 = o2.id;
                if (i1 > i2){
                    return 1;
                }
                if (i1 < i2){
                    return -1;
                }
                return 0;
            });
            System.out.println("============运行结束============");
            fFmpegFrameGrabber.stop();
            this.save(filepath);

        } catch (IOException E) {
            E.printStackTrace();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    public static BufferedImage FrameToBufferedImage(Frame frame) {
        //创建BufferedImage对象
        return converter.getBufferedImage(frame);
    }
}
