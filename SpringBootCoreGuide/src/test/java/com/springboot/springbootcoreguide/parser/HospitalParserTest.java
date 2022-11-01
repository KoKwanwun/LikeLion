package com.springboot.springbootcoreguide.parser;

import com.springboot.springbootcoreguide.dao.HospitalDao;
import com.springboot.springbootcoreguide.domain.Hospital;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.io.IOException;
import java.time.LocalDateTime;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class HospitalParserTest {

    String line1 = "\"1\",\"의원\",\"01_01_02_P\",\"3620000\",\"PHMA119993620020041100004\",\"19990612\",\"\",\"01\",\"영업/정상\",\"13\",\"영업중\",\"\",\"\",\"\",\"\",\"062-515-2875\",\"\",\"500881\",\"광주광역시 북구 풍향동 565번지 4호 3층\",\"광주광역시 북구 동문대로 24, 3층 (풍향동)\",\"61205\",\"효치과의원\",\"20211115113642\",\"U\",\"2021-11-17 02:40:00.0\",\"치과의원\",\"192630.735112\",\"185314.617632\",\"치과의원\",\"1\",\"0\",\"0\",\"52.29\",\"401\",\"치과\",\"\",\"\",\"\",\"0\",\"0\",\"\",\"\",\"0\",\"\",";

    @Autowired
    ReadLineContext<Hospital> hospitalReadLineContext;          // ParserFactory의 hospitalReadLineContext로 자동 DI

    @Autowired
    HospitalDao hospitalDao;    // HospitalDao가 왜 DI가 될까? -> @Autowired가 있으며, HospitalDao에 @Component가 붙어있음
                                // Component가 있으면 @Bean을 모두 붙인다.



    @Test
    @DisplayName("임의의 id의 정보를 잘 불러오는지")
    void findById() {
        hospitalDao.deleteAll();

        HospitalParser hp = new HospitalParser();
        Hospital hospital = hp.parse(line1);

        hospitalDao.add(hospital);

        Hospital selectedHospital = hospitalDao.findById(1);
        assertEquals(hospital.getHospitalName(), selectedHospital.getHospitalName());
        assertEquals(hospital.getLicenseDate(), selectedHospital.getLicenseDate());
    }

    @Test
    @DisplayName("Hospital이 insert가 잘 되는지")
    void add() {
        HospitalParser hp = new HospitalParser();
        Hospital hospital = hp.parse(line1);

        hospitalDao.add(hospital);
    }

    @Test
    @DisplayName("getCount와 deleteAll이 잘 되는지")
    void getCountAndDeleteAll() {
        hospitalDao.deleteAll();
        assertEquals(0, hospitalDao.getCount());

        HospitalParser hp = new HospitalParser();
        Hospital hospital = hp.parse(line1);

        hospitalDao.add(hospital);
        assertEquals(1, hospitalDao.getCount());
    }

    @Test
    @DisplayName("10만 건 이상 데이터가 파싱되는지")
    void OneHundreadThousandRows() throws IOException {
        String filename = "D:\\고관운 자료\\멋쟁이사자처럼\\수업 자료\\fulldata_01_01_02_P_의원_utf8.csv";
        List<Hospital> hospitalList = hospitalReadLineContext.readByLine(filename);
        assertTrue(hospitalList.size() > 100000);

        for (int i = 0; i < 10; i++) {
            System.out.println(hospitalList.get(i).getHospitalName());
        }
    }

    @Test
    @DisplayName("csv 1줄을 Hospital로 잘 만드는지 Test")
    void convertToHospital() {
        HospitalParser hp = new HospitalParser();
        Hospital hospital = hp.parse(line1);

        assertEquals(1, hospital.getId());
        assertEquals("의원", hospital.getOpenServiceName());
        assertEquals(3620000, hospital.getOpenLocalGovernmentCode());
        assertEquals("PHMA119993620020041100004", hospital.getManagementNumber());
        assertEquals(LocalDateTime.of(1999, 6, 12, 0, 0, 0), hospital.getLicenseDate());
        assertEquals(1, hospital.getBusinessStatus());
        assertEquals(13, hospital.getBusinessStatusCode());
        assertEquals("062-515-2875", hospital.getPhone());
        assertEquals("광주광역시 북구 풍향동 565번지 4호 3층", hospital.getFullAddress());
        assertEquals("광주광역시 북구 동문대로 24, 3층 (풍향동)", hospital.getRoadNameAddress());
        assertEquals("효치과의원", hospital.getHospitalName());
        assertEquals("치과의원", hospital.getBusinessTypeName());
        assertEquals(1, hospital.getHealthcareProviderCount());
        assertEquals(0, hospital.getPatientRoomCount());
        assertEquals(0, hospital.getTotalNumberOfBeds());
        assertEquals(52.29f, hospital.getTotalAreaSize());
    }
}