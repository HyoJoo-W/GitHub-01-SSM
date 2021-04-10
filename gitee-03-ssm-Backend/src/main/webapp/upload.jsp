<%--
  User: HyoJoo-W
  Date: 2021/4/10
  Time: 21:47
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>文件上传</title>
</head>
<body>
 <form action="${pageContext.request.contextPath}/user/quick18" method="post" enctype="multipart/form-data">
     名称：<input type="text" name="name"><br>
     文件：<input type="file" name="uploadFile"><br>
     <input type="submit" value="上传">
 </form>
</body>
</html>
