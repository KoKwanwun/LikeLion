package week7_20221031_20221103.day_221101.Programmers_12921;

interface StatementStrategy {
    boolean compare(int i, int n);
}
public class TemplateCallBackIsPrime {
    public boolean isPrime(int n, StatementStrategy stmt) {
        for (int i = 2; stmt.compare(i, n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        TemplateCallBackIsPrime tc = new TemplateCallBackIsPrime();

        System.out.println(tc.isPrime(13, new StatementStrategy() {
            @Override
            public boolean compare(int i, int n) {
                return i < n;
            }
        }));

        System.out.println(tc.isPrime(13, (i, n)-> i < n));
        System.out.println(tc.isPrime(17, (i, n)-> i <= n/2));
        System.out.println(tc.isPrime(19, (i, n)-> i*i <= n));
    }
}
