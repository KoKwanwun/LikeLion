package algorithm.set.randomNumberSet;

public class RandomNumberGenerator1 implements NumberGenerator1{
    @Override
    public int generate(int num) {
        return (int)(Math.random() * num);
    }
}
