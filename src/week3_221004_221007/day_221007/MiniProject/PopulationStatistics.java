package week3_221004_221007.day_221007.MiniProject;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class PopulationStatistics {
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

    public void readByLine(String filename) throws IOException {
        // BufferedReader를 활용하여 한줄씩 읽기
        BufferedReader bufferedReader = new BufferedReader(
                new FileReader(filename)
        );
        String str;
        while((str = bufferedReader.readLine()) != null){
            System.out.println(str);
        }
        bufferedReader.close();
    }

    public void readByLine2(String filename) {
        // 다른 버전의 BufferedReader로 한줄씩 읽기
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

    public List<String> readAllLine(String filename) {
        // 다른 버전의 BufferedReader로 한줄씩 읽기
        List<String> lineList = new ArrayList<>();

        try(BufferedReader br = Files.newBufferedReader(
                Paths.get(filename), StandardCharsets.UTF_8)){
            
            String line;
            while ((line = br.readLine()) != null) {
                lineList.add(line);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return lineList;
    }

    public PopulationMove parse(String data){
        String[] dataSplit = data.split(",");

        int fromSido = Integer.parseInt(dataSplit[0]);
        int toSido = Integer.parseInt(dataSplit[6]);

        return new PopulationMove(fromSido, toSido);
    }

    public static void main(String[] args) throws IOException {
        String address = "./src/week3_221004_221007/day_221007/MiniProject/2021_인구관련연간자료_20221006_98568.csv";
        PopulationStatistics populationStatistics = new PopulationStatistics();

//        populationStatistics.readByLine(address);
//        populationStatistics.readByLine2(address);

        List<String> lineList = new ArrayList<>();
        lineList = populationStatistics.readAllLine(address);
        PopulationMove populationMove;

        for (String s : lineList) {
            populationMove = populationStatistics.parse(s);

        }
    }
}
