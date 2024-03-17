import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Strength:");
        int t = sc.nextInt();
        System.out.print("Roll No.");
        int r = sc.nextInt();
        System.out.print("Name:");
        String n = sc.next();
        Section CSE6 = new Section(t);
        CSE6.addStudent(r, n);
        CSE6.diplaySection();
        System.out.println();
    }
}
