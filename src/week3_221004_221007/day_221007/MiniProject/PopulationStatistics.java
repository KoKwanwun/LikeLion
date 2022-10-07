package week3_221004_221007.day_221007.MiniProject;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
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

    public Map<String, Integer> heatmapIdxMap() {
        Map<String, Integer> map = new HashMap<>();
        map.put("11", 0);
        map.put("26", 1);
        map.put("27", 2);
        map.put("28", 3);
        map.put("29", 4);
        map.put("30", 5);
        map.put("31", 6);
        map.put("36", 7);
        map.put("41", 8);
        map.put("42", 9);
        map.put("43", 10);
        map.put("44", 11);
        map.put("45", 12);
        map.put("46", 13);
        map.put("47", 14);
        map.put("48", 15);
        map.put("50", 16);

        return  map;
    }
}
