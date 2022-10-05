package week3_221004_221007.day_221005.randomCalculator;

public class RandomCalculator {
    RandomNumberCreator rnc = new RandomNumberCreator();
    private int ramdomInt = rnc.RandomCreator();

    public void plus(int a) {
        System.out.println(a + " + " + ramdomInt + " = " + (a + ramdomInt));
    }

    public void minus(int a) {
        System.out.println(a + " - " + ramdomInt + " = " + (a - ramdomInt));
    }

    public void multiple(int a) {
        System.out.println(a + " * " + ramdomInt + " = " + (a * ramdomInt));
    }

    public void divide(int a) {
        try {
            double result = ((double) a / ramdomInt);
            if(Double.isInfinite(result) || Double.isNaN(result)){
                throw new ArithmeticException();
            }
            System.out.println(a + " * " + ramdomInt + " = " + result);
        } catch (ArithmeticException e) {
            System.out.println("랜덤하게 생성된 숫자가 0입니다.");
        }
        /*
        이렇게 코드를 짜면 소수점이 안나옴
        try {
            System.out.println(a + " / " + ramdomInt + " = " + (a / ramdomInt));
        } catch (Exception e) {
            System.out.println("랜덤하게 생성된 숫자가 0입니다.");
        }
        */
    }
}
