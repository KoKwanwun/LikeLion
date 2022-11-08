package readFile.test.File;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ReadLineMain {
    public static void main(String[] args) throws IOException {
        ReadLine readLine = new ReadLine("c_file.txt");

        System.out.println("한줄만 읽기");
        System.out.println(readLine.readOneLine());

        List<String> strs = new ArrayList<>();
        strs = readLine.readNLine(8);

        System.out.println("\nN줄 읽기");
        for (String str : strs) {
            System.out.println(str);
        }
    }
}
