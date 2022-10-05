package week3_221004_221007.day_221005.randomCalculator;

public class RandomCalculator {
    private int num;

    public RandomCalculator(int num) {
        this.num = num;
    }

    public void plus(int a) {
        System.out.println(a + " + " + num + " = " + (a + num));
    }

    public void minus(int a) {
        System.out.println(a + " - " + num + " = " + (a - num));
    }

    public void multiple(int a) {
        System.out.println(a + " * " + num + " = " + (a * num));
    }

    public void divide(int a) {
        try {
            double result = ((double) a / num);
            if(Double.isInfinite(result) || Double.isNaN(result)){
                throw new ArithmeticException();
            }
            System.out.println(a + " * " + num + " = " + result);
        } catch (ArithmeticException e) {
            System.out.println("랜덤하게 생성된 숫자가 0입니다.");
        }
        /*
        이렇게 코드를 짜면 소수점이 안나옴
        try {
            System.out.println(a + " / " + num + " = " + (a / num));
        } catch (Exception e) {
            System.out.println("랜덤하게 생성된 숫자가 0입니다.");
        }
        */
    }
}
