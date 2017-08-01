<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<html>
<head>
<base href="${pageContext.request.contextPath }/">
<meta charset="UTF-8">
<!-- 清除缓存 -->
<!-- <meta http-equiv="ContextType" content="text/html; charset=gb2312"> -->
<meta http-equiv="Pragma" content="no-cache">
<meta http-equiv="Cache-Control" content="no-cache">
<meta http-equiv="Expires" content="0">
<title>用户登录</title>
<style type="text/css">
	div{
		margin: 100px auto;
		width: 600px;
		height: auto;
		background-color: rgb(220,220,240);
		border-radius: 10px;
		box-shadow: 10px 10px 5px #888888;
	}
	table{
		margin: 0 auto;
		text-align: left;
	}

</style>
</head>
<body>
	<div>
		
		<form action="users/login" method="post">
			<table>
				<tr align="center">
					<td><span style="font-size：14px;color: red">${requestScope.msg }</span></td>
				</tr>
				<tr>
					<td>用户名：</td>
					<td colspan="2"><input type="text" name="uname"></td>
				</tr>
				<tr>
					<td>密码：</td>
					<td colspan="2"><input type="password" name="upwd"></td>
				</tr>
				<tr>
					<td>验证码：</td>
					<td><input type="text" name="validateCode"></td>
					<td>
						<img id="img" alt="validateCode" src="validateImage" onclick="javascript:changeImg()">
						<a href="javascript:changeImg()">看不清？</a>
					</td>
				</tr>
				<tr>
					<td colspan="3"><input type="submit" value="提交"></td>
				</tr>
			</table>
		</form>
		<div></div>
	</div>
	
	<!-- 触发JS刷新-->
 	<script type="text/javascript">
	    function changeImg(){
	        var img = document.getElementById("img"); 
	        img.src = "validateImage?date=" + new Date();;
	    }
	</script>
	
</body>
</html>