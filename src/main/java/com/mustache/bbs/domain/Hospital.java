package com.mustache.bbs.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.criteria.CriteriaBuilder;
import java.sql.Timestamp;

@Entity
@Table(name = "nation_wide_hospitals")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Hospital {
    @Id
    private Integer id;
    private String open_service_name;
    private Integer open_local_government_code;
    private String management_number;
    private Timestamp license_date;
    private Integer business_status;
    private Integer business_status_code;
    private String phone;
    private String full_address;
    private String road_name_address;
    private String hospital_name;
    private String business_type_name;
    private Integer healthcare_provider_count;
    private Integer patient_room_count;
    private Integer total_number_of_beds;
    private float total_area_size;
}
