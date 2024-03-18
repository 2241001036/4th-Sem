public class Driver
{
    public static void main(String[] args)
    {
        Student S1 = new Student("Aryan Agrawal", "2241001036", 19);
        S1.printDetails();
        Student S2 = new Student("SK Danish Afroz", 224101029, 20);
        S2.printDetails();
        S1.setRollNumber(2);
        S1.printDetails();
        S2.setRollNumber("1");
        S2.printDetails();
    }
}