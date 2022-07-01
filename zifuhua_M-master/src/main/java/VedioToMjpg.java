import org.jim2mov.core.DefaultMovieInfoProvider;
import org.jim2mov.core.Jim2Mov;
import org.jim2mov.core.MovieInfoProvider;
import org.jim2mov.core.MovieSaveException;
import video.Flash;
import video.Video;
import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.LinkedList;
import java.util.List;

public class VedioToMjpg {
    public static void main(String[] args) throws IOException, MovieSaveException {


        String videoPath,mp3Path;
        videoPath = "D:\\Users\\15433\\Downloads\\Video\\output.video";
        mp3Path="D:\\Users\\15433\\Downloads\\Video\\output.mp3";
        Video video  = new Video(videoPath);
        DefaultMovieInfoProvider dmip = new DefaultMovieInfoProvider("output.mjpg");//生成视频的名称
        dmip.setFPS((float) video.rate);
        dmip.setNumberOfFrames(video.ftp);
        dmip.setMWidth(video.width);
        dmip.setMHeight(video.height);
        int width=video.width;
        int height=video.height;
        BufferedImage bfi=new BufferedImage(width, height,
                BufferedImage.TYPE_INT_RGB);
        new Jim2Mov(frame -> {
            try {
                BufferedImage bi=flashs2img(video,frame,bfi);
                ByteArrayOutputStream out=new ByteArrayOutputStream();
                ImageIO.write(bi,"jpeg",out);
                return out.toByteArray();
            } catch (IOException e) {
                e.printStackTrace();
            }
            return null;
        }, dmip, null).saveMovie(MovieInfoProvider.TYPE_AVI_MJPEG);
    }
    public static BufferedImage flashs2img(Video video,int frame,BufferedImage bi){
        int width=video.width;
        int height=video.height;
        Flash flash=video.flashs.get(frame);
        String str=flash.getAsciiImage();
        Graphics g2 = bi.createGraphics();
        g2.setColor(Color.WHITE);
        g2.fillRect(0, 0, width, height);
        g2.setColor(Color.BLACK);
        int wsize= width/video.wsize+5;
        g2.setFont(new Font("宋体", Font.BOLD,wsize));
        String[] strs=str.split("\n");
        int n=strs.length,m=strs[0].length();

        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                g2.drawString(String.valueOf(strs[i].charAt(j)),j*(width)/m,i*(height)/n);
            }
        }
        return bi;
    }
    public static List<BufferedImage> flashs2img(Video video){
        int width=video.width;
        int height=video.height;
        List<BufferedImage> ret=new LinkedList<>();
        for(Flash flash:video.flashs){
            String str=flash.getAsciiImage();
            BufferedImage bi = new BufferedImage(width, height,
                    BufferedImage.TYPE_INT_RGB);
            Graphics g2 = bi.createGraphics();
            g2.setColor(Color.WHITE);
            g2.fillRect(0, 0, width, height);
            g2.setColor(Color.BLACK);
            int wsize= width/video.wsize+5;
            g2.setFont(new Font("宋体", Font.BOLD,wsize));
            String[] strs=str.split("\n");
            int n=strs.length,m=strs[0].length();

            for(int i=0;i<n;i++){
                for(int j=0;j<m;j++){
                    g2.drawString(String.valueOf(strs[i].charAt(j)),j*(width)/m,i*(height)/n);
                }
            }
            ret.add(bi);
        }
        return ret;

    }
}
