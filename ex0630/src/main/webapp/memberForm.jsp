<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>memberForm</title>
		<script  src="http://code.jquery.com/jquery-latest.min.js"></script>
		<script type="text/javascript">
			function formCheck() {
				//이름 유효성 검사
				if($("#name").val()==""){
					alert("이름을 입력해주세요");
					$("#name").focus();
					return false;
				}
				//아이디 유효성 검사
				if($("#id").val().length<3){
					alert("아이디는 3자리 이상 입력하셔야 합니다.");
					$("#id").focus();
					return false;
				}
				// pay(월급)데이터나누기 10을 한값을 받아 dedu(공제액)에 값 넣기
				var pay = Number($("#pay").val());
				$("#pay").val(pay/10.0);
				
				return $("#form").submit();
			}
		
		
		
		</script>
	</head>
	<body>
		<form action="./j0630_04.jsp" method="post" name="form" id="form">
			<label>번호</label>
			<input type="text" id="num" name="num"><br>
			<label>이름</label>
			<input type="text" id="name" name="name"><br>
			<label>아이디</label>
			<input type="text" id="id" name="id"><br>
			<label>전화번호</label>
			<input type="text" id="tel" name="tel"><br>
			<label>성별</label>
			<input type="radio" id="gender" name="gender" value="male"><label for="male">남자</label>
			<input type="radio" id="gender" name="gender" value="female"><label for="female">여자</label><br>
			<label>월급</label>
			<input type="text" id="pay" name="pay"><br>
			<input type="hidden" id="dedu" name="dedu"><br>
			<input type="button" onclick="formCheck()" value="전송">
		</form>
	</body>
</html>