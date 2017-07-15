<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>个人信息</title>
	<style type="text/css">
		body{
			font-family:Microsoft YaHei;
			font-maxsize:
		}
		input[type=submit]{
			border:none;
			background-color:#11a3e0;
			color:#fff;
			cursor:pointer;
		}
		.top-head{
			margin-top:50px;
			border-bottom:1px solid #0093d0;
		}
		.top-last{
			margin-top:10px;
			border-bottom:1px solid #0093d0;
			text-align:center;
			}
		.tblist1{
			margin-left:100px;
			width:80%;
			text-align:center;
		}
		.tblist1 td{
			width:20%;		
			color:#11a3e0;
		}
		.tblist1 td:hover{
			background-color:#11a3e0;
			color:#fff;
			cursor:pointer;
		}
		 a{text-decoration:none;}
	</style>

</head>
<body>
		<form action="#" method="post" >
		<div class="top-head">
			<table class="tblist1">
				<thead>
					<tr>
						<th>个人信息</th>
					</tr>
				</thead>

				<tbody>
					<tr>
						<td>用户名:${TUser.username}</td>                    
					</tr>
					<tr>
						<td>真实姓名：${TUser.realname}</td>
					</tr>
					<tr>
						<td>身份证号：${TUser.uidnumber}</td>
					</tr>                 
					<tr>
						<td>性别：${TUser.sex==0?"男":"女"}</td>
					</tr>                  
					<tr>
						<td>联系电话：${TUser.tel}</td>
					</tr>
					<tr>
						<td><input type="submit" value="修改个人信息"  />
						</td>
					</tr>
				</tbody>
				<tr>
					<td>---------------------------</td>
				</tr>
			</table>
		</div>
	</form>
	<div class="top-last">
		<a href='#'>订单查询</a><br>
		<a href='#'>余票查询</a><br>
		<a href='#'>车站查询</a><br>
		<a href='#'>余票查询</a><br>
	</div>
</body>
</html>