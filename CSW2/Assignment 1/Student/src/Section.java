public class Section
{
    int max_st;
    Student[] s;
    int a = 0;
    public Section(int t)
    {
        s = new Student[t];
        max_st=t;
    }
    void addStudent(int r, String n)
    {
        s[a]=new Student(r,n);
        a++;
    }
    void diplaySection()
    {
        for(int i = 0;i<a;i++)
        {
            System.out.print(s[a]);
        }
    }
}
