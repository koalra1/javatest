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
		
		String flag = (String)session.getAttribute("flag");
		if(flag != null){
			if(flag.equals("sucess")){%>
				<a href="./logout.jsp"><img src="../images/login.jpg"></a>
			<% }
		}else{%>
			<a href="./login.jsp"><img src="../images/logout.jpg"></a>
		<%}
	
	
	
	%>
		
		
	
	</body>
</html>