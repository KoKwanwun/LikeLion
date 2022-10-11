package week4_20221011_20221014.day_221011.Algorithm;

public class Programmers_12931 {
    public int solution(int n) {
        int answer = 0;

        String[] sList = Integer.toString(n).split("");

        for(int i = 0; i < sList.length; i++){
            answer += Integer.parseInt(sList[i]);
        }

        return answer;
    }

    public static void main(String[] args) {
        Programmers_12931 sod = new Programmers_12931();
        int result1 = sod.solution(1234);

        if(result1 == 10) {
            System.out.println("테스트 통과했습니다.");
        } else {
            System.out.printf("테스트 실패 result:%d \n", result1);
        }
    }
}
