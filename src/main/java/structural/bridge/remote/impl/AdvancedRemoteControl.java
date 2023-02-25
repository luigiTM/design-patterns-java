package structural.bridge.remote.impl;

import structural.bridge.device.Device;

public class AdvancedRemoteControl extends BasicRemoteControl {

    public AdvancedRemoteControl(Device device) {
        super.device = device;
    }

    public void mute() {
        System.out.println("Remote: mute");
        device.setVolume(0);
    }
}
