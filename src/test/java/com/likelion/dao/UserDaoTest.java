package com.likelion.dao;

import com.likelion.domain.User;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(SpringExtension.class)
@ContextConfiguration(classes = UserDaoFactory.class)
class UserDaoTest {
    @Test
    void addAndget() {
        UserDao userDao = new UserDao();

        User user = new User("5", "김토익", "1234");
        userDao.add(user);

        User selectedUser = userDao.findById("5");
        assertEquals(user.getName(), selectedUser.getName());
    }
}