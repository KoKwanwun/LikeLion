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

    String readTwoByte() throws IOException {
        BufferedReader br = new BufferedReader(
                new FileReader(filename),
                16 * 1024
        );
        String nByte = br.readLine();

        int n = 2;

        if (nByte.length() < n){
            n = nByte.length();
        }

        return nByte.substring(0,n);
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
