<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2021/6/21
  Time: 18:54
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
  String basePath=request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+request.getContextPath()+"/";
%>
<html>
<head>
    <title>处理器方法返回String表示视图名称</title>
    <base href="<%=basePath%>">
</head>
<body>
<p>处理器方法返回String表示视图名称</p>
<p><%=request.getContextPath()%></p>
<form action="text04/returnString-View.do" method="post">
    姓名：<input type="text" name="name"><br/>
    年龄：<input type="text" name="age"><br/>
    <input type="submit" value="post提交"/>
</form>

<img src="img/p1.png" alt="我是一个静态资源，无法显示">
<br/>
</body>
</html>
