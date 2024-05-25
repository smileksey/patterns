package adapter;

public class Main {
    public static void main(String[] args) {

        Computer computer = new Computer();
        MemoryCard memoryCard = new MemoryCard();
        UsbAdapter usbAdapter = new UsbAdapter(memoryCard);

        computer.readUsbDrive(usbAdapter);
    }
}
