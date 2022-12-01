package Programmers.Programmers_136798;

class Solution {
    private int divisorNumByLimit(int i, int limit, int power) {
        int cnt = 0;

        for (int j = 1; j * j <= i; j++) {
            if (j * j == i) cnt++;
            else if (i % j == 0) cnt += 2;
        }

        if(cnt > limit){
            return power;
        } else{
            return cnt;
        }
    }

    public int solution(int number, int limit, int power) {
        int sum = 0;

        // 약수의 개수를 구하는데, limit을 넘으면 power를 리턴
        // sum에 계속 더해줌
        for (int i = 1; i <= number; i++) {
            sum += divisorNumByLimit(i, limit, power);
        }

        return sum;
    }
}