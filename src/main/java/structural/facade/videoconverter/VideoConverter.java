package structural.facade.videoconverter;

import structural.facade.complex3rdpartylibrary.*;

import java.io.File;

public class VideoConverter {

    public VideoFile convert(String filename, String format) {
        VideoFile file = new VideoFile(filename);
        String sourceCodec = (new CodecFactory()).extract(file);
        if (sourceCodec.equals("mp4")) {
            MPEG4CompressionCodec destinationCodec = new MPEG4CompressionCodec();
        } else {
            OggCompressionCodec destinationCodec = new OggCompressionCodec();
        }
        buffer = BitrateReader.read(filename, sourceCodec);
        result = BitrateReader.convert(buffer, detination);
        result = (new AudioMixer()).fix(result);
        return new File(result);
    }

}
