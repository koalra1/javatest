<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>쿠키설정</title>
	</head>
	<body>
		<%
			Cookie cookie = new Cookie("login_id","aaa");//변수명,value값
			Cookie nickName = new Cookie("nickName","korea");
			cookie.setMaxAge(60*30); //60초*30분 = 1시간
			nickName.setMaxAge(60*30);
			response.addCookie(cookie);
			response.addCookie(nickName);
		%>
		<a href="cookieGet.jsp">쿠키정보읽기</a>
	</body>
</html>