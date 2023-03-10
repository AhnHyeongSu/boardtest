<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>게시판 목록</title>
</head>

<body>
<h1>게시판</h1>

<table>
	<tr>
		<th>번호</th>
		<th>제목</th>
		<th>작성자</th>
		<th>작성일</th>
	</tr>
	<c:forEach var="bl" items="${boardList}">
		<tr>
			<td>${bl.board_num}</td>
			<td>${bl.board_title}</td>
			<td>${bl.member_name}</td>
			<td>${bl.board_date}</td>
		</tr>
	</c:forEach>  
</table>
</body>
</html>