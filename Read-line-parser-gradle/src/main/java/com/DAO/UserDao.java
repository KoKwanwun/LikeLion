package com.DAO;

import com.DAO.domain.User;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class UserDao {

    private AwsConnectionMaker awsConnectionMaker;

    // 매개 변수가 없다면 새로 생성하고
    // 받은 매개 변수가 있다면 awsConnectionMaker에 할당
    public UserDao() {
        this.awsConnectionMaker = new AwsConnectionMaker();
    }

    public UserDao(AwsConnectionMaker awsConnectionMaker) {
        this.awsConnectionMaker = awsConnectionMaker;
    }

    public void add(User user) throws SQLException, ClassNotFoundException {
        Connection conn = awsConnectionMaker.getConnection();
        PreparedStatement ps = conn.prepareStatement("INSERT INTO users(id, name, password) VALUES (?, ?, ?)");
        ps.setString(1, user.getId());
        ps.setString(2, user.getName());
        ps.setString(3, user.getPassword());

        ps.executeUpdate();
        ps.close();
        conn.close();
    }

    public User findbyId(String id) throws SQLException, ClassNotFoundException {
        Connection conn = awsConnectionMaker.getConnection();
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
        Connection conn = awsConnectionMaker.getConnection();
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

    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        UserDao userDao = new UserDao();
        userDao.add(new User("7", "Eclipse", "880"));

        List<User> userList = userDao.findAll();
        for (User user : userList) {
            System.out.println("ID : " + user.getId());
            System.out.println("NAME : " + user.getName());
            System.out.println("PASSWORD : " + user.getPassword());
        }
    }
}
