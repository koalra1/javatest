<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Insert title here</title>
			<script  src="http://code.jquery.com/jquery-latest.min.js"></script>
			<script type="text/javascript">
			function testCheck() {
				alert("테스트");
				if($("#name").val()==""){
					alert("이름을 입력하세요.")
					$("#name").focus();
					return false;
				}
				
				return $("#test").submit();
			}
			
			</script>
		
	</head>
	<body>
		<!-- 시험번호:1 이름:홍길동 점수:70 -->
		<!-- test.jsp -> 합격이면 test_success.jsp, 불합격이면 test_fail.jsp
		 60이상 합격,60미만 불합격 파라미터->시험번호,이름,점수,합격 불합격 여부 나타나게 -->
	
		<form action="test.jsp" method = "post" id="test" name="testForm">
		<h3>시험여부</h3>
		<label>시험번호</label>
		<input type = "text" id="num" name="num"><br>
		<label>이름</label>
		<input type = "text" id="name" name="name"><br>
		<label>점수</label>
		<input type = "text" id="score" name="score"><br>
		<input type="button" onclick= "testCheck()" value="전송">

		</form>
	</body>
</html>