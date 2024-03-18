import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
public class Main
{
    public static void main(String[] args)
    {
        ArrayListUser arrayListUser = new ArrayListUser();
        arrayListUser.addUser(new User("Alice", 25));
        arrayListUser.addUser(new User("Bob", 30));
        arrayListUser.addUser(new User("Charlie", 20));
        arrayListUser.printUsers();
        arrayListUser.sortByAge();
        System.out.println("\nSorted Users by Age:");
        arrayListUser.printUsers();
    }
}
