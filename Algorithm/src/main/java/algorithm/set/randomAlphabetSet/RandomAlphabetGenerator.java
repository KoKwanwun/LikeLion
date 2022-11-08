package algorithm.set.randomAlphabetSet;

public class RandomAlphabetGenerator implements AlphabetGenerator{
    @Override
    public char generate() {
        return (char) ((int) (Math.random() * 26) + 65);
    }
}
