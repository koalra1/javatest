<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
	<meta charset="UTF-8">
	<title>수정 페이지</title>
			<script src="http://code.jquery.com/jquery-latest.min.js"></script>
		<script type="text/javascript">
		  function formCheck(){
			if($("#name").val==""){
				alert("이름은 필수입니다. 이름을 입력하세요.");
				$("#name").focus();
				return false;
			}
			  
			  return $("#stuScoreForm").submit();
		  }
		
		</script>
	</head>
	<body>
		
		<%!
			String stuNo,name;
			int kor,eng,math,total;
			double avg;
		%>
		<%
		request.setCharacterEncoding("utf-8");	
			
			stuNo = request.getParameter("stuNo");
			name = request.getParameter("name");
			kor = Integer.parseInt(request.getParameter("kor"));
			eng = Integer.parseInt(request.getParameter("eng"));
			math = Integer.parseInt(request.getParameter("math"));
			total = kor+eng+math;
			avg = total/3.0;
		
		%>
		<h3>학생성적 수정페이지</h3>
		<form action="./result.jsp" method="post" id = "stuScoreForm" name="StuScoreForm">
		<h2>회원가입</h2>
			<label for="stuNo">학번</label>
			<input type="text" name="stuNo" id="stuNo" value = "<%=stuNo%>"readonly><br>
			<label for="name">이름</label>
			<input type="text" name="name" id="name" value = "<%=name%>"><br>
			<label for="kor">국어</label>
			<input type="text" name="kor" id="kor" value = "<%=kor%>"><br>
			<label for="eng">영어</label>
			<input type="text" name="eng" id="eng" value = "<%=eng%>"><br>
			<label for="math">수학</label>
			<input type="text" name="math" id="math" value = "<%=math%>"><br>
			<label for="total">합계</label>
			<input type="text" name="total" id="total" value = "<%=total%>"readonly><br>
			<label for="avg">평균</label>
			<input type="text" name="avg" id="avg" value = "<%=avg%>"readonly><br>
			
			<input type = "button" onclick = "formCheck()"value="수정">
			
		</form>
	</body>
</html>