package readFile.hospitalProject;

import readFile.hospitalProject.domain.Hospital;
import readFile.hospitalProject.parser.HospitalParser;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        LineReader<Hospital> hospitalLineReader = new LineReader<>(new HospitalParser());
        String filename = "D:\\고관운 자료\\멋쟁이사자처럼\\백엔드스쿨 2기 교본\\220919\\4주차\\서울시 병의원 위치 정보.csv";
        List<Hospital> hospitals = hospitalLineReader.readlines(filename);

        System.out.println(hospitals.size());

        List<String> lines = new ArrayList<>();
        for (Hospital hospital : hospitals) {
            lines.add(hospital.getSqlInsertQuery());
        }
        String sqlFilename = "hospital_insert.sql";
        hospitalLineReader.createANewFile(sqlFilename);
        hospitalLineReader.writeLines(lines, sqlFilename);
    }
}
