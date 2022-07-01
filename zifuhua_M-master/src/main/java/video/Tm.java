package video;

import java.util.LinkedList;
import java.util.List;
import java.util.Stack;
import java.util.concurrent.locks.ReentrantLock;

public class Tm implements Runnable{
    Video video;
    Flash flash;
    public static Stack<StringBuffer> bufferList=new Stack<>();
    public static int xcsl=10;
    public volatile static int using=0;
    public static ReentrantLock lock=new ReentrantLock();
    public Tm(Video video,Flash flash)
    {
        using++;
        this.flash=flash;
        this.video=video;
    }
    @Override
    public void run() {
        StringBuffer stringBuffer=null;
        while (stringBuffer==null){
            if(!bufferList.isEmpty()){
                lock.lock();
                if (!bufferList.isEmpty()){
                    stringBuffer=bufferList.peek();
                    bufferList.pop();
                }
                lock.unlock();
            }
        }
        stringBuffer.setLength(0);

        flash.asciiImage=Flash.createAsciiPic(flash.image,stringBuffer).toString();

        stringBuffer.setLength(0);
        lock.lock();
        bufferList.push(stringBuffer);
        lock.unlock();
        video.flashs.add(flash);
        using--;
    }
}
