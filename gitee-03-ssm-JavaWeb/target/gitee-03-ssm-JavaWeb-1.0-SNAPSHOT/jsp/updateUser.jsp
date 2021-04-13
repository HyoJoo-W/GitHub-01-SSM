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
    <%--<form action="${pageContext.request.contextPath}/updateUserServlet" method="post">--%>
    <%--    <div>--%>
    <%--        姓名<input type="text" name="name" value="${requestScope.user.name}">--%>
    <%--    </div>--%>
    <%--    <div class="div-gender">--%>
    <%--        <span>性别：</span>--%>
    <%--        <c:if test="${requestScope.user.gender == 'male'}">--%>
    <%--            <input type="radio" name="gender" value="male" id="userGenderMale" checked>--%>
    <%--            <label for="userGenderMale">男</label>--%>
    <%--            <input type="radio" name="gender" value="female" id="userGenderFemale">--%>
    <%--            <label for="userGenderFemale">女</label>--%>
    <%--        </c:if>--%>
    <%--        <c:if test="${requestScope.user.gender == 'female'}">--%>
    <%--            <input type="radio" name="gender" value="male" id="userGenderMale" >--%>
    <%--            <label for="userGenderMale">男</label>--%>
    <%--            <input type="radio" name="gender" value="female" id="userGenderFemale" checked>--%>
    <%--            <label for="userGenderFemale">女</label>--%>
    <%--        </c:if>--%>

    <%--    </div>--%>
    <%--    &lt;%&ndash;<div>&ndash;%&gt;--%>
    <%--    &lt;%&ndash;    日期 <input type="text" name="date" value="${requestScope.user.date}">&ndash;%&gt;--%>
    <%--    &lt;%&ndash;</div>&ndash;%&gt;--%>
    <%--    <div>--%>
    <%--        余额 <input type="text" name="money" value="${requestScope.user.money}">--%>
    <%--    </div>--%>
    <%--    <div>--%>
    <%--        <input type="submit" value="确认修改">--%>
    <%--    </div>--%>
    <%--</form>--%>

    <div class="container">
        <form class="form-horizontal" action="${pageContext.request.contextPath}/updateUserServlet" method="get">
            <div class="form-group">
                <div class="col-sm-6 col-sm-offset-2">
                    <h2>用户资料修改</h2>
                </div>
            </div>
            <div class="form-group">
                <label for="name" class="col-sm-2 control-label">用户名</label>
                <div class="col-sm-6">
                    <input type="text" class="form-control" id="name" name="name" value="${requestScope.user.name}" readonly>
                </div>
            </div>
            <div class="form-group">
                <label for="password" class="col-sm-2 control-label">密码</label>
                <div class="col-sm-6">
                    <input type="password" class="form-control" id="password" name="password" value="${requestScope.user.password}">
                </div>
            </div>
            <div class="form-group">
                <label class="col-sm-2 control-label">性别</label>
                <c:if test="${requestScope.user.gender == 'male'}">
                    <div class=" col-sm-6">
                        <div class="radio">
                            <label>
                                <input type="radio" name="gender" value="male" checked> 男
                            </label>
                            <label>
                                <input type="radio" name="gender" value="female"> 女
                            </label>
                        </div>
                    </div>
                </c:if>
                <c:if test="${requestScope.user.gender == 'female'}">
                    <div class=" col-sm-6">
                        <div class="radio">
                            <label>
                                <input type="radio" name="gender" value="male" > 男
                            </label>
                            <label>
                                <input type="radio" name="gender" value="female" checked> 女
                            </label>
                        </div>
                    </div>
                </c:if>
            </div>
            <div class="form-group">
                <label for="date" class="col-sm-2 control-label">生日</label>
                <div class="col-sm-3">
                    <input type="text" value="修改前：${requestScope.user.date}">
                </div>
                <div class="col-sm-6">
                    <input type="date" id="date" name="date">
                </div>
            </div>
            <div class="form-group">
                <label for="money" class="col-sm-2 control-label">余额</label>
                <div class=" col-sm-6">
                    <input type="number" id="money" name="money" value="${requestScope.user.money}" readonly>
                </div>
            </div>

            <div class="form-group">
                <div class="col-sm-offset-2 col-sm-10">
                    <button type="submit" class="btn btn-default">确认修改</button>
                </div>
            </div>
        </form>
    </div>
    
</body>
</html>
