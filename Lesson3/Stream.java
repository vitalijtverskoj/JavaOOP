package Lesson3;

import java.util.Iterator;
import java.util.List;

public class Stream implements Iterable<StudentGroup>{
    private List<StudentGroup> studentGroupList;

    public Stream(List<StudentGroup> studentGroupList){
        this.studentGroupList = studentGroupList;
    }

    public List<StudentGroup> getStudentGroupList(){
        return studentGroupList;
    }

    public void addStudentGroup(StudentGroup studentGroup){
        studentGroupList.add(studentGroup);
    }

    @Override
    public Iterator<StudentGroup> iterator() {
        return new StreamIterator(studentGroupList);
    }

}
