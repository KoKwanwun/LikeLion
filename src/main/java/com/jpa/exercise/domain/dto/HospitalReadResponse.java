package com.jpa.exercise.domain.dto;

import com.jpa.exercise.domain.Hospital;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.List;
import java.util.stream.Collectors;

@Builder
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class HospitalReadResponse {
    private Long id;
    private String hospitalName;
    private String roadNameAddress;
    private List<ReviewResponse> reviews;

    public static HospitalReadResponse fromEntity(Hospital hospital) {
        return HospitalReadResponse.builder()
                .id(hospital.getId())
                .hospitalName(hospital.getHospitalName())
                .roadNameAddress(hospital.getRoadNameAddress())
                .reviews(hospital.getReviews().stream().map(review -> ReviewResponse.fromEntity(review))
                        .collect(Collectors.toList())).build();
    }
}
