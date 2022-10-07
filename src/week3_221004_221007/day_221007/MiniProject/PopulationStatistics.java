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
        public List<PopulationMove> readByLine(String filename, int from, int to) throws IOException {
        // String을 PopulationMove로 parsing하여 pml에 add합니다.
        List<PopulationMove> pml = new ArrayList<>();
        BufferedReader bufferedReader = new BufferedReader(
                new FileReader(filename)
        );
        String str;
        while((str = bufferedReader.readLine()) != null){
//            System.out.println(str);
            PopulationMove pm = parse(str, from, to);
            pml.add(pm);
        }
        bufferedReader.close();
        return pml;
    }

    public PopulationMove parse(String data, int from, int to){
        String[] dataSplit = data.split(",");

        return new PopulationMove(dataSplit[from], dataSplit[to]);  // 전입 : To, 전출 : From
    }

    public String fromToString(PopulationMove populationMove){
        return populationMove.getFromSido() + "," + populationMove.getToSido() + "\n";
    }

    public Map<Integer, Integer> HowManyFromSido(List<PopulationMove> newPml, int num){
        Map<Integer, Integer> modeSeoulToSido = new HashMap<>();
        int cnt;

        for (PopulationMove s : newPml) {
            if (s.getFromSido() == num){
                int toSido = s.getToSido();
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
