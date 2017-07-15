<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>   
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>列车信息</title>
</head>
<body>
	<h3>列车管理</h3>
	<table border="1" cellspacing="0" cellpadding="8">
		<tr align="center">
			<td>车次代码</td>
			<td>起始站</td>
			<td>终到站</td>
			<td>始发时间</td>
			<td>终到时间</td>
			<td>里程</td>
			<td>无座票数量</td>
			<td>车辆车体分类</td>
			<td>列车类型</td>
			<td>操作</td>
		</tr>
		
		<c:forEach items="${trainList}" var="train">
			<tr align="center">
				<td>${train.id }</td>
				<td>${train.TStationByStartstation.id}</td>
				<td>${train.TStationByEndstation.id }</td>
				<td>${train.starttime }</td>
				<td>${train.endtime }</td>
				<td>${train.mile}</td>
				<td>${train.noseatnumber }</td>
				<td>${train.bodytype }</td>
				<td>${train.type }</td>
				<td>
				<a	href="${pageContext.request.contextPath }/train_stop.action?id=${train.id}"	onClick="return confirm('是否确定删除？');">删除</a> 
				<a	href="${pageContext.request.contextPath }/train_find_findByProperty.action?proName=id&proVal=${train.id}&mold=update">更新</a>
				</td>
			</tr>
		</c:forEach>
	</table>
	<br />
	<a href="${pageContext.request.contextPath }/userjsp/admin/train/train_save.jsp">新增列车</a>
	<br />
	<br />
	<form
		action="${pageContext.request.contextPath }/train_find_findByProperty.action"
		method="post">
		查询条件：
		<select name="proName">
			<option value="id" selected="selected">始发站</option>
			<option value="name">始发时间</option>
		
		</select>
		<input type="text" name="proVal" value="1"> 
		<br/>
		<input type="submit" value="查询" />
		查询条件：
		<select name="proName">
			<option value="id" selected="selected">终到站</option>
			<option value="name">终到时间</option>
			
		</select>
		<input type="text" name="proVal" value="1"> 
		<br/>
		<input type="submit" value="查询" />
	</form>
	<br />
</body>
</html>