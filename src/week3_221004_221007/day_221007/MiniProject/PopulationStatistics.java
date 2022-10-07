package week3_221004_221007.day_221007.MiniProject;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PopulationStatistics {
        public List<PopulationMove> readByLine(String filename) throws IOException {
        // String을 PopulationMove로 parsing하여 pml에 add합니다.
        List<PopulationMove> pml = new ArrayList<>();
        BufferedReader bufferedReader = new BufferedReader(
                new FileReader(filename)
        );
        String str;
        while((str = bufferedReader.readLine()) != null){
//            System.out.println(str);
            PopulationMove pm = parse(str);
            pml.add(pm);
        }
        bufferedReader.close();
        return pml;
    }

    public PopulationMove parse(String data){
        String[] dataSplit = data.split(",");

        return new PopulationMove(dataSplit[6], dataSplit[0]);  // 전입 : To, 전출 : From
    }

    public String fromToString(PopulationMove populationMove){
        return populationMove.getFromSido() + "," + populationMove.getToSido() + "\n";
    }

    public PopulationMove newFileParse(String data){
        String[] dataSplit = data.split(",");

        return new PopulationMove(dataSplit[0], dataSplit[1]);  // 전입 : To, 전출 : From
    }

    public Map<Integer, Integer> HowManyFromSido(List<String> lineList, int num){
        PopulationMove populationMove;
        Map<Integer, Integer> modeSeoulToSido = new HashMap<>();
        int cnt;

        for (String s : lineList) {
            populationMove = newFileParse(s);
            if (populationMove.getFromSido() == num){
                int toSido = populationMove.getToSido();
                cnt = modeSeoulToSido.containsKey(toSido) ? modeSeoulToSido.get(toSido) : 0;
                modeSeoulToSido.put(toSido, cnt + 1);
            }
        }
        return modeSeoulToSido;
    }

    public int modeToSido(Map<Integer, Integer> modeSeoulToSido){
        int maxValue = 0;
        int maxKey = 0;

        for (Integer key : modeSeoulToSido.keySet()) {
            if(modeSeoulToSido.get(key) > maxValue){
                maxValue = modeSeoulToSido.get(key);
                maxKey = key;
            }
        }

        return  maxKey;
    }
}
