package Programmers.Programmers_12921;

class Solution {
    public int solution(int n) {
        int answer = 0;

        for (int i = 2; i < n + 1; i++) {
            if(isPrime3(i)) {
                answer++;
            }
        }

        return answer;
    }

    // 방법 1, 2, 3이 있는데 점점 시간복잡도가 줄어듬
    public boolean isPrime1(int n) {
        // 2부터 n미만까지 나눴을 때
        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public boolean isPrime2(int n) {
        // 2부터 n/2까지 나눴을 때
        for (int i = 2; i <= (n / 2); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public boolean isPrime3(int n) {
        // 제곱근까지 한다면 제곱근을 포함해야함
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}
