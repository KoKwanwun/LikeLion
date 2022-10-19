package com.dbexercise;

import com.dbexercise.domain.User;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class UserDao {
    private ConnectionMaker connectionMaker;

    public UserDao(){
        connectionMaker = new AwsConnectionMaker();
    }

    public UserDao(ConnectionMaker connectionMaker) {
        this.connectionMaker = connectionMaker;
    }

    public void add() throws ClassNotFoundException, SQLException {
        Connection conn = connectionMaker.getConnection();
        // 쿼리 직접 작성
        PreparedStatement ps = conn.prepareStatement("INSERT INTO users(id, name, password) VALUES (?, ?, ?)");
        // 각각의 값을 넣기
        ps.setString(1, "1");
        ps.setString(2, "Kwanwun");
        ps.setString(3, "1234");

        // DB에 반영
        ps.executeUpdate();
        ps.close();
        conn.close();
    }

    public User get(String id) throws SQLException, ClassNotFoundException {
        Connection conn = connectionMaker.getConnection();
        // Select문 실행
        PreparedStatement ps = conn.prepareStatement("SELECT * from users where id = 1");

        ResultSet rs = ps.executeQuery();

        rs.next();
        User user = new User(rs.getString("id"), rs.getString("name"), rs.getString("password"));

        rs.close();
        ps.close();
        conn.close();

        return user;
    }

    public User findbyId(String id) throws SQLException, ClassNotFoundException {
        Connection conn = connectionMaker.getConnection();
        PreparedStatement ps = conn.prepareStatement("SELECT * from users where id = ?");
        ps.setString(1, id);
        ResultSet rs = ps.executeQuery();

        rs.next();

        User user = new User(rs.getString("id"), rs.getString("name"), rs.getString("password"));

        rs.close();
        ps.close();
        conn.close();

        return user;
    }

    public List<User> findAll() throws SQLException, ClassNotFoundException {
        Connection conn = connectionMaker.getConnection();
        // Select문 실행
        PreparedStatement ps = conn.prepareStatement("SELECT * from users");

        ResultSet rs = ps.executeQuery();

        List<User> userList = new ArrayList<>();

        while(rs.next()) {
            User user = new User(rs.getString("id"), rs.getString("name"), rs.getString("password"));
            userList.add(user);
        }

        rs.close();
        ps.close();
        conn.close();

        return userList;
    }

    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        UserDao userDao = new UserDao();
//        userDao.add();
        User user = userDao.get("1");
        System.out.println(user.getName());

        List<User> userList = userDao.findAll();
        for (User eachUser : userList) {
            System.out.println("ID : " + eachUser.getId());
            System.out.println("NAME : " + eachUser.getName());
            System.out.println("PASSWORD : " + eachUser.getPassword());
        }
    }
}
