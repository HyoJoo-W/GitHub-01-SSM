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
    <!--在线引入bootstrap -->
    <link rel="stylesheet" href="http://cdn.bootcss.com/bootstrap/3.3.0/css/bootstrap.min.css">
    <script src="http://cdn.bootcss.com/jquery/1.11.1/jquery.min.js"></script>
    <script src="http://cdn.bootcss.com/bootstrap/3.3.0/js/bootstrap.min.js"></script>
</head>
<body>

    <div class="container">
        <form class="form-horizontal" action="${pageContext.request.contextPath}/createUserServlet" method="post">
            <div class="form-group">
                <div class="col-sm-6 col-sm-offset-2">
                    <h2>用户开户</h2>
                </div>
            </div>
            <div class="form-group">
                <label for="name" class="col-sm-2 control-label">用户名</label>
                <div class="col-sm-6">
                    <input type="text" class="form-control" id="name" name="name" placeholder="用户名">
                </div>
            </div>
            <div class="form-group">
                <label for="password" class="col-sm-2 control-label">密码</label>
                <div class="col-sm-6">
                    <input type="password" class="form-control" id="password" name="password" placeholder="密码">
                </div>
            </div>
            <div class="form-group">
                <label class="col-sm-2 control-label">性别</label>
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
            </div>
            <div class="form-group">
                <label for="date" class="col-sm-2 control-label">生日</label>
                <div class=" col-sm-6">
                    <input type="date" id="date" name="date">
                </div>
            </div>
            <div class="form-group">
                <label for="money" class="col-sm-2 control-label">余额</label>
                <div class=" col-sm-6">
                    <input type="number" id="money" name="money">
                </div>
            </div>
            <div class="form-group">
                <div class="col-sm-offset-2 col-sm-10">
                    <button type="submit" class="btn btn-default">创建</button>
                </div>
            </div>
        </form>
    </div>

</body>
</html>
