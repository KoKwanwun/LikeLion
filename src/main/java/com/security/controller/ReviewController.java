package com.security.controller;

import lombok.extern.slf4j.Slf4j;
import org.apache.coyote.Response;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/reviews")
@Slf4j
public class ReviewController {

    @PostMapping
    public ResponseEntity<String> authentication(Authentication authentication){
        log.info("Controller message:{}", authentication.getName());
        return ResponseEntity.ok().body("권한 부여 성공");
    }
}
