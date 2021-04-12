<%--
  User: HyoJoo-W
  Date: 2021/4/11
  Time: 14:16
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Login!</title>
    <!--在线引入bootstrap -->
    <link rel="stylesheet" href="http://cdn.bootcss.com/bootstrap/3.3.0/css/bootstrap.min.css">
    <script src="http://cdn.bootcss.com/jquery/1.11.1/jquery.min.js"></script>
    <script src="http://cdn.bootcss.com/bootstrap/3.3.0/js/bootstrap.min.js"></script>
</head>
<body>
    <div>
        <form action="${pageContext.request.contextPath}/loginServlet" method="post">
            <label for="name">用户名：</label>
            <input type="text" name="name" id="name" value="${requestScope.original.getName()}"><br>
            <label for="password">密码：</label>
            <input type="text" name="password" id="password" value="${requestScope.original.getPassword()}"><br>
            <input type="submit" value="提交">
        </form>
    </div>
    <span style="color: red">${requestScope.err_msg}</span>
    <div>
        <a href="#">成为管理员？</a>
    </div>
</body>
</html>
