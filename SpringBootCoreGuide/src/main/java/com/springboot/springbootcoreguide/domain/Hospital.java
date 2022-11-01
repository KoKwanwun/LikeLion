package com.springboot.springbootcoreguide.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;

@AllArgsConstructor // 모든 변수를 가진 생성자
@Getter             // Getter
@Setter             // Setter
@NoArgsConstructor  // 기본생성자
public class Hospital {
    private int id;
    private String OpenServiceName;
    private int openLocalGovernmentCode;
    private String managementNumber;
    private LocalDateTime licenseDate;
    private int businessStatus;
    private int businessStatusCode;
    private String phone;
    private String fullAddress;
    private String roadNameAddress;
    private String hospitalName;
    private String businessTypeName;
    private int healthcareProviderCount;
    private int patientRoomCount;
    private int totalNumberOfBeds;
    private float totalAreaSize;
}
