public class Main
{
    public static void main(String[] args)
    {
        College C1 = new College("ITER", "Jagamara");
        College C2 = new College("CV Raman", "Retang");
        Student S1 = new Student(1, "Aryan Agrawal", C1);
        Student S2 = new Student(2, "SK Danish Afroz", C2);
        Student S3 = new Student(3, "Aman Agarwal", C2);
        Student S4 = new Student(4, "Utkarsh Agrawal", C1);
        C1.addStudent(S1);
        C1.addStudent(S3);
        C2.addStudent(S2);
        C2.addStudent(S4);
        System.out.println("\nCollege Information: ");
        C1.displayCollegeInfo();
        C2.displayCollegeInfo();
        System.out.println("\nStudent Information: ");
        S1.displayStudentInfo();
        S2.displayStudentInfo();
        S3.displayStudentInfo();
        S4.displayStudentInfo();
    }
}