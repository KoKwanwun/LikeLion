package com.security.service;

import com.security.utils.JwtTokenUtil;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ReviewService {
    public String write(String userName) {
        return userName + "님의 리뷰가 등록되었습니다.";
    }
}
