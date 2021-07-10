<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>결과값</title>
		<style type="text/css">
			table,td{border: 1px solid black; border-collapse: collapse;}
		</style>
	</head>
	<body>
		<!-- 1.memberForm.jsp 번호,이름,아이디,전화번호,성별,월급,공제액 -->
		<!-- 공제액은 월급에서 10%를 자동으로 계산해서 hidden으로  -->
		<!-- 2.Salary.java 번호,이름,아이디,전화번호,성별,월급,공제액(10%) -->
		<!-- 2.j0630_04.jsp 폼에서 넘어온 데이터를 useBean에 값을 삽입 -->
		<!-- 3.useBean 데이터를 테이블에 출력을 하시오. -->
	
	<%
		request.setCharacterEncoding("utf-8");
	
	%>
	<jsp:useBean id="salary" class ="ex0630.Salary" scope="page"/>
	<jsp:setProperty property="*" name="salary"/>
	
	<table>
	<tr>
	<td>번호</td>
	<td><%=salary.getNum() %></td>
	</tr>
	<tr>
	<td>이름</td>
	<td><%=salary.getName() %></td>
	</tr>
	<tr>
	<td>아이디</td>
	<td><%=salary.getId() %></td>
	</tr>
	<tr>
	<td>전화번호</td>
	<td><%=salary.getTel() %></td>
	</tr>
	<tr>
	<td>성별</td>
	<td><%=salary.getGender() %></td>
	</tr>
	<tr>
	<td>월급</td>
	<td><%=salary.getPay() %></td>
	</tr>
	<td>공제액</td>
	<td><%=salary.getDedu() %></td>
	</tr>
	
	
	</table>
	</body>
</html>