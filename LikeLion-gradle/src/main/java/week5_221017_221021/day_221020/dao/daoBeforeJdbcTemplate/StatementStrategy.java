package week5_221017_221021.day_221020.dao.daoBeforeJdbcTemplate;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public interface StatementStrategy {
    PreparedStatement makePreparedStatement(Connection conn) throws SQLException;
}
