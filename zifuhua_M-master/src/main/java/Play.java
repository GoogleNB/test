import javafx.scene.media.AudioClip;
import video.MyFrame;
import video.Video;

import java.io.File;

public class Play {
    public static void main(String[] args)  {


        String videoPath,mp3Path;
        videoPath = "E:\\SB\\11.video";
        mp3Path="E:\\SB\\22.mp3";
        Video video;


        video = new Video(videoPath);

        new MyFrame(video,
                new AudioClip(new File(mp3Path).toURI().toString())//该路径是播放音乐时的背景音乐的路径
                , videoPath.substring(0, videoPath.lastIndexOf("\\") + 1));
    }

}
//C:\Users\15433\Desktop\a.mp4