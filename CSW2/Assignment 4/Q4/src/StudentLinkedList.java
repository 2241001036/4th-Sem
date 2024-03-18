import java.util.LinkedList;
import java.util.Scanner;
public class StudentLinkedList
{
    public static void main(String[] args)
    {
        LinkedList<Student> students = new LinkedList<>();
        students.add(new Student("Alice", 20, 85.5));
        students.add(new Student("Bob", 22, 75.0));
        students.add(new Student("Charlie", 21, 90.2));

        // (a.) Display the list
        System.out.println("List of students:");
        displayList(students);

        // (b.) Ask the user to enter a Student object and print its existence
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter details for the student to search (name, age, mark):");
        String name = scanner.next();
        int age = scanner.nextInt();
        double mark = scanner.nextDouble();
        Student searchStudent = new Student(name, age, mark);
        boolean isContained = students.contains(searchStudent);
        boolean isReferenced = false;
        for (Student student : students) {
            if (student == searchStudent) {
                isReferenced = true;
                break;
            }
        }
        System.out.println("Existence of the student object:");
        System.out.println("Contains: " + isContained);
        System.out.println("Referenced: " + isReferenced);

        // (c.) Remove a specified Student object
        System.out.println("Enter details for the student to remove (name, age, mark):");
        name = scanner.next();
        age = scanner.nextInt();
        mark = scanner.nextDouble();
        Student removeStudent = new Student(name, age, mark);
        students.remove(removeStudent);
        System.out.println("List after removing specified student:");
        displayList(students);

        // (d.) Count the number of objects present in the list
        System.out.println("Number of students in the list: " + students.size());

        // (e.) Overriding equals method
        Student student1 = new Student("Alice", 20, 85.5);
        Student student2 = new Student("Alice", 20, 85.5);
        System.out.println("Comparison using equals method: " + student1.equals(student2));
    }
    private static void displayList(LinkedList<Student> students)
    {
        for (Student student : students)
        {
            System.out.println(student);
        }
    }
}
