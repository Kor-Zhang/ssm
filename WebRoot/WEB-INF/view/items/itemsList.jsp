<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c"  uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>商品列表</title>
</head>
<body>
	<c:forEach items="${items}" var="i">
		名称：${i.name},描述：${i.description},价格：${i.price},数量：${i.quantity}
		<a href="<c:url value='/items/editAItem.action?id=${i.id}'></c:url>">修改</a>
		<br/>
	</c:forEach>
</body>
</html>