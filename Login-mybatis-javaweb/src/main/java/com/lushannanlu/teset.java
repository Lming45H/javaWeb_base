package com.lushannanlu;

import com.lushannanlu.Dao.UserDao;
import com.lushannanlu.pojo.User;
import com.lushannanlu.utils.MybatisUtil;
import org.apache.ibatis.session.SqlSession;

import java.util.List;

public class teset {
    public static void main(String[] args) {
        SqlSession sqlSession = MybatisUtil.getSqlSession();
        UserDao mapper = sqlSession.getMapper(UserDao.class);
        User zhangsan = mapper.queryUser("zhangsan");
        System.out.println(zhangsan.toString());
        sqlSession.close();
    }
}
