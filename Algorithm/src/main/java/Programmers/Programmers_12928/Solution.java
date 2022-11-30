package Programmers.Programmers_12928;

class Solution {
    public int solution(int n) {
        // for문의 범위를 n/2로 하여 초기화를 n으로 잡음
        // n/2로 한 이유 : 약수가 2인지 확인하면, n/2 초과의 값도 확인하는 것(시간복잡도 줄일 수 있음)
        int result = n;

        for (int i = 1; i <= (n / 2) ; i++) {
            if(n % i == 0) {
                result += i;
            }
        }

        return result;
    }
}
