package com.mustache.bbs.service;

import com.mustache.bbs.domain.Hospital;
import com.mustache.bbs.domain.User;
import com.mustache.bbs.domain.Visit;
import com.mustache.bbs.domain.dto.VisitCreateRequest;
import com.mustache.bbs.exception.ErrorCode;
import com.mustache.bbs.exception.HospitalReviewException;
import com.mustache.bbs.repository.HospitalRepository;
import com.mustache.bbs.repository.UserRepository;
import com.mustache.bbs.repository.VisitRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class VisitService {

    private final VisitRepository visitRepository;
    private final HospitalRepository hospitalRepository;
    private final UserRepository userRepository;

    public void createVisit(VisitCreateRequest dto, String userName) {
        // hospital이 없을 때 등록 불가
        Hospital hospital = hospitalRepository.findById(dto.getHospitalId())
                .orElseThrow(() -> new HospitalReviewException(ErrorCode.HOSPITAL_NOT_FOUND, String.format("hospitalId:%s 가 없습니다.", dto.getHospitalId())));

        // user가 없을 때 등록 불가
        User user = userRepository.findByUsername(userName)
                .orElseThrow(() -> new HospitalReviewException(ErrorCode.USER_NOT_FOUND, String.format("'%s' user 가 없습니다.", userName)));

        Visit visit = Visit.builder()
                .user(user)
                .hospital(hospital)
                .disease(dto.getDisease())
                .amount(dto.getAmount())
                .build();
        visitRepository.save(visit);
    }
}
