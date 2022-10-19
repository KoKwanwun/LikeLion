package likelion.dao;

public class UserDaoFactory {
    // Factory는 조립을 해줌 - DAO에서는
    public UserDao awsUserDao() {
        AwsConnectionMaker awsConnectionMaker = new AwsConnectionMaker();
        UserDao userDao = new UserDao(awsConnectionMaker);
        return userDao;
    }

    public UserDao localUserDao() {
        UserDao userDao = new UserDao(new LocalConnectionMaker());
        return userDao;
    }
}
