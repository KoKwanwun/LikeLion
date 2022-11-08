package CodeUp.CodeUp_3001;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 정수 리스트 담기
        int n = sc.nextInt();
        int[] nums = new int[n];

        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        // 찾고자 하는 특정 정수를 받고, 데이터의 위치는 -1로 초기화
        int findNum = sc.nextInt();
        int findIdx = -1;

        // 데이터가 있다면 인덱스+1 출력, 없다면 -1을 출력
        for (int i = 0; i < n; i++) {
            if(nums[i] == findNum){
                findIdx = i + 1;
            }
        }
        System.out.println(findIdx);
    }
}