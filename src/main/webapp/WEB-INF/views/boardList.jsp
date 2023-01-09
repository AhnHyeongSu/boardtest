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
	<table border="1" style="width: 800px; height: 500px;">
		<tr>
			<th>글번호</th>
			<th>작성자</th>
			<th>제목</th>
			<th>작성시간</th>
		</tr>
		<c:forEach items="${list}" var="data">
		<tr>
			<td>${data.board_num}</td>
			<td>${data.member_name}</td>
			<td><a href="/boardRead?board_num=${data.board_num}">${data.board_title}</a></td>
			<td><fmt:formatDate pattern="yyyy-MM-dd HH:mm" value="${data.board_date}"/></td>
		</tr>
		</c:forEach>
	</table>
	<ul class="paging">
		<c:if test="${paging.prev}">
			<span><a href='<c:url value="/boardList.do?page=${paging.startPage-1}"/>'>이전</a></span>
		</c:if>
		<c:forEach begin="${paging.startPage}" end="${paging.endPage}" var="num">
			<span><a href='<c:url value="/boardList.do?page=${num}"/>'>${num}</a></span>
		</c:forEach>
		<c:if test="${paging.next && paging.endPage>0}">
			<span><a href='<c:url value="/boardList.do?page=${paging.endPage+1}"/>'>다음</a></span>
		</c:if>
	</ul>
</body>
</html>