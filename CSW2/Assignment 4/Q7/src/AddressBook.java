import java.util.Iterator;
import java.util.TreeMap;

public class AddressBook {
    public static void main(String[] args) {
        TreeMap<String, Address> addressBook = new TreeMap<>();

        // Adding addresses to the TreeMap
        addressBook.put("John", new Address("123", "Main Street", "City A"));
        addressBook.put("Alice", new Address("456", "Broadway", "City B"));
        addressBook.put("Bob", new Address("789", "Oak Avenue", "City C"));

        // Using an iterator to display the TreeMap
        System.out.println("Address details:");
        Iterator<String> iterator = addressBook.keySet().iterator();
        while (iterator.hasNext()) {
            String name = iterator.next();
            Address address = addressBook.get(name);
            System.out.println(name + ": " + address);
        }
    }
}
