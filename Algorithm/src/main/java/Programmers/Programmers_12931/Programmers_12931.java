package Programmers.Programmers_12931;

public class Programmers_12931 {
    public int solutionA(int n) {
        // String으로 변환 후 각 자릿수 더하기
        int answer = 0;

        String[] sList = Integer.toString(n).split("");

        for(int i = 0; i < sList.length; i++){
            answer += Integer.parseInt(sList[i]);
        }

        return answer;
    }

    public int solutionB(int n) {
        // % 연산 이용 몫, 나머지
        int answer = 0;

        while(n > 0) {
            answer += n % 10;
            n = n / 10;
        }

        return answer;
    }

    public static void main(String[] args) {
        Programmers_12931 sod = new Programmers_12931();
        int result1 = sod.solutionB(1234);

        if(result1 == 10) {
            System.out.println("테스트 통과했습니다.");
        } else {
            System.out.printf("테스트 실패 result:%d \n", result1);
        }
    }
}
