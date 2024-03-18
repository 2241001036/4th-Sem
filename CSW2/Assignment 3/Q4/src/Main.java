import java.util.Arrays;
public class Main
{
    public static void main(String[] args)
    {
        Student[] students = {
                new Student("Alice", 101, 85),
                new Student("Bob", 102, 90),
                new Student("Charlie", 103, 88),
                new Student("David", 104, 92)
        };
        int rollNumberToSearch = 102;
        Student result = Student.linearSearch(students, rollNumberToSearch);
        if (result != null)
        {
            System.out.println("Student found:");
            System.out.println("Name: " + result.getName());
            System.out.println("Roll Number: " + result.getRollNumber());
            System.out.println("Total Marks: " + result.getTotalMark());
        }
        else
        {
            System.out.println("Student with roll number " + rollNumberToSearch + " not found.");
        }
    }
}
