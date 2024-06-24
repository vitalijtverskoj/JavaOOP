package Lesson3;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Student student1 = new Student(4, "AAA", "AAA", "AAA");
        Student student2 = new Student(2, "BBB", "BBB", "BBB");
        Student student3 = new Student(3, "Baa", "Baa", "Baa");
        Student student4 = new Student(1, "aaa", "aaa", "aaa");
        
        StudentGroup studentGroup = new StudentGroup(new ArrayList<>());
        studentGroup.addStudent(student1);
        studentGroup.addStudent(student2);
        studentGroup.addStudent(student3);
        studentGroup.addStudent(student4);
        StudentGroupService service = new StudentGroupService(studentGroup);
        printListStudent(service.getSortedStudentGroupByFIO());
        // System.out.println(student1.compareTo(student2));
        // // StudentGroupIterator iterator = new StudentGroupIterator(studentGroup.getStudentList());
        // printListStudent(studentGroup);

    }

    static void printListStudent(List<Student> students) {
        // while (iterator.hasNext()) {
        //     Student student = iterator.next();
        //     System.out.println(student);
        // }
        for (Student student : students) {
            System.out.println(student);
        }

    }
}
