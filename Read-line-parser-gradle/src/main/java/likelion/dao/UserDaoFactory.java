package likelion.dao;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class UserDaoFactory {
    // Factory는 조립을 해줌 - DAO에서는
    @Bean
    public UserDao awsUserDao() {
        AwsConnectionMaker awsConnectionMaker = new AwsConnectionMaker();
        // context 재사용 하는 부분이 많은 코드
        UserDao userDao = new UserDao(awsConnectionMaker);
        return userDao;
    }

    @Bean
    public UserDao localUserDao() {
        UserDao userDao = new UserDao(new LocalConnectionMaker());
        return userDao;
    }
}
