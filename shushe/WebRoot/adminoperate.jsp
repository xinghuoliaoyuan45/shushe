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
	<Strong>这是admin(宿舍管理员)对学生宿舍的增删改</Strong>


	<br>


	<hr>
	<Strong>学生迁出宿舍(删除学生)</Strong>

	<form action="deletestudent.action" method="post">
		<input type="text" name="stu_id">学生学号 </input><br>
		 <input type="submit">迁出</input>
	</form>
	<br>
	<br>
	

	<hr>
	<Strong>加入学生到宿舍</Strong>
	<form action="addStudentdomitory.action" method="post">
		<input type="text" name="stu_id">学生学号 </input><br>
		 <input type="text" name="stu_shushe">学生的宿舍号</input><br> 
		<input type="text" name="stu_name">学生名字</input><br> 
			<input type="text"name="stu_tel">学生电话<br> 
			<input type="submit">添加</input>
	</form>


	<br>
	<br>

	<hr>
	<Strong>学生换宿舍</Strong>
	<form action="UpdateStudentdomitory.action" method="post">
		<input type="text" name="stu_id">学生学号</input><br> 
		<input type="text" name="stu_shushe">学生的宿舍号</input><br> 
		<input type="submit">更换</input>
	</form>


</body>
</html>
