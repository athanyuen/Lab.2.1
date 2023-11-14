import java.lang.reflect.Array;
import java.util.ArrayList;

public class Store {
    private ArrayList<CISItem> cisItems;
    public Store(){
        cisItems = new ArrayList<>();
    }
    public void addBook(Book book){
        cisItems.add(book);
    }
    public boolean isEmpty(){
        return cisItems.isEmpty();
    }
    public void addPhone(Phone phone){
        cisItems.add(phone);
    }
    public void updatePhonesLocation(String location){
        for(CISItem p : cisItems){
            if(p instanceof Phone){
                p.setLocation(location);
            }
        }
    }
    public ArrayList<Phone> getAllPhones(){
        ArrayList<Phone> phoneArrayList = new ArrayList<>();
        for(CISItem p : cisItems){
            if(p instanceof Phone){
                phoneArrayList.add((Phone) p);
            }
        }
        return phoneArrayList;
    }
    public ArrayList<CISItem> getItems(String itemType){
        ArrayList<CISItem> getItems = new ArrayList<>();
        for(CISItem item : cisItems){
            if(item.getClass().getSimpleName().equals(itemType)){
                getItems.add(item);
            }
        }
        return getItems;
    }
    public void updateItems(String itemType, String property, String value){
        for(CISItem item : cisItems){
            if(item.getClass().getSimpleName().equals(itemType)){
                if(property.equals("name")){
                    item.setName(value);
                }
                if(property.equals("location")){
                    item.setLocation(value);
                }
                if(property.equals("price")){
                    item.setPrice(Integer.parseInt(value));
                }
                if(property.equals("description")){
                    item.setDescription(value);
                }
            }
        }
    }
    public void showAllInfo(){
        for (CISItem item : cisItems){
            System.out.println(item);
        }
    }
    public void addItems(CISItem item){
        cisItems.add(item);
    }
}
