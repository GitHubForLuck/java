<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>列车编组添加</title>
<link href="${pageContext.request.contextPath}/userjsp/admin/css/train.css" rel="stylesheet" type="text/css">
</head>
<body>
	<div>
		<h3>列车编组添加</h3>
		<hr/>
		<form action="${pageContext.request.contextPath }/carriage_save.action" method="post">
			<table>
				<!-- <tr><td>列车编组编号：</td><td><input type="text" name="id"/></td></tr> -->
				<tr><td>车次：</td><td><input type="text" name="tid"/></td></tr>
				<tr><td>车厢号：</td><td><input type="text" name="number"/></td></tr>
				<tr><td>车厢坐席数量：</td><td><input type="text" name="seatnumber"/></td></tr>
				<tr><td>车厢类型：</td><td><select name="ctype">
							<option value="0" id="商务座">商务座</option>
							<option value="1" id="一等座">一等座</option>
							<option value="2" id="二等座">二等座</option>
						</select></td></tr>
				<tr><td>车厢状态：</td>
					<td>
						<select name="con1">
							<option value="1">使用</option>
							<option value="0">停用</option>
						</select>
					</td>
				</tr>
				<tr><td><input type="submit" value="添加"/>&nbsp;&nbsp;&nbsp;<input type="reset" value="重置"/></td></tr>
			</table>
		</form>
	</div>
</body>
</html>