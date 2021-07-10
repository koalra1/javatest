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
		
		out.println("ContextPath : " + request.getContextPath()+"<br>");
		out.println("URL : " + request.getRequestURL()+"<br>");
		out.println("URI : " + request.getRequestURI()+"<br>");
		out.println("ip주소 : " + request.getRemoteAddr()+"<br>");
		
		//파일명만 출력시키세요.
		out.println(request.getRequestURI().substring(7)+"<br>");
		
		String uriName = request.getRequestURI();
		String pathName = request.getContextPath();
		out.println("파일 이름 : "+uriName.substring(pathName.length()));
	%>
	
	</body>
</html>