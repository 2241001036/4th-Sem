import java.util.Scanner;
import java.util.TreeSet;

public class TreeSetOperations {
    public static void main(String[] args) {
        TreeSet<Integer> treeSet = new TreeSet<>();
        treeSet.add(5);
        treeSet.add(10);
        treeSet.add(15);
        treeSet.add(20);

        // (a.) Display the TreeSet
        System.out.println("TreeSet elements: " + treeSet);
        Scanner sc = new Scanner(System.in);

        // (b.) Ask the user to enter a number and search if it's present in the list
        System.out.print("Enter a number to search: ");
        int searchNumber = sc.nextInt();
        boolean isPresent = treeSet.contains(searchNumber);
        System.out.println("Is " + searchNumber + " present in the TreeSet? " + isPresent);

        // (c.) Remove an element from the TreeSet
        System.out.print("Enter the number to remove from the TreeSet: ");
        int numberToRemove = sc.nextInt();
        if (treeSet.contains(numberToRemove)) {
            treeSet.remove(numberToRemove);
            System.out.println("Number " + numberToRemove + " removed successfully.");
        } else
            {
            System.out.println("Number " + numberToRemove + " not found in the TreeSet.");
        }
        System.out.println("Updated TreeSet elements: " + treeSet);
    }
}
