<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2021/6/21
  Time: 18:27
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<p>使用java对象接收请求参数</p>
<form action="${pageContext.request.contextPath}/text03/first.do" method="post">
<%--
        不加/ 访问http://localhost:8080/Spring_MVC/text03/first.do
            是以字符串的形式拼接
            缺点：递归访问时“text03”会重复拼接
            解决方案：
                1、加入${pageContext.request.contextPath}
                2、加入base标签，是html语言的标签，表示当前页面中访问地址的基地址。
                    页面中所有没有/的标签都是以base标签中的地址为参考地址
                    例如indexTest004.jsp
        加入/ 访问http://localhost:8080/text03/first.do
            是以参考路劲开始
--%>

    姓名：<input type="text" name="name"><br/>
    年龄：<input type="text" name="age"><br/>
    <input type="submit" value="post方式提交参数">
</form>
</body>
</html>
