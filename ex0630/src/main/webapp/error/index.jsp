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
		
		//session.setAttribute("session_flag", "success");
		String session_flag = (String)session.getAttribute("session_flag");
		//if(session_flag != null){
			if(session_flag.equals("success")){
				out.println("로그인 되었습니다.<br>");
			}
		//}
		
		//session.removeAttribute("session_flag");
		session.invalidate();
		
		%>
	</body>
</html>