<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>index</title>
	</head>
	<body>
		<!-- index 로그인전,로그인후 ->login.jsp->index.jsp->logout.jsp -->
		<%
		String session_flag = (String)session.getAttribute("session_flag");
		
		if(session_flag != null){
			if(session_flag.equals("sucess")){
		%>
			<a href="logout.jsp"><img src="../images/login.jpg"></a>
			<%
			}
				
			
		}else{%>
			
			<a href="login.jsp"><img src="../images/logout.jpg"></a>
		<%}%>
	
	
	</body>
</html>

<!-- 

[최초페이지]
index.jsp(로그인전)
- 로그인 안된이미지가 보여짐.
- 클릭시 ->login.jsp


login.jsp
- form데이터 id,pw를 넣고 loginCheck.jsp페이지 이동

loginCheck.jsp
- id,pw값을 request.getparameter 변수에 적용시킴
- id,pw를 체크해서 맞으면 -> session값 적용시키고 index.jsp로 보냄
- id,pw를 체크해서 맞지 않으면 -> login.jsp페이지로 이동

index.jsp(로그인후)
- 로그인 된 이미지를 보여줌.
- 클릭시 -> logout.jsp

logout.jsp
- session.invalidate() 모든 섹션 삭제
- index.jsp 페이지로 이동


 -->