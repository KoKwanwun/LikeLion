package week3_221004_221007.day_221007.MiniProject;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PopulationMain {
    public static void main(String[] args) throws IOException {
        PopulationStatistics populationStatistics = new PopulationStatistics();

//        // 파일 생성
//        CreateFile createFile = new CreateFile();
//        createFile.createAFile("from_to.txt");
//
//        // 파일 쓰기(from, to만 남기기)
//        String address = "D:\\고관운 자료\\멋쟁이사자처럼\\수업 자료\\221007 실습 자료\\2021_인구관련연간자료_20221006_98568.csv";
//        List<PopulationMove> pml = populationStatistics.readByLine(address, 6, 0);  // from : 전입 인덱스, to : 전출 인덱스
//
//        List<String> strings = new ArrayList<>();
//        for(PopulationMove pm : pml) {
//            String fromTo = populationStatistics.fromToString(pm);
//            strings.add(fromTo);
//        }
//
//        createFile.write(strings, "from_to.txt");

        // 새로 만든 파일로 작업
        String newAddress = "./from_to.txt";
        List<PopulationMove> newPml = populationStatistics.readByLine(newAddress, 0, 1);  // from : 전입 인덱스, to : 전출 인덱스

        // from에서 to로 간 시도의 개수 출력, 가장 많이 간 시도 출력(전체출력)
        Map<String, Integer> fromToList = populationStatistics.HowManyFromSido(newPml);
        System.out.println(fromToList);

        String modeToSido = populationStatistics.modeToSido(fromToList);
        System.out.println(modeToSido);

//        // from에서 to로 간 시도의 개수 출력, 가장 많이 간 시도 출력(from만 입력)
//        Map<String, Integer> fromToListInputFrom = populationStatistics.HowManyFromSido(newPml, 11);
//        System.out.println(fromToListInputFrom);
//
//        // from에서 to로 간 시도의 개수 출력, 가장 많이 간 시도 출력(from, to 입력) 오버로딩 이용
//        Map<String, Integer> fromToListInputFromTo = populationStatistics.HowManyFromSido(newPml, 44, 31);
//        System.out.println(fromToListInputFromTo);

        // 결과를 파일로 저장(전체 경우의 수)
        CreateFile createFile = new CreateFile();
        String targetFilename = "each_sido_cnt.txt";
        createFile.createAFile(targetFilename);

        List<String> cntResult = new ArrayList<>();
        for (String key : fromToList.keySet()){
            String s = String.format("from:%s to value:%d\n", key, fromToList.get(key));
            cntResult.add(s);
        }
        createFile.write(cntResult, targetFilename);

        // 결과를 히트맵 형식으로
        String targetFilenameForHeatmap = "each_sido_for_heatmap.txt";
        createFile.createAFile(targetFilenameForHeatmap);
        Map<String, Integer> heatMapIdxMap = populationStatistics.heatmapIdxMap();

        List<String> cntResultForHeatmap = new ArrayList<>();
        for (String key : fromToList.keySet()){
            String[] strForHeatmap = key.split(",");
            String s = String.format("[%s, %s, %s],\n", heatMapIdxMap.get(strForHeatmap[0]), heatMapIdxMap.get(strForHeatmap[1]), fromToList.get(key));
            cntResultForHeatmap.add(s);
        }
        createFile.write(cntResultForHeatmap, targetFilenameForHeatmap);
    }
}
