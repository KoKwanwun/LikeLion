package week3_221004_221007.day_221006.Student_List;

import java.util.List;

public class ListExerciseMain {
    public static void main(String[] args) {
        ListExercise listExercise = new ListExercise();
        List<String> students = listExercise.getListExercise();

        for (String student : students) {
            System.out.println(student);
        }
    }
}
