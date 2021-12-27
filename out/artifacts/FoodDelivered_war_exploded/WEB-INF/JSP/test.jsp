<%--
  Created by IntelliJ IDEA.
  User: Raven
  Date: 2021/12/10
  Time: 16:25
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Test</title>
</head>
<body>
<body>
<!-- 文件上传表单的提交方式必须是“post” 编码类型必须为：enctype="multipart/form-data" -->

<form action="imgUpLoad" method="post" enctype="multipart/form-data">
    <input type="file" name="file">
    <input type="submit" value="uploadFile">
</form>
</body>
</html>
