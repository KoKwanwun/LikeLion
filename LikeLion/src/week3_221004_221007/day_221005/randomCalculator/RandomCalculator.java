package week3_221004_221007.day_221005.randomCalculator;

public class RandomCalculator {
    private int baseNum;
    NumberCreator numCreator;

    public RandomCalculator(NumberCreator numCreator) {
        this.numCreator = numCreator;
        baseNum = numCreator.numberCreator(10);
    }

    public RandomCalculator(NumberCreator numCreator, int baseNum) {
        this.numCreator = numCreator;
        this.baseNum = numCreator.numberCreator(baseNum);
    }

    public void plus(int a) {
        System.out.println(a + " + " + baseNum + " = " + (a + baseNum));
    }

    public void minus(int a) {
        System.out.println(a + " - " + baseNum + " = " + (a - baseNum));
    }

    public void multiple(int a) {
        System.out.println(a + " * " + baseNum + " = " + (a * baseNum));
    }

    public void divide(int a) {
        try {
            double result = ((double) a / baseNum);
            if(Double.isInfinite(result) || Double.isNaN(result)){
                throw new ArithmeticException();
            }
            System.out.println(a + " * " + baseNum + " = " + result);
        } catch (ArithmeticException e) {
            System.out.println("랜덤하게 생성된 숫자가 0입니다.");
        }
        /*
        이렇게 코드를 짜면 소수점이 안나옴
        try {
            System.out.println(a + " / " + baseNum + " = " + (a / baseNum));
        } catch (Exception e) {
            System.out.println("랜덤하게 생성된 숫자가 0입니다.");
        }
        */
    }
}
