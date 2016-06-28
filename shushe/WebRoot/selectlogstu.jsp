<%@ page language="java" pageEncoding="UTF-8"%>
<%@ taglib prefix ="s" uri="/struts-tags"%>
  

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>

</head>

  <body background="../resources/background.jpeg">
  <center>
  
  <s:iterator id="log" value="#request.Logs">    
      不归宿时间    <s:property value="#log.Time"/>
    不归宿学生名字:     <s:property value="#log.Log_StudentID"/>
  不归宿学生宿舍号:     <s:property value="#log.Student_DomitoryID"/>
   不归宿学生名字电话:       <s:property value="#log.Student_Name"/><br>
</s:iterator>
</center>
</body>
</html>
