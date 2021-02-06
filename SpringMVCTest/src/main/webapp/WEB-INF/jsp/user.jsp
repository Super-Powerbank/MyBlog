<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html>
<head>
    <title>自定义类型数据提交</title>
</head>
<body>
<form action="/user/adduser" method="post">
    用户id：<input type="text" name="id"><br/>
    用户名：<input type="text" name="name"><br/>
    地址：<input type="text" name="address"><br/>

    <input type="submit" value="提交">
</form>

</body>
</html>