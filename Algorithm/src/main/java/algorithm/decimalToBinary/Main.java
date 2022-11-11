package algorithm.decimalToBinary;

public class Main {
    public static void main(String[] args) {
        int num = 9;
        int n = 6;
        int tmp;
        String binaryNum = "";

        while(num > 1) {
            tmp = num % 2;
            num /= 2;
            binaryNum += tmp;
        }
        binaryNum += num;

        // n만큼의 길이가 되도록 0추가
        while(binaryNum.length() < 6) {
            binaryNum += "0";
        }

        String result = "";
        for (int i = binaryNum.length() - 1; i >= 0; i--) {
            result += binaryNum.charAt(i);
        }

        System.out.println(result);
    }
}
