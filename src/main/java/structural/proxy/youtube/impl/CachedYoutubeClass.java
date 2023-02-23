package structural.proxy.youtube.impl;

import structural.proxy.youtube.ThirdPartyYoutubeLib;

import java.util.List;

public class CachedYoutubeClass implements ThirdPartyYoutubeLib {

    private ThirdPartyYoutubeLib service;
    private List<String> listCache;
    private

    @Override
    public void listVideos() {

    }

    @Override
    public void getVideoInfo(String id) {

    }

    @Override
    public void downloadVideo(String id) {

    }

}
