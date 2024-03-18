import java.util.HashMap;
import java.util.Map;
class Book {
    private int id;
    private String name;
    private String author;
    private int quantity;
    public Book(int id, String name, String author, int quantity) {
        this.id = id;
        this.name = name;
        this.author = author;
        this.quantity = quantity;
    }
    public int getId() {
        return id;
    }
    public String getName() {
        return name;
    }
    public String getAuthor() {
        return author;
    }
    public int getQuantity() {
        return quantity;
    }
    @Override
    public String toString() {
        return "Book[id=" + id + ", name=" + name + ", author=" + author + ", quantity=" + quantity + "]";
    }
}

