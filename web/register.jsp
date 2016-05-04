<%--
  Created by IntelliJ IDEA.
  User: shentao
  Date: 2016/5/3
  Time: 15:21
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>register</title>
</head>
<body>
<form action="UserAction_register.action" method="post">
<div> <input	type="text" name="user.username" style="text-align:center"/></div>
<div><input	type="text" name="user.pwd" style="text-align:center" /></div>
<input    type="submit" value="注册" />
<input    type="reset" value="重填" />
</form>

</body>
</html>
