package week3_221004_221007.day_221006.randomNumberSet;

import java.util.HashSet;
import java.util.Set;

public class RndNumberWithoutDuplicated {
    public static void main(String[] args) {
        RandomNumberGenerator1 randomNumberGenerator = new RandomNumberGenerator1();

        Set<Integer> rndNumWithoutDuplicated = new HashSet<>();

        System.out.print("랜덤한 수(50개) : ");
        for(int i = 0; i < 50; i++) {
            int rndNum = randomNumberGenerator.generate(10);
            System.out.print(rndNum + " ");
            rndNumWithoutDuplicated.add(rndNum);
        }

        System.out.print("\n랜덤한 수 중복제거 : ");
        for (Integer integer : rndNumWithoutDuplicated) {
            System.out.print(integer + " ");
        }
    }
}
