public class Demo {
    public static void main(String[] args) {
        testDevice(new Tv());
        testDevice(new Radio());
        testDevice(new Ac());
    }

    public static void testDevice(Device device) {
        System.out.println("Tests with basic remote.");
        BasicRemote basicRemote = new BasicRemote(device);
        basicRemote.togglePower();
        basicRemote.volumeUp();
        basicRemote.channelUp();
        basicRemote.channelDown();
        device.printStatus();

        System.out.println("Tests with Advanced remote.\n");
        AdvancedRemote advancedRemote = new AdvancedRemote(device);
        advancedRemote.togglePower();
        advancedRemote.mute();
        advancedRemote.volumeUp();
        advancedRemote.channelUp();
        device.printStatus();

        System.out.println("Tests with Universal Remote.\n");
        UniversalRemote universalRemote = new UniversalRemote(device);
        universalRemote.maxVolume();
        device.printStatus();
    }
}
