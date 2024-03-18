import java.util.HashMap;
import java.util.Map;

public class Library
{
    public static void main(String[] args) {
        Map<Integer, Book> bookMap = new HashMap<>();
        Book book1 = new Book(1, "Java Programming", "John Doe", 5);
        Book book2 = new Book(2, "Python Programming", "Jane Smith", 3);
        bookMap.put(book1.getId(), book1);
        bookMap.put(book2.getId(), book2);
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
        int keyToRemove = 2; // Remove the book with ID 2
        bookMap.remove(keyToRemove);
        System.out.println("After removing book with ID " + keyToRemove + ":");
        for (Map.Entry<Integer, Book> entry : bookMap.entrySet())
        {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}
