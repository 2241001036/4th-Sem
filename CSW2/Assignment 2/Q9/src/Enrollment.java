import java.util.ArrayList;
class Enrollment implements EnrollmentSystem {
    ArrayList<Student> students;
    ArrayList<Course> courses;
    public Enrollment() {
        this.students = new ArrayList<>();
        this.courses = new ArrayList<>();
    }
    @Override
    public void enrollStudent(Student student, Course course) {
        if (isStudentEnrolled(student, course)) {
            System.out.println("Student is already enrolled in this course.");
        } else {
            student.getEnrolledCourses().add(course);
            course.getEnrolledStudents().add(student);
            System.out.println("Student enrolled successfully.");
        }
    }
    @Override
    public void dropStudent(Student student, Course course)
    {
        if (!isStudentEnrolled(student, course)) {
            System.out.println("Student is not enrolled in this course.");
        }
        else
        {
            student.getEnrolledCourses().remove(course);
            course.getEnrolledStudents().remove(student);
            System.out.println("Student dropped successfully.");
        }
    }
    @Override
    public void displayEnrollmentDetails(Student student)
    {
        System.out.println("Enrollment details for student " + student.getName() + ":");
        for (Course course : student.getEnrolledCourses())
        {
            System.out.println("Course: " + course.getCourseName() + ", Course Code: " + course.getCourseCode());
        }
    }
    private boolean isStudentEnrolled(Student student, Course course) {
        return student.getEnrolledCourses().contains(course);
    }
}