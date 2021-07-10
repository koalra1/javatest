<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>loginCheck</title>
	</head>
	<body>
		<%
		String id = request.getParameter("id");
		String pw = request.getParameter("pw");
		if(id.equals("aaa")&&pw.equals("1111")){
			session.setAttribute("flag", "sucess");
			response.sendRedirect("./index.jsp");
		}else{
			response.sendRedirect("./login?flag=fail");
		}
		
		
		%>
	</body>
</html>