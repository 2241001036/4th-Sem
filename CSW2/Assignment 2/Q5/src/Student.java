public class Student
{
    private int StudentID;
    private String StudentName;
    private College College;
    Student(int StudentID, String StudentName, College College)
    {
        this.StudentID = StudentID;
        this.StudentName = StudentName;
        this.College = College;
    }
    public int getStudentID()
    {
        return StudentID;
    }
    public String getStudentName()
    {
        return StudentName;
    }
    public College getCollege()
    {
        return College;
    }
    public void displayStudentInfo()
    {
        System.out.println("Student ID: " + StudentID);
        System.out.println("Student Name: " + StudentName);
        System.out.println("College Name: " + College.getCollegeName());
        System.out.println("College Location: " + College.getCollegeLoc());
    }
}
