package com.mustache.bbs.repository;

import com.mustache.bbs.domain.Hospital;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class HospitalRepositoryTest {

    @Autowired
    HospitalRepository hospitalRepository;

    @Test
    void findById() {
        Optional<Hospital> hospital = hospitalRepository.findById(1);
        Hospital hp = hospital.get();
        System.out.println(hp.getId());
        assertEquals(1, hp.getId());
    }

    @Test
    @DisplayName("BusinessTypeName이 보건소/보건지소/보건진료소인 데이터가 잘 나오는지")
    void findByBusinessTypeNameIn(){
        List<String> includes = new ArrayList<>();
        includes.add("보건소");
        includes.add("보건지소");
        includes.add("보건진료소");
        List<Hospital> hospitalList = hospitalRepository.findByBusinessTypeNameIn(includes);
        for (Hospital hospital : hospitalList) {
            System.out.println(hospital.getHospitalName());
        }
    }
}