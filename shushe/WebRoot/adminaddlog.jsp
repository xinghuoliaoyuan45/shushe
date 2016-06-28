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
	<Strong>这是admin(宿舍管理员)对学生不归宿信息和的增加删除 </Strong>


	<br>

	<hr>
	<Strong>有违规学生添加信息(注意时间)</Strong>
	<form action="addloginfo.action" method="post">
		<input type="text" name="Log_StudentID">违规学生学号 </input><br>
		 <input type="text" name="Student_DomitoryID">学生的宿舍号</input><br> 
		<input type="text" name="Student_Name">学生名字</input><br> 
			<input type="text"name="Time">时间(年月日)<br> 
			<input type="submit">添加</input>
	</form>


	<br>
	<br>

	<hr>
		<Strong>删除违规学生信息</Strong>
	<form action="deleteloginfo.action" method="post">
		<input type="text" name="stuname ">违规学生名字 </input><br>
		<input type="submit">删除</input>
	</form>
	

</body>
</html>
