package readFile.hospitalProject.parser;

import readFile.hospitalProject.domain.Hospital;

public class HospitalParser implements Parser<Hospital> {
    private String getSubdivision(String name) {
        String[] subdivisions = {"소아과", "피부과", "성형외과", "정형외과", "이비인후과", "척추", "교정", "산부인과", "관절", "봉합", "화상", "골절", "영유아", "안과", "가정의학과", "비뇨기과", "치과", "내과", "외과"};

        for (String subdivision : subdivisions) {
            if(name.contains(subdivision)){
                return subdivision;
            }
        }
        return "";
    }

    @Override
    public Hospital parse(String str) {
        // "에 대한 에러 방지
        str = str.replaceAll("\"", "");
        String[] splitted = str.split(",");

        String name = splitted[10];
        String subDivision = getSubdivision(name);

        return new Hospital(splitted[0], splitted[1], splitted[2], Integer.parseInt(splitted[6]), name, subDivision);
    }
}
