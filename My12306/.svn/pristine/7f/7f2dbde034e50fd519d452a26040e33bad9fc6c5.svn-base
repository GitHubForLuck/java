<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>修改列车</title>
</head>
<body>
	<h3>列车信息</h3>
	
	<form action="${pageContext.request.contextPath }/train_update.action" method="post">
		<table>
		<tr>
			<td>车次代码</td>
			
			<td>${train.id }
			<input type="hidden" name="id" value="${train.id}"></td>
		</tr>
		<tr>
			<td>起始站</td>
			<td><input type="text" name="name" value="${train.startstation}"></td>
		</tr>
			<tr>
			<td>终到站</td>
			<td><input type="text" name="pinyin" value="${train.endstation}"></td>
		</tr>
		<tr>
			<td>始发时间</td>
			<td><input type="text" name="region" value="${train.starttime}"></td>
		</tr>
	
		<tr>
			<td>终到时间</td>
			<td><input type="text" name="range" value="${train.endtime}"></td>
		</tr>
		<tr>
			<td>里程</td>
			<td><input type="text" name="range" value="${train.mile}"></td>
		</tr>
		<tr>
			<td>无座票数量</td>
			<td><input type="text" name="address" value="${train.noseatnumber}"></td>
		</tr>
		<tr>
			<td>车辆车体分类</td>
		<td><input type="text" name="con1" value="${train.bodytype}"></td>
		</tr>
		<tr>
			<td>列车类型</td>
		<td><input type="text" name="con1" value="${train.type}"></td>
		</tr>
		<tr>
			<td><input type="submit" value="修改"></td>
			<td><input type="reset" value="重置"></td>
		</tr>

	</table>
	</form>
	
</body>
</html>