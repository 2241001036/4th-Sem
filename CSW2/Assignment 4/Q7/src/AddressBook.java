import java.util.Iterator;
import java.util.TreeMap;

public class AddressBook {
    public static void main(String[] args) {
        TreeMap<String, Address> addressBook = new TreeMap<>();
        addressBook.put("Aryan", new Address("103", "RB", "Jatni"));
        addressBook.put("Danish", new Address("102", "DB", "Cuttack"));
        addressBook.put("Aman", new Address("101", "MR", "Rourkela"));
        System.out.println("Address details:");
        Iterator<String> iterator = addressBook.keySet().iterator();
        while (iterator.hasNext()) {
            String name = iterator.next();
            Address address = addressBook.get(name);
            System.out.println(name + ": " + address);
        }
    }
}
