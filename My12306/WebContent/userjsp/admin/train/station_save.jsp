<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link href="${pageContext.request.contextPath}/userjsp/admin/css/train.css" rel="stylesheet" type="text/css">
</head>
<body>
	<div>
	<h3>车站添加</h3>
	<hr/>
	<form action="${pageContext.request.contextPath }/station_save.action" method="post">
		<table>
			<tr><td>车站编号：</td><td><input type="text" name="id" value="G234"/></td></tr>
			<tr><td>车站名：</td><td><input type="text" name="name" value="广州"/></td></tr>
			<tr><td>拼音码：</td><td><input type="text" name="pinyin" value="GZ"/></td></tr>
			<tr><td>所属行政区域：</td><td><input type="text" name="region" value="广州"/></td></tr>
			<tr><td>车站等级：</td><td><input type="text" name="range" value="1"/></td></tr>
			<tr><td>所属铁路局：</td><td><input type="text" name="company" value="广州铁路局"/></td></tr>
			<tr><td>联系地址：</td><td><input type="text" name="address" value="广州市"/></td></tr>
			<tr><td>车站状态：</td><td><input type="text" name="con1" value="1"/></td></tr>
			<tr><td><input type="submit" value="添加"/>&nbsp;&nbsp;&nbsp;<input type="reset" value="重置"/></td></tr>
		</table>
	</form>
	</div>
</body>
</html>