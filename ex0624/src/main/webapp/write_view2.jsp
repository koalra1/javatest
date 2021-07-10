<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
  <title>게시판 입력페이지</title>
  <link href="https://fonts.googleapis.com/css?family=Noto+Sans+KR:400,500,700,900&display=swap&subset=korean" rel="stylesheet">
  <link rel="stylesheet" href="css/style.css">
  <link rel="stylesheet" href="css/write.css">
  
  <script  src="http://code.jquery.com/jquery-latest.min.js"></script>
  <script type="text/javascript">
			
			function formCheck() {
				if ($("#title").val()=="") {
					alert('이름은 필수입니다. 이름을 입력해주세요');
					$("title").focus();
					return false;
				}
				return $(noticeForm).submit();
			}
	</script>
  
  
</head>
<body>
	<!-- noticewrite.jsp 게시판번호, 제목, 내용, 작성자,작성일,조회수 -->
	<!-- noticeView.jsp 게시판번호,제목,내용,작성자,작성일,조회수(1) -->
	<!-- noticeModify.jsp 게시판번호,제목,내용,작성자,작성일,조회수 readonly 게시판번호 -->
<section>
    <h1>게시판 입력페이지</h1>
    <hr>

    <form action="./content_view2.jsp" name="write" method="post" id="noticeForm">
      <table>
        <colgroup>
          <col width="15%">
          <col width="85%">
        </colgroup>
        <tr>
          <th>게시판번호</th>
          <td>
            <input type="text" id="noticeNo" name="noticeNo">
          </td>
        </tr>
        <tr>
          <th>제목</th>
          <td>
            <input type="text" id="title" name="title">
          </td>
        </tr>
        <tr>
          <th>내용</th>
          <td>
            <textarea id="contents" name="contents" cols="50" rows="10"></textarea>
          </td>
        </tr>
        <tr>
          <th>작성자</th>
          <td>
            <input type="text" id="writer" name="writer">
          </td>
        </tr>
        <tr>
          <th>조회수</th>
          <td>
            <input type="text" id="count" name="count" value="1">
          </td>
        </tr>
      </table>
      <hr>
      <div class="button-wrapper">
       <input type="button" onclick="formCheck()" value="저장">
       <input type="reset" value="취소">
      </div>
    </form>

  </section>

</body>
</html>