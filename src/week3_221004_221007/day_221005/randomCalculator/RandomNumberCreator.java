package week3_221004_221007.day_221005.randomCalculator;

public class RandomNumberCreator implements NumberCreator{
    @Override
    public int RandomCreator() {
        return (int)(Math.random() * 10);
    }
}
