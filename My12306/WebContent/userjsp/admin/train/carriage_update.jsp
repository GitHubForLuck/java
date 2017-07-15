<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>列车编组更新</title>
<link href="${pageContext.request.contextPath}/userjsp/admin/css/train.css" rel="stylesheet" type="text/css">
<script type="text/javascript">
	window.onload = function() {
		var ctype = "${carriage.ctype}";
		var con1 = "${carriage.con1}";
		if ("0" == ctype) {
			document.getElementById("商务座").selected = true;
		} else if ("1" == ctype) {
			document.getElementById("一等座").selected = true;
		} else {
			document.getElementById("二等座").selected = true;
		}
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
		<h3>列车编组更新</h3>
		<hr/>
		<form action="${pageContext.request.contextPath }/carriage_update.action" method="post">
			<table>
				<tr><td>列车编组编号：</td><td>${carriage.id }<input type="text" name="id" value="${carriage.id }" hidden="true"/></td></tr>
				<tr><td>车次：</td><td><input type="text" name="tid" value="${carriage.TTrain.id }"/></td></tr>
				<tr><td>车厢号：</td><td><input type="text" name="cnumber" value="${carriage.cnumber }"/></td></tr>
				<tr><td>车厢坐席数量：</td><td><input type="text" name="seatnumber" value="${carriage.seatnumber }"/></td></tr>
				<tr><td>车厢类型：</td><td><select name="ctype">
							<option value="0" id="商务座">商务座</option>
							<option value="1" id="一等座">一等座</option>
							<option value="2" id="二等座">二等座</option>
						</select></td></tr>
				<tr><td>车厢状态：</td><td><select name="con1">
							<option value="0" id="停用">停用</option>
							<option value="1" id="使用">使用</option>
						</select></td></tr>
				<tr><td><input type="submit" value="添加"/>&nbsp;&nbsp;&nbsp;<input type="reset" value="重置"/></td></tr>
			</table>
		</form>
	</div>
</body>
</html>