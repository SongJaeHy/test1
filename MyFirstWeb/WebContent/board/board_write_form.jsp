<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.0/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-KyZXEAg3QhqLMpG8r+8fhAXLRk2vvoC2f3B09zVXn8CA5QIVfZOJ3BCsw2P0p/We" crossorigin="anonymous">
</head>
<body>
	<h1>글쓰기 창</h1>
	<form action="/MyFirstWeb/boardwrite.do" method="post">
		<div class="row">
			<div class="col-md-2">
			<h4>제목</h4>
			</div>
		<div class="col-md-4">
			<input type="text" name="title" class="form-control"><br/>
		</div>
	</div>
	<div class="row">
		<div class="col-md-2">
		<h4>본문</h4>
		</div>
		<div class="col-md-3">
	<textarea class="form-control" cols="30" rows="10" name="content"></textarea><br/>
		</div>
	</div>
	<div class="row">
		<div class="col-md-2">
		<h4>글쓴이</h4>
		</div>
		<div class="col-md-4">
		<input type="text" name="writer" class="form-control"><br/>
		</div>
	</div>
	<div class="row">
		<div class="col-md-3">
			<div class="btn-group">	
				<input type="button" class="btn btn-primary" value="글쓰기">
				<input type="button"  class="btn btn-success" value="초기화">
				</div>
			</div>
		</div>
		</form>
</body>
</html>