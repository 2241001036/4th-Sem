public class Student
{
    private int roll_No;
    private String Name;
    public Student(int r, String n)
    {
        roll_No = r;
        Name = n;
    }
    @Override
    public String toString()
    {
        System.out.println("Name:" + Name);
        System.out.println("Roll No.:" + roll_No);
        return null;
    }
}
