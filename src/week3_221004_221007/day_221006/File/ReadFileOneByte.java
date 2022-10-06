package week3_221004_221007.day_221006.File;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReadFileOneByte {
    private String filename;

    public ReadFileOneByte(String filename) {
        this.filename = filename;
    }

    char readByte() throws IOException {
        BufferedReader br = new BufferedReader(
                new FileReader(filename),
                1
        );
        return (char)br.read();
    }
}
