<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<html>
<head>
<meta charset="UTF-8">
<title>线路</title>
</head>
<body>
	<h3>线路</h3>
	<table border="1" cellspacing="0" cellpadding="8">
		<tr>
			<td>线路编号</td>
			<td>车次</td>
			<td>站序</td>
			<td>车站名</td>
			<td>里程</td>
			<td>发车时间</td>
			<td>到站时间</td>
			<td>停留时间</td>
			<td>线路状态</td>
			<td>操作</td>
		</tr>
		<c:forEach items="${routeList }" var="route">
			<tr>
				<td>${route.id }</td>
				<td>${route.TTrain.id }</td>
				<td>${route.siteorder }</td>
				<td>${route.site }</td>
				<td>${route.mile }</td>
				<td>${route.starttime }</td>
				<td>${route.endtime }</td>
				<td>${route.staytime }</td>
				<td>
					<c:choose>
						<c:when test="${route.con1 == 0}">停用</c:when>
						<c:when test="${route.con1 == 1}">使用</c:when>
					</c:choose>
				</td>
				<td>
					<a href="${pageContext.request.contextPath }/route_find_findById.action?id=${route.id }&type=update">更新</a>
				</td>
			</tr>
		</c:forEach>
	</table>
	<p><a href="${pageContext.request.contextPath }/userjsp/admin/train/route_save.jsp">添加列车组</a></p>
	<form action="${pageContext.request.contextPath }/route_find_findByProperties.action" method="post">
		<table>
			<tr><td>线路查询:</td></tr>
			<tr>
				<!-- //路线查询：根据线路编号（String）,车站名（String）,发车时间（Date）、到站时间（Date）， -->
				<td>线路编号</td>
				<td><input type="number" name="id"></td>
			</tr>
			<tr>
				<td>车次</td>
				<td><input type="text" name="tid"></td>
			</tr>
			<tr>
				<td>发车时间</td>
				<td><input type="date" name="starttime"></td>
			</tr>
			<tr>
				<td>到站时间</td>
				<td><input type="date" name="endtime"></td>
			</tr>
			
			<tr>
				<td>路线状态</td>
				<td>
				<select name="con1">
					<option value="" selected="selected">请选择路线状态</option>
					<option value="1" >使用</option>
					<option value="0">停用</option>
				</select>
				</td>
			</tr>
			<tr>
				<td colspan="2"><input type="submit" value="查询">&nbsp;&nbsp;&nbsp;
				<input type="reset" value="重置"></td>
			</tr>
		</table>
	</form>
</body>
</html>