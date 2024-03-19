public class Main {
    public static void main(String[] args) {
        Enrollment enrollmentSystem = new Enrollment();

        Student student1 = new Student("Aryan Agrawal", "2241001036");
        Student student2 = new Student("SK Danish Afroz", "2241001029");
        enrollmentSystem.students.add(student1);
        enrollmentSystem.students.add(student2);

        Course course1 = new Course("CS101", "Introduction to Programming");
        Course course2 = new Course("MATH101", "Calculus");
        enrollmentSystem.courses.add(course1);
        enrollmentSystem.courses.add(course2);

        enrollmentSystem.enrollStudent(student1, course1);
        enrollmentSystem.enrollStudent(student1, course2);
        enrollmentSystem.enrollStudent(student2, course1);
        System.out.println("\nEnrollment details for student " + student1.getName() + ":");
        enrollmentSystem.displayEnrollmentDetails(student1);

        System.out.println("\nDropping student " + student1.getName() + " from course " + course1.getCourseName() + ":");
        enrollmentSystem.dropStudent(student1, course1);

        System.out.println("\nEnrollment details for student " + student1.getName() + ":");
        enrollmentSystem.displayEnrollmentDetails(student1);
    }
}