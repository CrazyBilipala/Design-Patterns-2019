package p16_iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Team implements Iterable {
    private List<Student> students = new ArrayList<>();
    private int current = 0;

    public void add(Student student) {
        students.add(student);
    }

    public void remove(Student student) {
        students.remove(student);
    }

    @Override
    public Iterator iterator() {
        current = 0;
        return new Iterator() {
            @Override
            public boolean hasNext() {
                return students.size() > current;
            }

            @Override
            public Object next() {
                Student student = students.get(current);
                current++;
                return student;
            }
        };
    }
}
