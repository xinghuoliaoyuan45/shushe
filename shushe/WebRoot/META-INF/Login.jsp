<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
 <base href="<%=basePath%>"> 
  <title>校园宿舍管理系统</title>
  <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
  <link href="Style/Style.css" rel="stylesheet" type="text/css" />
</head>
<body>
<center>
  <br><br><br><br><br>
  <table width="684" border="0" cellspacing="0" cellpadding="0">
    <tr>
      <td height="292" align="center" valign="top" >
      <table width="350" height="201" border="0" cellpadding="0" cellspacing="0">
        <tr>
          <td height="72" align="center"><h2>校园宿舍管理系统</h2></td>
        </tr>
        <tr>
          <td align="center" valign="top">
             <form action="GoLogin.action" method="post">
              <table width="100%" border="0" cellspacing="0" cellpadding="0">
                <tr>
                  <td height="30" colspan="2" align="center"><span style="color:red;">
                  </span></td>
                  </tr>
            
                <tr>
                  <td width="37%" height="30" align="right"><h2>admin:</h2></td>
                  <td width="300" align="left"><input type="text" name="Admin_Username"/></td>
                  </tr>
                <tr>
                  <td height="30" align="right"><h2>密码：</h2></td>
                  <td align="left"><input type="password" name="Admin_Password"/></td>
                  </tr>
                <tr>
                  <td height="30" colspan="2" align="center"><label>
                    <input type="submit" name="button" id="button" value="登录">
                  </label></td>
                  </tr>
              </table>
              </form>
          
          </td>
        </tr>
      </table></td>
    </tr>
  </table>


</center>
</body>
</html>
