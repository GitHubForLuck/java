<%@ page language="java" pageEncoding="UTF-8"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
<title>菜单</title>
<link href="${pageContext.request.contextPath}/userjsp/admin/css/left.css" rel="stylesheet" type="text/css">
</head>
<body>
<table width="100" border="0" cellspacing="0" cellpadding="0">
  <tr>
    <td height="12"></td>
  </tr>
</table>
<table width="100%" border="0">
  <tr>
    <td>
<div class="dtree">

	<a href="javascript: d.openAll();">展开所有</a> | <a href="javascript: d.closeAll();">关闭所有</a>
	<link rel="StyleSheet" href="${pageContext.request.contextPath}/userjsp/admin/css/dtree.css" type="text/css" />
	<script type="text/javascript" src="${pageContext.request.contextPath}/userjsp/admin/js/dtree.js"></script>
	<script type="text/javascript">

		d = new dTree('d');  /* 创建一个树的根 */
		d.add(0,-1,'系统菜单树');  /*  根元素的名称：系统菜单树*/
		/*  参数1：当前目录的标识名   参数2：父级目录的标识  参数3：当前目录显示的名称,参数4：点击此目录跳转的页面地址,参数5：跳转页面显示的位置*/
		d.add(1,0,'火车站信息添加','${pageContext.request.contextPath}/userjsp/admin/login/welcome.jsp','','mainFrame');
		//子目录添加
		d.add(11,1,'车站添加','${pageContext.request.contextPath}/userjsp/admin/train/station_save.jsp','','mainFrame');
		d.add(12,1,'列车添加','${pageContext.request.contextPath}/userjsp/admin/train/train_save.jsp','','mainFrame');
		d.add(13,1,'线路添加','${pageContext.request.contextPath}/userjsp/admin/train/route_save.jsp','','mainFrame');
		d.add(14,1,'列车编组','${pageContext.request.contextPath}/userjsp/admin/train/carriage_save.jsp','','mainFrame');
		d.add(14,1,'旅程区段','${pageContext.request.contextPath}/userjsp/showAllProductsServlet','','mainFrame');
	
	    d.add(2, 0, '火车站信息管理', '${pageContext.request.contextPath}/' ,'', 'mainFrame' );
		//子目录
		d.add(19, 2,'车站管理','${pageContext.request.contextPath}/station_find_findAll.action','','mainFrame');
		d.add(4, 2,'列车管理','${pageContext.request.contextPath}/train_find_findAll.action','','mainFrame');
		d.add(5, 2,'线路管理','${pageContext.request.contextPath}/route_find_findAll.action','','mainFrame');
		d.add(6, 2,'列车编组管理','${pageContext.request.contextPath}/carriage_find_findAll.action','','mainFrame');
		d.add(7, 2,'旅程区段管理','${pageContext.request.contextPath}/userjsp/showAllProductsServlet','','mainFrame');
	   
		d.add(3, 0, '用户信息管理', '${pageContext.request.contextPath}/' ,'', 'mainFrame' );
		//子目录
		d.add(8, 3,'用户添加','${pageContext.request.contextPath}/userjsp/showAllProductsServlet','','mainFrame');
		d.add(9, 3,'用户管理','${pageContext.request.contextPath}/userjsp/showAllProductsServlet','','mainFrame');
		
		d.add(18, 0, '订单信息管理', '${pageContext.request.contextPath}/' ,'', 'mainFrame' );
		//子目录
		d.add(20, 18,'订单信息','${pageContext.request.contextPath}/orders_find_findAll.action','','mainFrame');
		
		document.write(d);

	</script>
</div>	</td>
  </tr>
</table>
</body>
</html>
