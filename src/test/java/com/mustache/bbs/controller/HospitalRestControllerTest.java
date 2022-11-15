package com.mustache.bbs.controller;

import com.mustache.bbs.dto.HospitalResponse;
import com.mustache.bbs.service.HospitalService;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.web.servlet.MockMvc;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.BDDMockito.given;
import static org.mockito.Mockito.verify;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;

@WebMvcTest(HospitalRestController.class)
class HospitalRestControllerTest {

    @Autowired
    MockMvc mockMvc;

    @MockBean   // HospitalService는 테스트를 위해 가짜 객체를 쓰겠다.
    HospitalService hospitalService;    // 가짜 객체를 쓰면 좋은점 : DB와 상관없이 테스트 가능

    @Test
    @DisplayName("1개의 Json형태로 Response가 잘 오는지")    // 비즈니스로직(Service를 검증하지 않음) Controller만 검증
    void jsonResponse() throws Exception {
        HospitalResponse hospitalResponse = HospitalResponse.builder()
                        .id(2321)
                        .roadNameAddress("서울특별시 서초구 서초중앙로 230, 202호 (반포동, 동화반포프라자빌딩)")
                        .hospitalName("노소아청소년과의원")
                        .patient_room_count(0)
                        .totalNumberOfBeds(0)
                        .businessTypeName("의원")
                        .total_area_size(0.0f)
                        .businessStatusName("영업중").build();
        given(hospitalService.getHospital(2321))
                .willReturn(hospitalResponse);

        int hospitalId = 2321;

        mockMvc.perform(get(String.format("/api/v1/hospitals/%d", hospitalId)))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$.hospitalName").exists())  // $는 루트 $아래에 hospitalName이 있어야 함
                .andExpect(jsonPath("$.hospitalName").value("노소아청소년과의원"))
                .andDo(print()); // http request, response내역을 출력 해라

        verify(hospitalService).getHospital(hospitalId);    // getHospital()메소드의 호출이 있었는지 확인
    }

}