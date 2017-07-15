<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>订单信息管理</title>
</head>
<body>
	<h3>订单信息管理</h3>
	<table border="1" cellspacing="0" cellpadding="8">
		<tr align="center">
			<td>订单编号</td>
			<td>订票人编号</td>
			<td>车票编号</td>
			<td>订单状态</td>
			<td>下单时间</td>
			<td>操作</td>
		</tr>
		
		<c:forEach items="${oList}" var="o">
			<tr align="center">
				<td>${o.id }</td>
				<td>${o.TUser.id}</td>
				<td>${o.TTicket.id }</td>
				<td>${o.status }</td>
				<td>${o.maketime }</td>
				<td>
				<a	href="${pageContext.request.contextPath }/orders_find_changeStatusById.action?id=${o.id}"	onClick="return confirm('是否确定更改支付状态？');">更改订单支付状态</a> 
				<a	href="${pageContext.request.contextPath }/orders_find_findById.action?id=${o.id}&type=ordersupdate">更新</a>
				</td>
			</tr>
		</c:forEach>
	</table>
	<br />
	<form
		action="${pageContext.request.contextPath }/orders_find_findById.action"
		method="post">
		<p>
		<input type="text" name="id">
		<input type="submit" value="按订单编号查询" /></p>
	</form>
	<br />
</body>
</html>