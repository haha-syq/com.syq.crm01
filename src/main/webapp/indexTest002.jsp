<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2021/6/21
  Time: 16:14
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>逐个接收请求参数</title>
</head>
<body>
    <p>请求参数信息与处理方法形参名称一致</p>
    <form action="text02/first.do" method="post">
        姓名：<input type="text" name="name"><br/>
        年龄：<input type="text" name="age"><br/>
        <input type="submit" value="post方式提交参数">
    </form>
    <br/>
    <p>请求参数信息与处理方法形参名称不一致</p>
    <form action="text02/second.do" method="post">
        姓名：<input type="text" name="rname"><br/>
        年龄：<input type="text" name="rage"><br/>
        <input type="submit" value="post方式提交参数">
    </form>
    <br/>
</body>
</html>
