<%@page import="java.text.SimpleDateFormat"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.util.*" %>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<html>
<head>
<base href="${pageContext.request.contextPath }/">
<meta charset="UTF-8">
<title>列表页面</title>

<link rel="stylesheet" href="js/page/b.page.bootstrap3.css" type="text/css">
<link rel="stylesheet" href="js/page/b.page.css" type="text/css">
<link href="http://libs.baidu.com/bootstrap/3.0.3/css/bootstrap.min.css" rel="stylesheet">

<script src="http://libs.baidu.com/bootstrap/3.0.3/js/bootstrap.min.js"></script>
<script type="text/javascript"  src="https://code.jquery.com/jquery-3.2.1.js"></script>
<!-- 插件核心脚本 -->
<script type="text/javascript" src="js/page/b.page.js" ></script>
<script type="text/javascript" src="js/page/b.page.min.js" ></script>

</head>
<body>
<div>
	<!-- HTML代码、服务端内容填充 -->
	<table id="dataGridTableJson" class="table table-striped table-bordered table-hover table-condensed">
		<thead>
			<tr>
				<th class="selectColumn" >选择</th>
				<th>登录名</th>
				<th>密码</th>
				<th>姓名</th>
				<th>性别</th>
				<th>出生年月</th>
				<th>电话</th>
				<th>电子邮箱</th>
				<th>状态</th>
				<th>更新时间</th>
			</tr>
		</thead>
		<tbody>
		</tbody>
	</table>
</div>
<div id="page3"></div>

<!-- HTML代码、服务端内容填充 -->
<div id="pageContent"></div>
<div id="page2"></div>

<script type="text/javascript">
	$(function(){
		//javascript初始化
		$('#page3').bPage({
		    url :'users/list2',
		    //开启异步处理模式
			asyncLoad : true,
			//关闭服务端页面模式
		    serverSidePage : false,
			//数据自定义填充
		    render : function(data){
		    	var tb = $('#dataGridTableJson tbody');
		    	$(tb).empty();
		    	if(data && data.list && data.list.length > 0){
		    		$.each(data.list,function(i,row){
		    			var tr = $('<tr>');
		    			$(tr).append('<td></td>');
		    			$(tr).append('<td>'+row.uname+'</td>');
		    			$(tr).append('<td>'+row.upwd+'</td>');
		    			$(tr).append('<td>'+row.realname+'</td>');
		    			$(tr).append('<td>'+row.sex+'</td>');
		    			$(tr).append('<td>'+row.birthday+'</td>');
		    			$(tr).append('<td>'+row.tel+'</td>');
		    			$(tr).append('<td>'+row.email+'</td>');
		    			$(tr).append('<td>'+row.status+'</td>');
		    			$(tr).append('<td>'+row.updatetime+'</td>');
		    			$(tb).append(tr);
		    		});	    		
		    	}
		    },
		});
	});
</script>

<script type="text/javascript">
	$(function(){
		//javascript初始化
		$('#page2').bPage({
			//链接指向服务端用于返回数据渲染页面的位置
		    url : $webroot + 'users/list2',
		    //开启异步处理模式
			asyncLoad : true,
			//服务端页面处理模式
		    serverSidePage : true,
			//页面填充目标区域，支持jquery表达式
		    asyncTarget : '#pageContent'
		});
	});
</script>

</body>
</html>