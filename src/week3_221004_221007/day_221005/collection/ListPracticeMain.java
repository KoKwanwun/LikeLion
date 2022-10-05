package week3_221004_221007.day_221005.collection;

import java.util.List;

public class ListPracticeMain {
    public static void main(String[] args) {
        LikeLion2th likeLion2th = new LikeLion2th();
        List<String> students = likeLion2th.getStudentList();

        for (String student : students){
            System.out.println(student);
        }
        System.out.println("\n이름 총 개수 : " + students.size());
    }
}
