package com.lushannanlu;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.lushannanlu.Dao.UserDao;
import com.lushannanlu.pojo.User;
import com.lushannanlu.utils.MybatisUtil;
import org.apache.ibatis.session.SqlSession;

import java.util.List;

public class teset {
    public static void main(String[] args) {
        User user = new User("李明季", "35335");
        //将java对象转为json对象
        Object o = JSON.toJSON(user);
        //将json对象转为json字符串
        String s = JSON.toJSONString(o);

        //将json字符串转为json对象
        JSONObject jsonObject = JSON.parseObject(s);
        //将json对象转为java对象
        User user1 = JSON.toJavaObject(jsonObject, User.class);



    }
}
