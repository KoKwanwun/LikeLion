package likelion.line;

import likelion.domain.Hospital;
import likelion.line.parser.HospitalParser;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ParserMain {
    public static void main(String[] args) throws IOException {
        FileController<Hospital> hospitalFileController = new FileController<>(new HospitalParser());
        String filename = "D:\\고관운 자료\\멋쟁이사자처럼\\백엔드스쿨 2기 교본\\220919\\4주차\\서울시 병의원 위치 정보.csv";
        List<Hospital> hospitals = hospitalFileController.readlines(filename);

        System.out.println(hospitals.size());

        List<String> lines = new ArrayList<>();
        for (Hospital hospital : hospitals) {
            lines.add(hospital.getSqlInsertQuery());
        }
        String sqlFilename = "hospital_insert.sql";
        hospitalFileController.createANewFile(sqlFilename);
        hospitalFileController.writeLines(lines, sqlFilename);
    }
}
