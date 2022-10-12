package week4_20221011_20221014.day_221012;

import week4_20221011_20221014.day_221012.domain.Hospital;
import week4_20221011_20221014.day_221012.parser.HospitalParser;

import java.io.IOException;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        LineReader<Hospital> hospitalLineReader = new LineReader<>(new HospitalParser());
        String filename = "D:\\고관운 자료\\멋쟁이사자처럼\\백엔드스쿨 2기 교본\\220919\\4주차\\서울시 병의원 위치 정보.csv";
        List<Hospital> hospitals = hospitalLineReader.readlines(filename);

        System.out.println(hospitals.size());

        for (Hospital hospital : hospitals) {
            System.out.println(hospital.getId());
        }
    }
}
