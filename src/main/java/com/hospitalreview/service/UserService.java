package com.hospitalreview.service;

import com.hospitalreview.domain.User;
import com.hospitalreview.domain.dto.UserDto;
import com.hospitalreview.domain.dto.UserJoinRequest;
import com.hospitalreview.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserService {

    private final UserRepository userRepository;

    public UserDto join(UserJoinRequest request){
        // 비즈니스 로직 - 회원 가입

        // 회원 userName(id) 중복 Check
        // 중복이면 회원가입 X -> Exception(예외) 발생
        userRepository.findByUserName(request.getUserName())
                .ifPresent(user -> {
                    throw new RuntimeException("해당 UserName이 중복됩니다.");
                });

        // 중복 Check 통화하면 회원가입 -> .save()
        User savedUser = userRepository.save(request.toEntity());

        return UserDto.builder()
                .id(savedUser.getId())
                .userName(savedUser.getUserName())
                .emailAddress(savedUser.getEmailAddress())
                .build();
    }
}
