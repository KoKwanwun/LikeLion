package algorithm.numCalculator.randomCalculator;

public interface NumberCreator {
    // 인터페이스는 자식 클래스가 구현
    // default를 하면 같은 패키지에서만 호출 가능
    int numberCreator(int num);
}
