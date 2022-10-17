package week3_221004_221007.day_221005.randomCalculator;

public class RandomCalculatorMain {
    public static void main(String[] args) {
        // NumberCreator 인터페이스 = RandomNumberCreator(다형성)
        // 랜덤 숫자를 받아 생성자에 넣기
        RandomCalculator rc = new RandomCalculator(new RandomNumberCreator());

        rc.plus(10);
        rc.minus(10);
        rc.multiple(10);
        rc.divide(10);
        System.out.println();

        // NumberCreator 인터페이스 = SpecificNumberCreator(다형성)
        // 특정 숫자를 받아 생성자에 넣기
        RandomCalculator sc = new RandomCalculator(new SpecificNumberCreator(), 30);

        sc.plus(10);
        sc.minus(10);
        sc.multiple(10);
        sc.divide(10);
        System.out.println();

        // 안넣었다면 10으로 baseNum 설정해놨음
        RandomCalculator sc2 = new RandomCalculator(new SpecificNumberCreator());

        sc2.plus(10);
        sc2.minus(10);
        sc2.multiple(10);
        sc2.divide(10);
    }
}
