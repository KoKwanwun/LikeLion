package com.likelion.dao;

@c
public class UserDaoFactory {
    public UserDao awsUserDao() {
        return new UserDao(new AwsConnectionMaker());
    }
}
