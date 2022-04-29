<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="utf-8" %>
<html>
<head>
    <script src="./static/js/jquery-3.5.1.min.js"></script>
    <script src="./static/js/login.js"></script>
    <link rel="stylesheet" href="./static/css/index.css">
</head>
<body>
    <div class="container">
        <form action="" method="post" class="form_box">
            <span>用户名：</span><input type="text" name="username" class="username"><br>
            <span>密码：</span><input type="password" name="password" class="password">
            <button type="button" onclick="login()">登录</button>
        </form>

    </div>
</body>
</html>
