package week7_20221031_20221103.day_221102;

import java.util.ArrayList;
import java.util.Arrays;

public class SieveOfEratosthenes {
    public static void main(String[] args) {
        int N = 50;     // 50 이하의 모든 소수 구하기

        // 2~50가 들어있는 리스트 만들기
        ArrayList<Integer> arr = new ArrayList<>();

        for (int i = 2; i <= N; i++) {
            arr.add(i);
        }

        // 각 배수 지우고 removed 리스트에 넣은 후 for문을 다 돈 후 제거
        ArrayList<Integer> removed = new ArrayList<>();
        for (int i = 3; i <= N; i++) {
            if(i % 2 == 0) {
                removed.add(i);
            }
        }
        for (Integer num : removed) {
            arr.remove(Integer.valueOf(num));
        }
        System.out.println(arr.size());
    }
}
