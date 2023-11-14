public class Phone extends ElectronicItem{
    private String networkType;
    private int screenSize;
    public Phone(String name, String location, int price, String description, int storageCapacity, String model, String operatingSystem, String maker, String networkType, int screenSize) {
        super(name, location, price,description, storageCapacity, model, operatingSystem, maker);
        this.networkType = networkType;
        this.screenSize = screenSize;
    }
}
