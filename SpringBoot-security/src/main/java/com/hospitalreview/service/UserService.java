package com.hospitalreview.service;

import com.hospitalreview.domain.User;
import com.hospitalreview.domain.dto.UserDto;
import com.hospitalreview.domain.dto.UserJoinRequest;
import com.hospitalreview.exception.ErrorCode;
import com.hospitalreview.exception.HospitalReviewException;
import com.hospitalreview.repository.UserRepository;
import com.hospitalreview.utils.JwtTokenUtil;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserService {

    private final UserRepository userRepository;
    private final BCryptPasswordEncoder encoder;

    @Value("${jwt.token.secret}")
    private String secretKey;
    private long expireTimeMs = 1000 * 60 * 60;  // 1시간

    public UserDto join(UserJoinRequest request){
        // 비즈니스 로직 - 회원 가입

        // 회원 userName(id) 중복 Check
        // 중복이면 회원가입 X -> Exception(예외) 발생
        userRepository.findByUserName(request.getUserName())
                .ifPresent(user -> {
                    throw new HospitalReviewException(ErrorCode.DUPLICATED_USER_NAME, String.format("Username:%s", request.getUserName()));
                });

        // 중복 Check 통화하면 회원가입 -> .save()
        User savedUser = userRepository.save(request.toEntity(encoder.encode(request.getPassword())));

        return UserDto.builder()
                .id(savedUser.getId())
                .userName(savedUser.getUserName())
                .emailAddress(savedUser.getEmailAddress())
                .build();
    }

    public String login(String userName, String password) {

        // userName 있는지 여부 확인
        // 없으면 NOT_FOUND 에러 발생
        User user = userRepository.findByUserName(userName)
                .orElseThrow(() -> new HospitalReviewException(ErrorCode.NOT_FOUND, String.format("%s는 가입된 적이 없습니다.", userName)));

        // password 일치 하는지 여부 확인
        if(!encoder.matches(password, user.getPassword())) {
            throw new HospitalReviewException(ErrorCode.INVALID_PASSWORD, "userName 또는 password가 잘못됐습니다.");
        }

        // 두가지 확인 중 예외 안났으면 Token 발행
        return JwtTokenUtil.createToken(userName, secretKey, expireTimeMs);
    }

    public User getUserByUserName(String userName) {
        return userRepository.findByUserName(userName)
                .orElseThrow(() -> new HospitalReviewException(ErrorCode.NOT_FOUND, ""));
    }
}
