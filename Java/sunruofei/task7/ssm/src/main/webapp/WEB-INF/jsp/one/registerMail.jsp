<%--
  Created by IntelliJ IDEA.
  User: 孙若飞
  Date: 2019/3/11
  Time: 19:12
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="/registerByMail" name="user" method="post">
    用户名:<input type="text" name="name">
    密码:<input type="text" name="password">
    邮箱:<input type="text" name="mail">
    验证码:<input type="text" name="code">
    手机号:<input type="text" name="phone">
    <input type="submit" value="注册"><br>
</form>
</body>
</html>