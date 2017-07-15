<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>修改车站</title>
</head>
<body>
	<h3>车站信息</h3>
	
	<form action="${pageContext.request.contextPath }/station_update.action" method="post">
		<table>
		<tr>
			<td>车站编号</td>
			
			<td>${station.id }
			<input type="hidden" name="id" value="${station.id}"></td>
		</tr>
		<tr>
			<td>车站名称</td>
			<td><input type="text" name="name" value="${station.name}"></td>
		</tr>
			<tr>
			<td>车站字母缩写</td>
			<td><input type="text" name="pinyin" value="${station.pinyin}"></td>
		</tr>
		<tr>
			<td>所属行政区域</td>
			<td><input type="text" name="region" value="${station.region}"></td>
		</tr>
	
		<tr>
			<td>车站等级</td>
			<td><input type="text" name="range" value="${station.range}"></td>
		</tr>
		<tr>
			<td>联系地址</td>
			<td><input type="text" name="address" value="${station.address}"></td>
		</tr>
		<tr>
			<td>车站状态</td>
		<td><input type="text" name="con1" value="${station.con1}"></td>
		</tr>
		<tr>
			<td><input type="submit" value="新增"></td>
			<td><input type="reset" value="重置"></td>
		</tr>

	</table>
	</form>
	
</body>
</html>