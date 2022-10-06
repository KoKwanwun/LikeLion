package week3_221004_221007.day_221006.File;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ReadLine {
    private String filename;

    public ReadLine(String filename) {
        this.filename = filename;
    }

    public String readOneLine() throws IOException {
        BufferedReader br = new BufferedReader(
                new FileReader(filename),
                16 * 1024
        );
        return br.readLine();
    }

    public List<String> readNLine(int n) throws IOException {
        BufferedReader br = new BufferedReader(
                new FileReader(filename),
                16 * 1024
        );
        List<String> strs = new ArrayList<>();

        for(int i = 0; i < n; i++){
            String str = br.readLine();
            if (str == null){
                break;
            }
            strs.add(str);
        }

        return strs;
    }
}
