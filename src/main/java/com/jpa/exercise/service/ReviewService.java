package com.jpa.exercise.service;

import com.jpa.exercise.domain.Hospital;
import com.jpa.exercise.domain.Review;
import com.jpa.exercise.domain.dto.ReviewCreateRequest;
import com.jpa.exercise.domain.dto.ReviewCreateResponse;
import com.jpa.exercise.domain.dto.ReviewResponse;
import com.jpa.exercise.repository.HospitalRepository;
import com.jpa.exercise.repository.ReviewRepository;
import org.springframework.stereotype.Service;

import javax.swing.text.html.Option;
import java.util.Optional;

@Service
public class ReviewService {
    private final HospitalRepository hospitalRepository;
    private final ReviewRepository reviewRepository;

    public ReviewService(HospitalRepository hospitalRepository, ReviewRepository reviewRepository) {
        this.hospitalRepository = hospitalRepository;
        this.reviewRepository = reviewRepository;
    }

    public ReviewResponse findById(Long id) {
        Optional<Review> review = reviewRepository.findById(id);
        if(review.isEmpty()){
            return new ReviewResponse(null, "", "", "", "");
        } else{
            return ReviewResponse.builder()
                    .id(review.get().getId())
                    .title(review.get().getTitle())
                    .content(review.get().getContent())
                    .userName(review.get().getUserName())
                    .hospitalName(review.get().getHospital().getHospitalName())
                    .build();
        }
        // orElseThrow 방식 -> 해당 id에 해당하는 review가 없다면 콘솔에 "해당 id가 없습니다."가 뜸
//        Review review = reviewRepository.findById(id)
//                .orElseThrow(() -> new RuntimeException("해당 id가 없습니다."));
//        return ReviewResponse.builder()
//                .id(review.getId())
//                .title(review.getTitle())
//                .content(review.getContent())
//                .userName(review.getUserName())
//                .build();
    }

    public ReviewCreateResponse add(ReviewCreateRequest reviewCreateRequest) {
        Optional<Hospital> hospital = hospitalRepository.findById(reviewCreateRequest.getHospitalId());
        Review review = Review.builder()
                .title(reviewCreateRequest.getTitle())
                .content(reviewCreateRequest.getContent())
                .userName(reviewCreateRequest.getUserName())
                .hospital(hospital.get())
                .build();
        Review savedReview = reviewRepository.save(review);
        return ReviewCreateResponse.builder()
                .id(savedReview.getId())
                .title(savedReview.getTitle())
                .content(savedReview.getContent())
                .userName(savedReview.getUserName())
                .message("리뷰 등록을 성공했습니다.")
                .build();
    }
}
