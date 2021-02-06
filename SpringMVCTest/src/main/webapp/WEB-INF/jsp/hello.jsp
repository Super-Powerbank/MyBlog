<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">


<%--<html>--%>
<%--<head>--%>
    <%--<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">--%>
    <%--<title>success</title>--%>
<%--</head>--%>
<%--<body>--%>
<%--<h1>Hello 超大充电宝</h1>--%>
<%--</body>--%>
<%--</html>--%>


<html>
<head>
    <title>测试基本数据类型</title>
</head>
<body>
<!-- 测试基本的数据类型绑定：form表单向后端提交数据 -->
<form action="/basedataType" method="post">
    <input type="text" name="username">
    <input type="submit" value="提交">
</form>
</body>
</html>