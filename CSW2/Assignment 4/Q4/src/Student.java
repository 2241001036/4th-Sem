class Student
{
    private String name;
    private int age;
    private double mark;
    public Student(String name, int age, double mark)
    {
        this.name = name;
        this.age = age;
        this.mark = mark;
    }
    public String getName()
    {
        return name;
    }
    public void setName(String name)
    {
        this.name = name;
    }
    public int getAge()
    {
        return age;
    }
    public void setAge(int age)
    {
        this.age = age;
    }
    public double getMark()
    {
        return mark;
    }
    public void setMark(double mark)
    {
        this.mark = mark;
    }
    @Override
    public boolean equals(Object obj)
    {
        if (this == obj)
            return true;
        if (obj == null || getClass() != obj.getClass())
            return false;
        Student student = (Student) obj;
        return age == student.age && Double.compare(student.mark, mark) == 0 && name.equals(student.name);
    }
    @Override
    public String toString()
    {
        return "Name: " + name + ", Age: " + age + ", Mark: " + mark;
    }
}
