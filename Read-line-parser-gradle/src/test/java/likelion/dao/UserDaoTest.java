package likelion.dao;

import likelion.domain.User;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.sql.SQLException;

class UserDaoTest {
    @Test
    void addAndSelect() throws SQLException, ClassNotFoundException {
//        UserDao userDao = new UserDao(new AwsConnectionMaker());
        // 위의 코드를 Factory를 적용
        UserDao userDao = new UserDaoFactory().awsUserDao();
        // Local에도 적용 가능
//        UserDao userDao = new UserDaoFactory().localUserDao();

        User user = new User("10", "Lotto", "6666");
//        userDao.add(user);

        User selectedUser = userDao.findbyId("10");
        Assertions.assertEquals("Lotto", selectedUser.getName());
    }
}