package algorithm.decimalToBinary;

public class Main {
    public static void main(String[] args) {
        int num = 9;
        int tmp;
        String binaryNum = "";

        while(num > 1) {
            tmp = num % 2;
            num /= 2;
            binaryNum += tmp;
        }
        binaryNum += num;

        String result = "";
        for (int i = binaryNum.length() - 1; i >= 0; i--) {
            result += binaryNum.charAt(i);
        }

        System.out.println(result);
    }
}
