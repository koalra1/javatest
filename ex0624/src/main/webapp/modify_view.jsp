<%@page import="javax.print.attribute.HashPrintRequestAttributeSet"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
  <title>글수정</title>
  <link href="https://fonts.googleapis.com/css?family=Noto+Sans+KR:400,500,700,900&display=swap&subset=korean" rel="stylesheet">
  <link rel="stylesheet" href="css/style.css">
  <link rel="stylesheet" href="css/write.css">
</head>
<body>
<%!
	String bName,bTitle,bContent;
%>
<%
	request.setCharacterEncoding("utf-8");
	bName = request.getParameter("bName");
	bTitle = request.getParameter("bTitle");
	bContent = request.getParameter("bContent");
	
%>
<section>
    <h1>게시글 수정</h1>
    <hr>

    <form action="content_view.jsp" name="modify" method="post">
      <table>
      <input type="hidden" name="bId" value="">
        <colgroup>
          <col width="15%">
          <col width="85%">
        </colgroup>
        <tr>
          <th>작성자</th>
          <td>
            <input type="text" name="bName" value="<%=bName%>" readonly>
          </td>
        </tr>
        <tr>
          <th>제목</th>
          <td>
            <input type="text" name="bTitle" value="<%=bTitle%>">
          </td>
        </tr>
        <tr>
          <th>내용</th>
          <td>
            <textarea name="bContent" cols="50" rows="10" value = "">
           <%=bContent%>
            </textarea>
          </td>
        </tr>
        <tr>
          <th>이미지 표시</th>
          <td>
            <input type="file" name="file" id="file">
          </td>
        </tr>
      </table>
      <hr>
      <div class="button-wrapper">
        <button type="submit" class="write">수정완료</button>
        <button type="button" class="cancel" onclick="javascript:location.href='list.do'">ì·¨ì</button>
      </div>
    </form>

  </section>

</body>
</html>