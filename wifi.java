interface SmartDevice {

    void connectWifi();

    default void deviceStatus() {
        System.out.println("Smart device is ready");
    }
}

class SmartTV implements SmartDevice {

    @Override
    public void connectWifi() {
        System.out.println("Smart TV connected to WiFi");
    }
}

class SmartWatch implements SmartDevice {

    @Override
    public void connectWifi() {
        System.out.println("Smart Watch connected to WiFi");
    }
}
class wifi {
    public static void main(String[] args) {

        SmartDevice s1 = new SmartTV();
        SmartDevice s2 = new SmartWatch();

        s1.connectWifi();
        s1.deviceStatus();

        s2.connectWifi();
        s2.deviceStatus();
    }
}
