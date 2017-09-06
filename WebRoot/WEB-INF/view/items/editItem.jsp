<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c"  uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>修改商品</title>
</head>
<body>
	<!-- 显示错误信息 -->
	<c:forEach items="${allErrors}" var="e">
		<label style="color: red;">${e.defaultMessage}</label>
	</c:forEach>
	
	<form action="<c:url value='/items/updateAItem.action'></c:url>">
	<input type="hidden" name="id" value="${item.id}"/>
	名称：<input name="itemsCustom.name" value="${item.name}"/>
	描述：<input name="itemsCustom.description" value="${item.description}"/>
	价格：<input name="itemsCustom.price" value="${item.price}"/>
	数量：<input name="itemsCustom.quantity" value="${item.quantity}"/>
	<input type="submit"/>
	</form>
</body>
</html>