import java.util.HashSet;
public class Main {
    public static void printRepeatingIntegers(int[] arr) {
        HashSet<Integer> set = new HashSet<>();
        HashSet<Integer> repeatingElements = new HashSet<>();

        for (int num : arr) {
            if (!set.add(num)) {
                // If the number is already present in the set, it's a repeating element
                repeatingElements.add(num);
            }
        }

        System.out.println("Repeating elements in the array:");
        for (int num : repeatingElements) {
            System.out.println(num);
        }
    }

    public static void main(String[] args) {
        int[] array = {4, 2, 4, 5, 2, 3, 1, 5};
        printRepeatingIntegers(array);
    }
}
