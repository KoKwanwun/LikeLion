package week3_221004_221007.day_221007;

import week3_221004_221007.day_221007.MiniProject.PopulationStatistics;

import java.io.File;
import java.io.IOException;
import java.util.List;

public class CreateFile {
    // 파일 하나 생성
    public void createAFile(String filename) {
        File file = new File(filename);
        try {
            file.createNewFile();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    // List<String>을 지정한 파일에 write
    public void write(List<String> strs, String filename) {

    }

    public static void main(String[] args) {
        // 파일 생성
        CreateFile createFile = new CreateFile();
        createFile.createAFile("from_to.txt");
    }
}
