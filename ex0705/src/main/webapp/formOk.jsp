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
		<%!
			String id,pw,name,tel,gender,addr1,addr2,come;
			String[] hobby ;
		
		%>
		<%
		request.setCharacterEncoding("utf-8");
		
		String hobbys="";
		id = request.getParameter("id");
		pw = request.getParameter("pw");
		name = request.getParameter("name");
		tel = request.getParameter("tel");
		gender = request.getParameter("gender");
		addr1 = request.getParameter("addr1");
		addr2 = request.getParameter("addr2");
		hobby = request.getParameterValues("hobby");
		come = request.getParameter("come");
		
		for(int i=0; i<hobby.length; i++){
				hobbys = hobbys+hobby[i];
			}
		%>
		
	</head>
	<body>
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
		<td>이름</td>
		<td><%=name %></td>
		</tr>
		<tr>
		<td>전화번호</td>
		<td><%=tel %></td>
		</tr>
		<tr>
		<td>성별</td>
		<td><%=gender %></td>
		</tr>
		<tr>
		<td>주소1</td>
		<td><%=addr1 %></td>
		</tr>
		<tr>
		<td>주소2</td>
		<td><%=addr2 %></td>
		</tr>
		<tr>
		<td>취미</td>
		<td><%=hobbys %></td>
		</tr>
		<tr>
		<td>유입경로</td>
		<td><%=come %></td>
		</tr>
		
		
		</table>
	</body>
</html>