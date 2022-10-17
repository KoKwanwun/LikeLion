package week3_221004_221007.day_221006.randomAlphabetSet;

public class RandomAlphabetGenerator implements AlphabetGenerator{
    @Override
    public char generate() {
        return (char) ((int) (Math.random() * 26) + 65);
    }
}
