<%@ page language="java" pageEncoding="UTF-8"%>
<%@ taglib prefix ="s" uri="/struts-tags"%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>

</head>

  <body background="../resources/background.jpeg">
  <center>
  <s:iterator id="stus" value="#request.students">    
     学生学号:    <s:property value="#stus.Student_ID"/>
   学生宿舍名字:      <s:property value="#stus.Student_DomitoryID"/>
   学生名字:      <s:property value="#stus.Student_Name"/>
     学生电话:      <s:property value="#stus.Student_Tel"/><br>
</s:iterator>
<br>

</body>
</html>
