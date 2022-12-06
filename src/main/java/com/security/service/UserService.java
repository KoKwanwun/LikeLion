package com.security.service;

import com.security.utils.JwtTokenUtil;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserService {

    @Value("${jwt.token.secret}")
    private String secretKey;

    private long expireTimeMs = 1000 * 60 * 60;  // 1시간

    public String getToken() {
        // 토큰 발행
        return JwtTokenUtil.createToken("kwanwun", secretKey, expireTimeMs);
    }
}
