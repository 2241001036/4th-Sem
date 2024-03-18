class Student implements Comparable<Student> {
    private String name;
    private int rn;
    private int totalMark;

    public Student(String name, int rn, int totalMark) {
        this.name = name;
        this.rn = rn;
        this.totalMark = totalMark;
    }

    public String getName() {
        return name;
    }

    public int getRollNumber() {
        return rn;
    }

    public int getTotalMark() {
        return totalMark;
    }

    @Override
    public int compareTo(Student other) {
        return Integer.compare(this.rn, other.rn);
    }

    public static void bubbleSort(Student[] students) {
        int n = students.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (students[j].compareTo(students[j + 1]) > 0) {
                    Student temp = students[j];
                    students[j] = students[j + 1];
                    students[j + 1] = temp;
                }
            }
        }
    }
}
