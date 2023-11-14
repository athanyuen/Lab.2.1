import org.junit.jupiter.api.Test;

import java.sql.SQLOutput;
import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;
public class StoreTester {
    @Test
    public void addBookTest(){
        Store s = new Store();
        Book b = new Book("A", "hk", 100, "description", 1000, "11/9/2001", "Athan", "12345", "1");
        s.addBook(b);
        assertFalse(s.isEmpty());
    }

    @Test
    public void testAddPhoneAndBook(){
        Store s = new Store();
        Book b = new Book("A", "hk", 100, "description", 1000, "11/9/2001", "Athan", "12345", "1");
        Phone p = new Phone("Athan's phone", "hk", 1000, "description", 8, "Iphone 11", "operating system", "Apple", "CSL", 5);
        s.addBook(b);
        s.addPhone(p);
        assertFalse(s.isEmpty());
    }
    @Test
    public void testUpdatePhonesLocation(){
        Store s = new Store();
        Phone one = new Phone("Athan's phone", "hk", 1000, "description", 8, "Iphone 11", "operating system", "Apple", "CSL", 5);
        Phone two = new Phone("Athan's phone2", "hk", 1000, "description", 8, "Iphone 11", "operating system", "Apple", "CSL", 5);
        Phone three = new Phone("Athan's phone3", "hk", 1000, "description", 8, "Iphone 11", "operating system", "Apple", "CSL", 5);
        s.addPhone(one);
        s.addPhone(two);
        s.addPhone(three);
        s.updatePhonesLocation("Room 514");
        ArrayList<Phone> phoneArrayList = s.getAllPhones();
        for(Phone p : phoneArrayList){
            assertEquals(p.getLocation(), "Room 514");
        }
    }
    @Test
    public void testGetItems(){
        Store s = new Store();
        Phone one = new Phone("Athan's phone", "hk", 1000, "description", 8, "Iphone 11", "operating system", "Apple", "CSL", 5);
        Phone two = new Phone("Athan's phone2", "hk", 1000, "description", 8, "Iphone 11", "operating system", "Apple", "CSL", 5);
        Phone three = new Phone("Athan's phone3", "hk", 1000, "description", 8, "Iphone 11", "operating system", "Apple", "CSL", 5);
        Book bookOne = new Book("A", "hk", 100, "description", 1000, "11/9/2001", "Athan", "12345", "1");
        Book bookTwo = new Book("B", "hk", 100, "description1", 1000, "11/9/2001", "Athan", "12345", "1");
        s.addPhone(one);
        s.addPhone(two);
        s.addPhone(three);
        s.addBook(bookOne);
        s.addBook(bookTwo);
        ArrayList<CISItem> bookArrayList = s.getItems("Book");
        ArrayList<CISItem> phoneArrayList = s.getItems("Phone");
        for(CISItem phones : phoneArrayList){
            assertEquals(phones.getClass(), one.getClass());
        }
        for(CISItem books : bookArrayList){
            assertEquals(books.getClass(), bookOne.getClass());
        }
    }
    @Test
    public void testUpdateItems(){
        Store s = new Store();
        Book b = new Book("A", "hk", 100, "description", 1000, "11/9/2001", "Athan", "12345", "1");
        Phone p = new Phone("Athan's phone", "hk", 1000, "description", 8, "Iphone 11", "operating system", "Apple", "CSL", 5);
        s.addBook(b);
        s.addPhone(p);
        s.updateItems("Book", "location", "Room 514");
        s.updateItems("Book", "price", "300");
        s.updateItems("Phone", "name", "B");
        s.updateItems("Phone", "description", "newDescription");
        assertEquals("Room 514", b.getLocation());
        assertEquals(300, b.getPrice());
        assertEquals("B", p.getName());
        assertEquals("newDescription", p.getDescription());
    }


}
