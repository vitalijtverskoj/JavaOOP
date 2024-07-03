package Lesson4;

public class Student extends User implements Comparable<Student> {
    private int studentId;
    private String firstName;
    private String secondName;
    private String lastName;

    public Student(int studentId, String firstName, String secondName, String lastName) {
        super(firstName, secondName, lastName);
        this.studentId = studentId;

    }

    public int getStudentId() {
        return studentId;
    }

    @Override
    public String toString() {
        return "Student [studentId=" + studentId +
                super.toString() +
                "]";
    }

    @Override
    public int compareTo(Student o) {
        if (studentId > o.getStudentId()) {
            return 1;
        }
        if (studentId < o.getStudentId()) {
            return -1;
        }
        return 0;
    }

}