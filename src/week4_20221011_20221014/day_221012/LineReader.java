package week4_20221011_20221014.day_221012;

import week4_20221011_20221014.day_221012.parser.Parser;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
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
}
