package week5_221017_221021.day_221020.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DeleteAllStrategy implements StatementStrategy{
    @Override
    public PreparedStatement makePreparedStatement(Connection conn) throws SQLException {
        return conn.prepareStatement("DELETE FROM users");
    }
}
