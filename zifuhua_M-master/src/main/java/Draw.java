import javafx.scene.media.AudioClip;
import video.MyFrame;
import video.Video;

import java.io.File;

public class Draw {
    public static void main(String[] args) {
        String filepath;
        /**
         * 输入生成的video文件的路径或者个视频的路径
         * video是已完成渲染的视频，可立即启动
         * 其它视频需生成video文件后可启动
         */
        filepath = "D:\\Users\\15433\\Downloads\\Video\\output.mp4";
        Video video;

        video = new Video(new File(filepath));
        video.save(filepath.substring(0, filepath.lastIndexOf(".")));

    }
}