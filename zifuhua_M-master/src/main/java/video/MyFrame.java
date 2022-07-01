package video;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.util.Date;
import java.util.List;
import javafx.scene.media.AudioClip;

public class MyFrame extends JFrame implements Runnable {

    // 取得屏幕的宽度
    int pwidth = Toolkit.getDefaultToolkit().getScreenSize().width-50;
    // 取得屏幕的高度
    int pheight = Toolkit.getDefaultToolkit().getScreenSize().height-50;
    int height;
    int width;
    Video video;
    Thread t = new Thread(this);
    long st;
    int zs;
    AudioClip ac;
    public MyFrame(Video video,AudioClip ac,String filepath) {
        zs=0;
        this.video = video;
        width=video.width;
        height=video.height;
        double sf=1;
        if(width>pwidth)sf=(width*1.0)/(pwidth-60);
        if(height>pheight)sf=Math.max(sf,(height*1.0)/(pheight-80));
        width=(int)(width/sf);
        height=(int)(height/sf);
        this.setTitle("洛天依是我老婆~");
        // 设置窗体大小
        this.setSize(Math.min(width+60,pwidth), Math.min(height+80,pheight));
        // 设置窗体出现位置
        this.setLocationRelativeTo(null);
        // 将窗体设置为大小不可改变
        //this.setResizable(false);
        // 将窗体的关闭方式设置为默认关闭后程序结束
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setBackground(Color.BLACK);
        this.setVisible(true);
        this.ac=ac;
        st=0;

        t.start();
        // 刷新屏幕,防止开始游戏时出现无法显示的情况.
        this.repaint();


    }

    /***
     * 使用了双缓冲技术防止屏幕闪烁
     * @param g
     */
    public void paint(Graphics g) {
        if(st<=0)
        {
            if(ac!=null)ac.play();
            st=new Date().getTime();
        }
        zs=(int)((new Date().getTime()-st)*video.rate/1000);
        if(zs>=video.ftp-5)return;
        String str=video.flashs.get(zs).asciiImage;
        BufferedImage bi = new BufferedImage(pwidth, pheight,
                BufferedImage.TYPE_INT_RGB);
        Graphics g2 = bi.createGraphics();
        g2.setColor(Color.WHITE);
        g2.fillRect(0, 0, pwidth, pheight);
        g2.setColor(Color.BLACK);
        int wsize= (width-60)/video.wsize+5;
        g2.setFont(new Font("宋体", Font.BOLD,wsize));
        String[] strs=str.split("\n");
        int n=strs.length,m=strs[0].length();

        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                g2.drawString(String.valueOf(strs[i].charAt(j)),30+j*(width)/m,40+i*(height)/n);
            }
        }
        g.drawImage(bi, 0, 0, this);
    }

    public void run() {
        // TODO Auto-generated method stub
        while (true) {
            this.repaint();
            try {
                Thread.sleep(30);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}