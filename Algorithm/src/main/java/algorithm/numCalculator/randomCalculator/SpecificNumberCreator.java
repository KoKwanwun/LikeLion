package algorithm.numCalculator.randomCalculator;

public class SpecificNumberCreator implements NumberCreator{
    // 숫자 20000이라는 특정한 정수를 리턴
    @Override
    public int numberCreator(int num) {
        return num;
    }
}
