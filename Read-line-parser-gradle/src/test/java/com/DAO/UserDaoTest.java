package com.DAO;

import com.DAO.domain.User;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.sql.SQLException;

class UserDaoTest {
    @Test
    void addAndSelect() throws SQLException, ClassNotFoundException {
        UserDao userDao = new UserDao(new AwsConnectionMaker());
        User user = new User("10", "Lotto", "6666");
//        userDao.add(user);

        User selectedUser = userDao.findbyId("10");
        Assertions.assertEquals("Lotto", selectedUser.getName());
    }

    @Test
    void addAndSelectAws() throws SQLException, ClassNotFoundException {
        AWSUserDaoImpl userDao = new AWSUserDaoImpl();
        User user = new User("10", "Lotto", "6666");
//        userDao.add(user);

        User selectedUser = userDao.findbyId("10");
        Assertions.assertEquals("Lotto", selectedUser.getName());
    }
}