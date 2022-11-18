package com.mustache.bbs.service;

import com.mustache.bbs.domain.Hospital;
import com.mustache.bbs.dto.HospitalResponse;
import com.mustache.bbs.repository.HospitalRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.ArgumentMatchers.any;

class HospitalServiceTest {

    private HospitalRepository hospitalRepository = Mockito.mock(HospitalRepository.class);
    private HospitalService hospitalService;

    @BeforeEach
    void setup() {hospitalService = new HospitalService(hospitalRepository); }

    @Test
    @DisplayName("13이면 영업중, 3이면 폐업")
    void getHospital() {
        // 13 테스트
        Hospital hospital13 = Hospital.builder()
                .id(718458)
                .business_status_code(13)
                .build();

        Mockito.when(hospitalRepository.findById(any()))
                .thenReturn(Optional.of(hospital13));

        HospitalResponse hospitalResponse13 = hospitalService.getHospital(718458);

        assertEquals("영업중", hospitalResponse13.getBusinessStatusName());

        // 3 테스트
        Hospital hospital3 = Hospital.builder()
                .id(718457)
                .business_status_code(3)
                .build();

        Mockito.when(hospitalRepository.findById(any()))
                .thenReturn(Optional.of(hospital3));

        HospitalResponse hospitalResponse3 = hospitalService.getHospital(718457);

        assertEquals("폐업", hospitalResponse3.getBusinessStatusName());
    }
}