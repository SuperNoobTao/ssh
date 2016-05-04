<%--
  Created by IntelliJ IDEA.
  User: shentao
  Date: 2016/5/3
  Time: 13:28
  To change this template use File | Settings | File Templates.
--%>
<%@ page language="java" contentType="text/html; charset=utf-8"
         pageEncoding="utf-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
  <meta http-equiv="Content-Type" content="text/html; charset=utf-8">
  <title>first struts2</title>
</head>
<body>
<form action="UserAction_login.action" method="post">
  <input	type="text" name="user.username" />
  <input	type="text" name="user.pwd"  />
  <input    type="submit" value="登录" />
  <input    type="reset" value="重填" />
  <input    type="button" value="注册" onclick="window.location.href='register.jsp';"/>

</form>
</body>
</html>