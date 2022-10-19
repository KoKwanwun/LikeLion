package likelion.dao;

import likelion.domain.User;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import java.sql.SQLException;

@ExtendWith(SpringExtension.class)
@ContextConfiguration(classes = UserDaoFactory.class)
class UserDaoTest {

    @Autowired
    ApplicationContext context;

    @Test
    void addAndSelect() throws SQLException, ClassNotFoundException {
//        UserDao userDao = new UserDao(new AwsConnectionMaker());
//        Factory 적용
//        UserDao userDao = new UserDaoFactory().awsUserDao();
//        Local에도 적용 가능
//        UserDao userDao = new UserDaoFactory().localUserDao();
        UserDao userDao = context.getBean("awsUserDao", UserDao.class);
        UserDao userDao2 = context.getBean("awsUserDao", UserDao.class);

        User user = new User("10", "Lotto", "6666");
//        userDao.add(user);

        User selectedUser = userDao.findbyId("10");
        Assertions.assertEquals("Lotto", selectedUser.getName());
    }
}