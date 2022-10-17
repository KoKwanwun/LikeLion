package week3_221004_221007.day_221006.File;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class ReadFile {
    public static void main(String[] args) throws IOException {
        ReadFileByByte readFileByByte = new ReadFileByByte("a_file.txt");

        System.out.println(readFileByByte.readOneByte());

        System.out.println(readFileByByte.readTwoByte());

        System.out.println(readFileByByte.readNByte(10));
    }
}
