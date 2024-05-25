package adapter;

public class UsbAdapter extends UsbDrive {

    private final MemoryCard memoryCard;

    public UsbAdapter(MemoryCard memoryCard) {
        this.memoryCard = memoryCard;
    }

    @Override
    public void insert() {
        memoryCard.insert();
    }
}
