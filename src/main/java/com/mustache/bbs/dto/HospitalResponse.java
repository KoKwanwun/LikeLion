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

    public HospitalResponse(Integer id, String open_service_name, Integer open_local_government_code, String management_number, Timestamp license_date, Integer business_status, Integer business_status_code, String phone, String full_address, String roadNameAddress, String hospitalName, String businessTypeName, Integer healthcare_provider_count, Integer patient_room_count, Integer totalNumberOfBeds, float total_area_size) {
        this.id = id;
        this.open_service_name = open_service_name;
        this.open_local_government_code = open_local_government_code;
        this.management_number = management_number;
        this.license_date = license_date;
        this.business_status = business_status;
        this.business_status_code = business_status_code;
        this.phone = phone;
        this.full_address = full_address;
        this.roadNameAddress = roadNameAddress;
        this.hospitalName = hospitalName;
        this.businessTypeName = businessTypeName;
        this.healthcare_provider_count = healthcare_provider_count;
        this.patient_room_count = patient_room_count;
        this.totalNumberOfBeds = totalNumberOfBeds;
        this.total_area_size = total_area_size;
    }

    private String businessStatusName;

    public void setBusinessStatusName(String businessStatusName) {
        this.businessStatusName = businessStatusName;
    }
}
