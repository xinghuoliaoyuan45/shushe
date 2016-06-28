<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<link rel="stylesheet"
	href="http://localhost:8080/shushe/bootstrap3/css/bootstrap.min.css" />
</head>

<body>
	<Strong>这是超级管理员的特权页面 </Strong>


	<br>

	<hr>
	<Strong>添加宿舍</Strong>
	<form action="addDom.action" method="post">
		<input type="text" name="Domitory_ID ">宿舍名字</input><br>
		 <input type="text" name="Domitory_Desc">宿舍的描述信息</input><br> 
			<input type="submit">添加</input>
	</form>
	<br>
	<br>

	<hr>
		<Strong>更新宿舍信息</Strong>
	<form action="updatadomdesc.action" method="post">
		<input type="text" name="desc">宿舍信息 </input><br>
		<input type="text" name="Domitory_ID">宿舍名字 </input><br>
		<input type="submit">更新</input>
	</form>
	<br>

	<hr>
	<Strong>添加宿舍管理员</Strong>
	<form action="addamin.action" method="post">
		<input type="text" name="Admin_Username ">管理员名字</input><br>
		 <input type="text" name="Admin_Password">管理员密码</input><br> 
			<input type="submit">添加</input>
	</form>
	<br>
	<hr>
	<Strong>删除宿舍管理员</Strong>
	<form action="deleteadmin.action" method="post">
		<input type="text" name="Admin_Username">管理员名字</input><br>
		<input type="submit">删除</input>
	</form>

	
</body>
</html>
