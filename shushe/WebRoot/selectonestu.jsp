<%@ page language="java" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix ="s" uri="/struts-tags"%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>

</head>

  <body background="../resources/background.jpeg">
  <center>
<!--  
<%   	 Object stu=request.getAttribute("students");
		out.print(stu);
%>
-->  
<s:iterator id="stus" value="#request.students">
  <tr class="table_header">    
    <td> 学生学号:    <s:property value="#stus.Student_ID"/></td>
 <td>  学生宿舍名字:      <s:property value="#stus.Student_DomitoryID"/></td>
  <td> 学生名字:      <s:property value="#stus.Student_Name"/></td>
   <td>  学生电话:      <s:property value="#stus.Student_Tel"/></td>
   </tr>
</s:iterator>
 
</center>

</body>
</html>
