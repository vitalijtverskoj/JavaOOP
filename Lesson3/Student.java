package Lesson3;

public class Student implements Comparable<Student>{
    private int studentId;
    private String firstName;
    private String secondName;
    private String lastName;

    public Student(int studentId, String firstName, String secondName, String lastName) {
        this.studentId = studentId;
        this.firstName = firstName;
        this.secondName = secondName;
        this.lastName = lastName;
    }

    public int getStudentId() {
        return studentId;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getSecondName() {
        return secondName;
    }

    public String getLastName() {
        return lastName;
    }

    @Override
    public String toString() {
        return "Student [studentId=" +
                studentId + ", firstName=" +
                firstName + ", secondName=" +
                secondName + ", lastName=" +
                lastName + "]";
    }

    @Override
    public int compareTo(Student o) {
        if(studentId > o.getStudentId()){
            return 1;
        }
        if (studentId < o.getStudentId()) {
            return -1;
        }
        return 0;
    }

}
