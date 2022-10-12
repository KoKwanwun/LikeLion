package week4_20221011_20221014.day_221012.parser;

import week4_20221011_20221014.day_221012.domain.Hospital;

public class HospitalParser implements Parser<Hospital> {
    @Override
    public Hospital parse(String str) {
        String[] splitted = str.split(",");

        return new Hospital(splitted[0]);
    }
}
