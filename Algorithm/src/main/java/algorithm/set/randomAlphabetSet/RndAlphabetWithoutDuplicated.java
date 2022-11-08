package algorithm.set.randomAlphabetSet;

import java.util.HashSet;
import java.util.Set;

public class RndAlphabetWithoutDuplicated {
    public static void main(String[] args) {
        RandomAlphabetGenerator randomAlphabetGenerator = new RandomAlphabetGenerator();

        Set<Character> rndAlphaWithoutDuplicated = new HashSet<>();

        System.out.print("랜덤한 알파벳(50개) : ");
        for(int i = 0; i < 50; i++) {
            char rndAlpha = randomAlphabetGenerator.generate();
            System.out.print(rndAlpha + " ");
            rndAlphaWithoutDuplicated.add(rndAlpha);
        }

        System.out.print("\n랜덤한 알파벳 중복제거 : ");
        System.out.println(rndAlphaWithoutDuplicated);
    }
}
