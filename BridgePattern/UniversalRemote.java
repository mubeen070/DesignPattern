public class UniversalRemote extends BasicRemote {

    public UniversalRemote(Device device) {
        super(device);
    }

    @Override
    public void maxVolume() {
        device.setVolume(100);
    }
}
