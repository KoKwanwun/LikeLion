package com.mustache.bbs.domain;

import com.mustache.bbs.dto.UserResponse;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String username;
    private String password;

    public static UserResponse of(User user) {
        return new UserResponse(user.id, user.username);
    }
}
