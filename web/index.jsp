<%--
  Created by IntelliJ IDEA.
  User: fsweb
  Date: 17-3-21
  Time: 下午1:42
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>$Title$</title>
    <script src="js/js.js"></script>
</head>
<body>
<form action="login" method="post">
    name:<input name="name" type="text"><br>
    password:<input type="password" name="password">
    <hr>
    <input type="button" value="test" onclick="check()">
    <input type="submit" value="go">
</form>
<div id="result"></div>
</body>
</html>
