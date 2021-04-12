<%--
  User: HyoJoo-W
  Date: 2021/4/11
  Time: 14:00
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Create!</title>

</head>
<body>
    <form action="${pageContext.request.contextPath}/createUserServlet" method="get">
        <div class="div-name">
            <label for="userName">姓名：</label>
            <input type="text" id="userName" name="name">
        </div>

        <div class="div-gender">
            <span>性别：</span>
            <input type="radio" name="gender" value="male" id="userGenderMale" checked>
            <label for="userGenderMale">男</label>

            <input type="radio" name="gender" value="female" id="userGenderFemale">
            <label for="userGenderFemale">女</label>
        </div>

        <div class="div-password">
            <label for="userPassword">密码:</label>
            <input type="text" name="password" id="userPassword">
        </div>

        <div class="div-confirm">
            <label for="confirmPassword">确认密码:</label>
            <input type="text" name="confirmPassword" id="confirmPassword">
        </div>

        <span class="span-msg">${requestScope.login_msg}</span>
        <div class="div-btn">
            <input type="submit" value="确定">
        </div>
    </form>
</body>
</html>
