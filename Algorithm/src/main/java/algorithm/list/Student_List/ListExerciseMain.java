package algorithm.list.Student_List;

import java.util.List;

public class ListExerciseMain {
    public static void main(String[] args) {
        ListExercise listExercise = new ListExercise();
        List<String> students = listExercise.getListExercise();

        for (String student : students) {
            System.out.println(student);
        }

        System.out.println("총 이름 개수 : " + students.size());
    }
}
