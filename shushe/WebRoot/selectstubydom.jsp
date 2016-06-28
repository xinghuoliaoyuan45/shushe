<%@ page language="java" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>   
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>  
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>  

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>

</head>

  <body background="../resources/background.jpeg">
  <center>
    <c:forEach  var="stus"  items="${students}">
   学生学号:     ${stus.Student_ID} 
   学生宿舍名字:   ${stus.Student_DomitoryID}
    学生名字: 	 ${stus.Student_Name}
   学生电话:     ${stus.Student_Tel}
    </c:forEach>

</body>
</html>
