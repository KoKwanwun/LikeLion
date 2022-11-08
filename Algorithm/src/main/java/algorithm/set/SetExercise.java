package algorithm.set;

import java.util.HashSet;
import java.util.Set;

public class SetExercise {
    public static void main(String[] args) {
        Set<String> set1 = new HashSet<>(); // tree set도 있음
        set1.add("고관운");
        set1.add("고관운");
        set1.add("김미미");
        System.out.println(set1);

        // 정수 중복 제거
        Set<Integer> setInteger = new HashSet<>();
        setInteger.add(1);
        setInteger.add(1);
        setInteger.add(2);
        setInteger.add(3);

        System.out.println(setInteger);
    }
}
