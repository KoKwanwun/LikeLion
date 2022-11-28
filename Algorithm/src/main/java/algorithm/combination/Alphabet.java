package algorithm.combination;

public class Alphabet {
    public static void main(String[] args) {
        // 한 자리 수
        System.out.println("한 자리 수");
        oneAlphabet();

        // 두 자리 수
        System.out.println("두 자리 수");
        twoAlphabet();
    }

    private static void oneAlphabet() {
        for (char i = 'A'; i <= 'Z'; i++) {
            System.out.println(i);
        }
    }

    private static void twoAlphabet() {
        for (char i = 'A'; i <= 'Z'; i++) {
            for (char j = 'A'; j <= 'Z'; j++) {
                System.out.println(i + "" + j);
            }
        }
    }
}
