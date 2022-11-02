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

        // 2를 제외한 2의 배수 제거
        for (int i = 0; i < arr.size(); i++) {
            if(arr.get(i) % 2 == 0 && arr.get(i) > 2) {
                arr.remove(i);
            }
        }
        System.out.println(arr.size());
    }
}
