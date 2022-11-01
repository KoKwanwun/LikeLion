package week7_20221031_20221103.day_221101.Programmers_12921;

interface StatementStrategy {
    boolean compare(int i, int n);
}
public class TemplateCallBackIsPrime {
    public boolean isPrime(int n, StatementStrategy stmt) {
        // 2부터 n미만까지 나눴을 때
        for (int i = 2; stmt.compare(i, n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        TemplateCallBackIsPrime tc = new TemplateCallBackIsPrime();

        System.out.println(tc.isPrime(13));
        System.out.println(tc.isPrime(4));
        System.out.println(tc.isPrime(9));
    }
}
