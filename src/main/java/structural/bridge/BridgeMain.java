package structural.bridge;

import structural.bridge.device.Device;
import structural.bridge.device.impl.Radio;
import structural.bridge.device.impl.TV;
import structural.bridge.remote.impl.AdvancedRemoteControl;
import structural.bridge.remote.impl.BasicRemoteControl;

public class BridgeMain {

    public static void main(String[] args) {
        testDevice(new TV());
        testDevice(new Radio());
    }

    public static void testDevice(Device device) {
        System.out.println("Tests with basic remote.");
        BasicRemoteControl basicRemote = new BasicRemoteControl(device);
        basicRemote.power();
        device.printStatus();

        System.out.println("Tests with advanced remote.");
        AdvancedRemoteControl advancedRemote = new AdvancedRemoteControl(device);
        advancedRemote.power();
        advancedRemote.mute();
        device.printStatus();
    }

}
