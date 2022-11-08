package readFile.test.File;

import java.io.IOException;

public class ReadFile {
    public static void main(String[] args) throws IOException {
        ReadFileByByte readFileByByte = new ReadFileByByte("a_file.txt");

        System.out.println(readFileByByte.readOneByte());

        System.out.println(readFileByByte.readTwoByte());

        System.out.println(readFileByByte.readNByte(10));
    }
}
