<%--
  Created by IntelliJ IDEA.
  User: Raven
  Date: 2021/11/18
  Time: 14:38
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>index</title>
  </head>
  <body>
  <form action="imgUpLoad" method="post" enctype="multipart/form-data">
    <input type="file" name="file">
    <input type="submit" value="uploadFile">
  </form>
  </body>
</html>
