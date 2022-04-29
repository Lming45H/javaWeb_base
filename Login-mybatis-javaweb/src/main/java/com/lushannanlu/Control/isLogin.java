package com.lushannanlu.Control;

import com.lushannanlu.Dao.UserDao;
import com.lushannanlu.pojo.User;
import com.lushannanlu.utils.MybatisUtil;
import org.apache.ibatis.session.SqlSession;

public class isLogin {
    //查找数据库中是否有此人
    public User queryUserByName(String username){
        SqlSession sqlSession = MybatisUtil.getSqlSession();
        UserDao mapper = sqlSession.getMapper(UserDao.class);
        User user = mapper.queryUser(username);
        return user;
    }
}
