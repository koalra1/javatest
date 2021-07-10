<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
  <title>게시판 수정페이지</title>
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
	<%!
		String noticeNo, title, contents, writer, writerdate, count;
	%>
	<%
		request.setCharacterEncoding("utf-8");
		noticeNo = request.getParameter("noticeNo");
		title = request.getParameter("title");
		contents = request.getParameter("contents");
		writer = request.getParameter("writer");
		writerdate = request.getParameter("writerdate");
		count = request.getParameter("count");
	%>
<section>
    <h1>게시판 수정페이지</h1>
    <hr>

    <form action="./content_view.jsp" name="modify" method="post" id="noticeForm">
      <table>
      <input type="hidden" name="bId" value="">
        <colgroup>
          <col width="15%">
          <col width="85%">
        </colgroup>
        <tr>
          <th>게시판번호</th>
          <td>
            <input type="text" id="noticeNo" name="noticeNo" readonly>
          </td>
        </tr>
        <tr>
          <th>작성자</th>
          <td>
            <input type="text" id="writer" name="writer" value="<%=writer%>" readonly>
          </td>
        </tr>
        <tr>
          <th>제목</th>
          <td>
            <input type="text" id="title" name="title" value="<%=title%>">
          </td>
        </tr>
        <tr>
          <th>내용</th>
          <td>
            <textarea id="contents" name="contents" value="<%=contents%>" cols="50" rows="10">
           
            </textarea>
          </td>
        </tr>
        <tr>
          <th>작성일</th>
          <td>
            <input type="text" id="writerdate" name="writerdate" value="<%=writerdate%>">
          </td>
        </tr>
        <tr>
          <th>조회수</th>
          <td>
            <input type="text" id="count" name="count" value="<%=count%>">
          </td>
        </tr>
      </table>
      <hr>
      <div class="button-wrapper">
        <input type="button" onclick="formCheck()" value="수정">
		<input type="reset" value="취소"><br>
      </div>
    </form>

  </section>

</body>
</html>