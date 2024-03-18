public class Main
{
    public static void main(String[] args)
    {
        Book B1 = new Book(1, "Java Programming", 25.99);
        Book B2 = new Book(2, "Python Programming", 29.99);
        if (B1.getPrice() > B2.getPrice())
        {
            System.out.println("Book 2 is cheaper than Book 1");
        }
        else if (B1.getPrice() < B2.getPrice())
        {
            System.out.println("Book 1 is cheaper than Book 2");
        }
        else
        {
            System.out.println("Both books have the same price");
        }
        System.out.println("Book 1: " + B1.toString());
        System.out.println("Book 2: " + B2.toString());
    }
}