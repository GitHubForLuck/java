<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>   
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>车站信息</title>
</head>
<body>
	<h3>车站管理</h3>
	<table border="1" cellspacing="0" cellpadding="8">
		<tr align="center">
			<td>车站代码</td>
			<td>车站名</td>
			<td>拼音码</td>
			<td>所属行政区域</td>
			<td>车站等级</td>
			<td>所属铁路局</td>
			<td>联系地址</td>
			<td>车站状态</td>
			<td>操作</td>
		</tr>
		
		<c:forEach items="${stationList}" var="station">
			<tr align="center">
				<td>${station.id }</td>
				<td>${station.name}</td>
				<td>${station.pinyin }</td>
				<td>${station.region }</td>
				<td>${station.range }</td>
				<td>${station.company}</td>
				<td>${station.address }</td>
				<td>${station.con1 }</td>
				<td>
				<a	href="${pageContext.request.contextPath }/station_find_changeStatusById.action?id=${station.id}"	onClick="return confirm('是否确定更改？');">更改车站状态</a> 
				<a	href="${pageContext.request.contextPath }/station_find_findByProperty.action?proName=id&objVal=${station.id}&type=update">更新</a>
				</td>
			</tr>
		</c:forEach>
	</table>
	<br />
	<a href="${pageContext.request.contextPath }/userjsp/admin/train/station_save.jsp">新增车站</a>
	<br />
	<br />
	<form
		action="${pageContext.request.contextPath }/station_find_findByProperty.action"
		method="post">
		查询条件：
		<select name="proName">
			<option value="id" selected="selected">车站编号</option>
			<option value="name">车站名称</option>
			<option value="pinyin">车站字母缩写</option>
		</select>
		<input type="text" name="objVal" value="1"> 
		<br/>
		<input type="submit" value="查询" />
	</form>
	<br />
</body>
</html>