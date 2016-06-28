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
	<Strong>这是admin(宿舍管理员)对学生宿舍的查询页面</Strong>


	<br>


	<hr>
	<Strong>根据宿舍名称查询学生信息</Strong>

	<form action="selectStudentsByDom.action" method="post">
		<input type="text" name="domitory_id">宿舍名字 </input><br>
		 <input type="submit">查询</input>
	</form>
	<br>
	<br>
	

	<hr>
	<Strong>查询学生名字by学生id</Strong>
	<form action="selectStudentsById.action" method="get">
		<input type="text" name="id">学生学号 </input><br>		  
			<input type="submit">查询</input>
	</form>


	<br>
	<br>

	<hr>
	<Strong>查询学生by迷糊查询学生名字</Strong>
	<form action="selectStudentsBylikename.action" method="post">
		<input type="text" name="namelike">学生名字</input><br> 
		<input type="submit">查询</input>
	</form>
	<hr>
	<Strong>查询学生夜不归宿信息</Strong>
	<form action="selectallStudentsBylogs.action" method="post">
		<input type="submit">查询</input>
	</form>
	<hr>
	<Strong>查询学生夜不归宿信息根据学生学号</Strong>
	<form action="selectalllogsStudentsByID.action" method="post">
	<input type="text" name="id">学生学号</input><br> 
		<input type="submit">查询</input>
	</form>

	
</body>
</html>
