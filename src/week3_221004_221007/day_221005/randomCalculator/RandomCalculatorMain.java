package week3_221004_221007.day_221005.randomCalculator;

public class RandomCalculatorMain {
    public static void main(String[] args) {
        // NumberCreator 인터페이스 = RandomNumberCreator(다형성)
        // 랜덤 숫자를 받아 생성자에 넣기
        NumberCreator rnc = new RandomNumberCreator();
        RandomCalculator rc = new RandomCalculator(rnc.numberCreator());

        rc.plus(10);
        rc.minus(10);
        rc.multiple(10);
        rc.divide(10);
        System.out.println();

        // NumberCreator 인터페이스 = SpecificNumberCreator(다형성)
        // 특정 숫자를 받아 생성자에 넣기
        NumberCreator snc = new SpecificNumberCreator();
        RandomCalculator sc = new RandomCalculator(snc.numberCreator());

        sc.plus(10);
        sc.minus(10);
        sc.multiple(10);
        sc.divide(10);
    }
}
