package com.lushannanlu.Dao;

import com.lushannanlu.pojo.User;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

public interface UserDao {
    @Select("select * from users where username = #{username}")
    User queryUser(@Param("username") String username);
}
