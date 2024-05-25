package adapter;

public class Computer {

    public void readUsbDrive(UsbDrive usbDrive) {
        usbDrive.insert();
        System.out.println("Данные прочитаны");
    }
}
