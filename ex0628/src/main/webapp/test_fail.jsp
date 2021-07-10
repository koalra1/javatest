<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>불합격</title>
	</head>
	<body>
		
		<h3>번호 : <%=request.getParameter("name") %></h3>
		<h3>나이 : <%=request.getParameter("num") %></h3>
		<h3>점수 : <%=request.getParameter("score") %></h3>
		<h3>불합격 입니다.</h3>
	</body>
</html>