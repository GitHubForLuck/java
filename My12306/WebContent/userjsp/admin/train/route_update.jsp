<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link href="${pageContext.request.contextPath}/userjsp/admin/css/train.css" rel="stylesheet" type="text/css">
<script type="text/javascript">
	window.onload = function() {
		var con1 = "${route.con1}";
		if ("1" == con1) {
			document.getElementById("使用").selected = true;
		} else {
			document.getElementById("停用").selected = true;
		}
	}
</script>
</head>
<body>
	<div>
	<h3>路线更新</h3>
	${route }
	<hr/>
	<form action="${pageContext.request.contextPath}/route_update.action" method="post">
		<table>
			<tr><td>线路编号：</td><td>${route.id }<input type="text" name="id" value="${route.id }" hidden="true"/></td></tr>
			<tr><td>车次编号：</td>
			<td>
				<input type="text" name="tid" value="${route.TTrain.id }">
				<!-- <select name="tid">
						<option value="T72">T72</option>
				</select> -->
			</td>
			</tr>
			<tr><td>站　　序：</td><td><input type="text" name="siteorder" value="${route.siteorder }"/></td></tr>
			<tr><td>车站名：</td><td><input type="text" name="site" value="${route.site }"/></td></tr>
			<tr><td>里程：</td><td><input type="text" name="mile" value="${route.mile }"/></td></tr>
			<tr><td>发车时间：</td><td><input type="date" name="starttime" value="${route.starttime }"/></td></tr>
			<tr><td>到站时间：</td><td><input type="date" name="endtime" value="${route.endtime }"/></td></tr>
			<tr><td>停留时间：</td><td><input type="text" name="staytime" value="${route.staytime }"/></td></tr>
			<tr><td>线路状态：</td><td><select name="con1">
							<option value="0" id="停用">停用</option>
							<option value="1" id="使用">使用</option>
						</select></td></tr>
			<tr><td><input type="submit" value="更新"/>&nbsp;&nbsp;&nbsp;<input type="reset" value="重置"/></td></tr>
		</table>
	</form>
	</div>
</body>
</html>