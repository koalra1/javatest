<%@page import="javax.swing.text.Document"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>form</title>
		<script  src="http://code.jquery.com/jquery-latest.min.js"></script>
		<script type="text/javascript">
			function formCheck() {
				var kor = Number($("#kor").val())
				var eng = Number($("#eng").val())
				var math = Number($("#math").val())
				var result = kor+eng+math;
			
				//total 점수등록
				$("#total").val(result);
				//avg 점수등록
				$("#avg").val($("#total").val()/3.0);
				
				return $("#form").submit();
				//return document.form.submit();
			}
			
		
		</script>
	</head>
	<body>
		<form action="./j0630_03.jsp" method="post" name="form" id="form">
		
			<label>학번</label>
			<input type="text" id="stuNo" name="stuNo"><br>
			<label>이름</label>
			<input type="text" id="name" name="name"><br>
			<label>국어</label>
			<input type="text" id="kor" name="kor"><br>
			<label>영어</label>
			<input type="text" id="eng" name="eng"><br>
			<label>수학</label>
			<input type="text" id="math" name="math"><br>
			<input type="hidden" id="total" name="total">
			<input type="hidden" id="avg" name="avg">
			
			<input type="button" onclick="formCheck()" value="전송">
		</form>
	</body>
</html>