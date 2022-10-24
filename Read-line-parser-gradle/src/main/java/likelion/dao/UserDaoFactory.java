package likelion.dao;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.SimpleDriverDataSource;

import javax.sql.DataSource;
import java.util.Map;

@Configuration
public class UserDaoFactory {
    // Connection이 아닌 Interface로 내재되어있는 Datasource로 변경
    @Bean
    public UserDao awsUserDao() {
        return new UserDao(awsDataSource());
    }

    @Bean
    public UserDao localUserDao() {
        return new UserDao(localDataSource());
    }

    @Bean
    DataSource awsDataSource() {
        Map<String, String> env = System.getenv();
        SimpleDriverDataSource dataSource = new SimpleDriverDataSource();
        dataSource.setDriverClass(com.mysql.cj.jdbc.Driver.class);
        dataSource.setUrl(env.get("DB_HOST"));
        dataSource.setUsername(env.get("DB_USER"));
        dataSource.setPassword(env.get("DB_PASSWORD"));
        return dataSource;
    }
    @Bean
    DataSource localDataSource() {
        SimpleDriverDataSource dataSource = new SimpleDriverDataSource();
        dataSource.setDriverClass(com.mysql.cj.jdbc.Driver.class);
        dataSource.setUrl("localhost");
        dataSource.setUsername("root");
        dataSource.setPassword("12345678");
        return dataSource;
    }
}
