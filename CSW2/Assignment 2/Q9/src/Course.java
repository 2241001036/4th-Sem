import java.util.ArrayList;
class Course
{
    private String courseCode;
    private String courseName;
    private ArrayList<Student> enrolledStudents;
    public Course(String courseCode, String courseName)
    {
        this.courseCode = courseCode;
        this.courseName = courseName;
        this.enrolledStudents = new ArrayList<>();
    }
    public String getCourseCode()
    {
        return courseCode;
    }
    public String getCourseName()
    {
        return courseName;
    }
    public ArrayList<Student> getEnrolledStudents()
    {
        return enrolledStudents;
    }
}