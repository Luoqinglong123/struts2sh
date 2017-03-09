<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<base href="<%=basePath %>" />
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>home</title>
</head>
<body>
	<form action="login/logout" method="post">
		<table align="center">
			<tr>
				<td>用户名：</td>
				<td><%=session.getAttribute("userName") %>
			</tr>
			<tr>
				<td><input type="submit" name="logout" value="退出"/></td>
			</tr>
		</table>
	</form>
</body>
</html>