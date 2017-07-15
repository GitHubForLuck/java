<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta  charset="UTF-8">
<title>用户注册页面</title>

	<script type="text/javascript" src="http://apps.bdimg.com/libs/jquery/2.1.1/jquery.min.js"></script>
	<script type="text/javascript" src="<c:url value='jquery.form.js'/>"></script>
	<script>
		function validateNull(object) {
			//js中的DOM编程
			var value = object.value;
			if (value == null || value == "") {
				document.getElementById("message").innerHTML = "内容不能为空";
			}else{
				document.getElementById("message").innerHTML = "";
			}
		}

		function validatePwdSave(object) {
			var pwd1 = document.getElementById("password").value;
			var pwd2 = object.value;
			if (pwd1 != pwd2) {
				document.getElementById("message").innerHTML = "两次输入的密码不一致";
			}else{
				document.getElementById("message").innerHTML = "";
			}
		}

		function validateidentity(object) {
			var identity = $("#identity").val();
			if(!/^\d{17}(\d|x)$/i.test(identity)) {
				document.getElementById("message").innerHTML = "你输入的身份证长度或格式错误";
			}else{
				document.getElementById("message").innerHTML = "";
			}
		}

		function validatePhone(object) {
			var phone = $("#phone").val();
			if (!(/^1[3|5|8][0-9]\d{4,8}$/.test(phone))) {
				document.getElementById("message").innerHTML = "请输入正确的手机号码！以13、15、18开头的号码";
				return;
			}else{
				document.getElementById("message").innerHTML = "";
			}
		}

		function validateMail(obj) {
			var mail = $("#mail").val();
			var pattern = /^([\.a-zA-Z0-9_-])+@([a-zA-Z0-9_-])+(\.[a-zA-Z0-9_-])+/;
			if (!pattern.test(mail)) {
				document.getElementById("message").innerHTML = "请输入正确的邮箱地址";
				return;
			}else{
				document.getElementById("message").innerHTML = "";
			}
		}
	</script>
<style type="text/css">
		body {
			font-family: 微软雅黑;
		}

		input[type=text],
		input[type=password],
		input[type=date] {
			height: 20px;
			border: none;
			padding: 5px;
			width: 240px;
		}

		.main {
			width: 100%;
			height: 750px;
		}

		.top {
			width: 100%;
			height: 10%;
			padding-top: 20px;
		}

		.logo {
			margin-left: 200px;
			font-size: 30px;
		}

		.center {
			width: 100%;
			height: 700px;
			background-image: url(../images/12306gt.png);
			background-repeat: no-repeat;
			background-size: cover;
		}

		.main-login {
			float: right;
			margin-right: 100px;
			margin-top: 50px;
			width: 400px;
			background-color: rgba(220, 220, 220, 0.7);
		}

		.lg-contentbox {
			margin: 25px 25px auto 25px;
			height: 80%;
		}

		.title {
			border-bottom: 3px solid #008AC9;
			height: 16%;
			text-align: center;
			font-size: 20px;
			color: #0066CC;
			font-weight: bold;
		}

		.lg-unit {
			margin-top: 25px;
			height: 25px;
			width: 100%;
		}

		.lg-unit-left {
			float: left;
			height: 20px;
			background-color: rgba(94, 155, 183, 0.4);
			width: 23%;
			padding: 5px;
			border-radius: 7px 0 0 7px;
		}

		input[type=submit],
		input[type=reset] {
			width: 30%;
			height: 40px;
			background: #008AC9;
			color: #fff;
			text-align: center;
			border: none;
			font-size: 15px;
			cursor: pointer;
			border-radius: 5px;
			font-family: 微软雅黑;
			margin-bottom: 40px;
		}

		.lg-contentbox a {
			margin-top: 15px;
			text-decoration: none;
			display: block;
		}

		.lg-contentbox a:hover {
			color: red;
		}

		.footer {
			height: 60px;
			width: 100%;
			padding-top: 20px;
		}

		.footer-left {
			float: left;
		}

		.footer-right {
			float: right;
			margin-right: 15%;
		}

		.footer-right a {
			text-decoration: none;
			color: #000;
		}

		.footer-right a:hover {
			color: red;
		}

		.return {
			float: right;
			margin-right: 50px;
		}
	</style>
</head>
	<body>
		<div class="main">
			<div class="top">
				<div class="logo">12306订票系统</div>
				<div class="return"><a href="welcome.jsp">返回首页</a></div>
			</div>
			<div class="center">
				<div class="main-login">
					<div class="lg-contentbox">
						<div class="title">
							<div style="height:56px;line-height:56px;">用户注册</div>
						</div>
						<form action="${pageContext.request.contextPath }/user_save.action" method="post" id="form">
							<div class="lg-unit">
								<div class="lg-unit-left">用户名：</div><input type="text" name="username" required="required" onblur="validateNull(this)">
							</div>
							<div class="lg-unit">
								<div class="lg-unit-left">真实姓名：</div><input type="text" name="realname" required="required" onblur="validateNull(this)">
							</div>
							<div class="lg-unit">
								<div class="lg-unit-left">身份证号：</div><input type="text" name="uidnumber" id="identity" required="required" onblur="validateidentity(this)">
							</div>

							<div class="lg-unit">
								<div class="lg-unit-left">性&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;别：</div>
								<input type="radio" name="sex" id="gender" value="0" checked="checked" onblur="validateNull(this)" />男
								<input type="radio" name="sex" id="gender" value="1" onblur="validateNull(this)" />女
							</div>
							<div class="lg-unit">
								<div class="lg-unit-left">邮&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;箱：</div><input type="text" required="required" name="mail" id="mail" onblur="validateMail(this)">
							</div>
							<div class="lg-unit">
								<div class="lg-unit-left">手&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;机：</div><input type="text" name="tel" id="phone" required="required" onblur="validatePhone(this)">
							</div>

							<div class="lg-unit">
								<div class="lg-unit-left">密&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;码：</div>
								<div><input type="password" name="password" id="password" required="required" onblur="validateNull(this)"></div>
							</div>
							<div class="lg-unit">
								<div class="lg-unit-left">密码确认：</div><input type="password" id="pwdAgain" onblur="validatePwdSave(this)">
							</div>
							<h4 id="message" style="margin-left:70px;color:red;"></h4>
							<input style="margin-left:60px;" type="submit" value="注册">&nbsp;&nbsp;
							<input type="reset" value="重置">
						</form>

					</div>
				</div>
			</div>
			<div class="footer">
				<div class="footer-left">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;Copyright(C)2015-2016 版权所有</div>
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