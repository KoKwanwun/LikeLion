package algorithm.combination;

public class AlphabetRecur {
    public static void main(String[] args) {
        // 한 자리 수
        System.out.println("한 자리 수");
        Alphabet(1, "");

        // 두 자리 수
        System.out.println("두 자리 수");
        Alphabet(2, "");

        // 세 자리 수
        System.out.println("세 자리 수");
        Alphabet(3, "");
    }

    private static void Alphabet(int digitNum, String str) {
        if(digitNum <= 0){
            System.out.println(str);
            return;
        }
        for (char c = 'A'; c <= 'Z'; c++) {
            Alphabet(digitNum - 1, str + c);
        }
    }
}
