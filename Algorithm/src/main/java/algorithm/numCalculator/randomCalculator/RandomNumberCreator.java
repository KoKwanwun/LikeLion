package algorithm.numCalculator.randomCalculator;

public class RandomNumberCreator implements NumberCreator{
    // 0~9까지의 숫자를 리턴
    @Override
    public int numberCreator(int num) {
        return (int)(Math.random() * num);
    }
}
