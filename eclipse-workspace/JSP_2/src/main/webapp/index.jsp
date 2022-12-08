<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%@ page import="java.lang.Math" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Bai Tap JSP-1</title>
</head>
<body>
	<%
		int a = 2;
		int b = 2;
		int sum = a+b;
		double canHai = Math.sqrt(sum);
	%>
	Hai Cộng Hai = <b> <%=sum%> </b><br>
	Căn Hai của sum = <b> <%=canHai%> </b>
</body>
</html>