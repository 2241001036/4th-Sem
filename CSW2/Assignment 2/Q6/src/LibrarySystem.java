import java.time.Duration;
import java.time.LocalDate;

public class LibrarySystem
{
    public static void main(String[] args)
    {
        Book B1 = new Book("The Psychology of Money", "Morgan Housel", 252);
        Magazine M1 = new Magazine("The New York Times Magazine", "Jake Silverstein", LocalDate.of(2023,01,01));
        DVD D1 = new DVD("Harry Potter", "J. K. Rowling", 1180);
        B1.displayDetails();
        M1.displayDetails();
        D1.displayDetails();
    }
}
