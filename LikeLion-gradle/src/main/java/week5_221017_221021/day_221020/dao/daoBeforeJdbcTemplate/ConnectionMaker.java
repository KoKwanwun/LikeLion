package week5_221017_221021.day_221020.dao.daoBeforeJdbcTemplate;

import java.sql.Connection;
import java.sql.SQLException;

public interface ConnectionMaker {
    public Connection getConnection() throws SQLException;
}
