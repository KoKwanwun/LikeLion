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

        // FileReader 설명
        FileReader fileReader = new FileReader("./b_file.txt");

        // 디렉토리로 파일 접근
        File dir = new File("./");  // new File로 디렉토리 설정

        File files[] = dir.listFiles(); // 현재 위치의 파일들이 담김
        System.out.println(files[0]);   // 첫 파일 출력

        for(int i = 0; i < files.length; i++){
            System.out.println(files[i]);
        }
        /*
        출력 결과 (현재 디렉토리 파일 목록)
        .\.git
        .\.gitignore
        .\.idea
        .\a_file.txt
        .\b_file.txt
        .\LikeLion.iml
        .\out
        .\README.md
        .\src
         */
    }
}
