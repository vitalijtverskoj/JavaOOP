package Lesson4;

import java.util.ArrayList;

public class StudentController implements UserController<Student>{
    StudentGroup students = new StudentGroup(new ArrayList<>());
    UserView<Student> userView = new UserView<Student>();
    @Override
    public void create(String firstName, String secondName, String lastName) {
        int maxId = 0;
        if(students.getStudentList().size() == 0)
            maxId = 0;
        else
            maxId = students.getStudentList().get(students.getStudentList().size() - 1).getStudentId() + 1;
        Student student = new Student(maxId, firstName, secondName, lastName);
    }

    void printStudentList(){
        userView.sendOnConsole(students.getStudentList());
    }

}
