package com.springboot.springbootcoreguide.controller;

import com.springboot.springbootcoreguide.dao.UserDao;
import com.springboot.springbootcoreguide.domain.dao.User;
import com.springboot.springbootcoreguide.domain.dto.MemberDto;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/user")
public class UserController {
    private final UserDao userDao;

    public UserController(UserDao userDao) {
        this.userDao = userDao;
    }

    @PostMapping("")
    public String add(@RequestBody User user) {
        userDao.add(user);
        return String.format("%s번에 정보가 등록되었습니다.", user.getId());
    }

    @DeleteMapping(value = "/delete/{id}")
    public String deleteById(@PathVariable String id) {
        userDao.deleteById(id);
        return String.format("%s번의 정보가 삭제되었습니다.", id);
    }

    @DeleteMapping(value = "/delete/all")
    public String deleteAll() {
        userDao.deleteAll();
        return "모든 정보가 삭제되었습니다.";
    }

    @GetMapping(value = "/select/{id}")
    public String selectById(@PathVariable String id) {
        User selectedUser = userDao.findById(id);
        return String.format("id : %s\nname : %s\npassword : %s",
                selectedUser.getId(), selectedUser.getName(), selectedUser.getPassword());
    }

    @GetMapping(value = "/select/all")
    public String selectAll() {
        List<User> users = userDao.getAll();

        String str = "";

        for (User user : users) {
            str += String.format("id : %s\nname : %s\npassword : %s\n\n",
                    user.getId(), user.getName(), user.getPassword());
        }

        return str;
    }
}
