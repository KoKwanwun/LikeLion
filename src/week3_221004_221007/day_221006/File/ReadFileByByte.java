package week3_221004_221007.day_221006.File;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;

public class ReadFileByByte {
    private String filename;

    public ReadFileByByte(String filename) {
        this.filename = filename;
    }

    char readOneByte() throws IOException {
        BufferedReader br = new BufferedReader(
                new FileReader(filename),
                16 * 1024
        );
        return (char)br.read();
    }

    char[] readTwoByte() throws IOException {
        BufferedReader br = new BufferedReader(
                new FileReader(filename),
                16 * 1024
        );
        char[] twoByte = new char[2];

        twoByte[0] = (char)br.read();
        twoByte[1] = (char)br.read();

        return twoByte;
    }

    String readNByte(int n) throws IOException {
        BufferedReader br = new BufferedReader(
                new FileReader(filename),
                16 * 1024
        );
        String nByte = br.readLine();

        if (nByte.length() < n){
            n = nByte.length();
        }

        return nByte.substring(0,n);
    }
}
