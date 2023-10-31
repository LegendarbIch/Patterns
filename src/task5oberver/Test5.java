package task5oberver;

public class Test5 {
    public static void main(String[] args) {

        NetworkDevice networkDevice = new NetworkDevice();
        NetworkDevice networkDevice2 = new NetworkDevice();
        new Admin("1", networkDevice);
        new Admin("20", networkDevice2);

        networkDevice.work();

        networkDevice2.work();
    }
}
