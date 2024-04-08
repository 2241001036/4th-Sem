import java.util.HashMap;
import java.util.Map;
public class Library
{
    public static void main(String[] args) {
        Map<Integer, Book> bookMap = new HashMap<>();
        Book B1 = new Book(1, "Java Programming", "Mr. D", 5);
        Book B2 = new Book(2, "Python Programming", "Mr. S", 4);
        bookMap.put(B1.getId(), B1);
        bookMap.put(B2.getId(), B2);
        System.out.println("Collection of books in the library:");
        for (Map.Entry<Integer, Book> entry : bookMap.entrySet())
        {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
        // (a.) Check if a particular book name is present in the map
        String searchBookName = "Java Programming";
        boolean isBookPresent = false;
        for (Book book : bookMap.values()) {
            if (book.getName().equals(searchBookName)) {
                isBookPresent = true;
                break;
            }
        }
        System.out.println("Is book \"" + searchBookName + "\" present in the library? " + isBookPresent);

        // (b.) Remove the value associated with a particular key value which will remove the book entry
        int keyToRemove = 1;
        bookMap.remove(keyToRemove);
        System.out.println("After removing book with ID " + keyToRemove + ":");
        for (Map.Entry<Integer, Book> entry : bookMap.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}