package likelion.dao;

import likelion.domain.User;
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
    ApplicationContext context;

    @Test
    void addAndSelect() throws SQLException, ClassNotFoundException {
        UserDao userDao = context.getBean("awsUserDao", UserDao.class);
        userDao.deleteAll();
        assertEquals(0, userDao.getCount());

        String id = "11";
        User user = new User(id, "Lotto", "6666");
        userDao.add(user);
        assertEquals(1, userDao.getCount());


        User selectedUser = userDao.findbyId(id);
        assertEquals("Lotto", selectedUser.getName());
    }

    @Test
    void count() throws SQLException, ClassNotFoundException {
        UserDao userDao = context.getBean("awsUserDao", UserDao.class);
        User user1 = new User("1", "박성철", "1234");
        User user2 = new User("2", "이길원", "2345");
        User user3 = new User("3", "박범진", "3456");

        userDao.deleteAll();
        assertEquals(0, userDao.getCount());

        userDao.add(user1);
        assertEquals(1, userDao.getCount());

        userDao.add(user2);
        assertEquals(2, userDao.getCount());

        userDao.add(user3);
        assertEquals(3, userDao.getCount());
    }
}