package week3_221004_221007.day_221007.MiniProject;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class PopulationMain {
    public static void main(String[] args) throws IOException {
        // 파일 생성
        CreateFile createFile = new CreateFile();
        createFile.createAFile("from_to.txt");

        // 파일 쓰기(from, to만 남기기)
        String address = "D:\\고관운 자료\\멋쟁이사자처럼\\수업 자료\\221007 실습 자료\\2021_인구관련연간자료_20221006_98568.csv";
        PopulationStatistics populationStatistics = new PopulationStatistics();
        List<PopulationMove> pml = populationStatistics.readByLine(address);

        List<String> strings = new ArrayList<>();
        for(PopulationMove pm : pml) {
            String fromTo = populationStatistics.fromToString(pm);
            strings.add(fromTo);
        }

        createFile.write(strings, "from_to.txt");

        // 새로 만든 파일로 작업
        String newAddress = "./from_to.txt";




//        Map<Integer, Integer> modeSeoulToSido = populationStatistics.HowManyFromSido(lineList, 11);
//        System.out.println(modeSeoulToSido);
//
//        int modeSido = populationStatistics.modeToSido(modeSeoulToSido);
//        System.out.println(modeSido);
    }
}
