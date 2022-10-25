package com.likelion.dao;

import com.likelion.domain.User;
import org.springframework.dao.EmptyResultDataAccessException;

import java.sql.*;

public class UserDao {
    private ConnectionMaker connectionMaker;

    public UserDao() {
        this.connectionMaker = new AwsConnectionMaker();
    }

    public UserDao(ConnectionMaker connectionMaker) {
        this.connectionMaker = connectionMaker;
    }

    public void jdbcContextWithStatementStrategy(StatementStrategy stmt) throws SQLException {
        Connection c = null;
        PreparedStatement pstmt = null;
        try {
            c = connectionMaker.getConnection();

            pstmt = stmt.makePreparedStatement(c);

            pstmt.executeUpdate();
        } catch (SQLException e) {
            throw e;
        } finally {
            if(pstmt != null){
                try {
                    pstmt.close();
                } catch (SQLException e){
                }
            }
            if(c != null){
                try {
                    c.close();
                } catch (SQLException e) {
                }
            }
        }
    }

    public void add(User user) {
        try {
            Connection c = connectionMaker.getConnection();

            PreparedStatement pstmt = c.prepareStatement("INSERT INTO users(id, name, password) VALUES(?,?,?);");
            pstmt.setString(1, user.getId());
            pstmt.setString(2, user.getName());
            pstmt.setString(3, user.getPassword());

            pstmt.executeUpdate();

            pstmt.close();
            c.close();

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public User findById(String id) {
        try {
            Connection c = connectionMaker.getConnection();

            PreparedStatement pstmt = c.prepareStatement("SELECT * FROM users WHERE id = ?");
            pstmt.setString(1, id);

            ResultSet rs = pstmt.executeQuery();

            User user = null;

            if(rs.next()) {
                user = new User(rs.getString("id"), rs.getString("name"),
                        rs.getString("password"));
            }

            rs.close();
            pstmt.close();
            c.close();

            if(user == null) throw new EmptyResultDataAccessException(1);

            return user;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public void deleteAll() throws SQLException {
        jdbcContextWithStatementStrategy(new DeleteAllStatement());
    }

    public int getCount() throws SQLException {
        Connection c = null;
        PreparedStatement pstmt = null;
        ResultSet rs = null;

        try {
            c = connectionMaker.getConnection();
            pstmt = c.prepareStatement("select count(*) from users");
            rs = pstmt.executeQuery();
            rs.next();
            return rs.getInt(1);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            if(rs != null){
                try {
                    rs.close();
                } catch (SQLException e) {
                }
            }
            if(pstmt != null){
                try {
                    pstmt.close();
                } catch (SQLException e) {
                }
            }
            if(c != null){
                try {
                    c.close();
                } catch (SQLException e) {
                }
            }
        }
    }
}