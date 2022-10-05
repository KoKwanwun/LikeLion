package week3_221004_221007.day_221005.collection;

import java.util.ArrayList;
import java.util.List;

public class LikeLion2th {
    // students 초기화
    private List<String> students = new ArrayList<>();
    private List<Student> studentObjs = new ArrayList<>();

    // Names 클래스에서 이름을 가져와 students에 할당
    public LikeLion2th() {
        Names names = new Names();
        this.students = names.names();
        this.studentObjs = names.getStudentObjs();
    }

    // 멋사자 2기 학생의 이름이 들어있는 list를 return하는 method
    public List<String> getStudentList(){
        return this.students;
    }

    public List<Student> getStudentObjsList(){
        return this.studentObjs;
    }
}
