<%@page import="java.text.SimpleDateFormat"%>
<%@page import="java.util.Date"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
  <title>게시판 결과 페이지</title>
  <link href="https://fonts.googleapis.com/css?family=Noto+Sans+KR:400,500,700,900&display=swap&subset=korean" rel="stylesheet">
  <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.12.1/css/all.min.css">
  <link rel="stylesheet" href="css/style.css">
  <link rel="stylesheet" href="css/read.css">
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
		
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-mm-dd hh:mm:ss");
		Date today = new Date();
		writerdate = sdf.format(today);
	%>
</head>
<body>
<section>
    <h1>게시판번호<%=noticeNo %></h1>

    <table>
      <colgroup>
        <col width="80%">
        <col width="10%">
        <col width="10%">
        
      </colgroup>
      <tr>
        <th>제목</th>
        <td><%=title %></td>
      </tr>
      <tr>
        <td><strong>게시판 글제목이 들어갑니다.</strong></td>
        <td><%=contents %></td>
      </tr>
      <tr>
        <td>작성자가 들어갑니다.</td>
        <td><%=writer %></td>
      </tr>
      <tr>
        <td>조회수</td>
        <td><%=count %></td>
      </tr>
      <tr>
        <td>날짜</td>
        <td><%=writerdate %></td>
      </tr>
      
    </table>
    
    <form action="./modify_view2.jsp">
		<input type="hidden" name="noticeNo" value="<%=noticeNo %>">
		<input type="hidden" name="title" value="<%=title %>">
		<input type="hidden" name="contents" value="<%=contents %>">
		<input type="hidden" name="writer" value="<%=writer %>">
		<input type="hidden" name="writerdate" value="<%=writerdate %>">
		<input type="hidden" name="count" value="<%=count %>">
		<input type="submit" value="수정">
	</form>

  </section>
</body>
</html>