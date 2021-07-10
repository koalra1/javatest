<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Insert title here</title>
	</head>
	<body>
		<!-- 
			useBean 만들어서 1,홍길동,aaa,1111,010-1111-1111,남자 저장하고 출력
			int no;
			String name;
			String id;
			String pw;
			String tel;
			String gender;
		
		 -->
		 
		 <jsp:useBean id="mem" class="ex0630.Member" scope="page"></jsp:useBean>
		 <jsp:setProperty name="mem" property="no" value="1" />
		 <jsp:setProperty name="mem" property="name" value="홍길동" />
		 <jsp:setProperty name="mem" property="id" value="aaa" />
		 <jsp:setProperty name="mem" property="pw" value="1111" />
		 <jsp:setProperty name="mem" property="tel" value="010-1111-1111" />
		 <jsp:setProperty name="mem" property="gender" value="남자" />
	
		<table border="1">
		 <tr>
		 <td>번호</td>
		 <td><%=mem.getNo() %></td>
		 <td><jsp:getProperty name="mem" property="no" /></td>
		 </tr>
		
		 
		 
		 <tr>
		 <td>이름</td>
		 <td><%=mem.getName() %></td>
		 <td><jsp:getProperty property="name" name="mem"/></td>
		 </tr>
		 <tr>
		 <td>아이디</td>
		 <td><%=mem.getId() %></td>
		 <td><jsp:getProperty property="id" name="mem"/></td>
		 </tr>
		 <tr>
		 <td>비밀번호</td>
		 <td><%=mem.getPw() %></td>
		 <td><jsp:getProperty property="pw" name="mem"/></td>
		 </tr>
		 <tr>
		 <td>전화번호</td>
		 <td><%=mem.getTel() %></td>
		 <td><jsp:getProperty property="tel" name="mem"/></td>
		 </tr>
		 <tr>
		 <td>성별</td>
		 <td><%=mem.getGender() %></td>
		 <td><jsp:getProperty property="gender" name="mem"/></td>
		 </tr>
		
		
		
		</table>
	
	
	</body>
</html>