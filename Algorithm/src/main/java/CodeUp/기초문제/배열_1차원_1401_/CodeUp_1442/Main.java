package CodeUp.기초문제.배열_1차원_1401_.CodeUp_1442;

import java.util.Scanner;

public class Main {
    int[] sort(int[] arr) {
        int minIdx;
        int temp;

        for(int i = 0; i < arr.length; i++) {
            minIdx = i;
            for(int j = i + 1; j < arr.length; j++) {
                if(arr[minIdx] > arr[j]){
                    // 최소값 설정
                    minIdx = j;
                }
            }
            // 최소값과 i의 값과 교환
            temp = arr[i];
            arr[i] = arr[minIdx];
            arr[minIdx] = temp;
        }

        return arr;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 값을 입력받아 배열 만들기
        int n = sc.nextInt();

        int[] arr = new int[n];

        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        Main main = new Main();

        // 결과 한줄씩 출력
        int[] resultArr = main.sort(arr);
        for (int i : resultArr) {
            System.out.println(i);
        }
    }
}
