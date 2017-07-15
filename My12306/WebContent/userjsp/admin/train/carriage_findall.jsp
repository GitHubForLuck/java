<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<html>
<head>
<meta charset="UTF-8">
<title>列车编组</title>
</head>
<body>
	<h3>列车编组</h3>
	<table border="1" cellspacing="0" cellpadding="8">
		<tr>
			<td>列车编组编号</td>
			<td>车次</td>
			<td>车厢号</td>
			<td>车厢坐席数量</td>
			<td>车厢类型</td>
			<td>车厢状态</td>
			<td>操作</td>
		</tr>
		<c:forEach items="${carriageList }" var="carriage">
			<tr>
				<td>${carriage.id }</td>
				<td>${carriage.TTrain.id }</td>
				<td>${carriage.cnumber }</td>
				<td>${carriage.seatnumber }</td>
				<td>
					<c:choose>
						<c:when test="${carriage.ctype == 0}">商务座</c:when>
						<c:when test="${carriage.ctype == 1}">一等座</c:when>
						<c:when test="${carriage.ctype == 2}">二等座</c:when>
					</c:choose>
				</td>
				<td>
					<c:choose>
						<c:when test="${carriage.con1 == 0}">停用</c:when>
						<c:when test="${carriage.con1 == 1}">使用</c:when>
					</c:choose>
				</td>
				<td>
					<a href="${pageContext.request.contextPath }/carriage_find_findById.action?id=${carriage.id }&type=update">更新</a>
				</td>
			</tr>
		</c:forEach>
	</table>
	<p><a href="${pageContext.request.contextPath }/userjsp/admin/train/carriage_save.jsp">添加列车组</a></p>
	<form action="${pageContext.request.contextPath }/carriage_find_findByProperties.action" method="post">
		<table>
			<tr>车厢查询:</tr>
			<tr>
				<!-- 车厢查询：根据车厢编号（int）,车次（String）,车厢号（int）、车厢类型（int） -->
				<td>列车编组编号</td>
				<td><input type="number" name="id"></td>
			</tr>
			<tr>
				<td>车次</td>
				<td><input type="text" name="tid"></td>
			</tr>
			<tr>
				<td>车厢号</td>
				<td><input type="number" name="cnumber"></td>
			</tr>
			<tr>
				<td>车厢类型</td>
				<td>
				<select name="ctype">
					<option value="" selected="selected">请选择车厢类型</option>
					<option value="0" id="商务座">商务座</option>
					<option value="1" id="一等座">一等座</option>
					<option value="2" id="二等座">二等座</option>
				</select>
				</td>
			</tr>
			<tr>
				<td>车厢状态</td>
				<td>
				<select name="con1">
					<option value="" selected="selected">请选择车厢状态</option>
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