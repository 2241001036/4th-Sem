class Student implements Comparable<Student>
{
    private String name;
    private int rn;
    private int totalMark;
    public Student(String name, int rn, int totalMark)
    {
        this.name = name;
        this.rn = rn;
        this.totalMark = totalMark;
    }
    public String getName()
    {
        return name;
    }
    public int getRollNumber()
    {
        return rn;
    }
    public int getTotalMark()
    {
        return totalMark;
    }
    @Override
    public int compareTo(Student other)
    {
        return Integer.compare(this.rn, other.rn);
    }
    public static Student linearSearch(Student[] students, int rollNumber)
    {
        for (Student student : students)
        {
            if (student.getRollNumber() == rollNumber)
            {
                return student;
            }
        }
        return null;
    }
}
