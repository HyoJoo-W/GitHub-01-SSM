<%--
  User: HyoJoo-W
  Date: 2021/4/11
  Time: 14:01
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>mainMenu!</title>
    <!--在线引入bootstrap -->
    <link rel="stylesheet" href="http://cdn.bootcss.com/bootstrap/3.3.0/css/bootstrap.min.css">
    <script src="http://cdn.bootcss.com/jquery/1.11.1/jquery.min.js"></script>
    <script src="http://cdn.bootcss.com/bootstrap/3.3.0/js/bootstrap.min.js"></script>

</head>
<body>

    <h1>欢迎来到用户操作主界面！</h1>
    <div class="div-add">
        <a href="./createUser.jsp">添加用户</a>
    </div>
    <div class="div-query">
        <a href="${pageContext.request.contextPath}/queryUserServlet">查询用户</a>
    </div>
</body>
</html>
