package com.mustache.bbs.service;

import com.mustache.bbs.domain.User;
import com.mustache.bbs.dto.UserResponse;
import com.mustache.bbs.repository.UserRepository;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserService {

    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public UserResponse getUser(Long id) {
        Optional<User> optionalUser = userRepository.findById(id);
        User user = optionalUser.get();
        UserResponse userResponse = User.of(user);

        return userResponse;
    }

}
