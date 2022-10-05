package week3_221004_221007.day_221005;

public class RandomCalculator {
    private int b = (int)(Math.random() * 10);

    public void plus(int a) {
        System.out.println(a + " + " + b + " = " + (a + b));
    }

    public void minus(int a) {
        System.out.println(a + " - " + b + " = " + (a - b));
    }

    public void multiple(int a) {
        System.out.println(a + " * " + b + " = " + (a * b));
    }

    public void divide(int a) {
        try {
            System.out.println(a + " / " + b + " = " + (a / b));
        } catch (Exception e) {
            System.out.println("랜덤하게 생성된 숫자가 0입니다.");
        }
    }
}
