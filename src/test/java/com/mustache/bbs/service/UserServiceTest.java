package com.mustache.bbs.service;

import com.mustache.bbs.domain.User;
import com.mustache.bbs.domain.dto.UserRequest;
import com.mustache.bbs.domain.dto.UserResponse;
import com.mustache.bbs.repository.UserRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.ArgumentMatchers.any;

class UserServiceTest {
    private UserRepository userRepository = Mockito.mock(UserRepository.class);
    private UserService userService;

    @BeforeEach
    void setUp() {
        userService = new UserService(userRepository);  // 수동 DI
    }

    @Test
    @DisplayName("회원 등록 성공 메세지가 나오는지")
    void addTest() {

        Mockito.when(userRepository.save(any()))
                .thenReturn(new User(1l, "Ko", "1234"));

        UserResponse userResponse = userService.addUser(new UserRequest("Ko", "1234"));
        assertEquals("Ko", userResponse.getUsername());
        assertEquals("등록이 완료되었습니다.", userResponse.getMessage());
    }
}