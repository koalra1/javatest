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
		<script  src="http://code.jquery.com/jquery-latest.min.js"></script>
		<script type="text/javascript">
			function formCheck() {
				if($("#id").val()==""){
					alert("아이디를 입력하세요.");
					$("#id").focus();
					return false;
				}
				if($("#pw").val()!=$("#pw2").val()){
					alert("비밀번호가 다릅니다.");
					return false;
					
				}
				return $("#form").submit();
			}
		
		
		</script>
		
	</head>
	<body>
		<form action="./formOk.jsp" method="post" name="form" id="form">
		<table>
		<tr>
		<td>아이디</td>
		<td><input type="text" name="id" id="id"></td>
		</tr>
		<tr>
		<td>비밀번호</td>
		<td><input type="text" name="pw" id="pw"></td>
		</tr>
		<tr>
		<td>비밀번호 확인</td>
		<td><input type="password" name="pw2" id="pw2"></td>
		</tr>
		<tr>
		<td>소식지 수신여부</td>
		<td>
		<input type="radio" name="news" id="news" value="수신">
		<label>수신</label>
		<input type="radio" name="news" id="news" value="미수신">
		<label>미수신</label>
		</td>
		</tr>
		</table><br>
		
		<table>
		<tr>
		<td>관심연령</td>
		<td><select name="age">
			<option>10대</option>
			<option>20대</option>
			<option>30대</option>
			</select></td>
		<td>성별</td>
		<td>
		<label>선택안함</label>
		<input type="radio" name="gender" id="gender" value="선택안함">
		<label>남자</label>
		<input type="radio" name="gender" id="gender" value="남자">
		<label>여자</label>
		<input type="radio" name="gender" id="gender" value="여자">
		</td>
		</tr>
	
		<tr>
		<td>결혼여부</td>
		<td>
		<label>선택안함</label>
		<input type="radio" name="wedding" id="wedding" value="선택안함">
		<label>미혼</label>
		<input type="radio" name="wedding" id="wedding" value="미혼">
		<label>기혼</label>
		<input type="radio" name="wedding" id="wedding" value="기혼">
		</td>
		
		
	<td>자녀유무</td>
	<td>
	<label>선택안함</label>
		<input type="radio" name="baby" id="baby" value="선택안함">
		<label>없음</label>
		<input type="radio" name="baby" id="baby" value="없음">
		<label>있음</label>
		<input type="radio" name="baby" id="baby" value="있음">
	
	</td>
	
	</tr>
		
		<tr>
		<td>직업</td>
		<td>
		<select name="job">
		<option>학생</option>
		<option>회사원</option>
		<option>군인</option>
		</select>
		
	</table><br>
	
	<table>
	<tr>
	<td>
	<input type="checkbox" name="check3" value="가정법률" >
	<label>가정법률</label>
	<input type="checkbox" name="check3" value="아동,청소년/교육" >
	<label>아동,청소년/교육</label>
	<input type="checkbox" name="check3" value="부동산/임대차" >
	<label>부동산/임대차</label>
	<input type="checkbox" name="check3" value="금융/금전" >
	<label>금융/금전</label>
	<input type="checkbox" name="check3" value="사업" >
	<label>사업</label>
	<input type="checkbox" name="check3" value="창업" >
	<label>창업</label><br>
	
	<input type="checkbox" name="check3" value="무역/출입국" >
	<label>무역/출입국</label>
	<input type="checkbox" name="check3" value="소비자" >
	<label>소비자</label>
	<input type="checkbox" name="check3" value="문화/여가생활" >
	<label>문화/여가생활</label>
	<input type="checkbox" name="check3" value="민형사/소송" >
	<label>민형사/소송</label>
	<input type="checkbox" name="check3" value="교통/운전" >
	<label>교통/운전</label>
	<input type="checkbox" name="check3" value="근로/노동" >
	<label>근로/노동</label><br>
	
	<input type="checkbox" name="check3" value="복지" >
	<label>복지</label>
	<input type="checkbox" name="check3" value="국방/보훈" >
	<label>국방/보훈</label>
	<input type="checkbox" name="check3" value="정보통신/기술" >
	<label>정보통신/기술</label>
	<input type="checkbox" name="check3" value="환경/에너지" >
	<label>환경/에너지</label>
	<input type="checkbox" name="check3" value="사회안전/범죄" >
	<label>사회안전/범죄</label>
	<input type="checkbox" name="check3" value="국가 및 지자체" >
	<label>국가 및 지자체</label>
	
	</td>
	</tr>
	
	
	</table>
	
	
	
	<input type="button" onclick="formCheck()" value="전송">
	<input type="reset" value="취소">
	</form>
	
	</body>
</html>