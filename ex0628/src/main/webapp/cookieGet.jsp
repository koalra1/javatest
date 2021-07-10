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
			Cookie[] cookies = request.getCookies();
			for(int i=0; i<cookies.length;i++){
				String cookieName = cookies[i].getName(); // Cookie저장되어 있는 모든 이름을 가져옴
				String cookieValue = cookies[i].getValue();
				out.println("쿠키이름 : "+cookieName+"<br>");
				out.println("쿠키값 : "+cookieValue+"<br>");
				if(cookieName.equals("login_id")){
					out.println("login_id=aaa 쿠키가 존재합니다."+"<br>");
				}
				
			}
		%>
	</body>
</html>