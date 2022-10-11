package structural.bridge.device;

public interface Device {

    boolean isEnabled();

    void enable();

    void disable();

    byte getVolume();

    void setVolume(byte percent);

    byte getChannel();

    void setChannel(byte channel);

}
