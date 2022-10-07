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

    public Map<String, Integer> HowManyFromSido(List<PopulationMove> newPml){
        Map<String, Integer> modeSeoulToSido = new HashMap<>();
        int cnt;
        String key;

        for (PopulationMove s : newPml) {
            int toSido = s.getToSido();
            key = s.getFromSido() + "," + toSido;
            cnt = modeSeoulToSido.containsKey(key) ? modeSeoulToSido.get(key) : 0;
            modeSeoulToSido.put(key, cnt + 1);
        }
        return modeSeoulToSido;
    }

    // 오버로딩
    public Map<String, Integer> HowManyFromSido(List<PopulationMove> newPml, int from){
        Map<String, Integer> modeSeoulToSido = new HashMap<>();
        int cnt;
        String key;

        for (PopulationMove s : newPml) {
            if (s.getFromSido() == from){
                int toSido = s.getToSido();
                key = s.getFromSido() + "," + toSido;
                cnt = modeSeoulToSido.containsKey(key) ? modeSeoulToSido.get(key) : 0;
                modeSeoulToSido.put(key, cnt + 1);
            }
        }
        return modeSeoulToSido;
    }

    // 오버로딩
    public Map<String, Integer> HowManyFromSido(List<PopulationMove> newPml, int from, int to){
        Map<String, Integer> modeSeoulToSido = new HashMap<>();
        int cnt;
        String key;

        for (PopulationMove s : newPml) {
            if (s.getFromSido() == from){
                int toSido = s.getToSido();
                if (toSido == to) {
                    key = s.getFromSido() + "," + toSido;
                    cnt = modeSeoulToSido.containsKey(key) ? modeSeoulToSido.get(key) : 0;
                    modeSeoulToSido.put(key, cnt + 1);
                }
            }
        }
        return modeSeoulToSido;
    }
    public String modeToSido(Map<String, Integer> modeSeoulToSido){
        int maxValue = 0;
        String maxKey = "";

        for (String key : modeSeoulToSido.keySet()) {
            if(modeSeoulToSido.get(key) > maxValue){
                maxValue = modeSeoulToSido.get(key);
                maxKey = key;
            }
        }

        return maxKey;
    }
}
