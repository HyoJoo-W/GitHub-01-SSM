<%--
  User: HyoJoo-W
  Date: 2021/4/10
  Time: 20:30
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>表单</title>
</head>
<body>
    <form action="${pageContext.request.contextPath}/user/quick13" method="post">
        <input type="text" name="userList[0].name">
        <input type="text" name="userList[0].age">
        <input type="text" name="userList[1].name">
        <input type="text" name="userList[1].age">
        <input type="submit" value="提交">
    </form>
</body>
</html>
