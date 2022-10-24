package likelion.dao;

import likelion.domain.User;
import org.springframework.dao.EmptyResultDataAccessException;

import javax.sql.DataSource;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class UserDao {
    private final DataSource dataSource;  //DataSource를 의존하게 변경

    public UserDao(DataSource dataSource) {     // 생성자도 변경
        this.dataSource = dataSource;
    }

    public void jdbcContextWithStatementStrategy(StatementStrategy stmt) throws SQLException, ClassNotFoundException {
        Connection conn = null;
        PreparedStatement ps = null;

        try{
            conn = dataSource.getConnection();
            ps = stmt.makePreparedStatement(conn);
            ps.executeUpdate();
        } catch (SQLException e) {
            throw e;
        } finally {     // error가 나도 실행되는 블럭
            if(ps != null) {
                try {
                    ps.close();
                } catch (SQLException e) {
                }
            }
            if(conn != null){
                try {
                    conn.close();
                } catch (SQLException e) {
                }
            }
        }
    }

    public void add(User user) throws SQLException, ClassNotFoundException {
        StatementStrategy st = new AddStrategy(user);
        jdbcContextWithStatementStrategy(st);
    }

    public User findbyId(String id) throws SQLException, ClassNotFoundException {
        Connection conn = dataSource.getConnection();
        PreparedStatement ps = conn.prepareStatement("SELECT * from users where id = ?");
        ps.setString(1, id);
        ResultSet rs = ps.executeQuery();

        User user = null;
        if(rs.next()){
            user = new User(rs.getString("id"), rs.getString("name"), rs.getString("password"));
        }
        rs.close();
        ps.close();
        conn.close();

        if (user == null) throw new EmptyResultDataAccessException(1);

        return user;
    }

    public List<User> findAll() throws SQLException, ClassNotFoundException {
        Connection conn = dataSource.getConnection();
        PreparedStatement ps = conn.prepareStatement("SELECT * from users");
        ResultSet rs = ps.executeQuery();

        List<User> userList = new ArrayList<>();

        while(rs.next()){
            User user = new User(rs.getString("id"), rs.getString("name"), rs.getString("password"));
            userList.add(user);
        }
        rs.close();
        ps.close();
        conn.close();

        return userList;
    }

    public void deleteAll() throws SQLException, ClassNotFoundException {
        jdbcContextWithStatementStrategy(new DeleteAllStrategy());
    }

    public int getCount() throws SQLException, ClassNotFoundException {
        Connection conn = null;
        PreparedStatement ps = null;
        ResultSet rs = null;

        try {
            conn = dataSource.getConnection();

            ps = conn.prepareStatement("SELECT count(*) FROM users");

            rs = ps.executeQuery();
            rs.next();
            return rs.getInt(1);
        } catch (SQLException e) {
            throw e;
        } finally {
            if(rs != null){
                try {
                    rs.close();
                } catch (SQLException e) {
                }
            }
            if(ps != null) {
                try {
                    ps.close();
                } catch (SQLException e) {
                }
            }
            if(conn != null){
                try {
                    conn.close();
                } catch (SQLException e) {
                }
            }
        }
    }
}
