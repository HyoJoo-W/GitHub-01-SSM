<%--
  User: HyoJoo-W
  Date: 2021/4/10
  Time: 20:39
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>ajax</title>
    <script src="${pageContext.request.contextPath}/js/jquery-3.5.1.js"></script>
    <script>
        let userList = new Array();
        userList.push({name:"tom",age:12});
        userList.push({name:"amy",age:14});

        //发送ajax请求
        $.ajax({
            type: "POST",
            url: "${pageContext.request.contextPath}/user/quick14",
            data: JSON.stringify(userList),
            contentType: "application/json;charset=utf-8"
        })
    </script>
</head>
<body>

</body>
</html>
