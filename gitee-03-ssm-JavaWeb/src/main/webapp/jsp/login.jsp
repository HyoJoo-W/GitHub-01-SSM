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

    <div class="container">
        <form class="form-horizontal" action="${pageContext.request.contextPath}/loginServlet" method="post">
            <div class="form-group">
                <span class="col-sm-offset-4 col-sm-4">
                    <h2>管理员登录</h2>
                </span>
            </div>
            <div class="form-group">
                <label for="name" class="col-sm-4 control-label">账户名</label>
                <div class="col-sm-6">
                    <input type="text" class="form-control" id="name" name="name" value="${requestScope.original.getName()}" placeholder="请输入管理员账户名...">
                </div>
            </div>
            <div class="form-group">
                <label for="password" class="col-sm-4 control-label">密码</label>
                <div class="col-sm-6">
                    <input type="password" class="form-control" id="password" name="password" value="${requestScope.original.getPassword()}" placeholder="请输入密码...">
                </div>
            </div>
            <div class="form-group">
                <span class="col-sm-offset-5" style="color: red">${requestScope.err_msg}</span>
            </div>
            <div class="form-group">
                <div class="col-sm-offset-4 col-sm-10">
                    <div class="checkbox">
                        <label>
                            <input type="checkbox"> 记住我
                        </label>
                    </div>
                </div>
            </div>
            <div class="form-group">
                <div class="col-sm-offset-4 col-sm-10">
                    <button type="submit" class="btn btn-default">登录</button>
                </div>
            </div>
        </form>
    </div>
</body>
</html>
