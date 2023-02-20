package structural.facade.complex3rdpartylibrary;

public class CodecFactory {
    public String extract(VideoFile file) {
        String[] split = file.getFilename().split(".");
        return split[split.length - 1];
    }
}
