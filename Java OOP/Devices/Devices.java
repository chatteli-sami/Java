public class Devices {
    protected int battery;

    public Devices() {
        battery = 100;
    }

    public void status() {
        System.out.println("Battery remaining:  " + battery);
    }
}