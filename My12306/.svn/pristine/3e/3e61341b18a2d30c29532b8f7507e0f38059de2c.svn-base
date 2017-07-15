<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta  charset="UTF-8">
	<title>登陆页面</title>   
	<style type="text/css">
		body{font-family:微软雅黑;}
		input[type=text],input[type=password]{height:30px;border:none;padding:5px;width:250px;}
		.main{width:100%;height:750px;}
		.top{width:100%;height:10%;padding-top:20px;}
		.logo{margin-left:200px;font-size:30px;}
		.center{width:100%;height:600px;background-image: url(../images/12306gt.png);background-repeat: no-repeat;background-size:cover;}
		.main-login{float:right;margin-right:100px;margin-top:50px;width:400px;height:60%;background-color:rgba(220,220,220,0.7);}
		.lg-contentbox{margin:25px 25px auto 25px;height:80%;}
		.title{border-bottom:3px solid #008AC9;height:16%;text-align: center;font-size:20px;color:#0066CC;font-weight:bold;}
		.lg-unit{margin-top:25px;height:45px;width:100%;}
		.lg-unit-left{float:left;height:20px;background-color:rgba(94,155,183,0.4);width:19%;padding:10px;border-radius:7px 0 0 7px;}
		
		input[type=button]{width: 100%;height:40px;background:#008AC9;color:#fff;text-align:center;border:none;font-size:15px;margin-top:25px;
			cursor:pointer;border-radius:5px;font-family:微软雅黑;}
		.lg-contentbox a{margin-top:15px;text-decoration:none;display:block;}
		.lg-contentbox a:hover{color:red;}
		.footer{height:60px;width:100%;padding-top:20px;}
		.footer-left{float:left;}
		.footer-right{float:right;margin-right:15%;}
		.footer-right a{text-decoration:none;color:#000;}
		.footer-right a:hover{color:red;}
		.return{float:right;margin-right:50px;}
	</style>
	<script type="text/javascript" src="http://apps.bdimg.com/libs/jquery/2.1.1/jquery.min.js"></script>
	<script>
		function check(){
			if($("input[name='username']").val()=="")
				alert("用户名不能为空！");
			else if($("input[name='password']").val()=="")
				alert("密码不能为空！");
			else
				$("form").submit();
		}
	</script>
</head>
<body>
	<div class="main">
		<div class="top">
			<div class="logo">12306订票系统</div>
			<div class="return"><a href="searchPage.jsp">返回首页</a></div>
		</div>
		<div class="center">
			<div class="main-login">
				<div class="lg-contentbox">
					<div class="title"><div style="height:56px;line-height:56px;">用户登录</div></div>
					<form action="${pageContext.request.contextPath }/user_login.action" method="post">  
						<div class="lg-unit">
							<div class="lg-unit-left">用户名：</div><input type="text" name="username" placeholder="请输入用户名">
						</div>
						<div class="lg-unit">
							<div class="lg-unit-left">密&nbsp;&nbsp;&nbsp;&nbsp;码：</div>
							<div><input type="password" name="password" placeholder="密码"></div>
						</div>
						<input type="button" value="登录" onclick="check()">
						<a href="javascript:void(0)" style="float:left;">忘记密码？</a>
						<a href="${pageContext.request.contextPath}/userjsp/register.jsp" style="float:right;">用户注册</a>
					</form>
					
				</div>
			</div>
		</div>
		<div class="footer">
			<div class="footer-left">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;Copyright(C)2015-2016  版权所有</div>
			<div class="footer-right">
				<a href="javascript:void(0)">常见问题</a> | 
				<a href="javascript:void(0)">预定须知</a> | 
				<a href="javascript:void(0)">关于我们</a> | 
				<a href="javascript:void(0)">法律声明</a> |
				<a href="javascript:void(0)">隐私条款</a> 
			</div>
		</div>
	</div>
</body>
</html>