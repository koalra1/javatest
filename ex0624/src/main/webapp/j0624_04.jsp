<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
	<meta charset="UTF-8">
	<title>회원가입</title>
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
		
		
		<!-- j0624_04.jsp 학번,이름,국어,영어,수학 -->
		<!-- result.jsp 학번,이름,국어,영어,수학,합계,평균 -->
		<!-- modify.jsp 학번,이름,국어,영어,수학,합계,평균 -->
		
		
		<h3>학생성적 입력페이지</h3>
		<form action="./result.jsp" method="post" id = "stuScoreForm" name="StuScoreForm">
			<label for="stuNo">학번</label>
			<input type="text" name="stuNo" id="stuNo"><br>
			<label for="name">이름</label>
			<input type="text" name="name" id="name"><br>
			<label for="kor">국어</label>
			<input type="text" name="kor" id="kor"><br>
			<label for="eng">영어</label>
			<input type="text" name="eng" id="eng"><br>
			<label for="math">수학</label>
			<input type="text" name="math" id="math"><br>
			<input type = "button" onclick = "formCheck()"value="전송">
			<input type = "reset" value="취소">
		</form>
	</body>
</html>