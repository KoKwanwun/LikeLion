package readFile.poluationProject;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;

public class ReadFile {
    public void readByChar(String filename) throws IOException {
        FileReader fileReader = new FileReader(filename);
        // 여기까지는 파일을 읽지 않는다.

        // 1byte씩 백만개 읽은 후 출력
        String fileContents = "";
        while (fileContents.length() < 1000000){
            char c = (char) fileReader.read();
            fileContents += c;
        }
        System.out.println(fileContents);
    }

    public void readByLine2(String filename) {
        // BufferedReader로 한줄씩 읽기
        try(BufferedReader br = Files.newBufferedReader(
                Paths.get(filename), StandardCharsets.UTF_8)){

            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static void main(String[] args) {
        String address = "D:\\고관운 자료\\멋쟁이사자처럼\\수업 자료\\221007 실습 자료\\2021_인구관련연간자료_20221006_98568.csv";
        ReadFile readFile = new ReadFile();

        readFile.readByLine2(address);
    }
}
