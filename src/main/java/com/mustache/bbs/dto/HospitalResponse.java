package com.mustache.bbs.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import java.sql.Timestamp;

@Builder
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class HospitalResponse {
    private Integer id;
    private String open_service_name;
    private Integer open_local_government_code;
    private String management_number;
    private Timestamp license_date;
    private Integer business_status;
    private Integer business_status_code;
    private String phone;
    private String full_address;

    @Column(name = "road_name_address")
    private String roadNameAddress;

    @Column(name = "hospital_name")
    private String hospitalName;

    @Column(name = "business_type_name")
    private String businessTypeName;

    private Integer healthcare_provider_count;
    private Integer patient_room_count;

    @Column(name = "total_number_of_beds")
    private Integer totalNumberOfBeds;

    private float total_area_size;
}
