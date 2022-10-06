package week3_221004_221007.day_221006.randomNumberSet;

public class RndNumberWithoutDuplicated {
    public static void main(String[] args) {
        RandomNumberGenerator1 randomNumberGenerator = new RandomNumberGenerator1();
        for(int i = 0; i < 50; i++) {
            int rndNum = randomNumberGenerator.generate(10);
            System.out.println(rndNum);
        }
    }
}
