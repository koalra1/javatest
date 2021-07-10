<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>결과 페이지</title>
		<style type="text/css">
		table,td{border:1px solid black; border-collapse: collapse;}
		</style>
	</head>
	<body>
		<%!
			String num,name,han,writer;
			int count=0;
		%>
		<%
			request.setCharacterEncoding("utf-8");
			String num = request.getParameter("num");
			String name = request.getParameter("name");
			String han = request.getParameter("han");
			String writer = request.getParameter("writer");
			count=count++;
		%>
	<h3>게시판 확인페이지</h3>
		<table>
		<tr>
			<td>게시판 번호</td>
			<td><%=num %></td>
		</tr>
		<tr>
			<td>제목</td>
			<td><%=name %></td>
		</tr>
		<tr>
			<td>내용</td>
			<td><%=han %></td>
		</tr>
		<tr>
			<td>작성자</td>
			<td><%=writer %></td>
		</tr>
		</table><br>
		
		
		<form action="./noticeModify.jsp"method="post"name="score">
		 <input type="hidden"name="num" value='<%=num%>'>
		 <input type="hidden"name="name" value='<%=name%>'>
		 <input type="hidden"name="han" value='<%=han%>'>
		 <input type="hidden"name="writer" value='<%=writer%>'>
		 
		<input type="submit" value="수정">
		
		</form> 
		
	</body>
</html>