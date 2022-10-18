package com.DBexercise;

import com.DBexercise.domain.User;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.sql.SQLException;

import static org.junit.jupiter.api.Assertions.*;

class UserDaoTest {
    @Test
    void addAndSelect() throws SQLException, ClassNotFoundException {
        UserDao userDao = new UserDao();
        User user = new User("8", "Lotto", "6666");
//        userDao.add(user);

        User selectedUser = userDao.findbyId("8");
        Assertions.assertEquals("Lotto", selectedUser.getName());
    }
}