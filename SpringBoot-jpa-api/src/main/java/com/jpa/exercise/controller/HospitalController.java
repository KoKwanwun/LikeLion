package com.jpa.exercise.controller;

import com.jpa.exercise.domain.Hospital;
import com.jpa.exercise.domain.dto.HospitalReadResponse;
import com.jpa.exercise.domain.dto.ReviewCreateRequest;
import com.jpa.exercise.domain.dto.ReviewCreateResponse;
import com.jpa.exercise.domain.dto.ReviewResponse;
import com.jpa.exercise.service.HospitalService;
import com.jpa.exercise.service.ReviewService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/api/v1/hospitals")
@RequiredArgsConstructor
public class HospitalController {

    private final ReviewService reviewService;
    private final HospitalService hospitalService;

    @PostMapping("/{id}/reviews")
    public ResponseEntity<ReviewCreateResponse> createReview(@PathVariable Long id, @RequestBody ReviewCreateRequest reviewCreateRequest) {
        return ResponseEntity.ok().body(reviewService.add(reviewCreateRequest));
    }

    @GetMapping("/{hospitalId}/reviews")
    public ResponseEntity<List<ReviewResponse>> findAllByHospitalId(@PathVariable Long hospitalId) {
        return ResponseEntity.ok().body(reviewService.findAllByHospitalId(hospitalId));
    }

    @GetMapping("/{hospitalId}")
    public ResponseEntity<HospitalReadResponse> hospitalAndReviews(@PathVariable Long hospitalId) {
        Hospital hospital = hospitalService.findById(hospitalId);
        HospitalReadResponse hospitalReadResponse = HospitalReadResponse.fromEntity(hospital);
        return ResponseEntity.ok().body(hospitalReadResponse);
    }
}
