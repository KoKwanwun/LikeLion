package week7_20221031_20221103.day_221103;

import java.util.ArrayList;

public class SieveOfEratosthenes {
    // 2~100, 2의 배수를 쌍으로 출력
    public static void main(String[] args) {
        int checks = 2;
        for (int i = 2; i <= 100; i++) {
            System.out.println(i + ", " + checks);
            checks += 2;
        }
    }
}
