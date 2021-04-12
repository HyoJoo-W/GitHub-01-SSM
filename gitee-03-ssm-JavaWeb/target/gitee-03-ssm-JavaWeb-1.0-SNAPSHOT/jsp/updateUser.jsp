<%--
  User: HyoJoo-W
  Date: 2021/4/11
  Time: 14:00
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Update!</title>
    <!--在线引入bootstrap -->
    <link rel="stylesheet" href="http://cdn.bootcss.com/bootstrap/3.3.0/css/bootstrap.min.css">
    <script src="http://cdn.bootcss.com/jquery/1.11.1/jquery.min.js"></script>
    <script src="http://cdn.bootcss.com/bootstrap/3.3.0/js/bootstrap.min.js"></script>
</head>
<body>
    <form action="${pageContext.request.contextPath}/updateUserServlet" method="post">
        <div>
            姓名<input type="text" name="name" value="${requestScope.user.name}">
        </div>
        <div class="div-gender">
            <span>性别：</span>
            <c:if test="${requestScope.user.gender == 'male'}">
                <input type="radio" name="gender" value="male" id="userGenderMale" checked>
                <label for="userGenderMale">男</label>
                <input type="radio" name="gender" value="female" id="userGenderFemale">
                <label for="userGenderFemale">女</label>
            </c:if>
            <c:if test="${requestScope.user.gender == 'female'}">
                <input type="radio" name="gender" value="male" id="userGenderMale" >
                <label for="userGenderMale">男</label>
                <input type="radio" name="gender" value="female" id="userGenderFemale" checked>
                <label for="userGenderFemale">女</label>
            </c:if>

        </div>
        <%--<div>--%>
        <%--    日期 <input type="text" name="date" value="${requestScope.user.date}">--%>
        <%--</div>--%>
        <div>
            余额 <input type="text" name="money" value="${requestScope.user.money}">
        </div>
        <div>
            <input type="submit" value="确认修改">
        </div>
    </form>
    
</body>
</html>
