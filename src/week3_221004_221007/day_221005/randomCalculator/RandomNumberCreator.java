package week3_221004_221007.day_221005.randomCalculator;

public class RandomNumberCreator implements NumberCreator{
    // 0~9까지의 숫자를 리턴
    @Override
    public int numberCreator() {
        return (int)(Math.random() * 10);
    }
}
