package week4_20221011_20221014.day_221012;

import week4_20221011_20221014.day_221012.parser.Parser;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class LineReader<T> {
    Parser<T> parser;

    boolean isRemoveColumnName = true;

    public LineReader(Parser<T> parser) {
        this.parser = parser;
    }

    // 첫행 받는여부를 생성자로 받을 수 있음
    public LineReader(Parser<T> parser, boolean isRemoveColumnName) {
        this.parser = parser;
        this.isRemoveColumnName = isRemoveColumnName;
    }

    List<T> readlines(String filename) throws IOException {
        List<T> result = new ArrayList<>();
        BufferedReader br = new BufferedReader(new FileReader(filename));
        String str;

        // 첫 행 날리기
        if(isRemoveColumnName) {
            br.readLine();
        }

        while((str = br.readLine()) != null) {
            result.add(parser.parse(str));
        }
        return result;
    }

    public void createANewFile(String filename) throws IOException {
        File file = new File(filename);
        file.createNewFile();
        System.out.println("파일 생성 되었는지?:" + file.exists());
    }

    public void writeLines(List<String> lines, String filename) throws IOException{
        File file = new File(filename);
        FileWriter fileWriter = new FileWriter(file);
        for (int i = 0; i < lines.size(); i++) {
            fileWriter.write(lines.get(i) + "\n");
        }
        fileWriter.flush();
        fileWriter.close();
        System.out.println("success");
    }
}
