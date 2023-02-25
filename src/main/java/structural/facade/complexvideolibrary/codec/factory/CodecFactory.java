package structural.facade.complexvideolibrary.codec.factory;

import structural.facade.complexvideolibrary.VideoFile;
import structural.facade.complexvideolibrary.codec.Codec;
import structural.facade.complexvideolibrary.codec.impl.MPEG4CompressionCodec;
import structural.facade.complexvideolibrary.codec.impl.OggCompressionCodec;

public class CodecFactory {
    public static Codec extract(VideoFile file) {
        String type = file.getCodecType();
        if (type.equals("mp4")) {
            System.out.println("CodecFactory: extracting mpeg audio...");
            return new MPEG4CompressionCodec();
        } else {
            System.out.println("CodecFactory: extracting ogg audio...");
            return new OggCompressionCodec();
        }
    }
}
