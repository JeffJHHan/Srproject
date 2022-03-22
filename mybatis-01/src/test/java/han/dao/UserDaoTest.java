package han.dao;

import org.apache.ibatis.session.SqlSession;
import org.junit.Test;
import pojo.User;

import java.util.List;

public class UserDaoTest {
    @Test
    public void test(){
        SqlSession sqlSession = MybatisUtils.getSqlsession();
        try{
            UserDao userDao = sqlSession.getMapper(UserDao.class);
            List<User> userlist = userDao.getUserList();
            for(User user:userlist){
                System.out.println(user);
            }
        }
        catch(Exception e){

        }
        finally{
            sqlSession.close();
        }
    }
    @Test
    public void inserttest(){
        SqlSession sqlSession = MybatisUtils.getSqlsession();
        UserDao userDao = sqlSession.getMapper(UserDao.class);
        userDao.createTable("5678");
        sqlSession.close();
    }
}
