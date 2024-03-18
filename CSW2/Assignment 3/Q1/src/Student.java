public class Student {
    private String name;
    private Object rollNumber;
    private int age;
    public Student(String name, String rollNumber, int age)
    {
        this.name = name;
        this.rollNumber = rollNumber;
        this.age = age;
    }
    public Student(String name, int rollNumber, int age)
    {
        this.name = name;
        this.rollNumber = rollNumber;
        this.age = age;
    }
    public String getName()
    {
        return name;
    }
    public Object getRollNumber()
    {
        return rollNumber;
    }
    public int getAge()
    {
        return age;
    }
    public void setName(String name)
    {
        this.name = name;
    }
    public void setRollNumber(String rollNumber)
    {
        this.rollNumber = rollNumber;
    }
    public void setRollNumber(int rollNumber)
    {
        this.rollNumber = rollNumber;
    }
    public void setAge(int age)
    {
        this.age = age;
    }
    public void printDetails() {
        System.out.println("Name: " + name);
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("Age: " + age);
    }
}
