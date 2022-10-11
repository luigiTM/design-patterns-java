package structural.bridge.remote;

import structural.bridge.device.Device;

public class RemoteControl {

    protected Device device;

    public RemoteControl(Device device) {
        this.device = device;
    }

    public void togglePower() {
        if (device.isEnabled()) {
            device.disable();
        } else {
            device.enable();
        }
    }

    public void volumeDown() {
        device.setVolume((byte) (device.getVolume() - 10));
    }

    public void volumeUp() {
        device.setVolume((byte) (device.getVolume() + 10));
    }

    public void channelDown() {
        device.setChannel((byte) (device.getChannel() - 1));
    }

    public void channelUp() {
        device.setChannel((byte) (device.getChannel() + 1));
    }

}
