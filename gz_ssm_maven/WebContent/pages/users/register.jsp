<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<html>
<head>
<base href="${pageContext.request.contextPath }/">
<meta charset="UTF-8">
<title>注册</title>
<script type="text/javascript"  src="https://code.jquery.com/jquery-3.2.1.js"></script>
<script type="text/javascript">
	var check = false;
	//验证输入
	function checkValue(obj){
		//js对象转jquery对象alert($(obj));
		if (obj.value=='') {
			$(obj).next().css('color','red').text("不能为空");
			return ;
		}
		//当输入框为邮箱地址时
		if (obj.name=='email') {
			//使用正则表达式校验
			var szReg = /^([a-zA-Z0-9_\.\-])+\@(([a-zA-Z0-9\-])+\.)+([a-zA-Z0-9]{2,4})+$/;
			if (szReg.test(obj.value)) {
				$(obj).next().css('color','green').text("邮箱格式正确！");
			} else {
				$(obj).next().css('color','red').text("邮箱格式不正确！");
				return ;
			}
		}
		//ajax校验输入值是否存在
		$.ajax({
			url:'users/selectByProperty',
			type:'post',
			data:{'propName':obj.name,'propVal':obj.value},
			success:function(msg){
				//清空文本
				$(obj).next().empty();
				if (msg == '0') {
					$(obj).next().css('color','green').text("可以使用");
					check = true;
				} else {
					$(obj).next().css('color','red').text("已存在，请重新输入");
					check = false;
				}
			}
		});
	}
	
	//按钮提交
	function submit() {
		if (check) {
			document.form1.submit();
		}
	}
</script>

</head>
<body>
	<div>
		<form name="from1" action="users/register/insert/aa" method="post">
			<table>
				<tr>
					<td>用户名:</td>
					<td><input type="text" name="uname" onblur="checkValue(this)"><span></span></td>
				</tr>
				<tr>
					<td>密码:</td>
					<td><input type="password" name="upwd" onblur="checkValue(this)"><span></span></td>
				</tr>
				<tr>
					<td>真实姓名:</td>
					<td><input type="text" name="realname"></td>
				</tr>
				<tr>
					<td>性别:</td>
					<td>
						<input type="radio" name="sex" value="male">男&nbsp;
						<input type="radio" name="sex" value="female">女
					</td>
				</tr>
				<tr>
					<td>出生年月:</td>
					<td><input type="date" name="birthday"></td>
				</tr>
				<tr>
					<td>手机号:</td>
					<td><input type="tel" name="tel"></td>
				</tr>
				<tr>
					<td>邮箱:</td>
					<td><input type="text" name="email" onblur="checkValue(this)"><span></span></td>
				</tr>
				<tr>
					<td><input type="button" value="提交" onclick="submit()"></td>
					<td><input type="reset" value="重置"></td>
				</tr>
			</table>
		</form>
	</div>
</body>
</html>