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
	<div class="row">
	<h1 class="text-primary">로그인 창</h1>
	</div>
	<form action="/MyFirstWeb/login.do" method="post" >
		<div class="row">
			<div class="col-md-2">
				<h4 class="text-success">아이디</h4>
			</div>
			<div class="col-md-4">
		<input type="text" name="uId" placeholder="Id" class="form-control"><br/>
		</div>
		</div><!--  div id row -->
			<div class="row">
			<div class="col-md-2">
				<h4 class="text-info">비밀번호</h4>
			</div>
			<div class="col-md-4">
		<input type="password" name="uPw" placeholder="PW" class="form-control"><br/>
		</div>
		</div><!--  div pw row -->
		<div class="row">
		<div class="col-md-2">
			<input type="submit" value="로그인" class="btn btn-primary">
		</div>
		</div>
		</form>
		<a href="/MyFirstWeb/users/users_join_form.jsp" class="btn btn-info"><input type="button" value="회원가입"></a><br/>
</body>
</html>