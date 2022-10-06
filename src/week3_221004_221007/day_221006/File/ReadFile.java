package week3_221004_221007.day_221006.File;

import java.io.IOException;

public class ReadFile {
    public static void main(String[] args) throws IOException {
        ReadFileOneByte readFileOneByte = new ReadFileOneByte("a_file.txt");

        System.out.println(readFileOneByte.readByte());
    }
}
