<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>订单更新</title>
<link href="${pageContext.request.contextPath}/userjsp/admin/css/train.css" rel="stylesheet" type="text/css">
</head>
<body>
	<div>
	<h3>订单更新</h3>
	<hr/>
	<form action="${pageContext.request.contextPath }/orders_update.action" method="post">
		<table>
			<tr><td>订单编号：</td><td><input type="text" name="id" value="${tOrders.id }"/></td></tr>
			<tr><td>订票人编号：</td><td><input type="text" name="userid" value="${tOrders.TUser.id }"/></td></tr>
			<tr><td>车票编号：</td><td><input type="text" name="tkid" value="${tOrders.TTicket.id }"/></td></tr>
			<tr><td>订单状态：</td>
				<td>
					<select name="status">
						<option value="1" ${tOrders.status==1?"selected=selected":"" }>已支付</option>
						<option value="0" ${tOrders.status==0?"selected=selected":"" }>未支付</option>
					</select>
				</td>
			</tr>
			<tr><td>下单时间：</td><td><input type="date" name="maketime" value="${tOrders.maketime }"/></td></tr>
			<tr><td><input type="submit" value="更新"/>&nbsp;&nbsp;&nbsp;<input type="reset" value="重置"/></td></tr>
		</table>
	</form>
	</div>
</body>
</html>