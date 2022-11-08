package algorithm.numCalculator;

public class CalculatorMain {
    public static void main(String[] args) {
        Calculator c = new Calculator(10, 20);

        c.plus();
        c.minus();
        c.multiple();
        c.divide();
    }
}
