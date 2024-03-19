import java.util.ArrayList;
class Student {
    private String name;
    private String id;
    private ArrayList<Course> enrolledCourses;
    public Student(String name, String id)
    {
        this.name = name;
        this.id = id;
        this.enrolledCourses = new ArrayList<>();
    }
    public String getName()
    {
        return name;
    }
    public String getId()
    {
        return id;
    }
    public ArrayList<Course> getEnrolledCourses()
    {
        return enrolledCourses;
    }
}