<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<base href="<%=basePath%>">

<title>success .jsp</title>
<meta http-equiv="pragma" content="no-cache">
<meta http-equiv="cache-control" content="no-cache">
<meta http-equiv="expires" content="0">
<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
<meta http-equiv="description" content="This is success page">
<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
</head>

<body>
	操作成功页面
	<h2>
		<a href="http://localhost:8080/shushe/adminoperate.jsp">回到admin(宿舍管理员)对学生宿舍的增删改</a>
	</h2>

	<h2>
		<a href="http://localhost:8080/shushe/adminaddlog.jsp">回到admin(宿舍管理员)对学生不归宿信息和的增加删除</a>
	</h2>
	<h2>
		<a href="http://localhost:8080/shushe/adminselect.jsp">回到admin(宿舍管理员)对学生宿舍的查询页面 </a>
	</h2>
	<h2>
		<a href="http://localhost:8080/shushe/adminoperatedom.jsp">超级管理员的特权页面</a>
	</h2>
</body>
</html>
