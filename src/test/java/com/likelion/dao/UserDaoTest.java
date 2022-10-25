package com.likelion.dao;

import com.likelion.domain.User;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import java.sql.SQLException;

import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(SpringExtension.class)
@ContextConfiguration(classes = UserDaoFactory.class)
class UserDaoTest {

    @Autowired
    private ApplicationContext context;
    private User user1;
    private User user2;
    private User user3;

    @BeforeEach
    void setUp() {
        user1 = new User("1", "김삼성", "1234");
        user2 = new User("2", "강카카", "2345");
        user3 = new User("3", "박네이", "3456");
    }

    @Test
    void addAndget() throws SQLException {
        UserDao userDao = new UserDao();

        userDao.deleteAll();
        assertEquals(0, userDao.getCount());

        userDao.add(user1);
        userDao.add(user2);
        userDao.add(user3);
        assertEquals(3, userDao.getCount());
    }
}