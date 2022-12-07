package com.mustache.bbs.controller;

import com.mustache.bbs.domain.dto.UserRequest;
import com.mustache.bbs.domain.dto.UserResponse;
import com.mustache.bbs.service.UserService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/users")
public class UserRestController {

    private final UserService userService;

    public UserRestController(UserService userService) {
        this.userService = userService;
    }


    @GetMapping("/{id}")
    public ResponseEntity<UserResponse> findById(@PathVariable Long id) {
        UserResponse userResponse = userService.getUser(id);
        return ResponseEntity.ok().body(userResponse);
    }

    @PostMapping("/add")
    public ResponseEntity<UserResponse> add(@RequestBody UserRequest dto) {
        UserResponse savedResponse = userService.addUser(dto);
        return ResponseEntity.ok().body(savedResponse);
    }
}