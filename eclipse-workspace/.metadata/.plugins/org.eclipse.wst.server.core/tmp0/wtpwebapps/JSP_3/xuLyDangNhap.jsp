<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%
	String username = request.getParameter("username");
	String password = request.getParameter("password");
	%>
	<%
		if(username.equalsIgnoreCase("Phung")&&password.equals("123"))
		{
	%>
			<h2>Bạn đã đăng nhập thành công.</h2>
	<%
		}else{
	%>
			<h2>Tên đăng nhập hoặc mật khẩu không đúng!</h2>
	<%
		}
	%>
</body>
</html>