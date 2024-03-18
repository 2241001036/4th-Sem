import java.util.Arrays;
public class Main {
    public static void main(String[] args)
    {
        Student[] students = {
                new Student("Alice", 101, 85),
                new Student("Bob", 102, 90),
                new Student("Charlie", 103, 88),
                new Student("David", 104, 92)
        };
        Student.bubbleSort(students);
        System.out.println("Sorted Students based on roll number (rn):");
        for (Student student : students)
        {
            System.out.println("Name: " + student.getName() + ", Roll Number: " + student.getRollNumber() + ", Total Marks: " + student.getTotalMark());
        }
    }
}
