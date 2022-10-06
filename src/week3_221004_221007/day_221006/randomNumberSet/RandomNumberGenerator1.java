package week3_221004_221007.day_221006.randomNumberSet;

public class RandomNumberGenerator1 implements NumberGenerator1{
    @Override
    public int generate(int num) {
        return (int)(Math.random() * num);
    }
}
