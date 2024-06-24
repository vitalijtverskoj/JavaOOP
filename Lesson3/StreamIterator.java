package Lesson3;

import java.util.Iterator;
import java.util.List;

public class StreamIterator implements Iterator<StudentGroup>{
    private List<StudentGroup> studentGroupList;
    private int counter = 0;

    public StreamIterator(List<StudentGroup> studentGroupList) {
        this.studentGroupList = studentGroupList;
    }

    @Override
    public boolean hasNext() {
        return counter < studentGroupList.size();
    }

    @Override
    public StudentGroup next() {
        if(hasNext()){
            return studentGroupList.get(counter++);
        }
        return null;
    }

    @Override
    public void remove() {
        if(hasNext()){
            studentGroupList.remove(counter);
        }
    }

    

    
}
