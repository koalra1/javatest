<%@page import="java.util.Date"%>
<%@page import="java.text.SimpleDateFormat"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
  <title>뷰페이지</title>
  <link href="https://fonts.googleapis.com/css?family=Noto+Sans+KR:400,500,700,900&display=swap&subset=korean" rel="stylesheet">
  <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.12.1/css/all.min.css">
  <link rel="stylesheet" href="css/style.css">
  <link rel="stylesheet" href="css/read.css">
</head>
<body>
<%!
	String bName,bTitle,bContent,rDate;
	int count=1;
	
%>
<%
	request.setCharacterEncoding("utf-8");
	bName = request.getParameter("bName");
	bTitle = request.getParameter("bTitle");
	bContent = request.getParameter("bContent");
	count++;
	SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
	Date today = new Date();
	rDate = sdf.format(today);
	
%>

<section>
    <h1>NOTICE</h1>

    <table>
      <colgroup>
        <col width="80%">
        <col width="10%">
        <col width="10%">
        
      </colgroup>
      <tr>
        <th colspan="2">제목</th>
        <th><%=rDate%></th>
      </tr>
      <tr>
        <td colspan="3"><strong><%= bTitle %></strong></td>
      </tr>
      <tr>
        <td><%=bName %></td>
        <td>조회수</td>
        <td><%=count %></td>
      </tr>
      <tr>
        <td colspan="3" class="article"><%=bContent %></td>
      </tr>
      <tr>
        <td colspan="3"><strong>다음글</strong> <span class="separator">|</span> [키즈잼] 2월 프로그램 안내</td>
      </tr>
      <tr>
        <td colspan="3"><strong>이전글</strong> <span class="separator">|</span> [키즈잼] 2020년 1분기 정기 휴관일 안내</td>
      </tr>
    </table>
    

    <a href=""><div class="list">목록</div></a>
    <a href=""><div class="list">삭제</div></a>
    <a href="./modify_view.jsp?bName=<%=bName%>&bTitle=<%=bTitle%>&bContent=<%=bContent%>" ><div class="list">수정</div></a>
    <a href=""><div class="list">답변달기</div></a>
  </section>
</body>
</html>