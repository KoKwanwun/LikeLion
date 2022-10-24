package week5_221017_221021.day_221020.dao;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import week5_221017_221021.day_221020.domain.User;

import java.sql.SQLException;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(SpringExtension.class)
@ContextConfiguration(classes = UserDaoFactory.class)
class UserDaoTest {
    @Autowired
    private ApplicationContext context;
    private UserDao userDao;
    private User user1;
    private User user2;
    private User user3;

    @BeforeEach
    public void setUp(){
        userDao = context.getBean("awsUserDao", UserDao.class);
        user1 = new User("1", "박성철", "1234");
        user2 = new User("2", "이길원", "2345");
        user3 = new User("3", "박범진", "3456");
    }


    @Test
    void addAndGet() throws SQLException, ClassNotFoundException {


        userDao.deleteAll();
        assertEquals(0, userDao.getCount());

        userDao.add(user1);
        assertEquals(1, userDao.getCount());

        userDao.add(user2);
        assertEquals(2, userDao.getCount());

        User selectedUser = userDao.findbyId(user1.getId());
        assertEquals(user1.getName(), selectedUser.getName());
    }

    @Test
    void userNull() {
        assertThrows(EmptyResultDataAccessException.class, ()->{
            userDao.findbyId("30");
        });
    }

    @Test
    @DisplayName("없을 때 빈 리스트를 리턴하는지, 있을 때 개수만큼 리턴하는지")
    void getAllTest() {
        userDao.deleteAll();
        List<User> users = userDao.getAll();
        assertEquals(0, users.size());
        userDao.add(user1);
        userDao.add(user2);
        userDao.add(user3);
        users = userDao.getAll();
        assertEquals(3, users.size());
    }
}