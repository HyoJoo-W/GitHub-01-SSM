<%--
  User: HyoJoo-W
  Date: 2021/4/12
  Time: 13:52
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Query!</title>
    <!--在线引入bootstrap -->
    <link rel="stylesheet" href="http://cdn.bootcss.com/bootstrap/3.3.0/css/bootstrap.min.css">
    <script src="http://cdn.bootcss.com/jquery/1.11.1/jquery.min.js"></script>
    <script src="http://cdn.bootcss.com/bootstrap/3.3.0/js/bootstrap.min.js"></script>
    <script>
        function deleteUser(name)
        {
            if(confirm("您确定要删除该用户吗？"))
            {
                location.href="${pageContext.request.contextPath}/deleteUserServlet?name="+name;
            }
        }
    </script>
</head>
<body>
    <div class="table-responsive">
        <table class="table">
            <tr>
                <th>编号</th>
                <th>用户名</th>
                <th>用户性别</th>
                <th>开户日期</th>
                <th>用户存款</th>
                <th>操作</th>
            </tr>
            <c:forEach items = "${requestScope.userList}" var = "user" varStatus = "s">
                <tr>
                    <td>${s.count}</td>
                    <td>${user.name}</td>
                    <td>${user.gender}</td>
                    <td>${user.date}</td>
                    <td>${user.money}</td>
                    <td>
                        <a href="${pageContext.request.contextPath}/queryUserByNameServlet?name=${user.name}">修改</a> &nbsp;
                        <a href="javascript:deleteUser('${user.name}')">删除</a>
                    </td>
                </tr>
            </c:forEach>
        </table>
    </div>

</body>
</html>
