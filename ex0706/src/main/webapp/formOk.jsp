<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Insert title here</title>	
		<style type="text/css">
		table,td{border:1px solid black; border-collapse: collapse;}
		</style>
	</head>
	<body>
		
		<%!
		String id,pw,news,age,gender,wedding,baby,job;
		
		String[] check3;
		%>
		<%
		
		request.setCharacterEncoding("utf-8");
		String checks3="";
		
		id = request.getParameter("id");
		pw = request.getParameter("pw");
		news = request.getParameter("news");
		age = request.getParameter("age");
		gender = request.getParameter("gender");
		wedding = request.getParameter("wedding");
		baby = request.getParameter("baby");
		job = request.getParameter("job");
		check3 = request.getParameterValues("check3");
		
		for(int i=0; i<check3.length;i++){
			checks3 = checks3+check3[i];
		}
		
		%>
		
		
		<table>
		<tr>
		<td>아이디</td>
		<td><%=id %></td>
		</tr>
		<tr>
		<td>비밀번호</td>
		<td><%=pw %></td>
		</tr>
		<tr>
		<td>비밀번호 확인</td>
		<td><%=pw %></td>
		</tr>
		<tr>
		<td>소식지 수신여부</td>
		<td><%=news %></td>
		</tr>
		<tr>
		<td>관심연령</td>
		<td><%=age %></td>
		</tr>
		<tr>
		<td>성별</td>
		<td><%=gender %></td>
		</tr>
		<tr>
		<td>결혼여부</td>
		<td><%=wedding %></td>
		</tr>
		<tr>
		<td>자녀유무</td>
		<td><%=baby %></td>
		</tr>
		<tr>
		<td>직업</td>
		<td><%=job %></td>
		</tr>
		<tr>
		<td>관심주제</td>
		<td><%=checks3 %></td>
		</tr>
		</table>
	
		<form action="./form_update.jsp">
			<input type="hidden" name="id" value=<%=id%>>
			<input type="hidden" name="pw" value=<%=pw%>>
			<input type="hidden" name="news" value=<%=news%>>
			<input type="hidden" name="age" value=<%=age%>>
			<input type="hidden" name="gender" value=<%=gender%>>
			<input type="hidden" name="wedding" value=<%=wedding%>>
			<input type="hidden" name="baby" value=<%=baby%>>
			<input type="hidden" name="job" value=<%=job%>>
			<input type="hidden" name="check3" value=<%=check3%>>
			<input type="submit" value="수정">
		
		</form>
		<button type="button" onclick="location.href='./form_update.jsp'">수정</button>
	</body>
</html>