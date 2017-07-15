<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>旅程区段</title>
<link href="${pageContext.request.contextPath}/userjsp/admin/css/train.css" rel="stylesheet" type="text/css">
</head>
<body>
	<h3>旅程区段</h3>
	<form action="#" method="post">
		<table>
			<!-- <tr><td>旅程区段编号：</td><td><input type="text" name="id"/></td></tr> -->
			<tr><td>里程区段From：</td><td><input type="text" name="journeyfrom"/></td></tr>
			<tr><td>里程区段To：</td><td><input type="text" name="journeyto"/></td></tr>
			<tr><td>区段数：</td><td><input type="text" name="number"/></td></tr>
			<tr><td>每区段里程：</td><td><input type="text" name="permile"/></td></tr>
			<tr><td><input type="submit" value="添加"/>&nbsp;&nbsp;&nbsp;<input type="reset" value="重置"/></td></tr>
		</table>
	</form>
</body>
</html>