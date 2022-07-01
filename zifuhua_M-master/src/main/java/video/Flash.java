package video;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.Serializable;
public class Flash implements Serializable {
    transient BufferedImage image;
    String asciiImage;
    static int size=100;
    int id;
    public Flash(BufferedImage image,int id)
    {
        this.id=id;
        this.image=image;
        this.asciiImage=createAsciiPic(image,new StringBuffer()).toString();
    }

    public String getAsciiImage() {
        return asciiImage;
    }

    public static StringBuffer createAsciiPic(BufferedImage image,StringBuffer ans) {
        image=compressImage(image);
        final String base = "@B%8&WM#*oahkbdpqwmZO0QLCJUYXzcvunxrjft/\\|()1{}[]?-_+~<>i!lI;:,\"^`'. ";// 字符串由复杂到简单
        int sl=0;
        for (int y = 0; y < image.getHeight(); y +=2) {
            for (int x = 0; x < image.getWidth(); x++) {
                final int pixel = image.getRGB(x, y);
                final int r = (pixel & 0xff0000) >> 16, g = (pixel & 0xff00) >> 8, b = pixel & 0xff;
                final float gray = 0.299f * r + 0.578f * g + 0.114f * b;
                int index = (int)(gray * (base.length() + 1) / 256);
                ans.append(index >= base.length() ? " " : String.valueOf(base.charAt(index)));
            }
            ans.append( "\n");
        }
        return ans;
    }
    public static BufferedImage compressImage(BufferedImage srcImg){
        int h =  srcImg.getHeight();
        int w = srcImg.getWidth();
        if(Math.max(h,w)<=size)
            return srcImg;
        int new_H;
        int new_W;
        if(w>h){
            new_W = size;
            new_H = size*h/w ;
        }else{
            new_H = size;
            new_W = size*w/h;
        }
        BufferedImage smallImg = new BufferedImage(new_W,new_H,srcImg.getType());
        Graphics g = smallImg.getGraphics();
        g.drawImage(srcImg,0,0,new_W,new_H,null);
        g.dispose();
        return smallImg;
    }
    public static int compare(Flash o1, Flash o2) {
        int i1 = o1.id;
        int i2 = o2.id;
        if (i1 < i2){
            return 1;
        }
        if (i1 > i2){
            return -1;
        }
        return 0;
    }
}



