package algorithm.list.collection;

import java.util.List;

public class ListPracticeMain {
    public static void main(String[] args) {
        LikeLion2th likeLion2th = new LikeLion2th();
        List<String> students = likeLion2th.getStudentList();
        List<Student> studentObjs = likeLion2th.getStudentObjsList();

        for (String student : students){
            System.out.println(student);
        }
        System.out.println("\n이름 총 개수 : " + students.size());
        System.out.println();

        for (Student student : studentObjs){
            System.out.println("반 : " + student.getClassNum());
            System.out.println("이름 : " + student.getName());
            System.out.println("깃주소 : " + student.getGitRepositoryAddress());
            System.out.println();
        }
    }
}
