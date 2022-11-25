package algorithm.recursion;

public class TailRecur {
    public static void recur(int n) {
        while(n > 0) {
            recur(n - 1);
            System.out.println(n);
            n = n - 2;
        }
    }
    public static void main(String[] args) {
        recur(3);
    }
}
