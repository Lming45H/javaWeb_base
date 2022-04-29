package com.lushannanlu.cookie;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

public class CookieDemo01 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //解决中文乱码
        request.setCharacterEncoding("utf-8");
        response.setCharacterEncoding("utf-8");
        PrintWriter writer = response.getWriter();
        //从客户端获取cookie
        Cookie[] cookies = request.getCookies();
        if(cookies!=null){
            for (int i=0;i<cookies.length;i++){
                Cookie cookie = cookies[i];
                if("lastLoginTime".equals(cookie.getName())){

                    long l = Long.parseLong(cookie.getValue());
                    Date date = new Date(l);
                    writer.write(date.toString());
                }
            }
        }else{
            writer.write("这是第一次访问本站:");
        }
        //服务端向客户端响应一个cookie
        Cookie cookie = new Cookie("lastLoginTime", System.currentTimeMillis()+"");

        response.addCookie(cookie);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doGet(req,resp);
    }
}
