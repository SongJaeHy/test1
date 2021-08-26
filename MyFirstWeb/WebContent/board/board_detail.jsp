<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>글쓰기 창</h1>
		<table border ="1">
			<tr>
				<td>글 번호</td>
				<td>${board.bId}</td>
				<td>조회수</td>
				<td>${board.bHit}</td>
			</tr>
			<tr>
				<td>글 쓴 날짜</td>
				<td>${board.bDate}</td>
			</tr>
			<tr>
				<td>글 제목</td>
				<td>${board.bTitle}</td>
			</tr>
			<tr>
				<td>본문</td>
				<td><textarea cols="50" rows="10" name="content">${board.bContent}</textarea></td>
			</tr>
			<tr>
				<td>글쓴이</td>
				<td>${board.bName }</td>
			</tr>
			<tr>
				<td>
					<a href="/MyFirstWeb/boardselect.do">
						<input type="button" value="리스트로"></a>
					<form action="/MyFirstWeb/boarddelete.do" method="post">
						<input type="hidden" value="${board.bId }" name="bId"/>
						<input type="submit" value="삭제하기">
					</form>
					<form action="/MyFirstWeb/boardupdate.do" method="post">
						<input type="hidden" value="${board.bId }" name="bId"/>
						<input type="submit" value="수정하기">
					</form>
					
				</td>
			</tr>
		</table>
</body>
</html>