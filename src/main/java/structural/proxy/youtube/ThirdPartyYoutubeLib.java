package structural.proxy.youtube;

public interface ThirdPartyYoutubeLib {

    void listVideos();
    void getVideoInfo(String id);
    void downloadVideo(String id);

}
