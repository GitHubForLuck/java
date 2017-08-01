<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<html>
<head>
<meta charset="UTF-8">
<title>激活失败页面</title>
</head>
<body background=http://image2.sina.com.cn/home/images/tz-001.gif>
	<script type="text/javascript">
		function isIFrameSelf() {
			try {
				if (window.top == window) {
					return false;
				} else {
					return true;
				}
			} catch (e) {
				return true;
			}
		}
		function toHome() {
			if (!isIFrameSelf()) {
				window.location.href = "http://localhost:8080/gz_ssm";
			}
		}
		window.setTimeout("toHome()", 5000);
	//-->
	</script>

	<table border=0 cellpadding=0 cellspacing=0>
		<tr>
			<td height=134></td>
		</tr>
	</table>
	<table width=544 height=157 border=0 cellpadding=0 cellspacing=0
		align=center>
		<tr valign=middle align=middle>
			<td background=http://image2.sina.com.cn/home/images/tz-002.gif>
				<table border=0 cellpadding=0 cellspacing=0>
					<tr>
						<td style="padding-left: 80px; padding-top: 10px"><strong>激活失败！
								5秒钟之后将会带您进入首页!</strong></td>
					</tr>
				</table>
			</td>
		</tr>
	</table>
	<br>
</body>
</html>