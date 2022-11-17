package com.mustache.bbs.dto;

import com.mustache.bbs.domain.User;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class UserRequest {
    private String username;
    private String password;

    public User toEntity() {
        return new User(username, password);
    }
}
