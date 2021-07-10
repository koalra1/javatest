
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>게시판 입력</title>
		<script src="http://code.jquery.com/jquery-latest.min.js"></script>
		<script type="text/javascript">
		function formCheck1() {
			if($("#name").val==""){
				alert("제목은 필수 입력입니다.");
				return false;
			}
			return $("#notice").submit();
		}
		</script>
		
		
	</head>
	<body>
		<!-- noticeWrite.jsp 게시판번호,제목,내용,작성자 -->
		<!-- noticeView.jsp 게시판번호,제목,내용,작성자,작성일(date),조회수 -->
		<!-- noticeModify.jsp 게시판번호,제목,내용,작성자,작성일(date),조회수 readonly 게시판번호,작성일,조회수 -->
	
		<h3>게시판</h3>
		<form action="./noticeView.jsp" method="post" name="notice" id="notice">
		
			<label for="num">게시판 번호</label>
			<input type="text" id="num" name="num"><br>
			<label for="name">제목</label>
			<input type="text" id="name" name="name"><br>
			<label for="han">내용</label>
			<input type="text" id="han" name="han"><br>
			<label for="writer">작성자</label>
			<input type="text" id="writer" name="writer"><br>
			<input type="button" onclick="formCheck1()"value="전송">
		</form>
	
	</body>
</html>