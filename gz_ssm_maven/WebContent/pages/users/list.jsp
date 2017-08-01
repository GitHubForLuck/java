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
<table class="table table-striped table-bordered table-hover table-condensed">
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
		<c:forEach items="${pageUtils.list}" var="d">
			<tr>
				<td class="selectColumn"><input type="radio" name="userSelect" value="${d.uid}" /></td>
				<td>${d.uname}</td>
				<td>${d.upwd}</td>
				<td>${d.realname}</td>
				<td>${d.sex}</td>
				<td>${d.birthday}</td>
				<td>${d.tel}</td>
				<td>${d.email}</td>
				<td>${d.status}</td>
				<td>${d.updatetime}</td>
			</tr>
		</c:forEach>
	</tbody>
</table>
</div>
<!-- 生成分页数据内容，必须设置 -->
<!-- 必须设置以下分页信息设置，否则插件将无法读取分页数据-->
<!-- 隐藏内容设置后，在插件初始化时进行读取-->
<c:if test="${pageUtils.list != null}">
<input type="hidden" id="pageNumber" value="${pageUtils.pageNumber}">
<input type="hidden" id="pageSize" value="${pageUtils.pageSize}">
<input type="hidden" id="totalPage" value="${pageUtils.totalPage}">
<input type="hidden" id="totalRow" value="${pageUtils.totalRow}">
</c:if>

<!-- 分页栏 -->
<div id="page1"></div>

<script type="text/javascript">
	$(function(){
		//初始化插件
		$('#page1').bPage({
		    //分页目标链接
		    url : "users/list",
		    //读取页面设置的分页参数
		    totalPage : $('#totalPage').val(),
		    totalRow : $('#totalRow').val(),
		    pageSize : $('#pageSize').val(),
		    pageNumber : $('#pageNumber').val()
		});
	});

</script>

</body>
</html>