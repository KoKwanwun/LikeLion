package algorithm.list.Student_List;

import java.util.ArrayList;
import java.util.List;

public class ListExercise {
    private List<String> students;

    public ListExercise() {
        students = new ArrayList<>();
        students.add("고관운1");
        students.add("고관운2");
        students.add("고관운3");
        students.add("고관운4");
        students.add("고관운5");
    }

    public List<String> getListExercise() {
        return students;
    }
}
