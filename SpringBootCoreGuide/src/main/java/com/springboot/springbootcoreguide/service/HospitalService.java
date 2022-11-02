package com.springboot.springbootcoreguide.service;

import com.springboot.springbootcoreguide.dao.HospitalDao;
import com.springboot.springbootcoreguide.domain.Hospital;
import com.springboot.springbootcoreguide.parser.ReadLineContext;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.io.IOException;
import java.util.List;

@Service
public class HospitalService {

    private final ReadLineContext<Hospital> hospitalReadLineContext;
    private final HospitalDao hospitalDao;

    public HospitalService(ReadLineContext<Hospital> hospitalReadLineContext, HospitalDao hospitalDao) {
        this.hospitalReadLineContext = hospitalReadLineContext;
        this.hospitalDao = hospitalDao;
    }

    @Transactional
    public int insertLargeVolumeHospitalData(String filename) {
        int cnt = 0;
        try {
            List<Hospital> hospitalList = hospitalReadLineContext.readByLine(filename);

            for (Hospital hospital : hospitalList) {
                try {
                    hospitalDao.add(hospital);          // db에 insert
                    cnt++;
                } catch (Exception e) {
                    System.out.printf("id:%d 레코드에 문제가 있습니다.", hospital.getId());
                    throw new RuntimeException(e);
                }
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        return cnt;
    }
}
