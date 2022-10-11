package structural.bridge.device.impl;

import structural.bridge.device.Device;

public class TV implements Device {

    private boolean enabled = false;

    private byte volume = 0;

    private byte channel = 0;

    @Override
    public boolean isEnabled() {
        return enabled;
    }

    @Override
    public void enable() {
        enabled = true;
    }

    @Override
    public void disable() {
        enabled = false;
    }

    @Override
    public byte getVolume() {
        return volume;
    }

    @Override
    public void setVolume(byte percent) {
        this.volume = percent;
    }

    @Override
    public byte getChannel() {
        return channel;
    }

    @Override
    public void setChannel(byte channel) {
        this.channel = channel;
    }

}
