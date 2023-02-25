package structural.proxy.somecoolmedialibrary;

import structural.proxy.somecoolmedialibrary.video.Video;

import java.util.HashMap;

public interface  ThirdPartyYouTubeLib {
    HashMap<String, Video> popularVideos();

    Video getVideo(String videoId);
}
