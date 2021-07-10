<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Insert title here</title>
		<script  src="http://code.jquery.com/jquery-latest.min.js"></script>
		<script type="text/javascript">
			function formCheck(){
				if($("#name").val()==""){
					alter("이름을 입력해주세요");
					$("#name").focus();
					return false;
				}
				return $("#form").submit();
			}
		
		
		
		
		</script>
	</head>
	<body>
		
		<form action="./formOk.jsp" method="post" name="form" id="form">
			<label>아이디</label>
			<input type = 'text' id = 'id' name = 'id'><br>
			<label>패스워드</label>
			<input type='text' id='pw' name='pw'><br>
			<label>이름</label>
			<input type='text' id='name' name='name'><br>
			<label>전화번호</label>
			<input type='text' id='tel' name='tel'><br>
			<label>성별</label>
			<label for="male">남자</label>
			<input type = 'radio' id='male' name='gender' value="male">
			<label for="female">여자</label>
			<input type = 'radio' id='female' name='gender' value="female"><br>
			<label>주소1</label>
			<input type='text' id='addr1' name='addr1'><br>
			<label>주소2</label>
			<input type='text' id='addr2' name='addr2'><br>
			<label for="hobby">취미</label>
			<label for="hobby">수영</label>
			<input type="checkbox" name="hobby" value="수영">
			<label for="hobby">골프</label>
			<input type="checkbox" name="hobby" value="골프">
			<label for="hobby">독서</label>
			<input type="checkbox" name="hobby" value="독서">
			<label for="hobby">조깅</label>
			<input type="checkbox" name="hobby" value="조깅"><br>
			<label for="come">유입경로</label>
			<select for="come" name="come">
				<option>인터넷</option>
				<option>블로그</option>
				<option>신문광고</option>
				<option>유튜브</option>
			</select><br>
			<input type = "button" onclick="formCheck()" value="전송">
			
		</form>
		
		
	</body>
</html>