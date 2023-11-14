public class CISItem {
    private String name;
    private String location;
    private int price;
    private String description;

    public CISItem(String name, String location, int price, String description){
        this.name =name;
        this.location = location;
        this.price = price;
        this.description = description;
    }
    public int getPrice() {
        return price;
    }
    public String getDescription() {
        return description;
    }
    public String getLocation() {
        return location;
    }
    public String getName() {
        return name;
    }
    public void setLocation(String location) {
        this.location = location;
    }
    public void setDescription(String description) {
        this.description = description;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setPrice(int price) {
        this.price = price;
    }
}
