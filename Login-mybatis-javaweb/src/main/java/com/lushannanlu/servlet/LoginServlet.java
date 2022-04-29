package com.lushannanlu.servlet;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.lushannanlu.Control.isLogin;
import com.lushannanlu.pojo.User;
import com.mysql.cj.xdevapi.JsonArray;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

import static java.lang.System.out;

@WebServlet("/login")
public class LoginServlet extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("utf-8");
        resp.setCharacterEncoding("utf-8");
        resp.setContentType("text/json;charset=utf-8");
        String person = req.getParameter("person");
        out.println(person);
//        isLogin isLogin = new isLogin();
//        User user = isLogin.queryUserByName(username);
//        PrintWriter outprint=resp.getWriter();
//        if(user==null){
//            String s = new String("没找到");
//            String msg = JSON.toJSONString(s);
//            outprint.write(msg);
//        }else{
//            //fastjson将java对象转为json字符串返回给ajax，由于ajax接收类型为json所以会自动转为json对象
//            String s = JSON.toJSONString(user);
//            outprint.write(s);
//        }
//
//        outprint.close();
    }
}
