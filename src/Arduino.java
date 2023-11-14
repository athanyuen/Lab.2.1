public class Arduino extends ElectronicItem{
    private String version;
    public Arduino(String name, String location, int price, String description, int storageCapacity, String model, String operatingSystem, String maker, String version) {
        super(name, location, price,description, storageCapacity, model, operatingSystem, maker);
        this.version = version;
    }
}
