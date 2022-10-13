package com.line.parser;

import com.line.domain.Hospital;

public class HospitalParser implements Parser<Hospital> {
    @Override
    public Hospital parse(String str) {
        str = str.replaceAll("\"", "");
        String[] splitted = str.split(",");

        String subDivision = setSubdivision(splitted[10]);

        return new Hospital(splitted[0], splitted[1], splitted[2], Integer.parseInt(splitted[6]), splitted[10], subDivision);
    }

    String setSubdivision(String name) {
        String result = "";
        String[] inputChecks = {"내과", "외과", "소아", "피부", "성형", "정형외과", "척추", "교정", "산부인과", "관절", "봉합", "화상", "골절", "영유아", "안과", "가정의학과", "비뇨기과", "치과"};
        for (String inputCheck : inputChecks) {
            if(name.contains(inputCheck)){
                result += inputCheck;
            }
        }
        if(result == ""){
            result = null;
        }

        return result;
    }
}
