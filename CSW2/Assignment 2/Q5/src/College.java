import java.util.ArrayList;
import java.util.List;

public class College
{
    private String CollegeName;
    private String CollegeLoc;
    private List<Student> Students;
    College(String CollegeName, String CollegeLoc)
    {
        this.CollegeName = CollegeName;
        this.CollegeLoc = CollegeLoc;
        this.Students = new ArrayList<>();
    }
    public String getCollegeName() {
        return CollegeName;
    }
    public String getCollegeLoc() {
        return CollegeLoc;
    }
    public void addStudent(Student Student)
    {
        Students.add(Student);
    }
    public void displayCollegeInfo()
    {
        System.out.println("College Name: " + CollegeName);
        System.out.println("College Location: " + CollegeLoc);
    }
}
