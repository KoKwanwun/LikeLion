package week3_221004_221007.day_221006.File;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReadFileList {
    public void printFiles(){
        // 디렉토리로 파일 접근
        File dir = new File("./");  // new File로 디렉토리 설정

        File files[] = dir.listFiles(); // 현재 위치의 파일들이 담김
        System.out.println(files[0]);   // 첫 파일 출력

        for(int i = 0; i < files.length; i++){
            System.out.println(files[i]);
        }
    }

    public char rearAChar(String filename) throws IOException {
        // FileReader 설명
        FileReader fileReader = new FileReader(filename);
        return (char) fileReader.read();
    }

    public String rearTwoChar(String filename) throws IOException {
        // FileReader 설명
        FileReader fileReader = new FileReader(filename);
        String str = "";
        str += (char) fileReader.read();
        str += (char) fileReader.read();

        return str;
    }

    public static void main(String[] args) throws IOException {
        ReadFileList readFileList = new ReadFileList();
        char c = readFileList.rearAChar("b_file.txt");
        System.out.println(c);

        String str = readFileList.rearTwoChar("b_file.txt");
        System.out.println(str);
    }
    /*
    출력 결과 (현재 디렉토리 파일 목록)
    .\.git          // 첫 파일 출력
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
