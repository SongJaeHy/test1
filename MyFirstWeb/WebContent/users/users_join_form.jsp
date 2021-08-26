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
	<h1>회원가입 창입니다.</h1>
	<div class="container">
	<h1 class="text-primary">회원가입 창</h1>
	</div>
	<form action="/MyFirstWeb/join.do" method="post">
	<div class="row">
		<div class="col-md-5"></div>
	<div class="input-group">
		<div class="input-group-prepend">
			<span class="input-group-text">아이디&nbsp;&nbsp;&nbsp;&nbsp;</span>
		</div>
		<input type="text" name="uid" placeholder="ID" class="form-contorl"/><br/>
	</div>
	</div>
	<div class="row">
		<div class="col-md-5"></div>
	<div class="input-group">
		<div class="input-group-prepend">
			<span class="input-group-text">비밀번호&nbsp;&nbsp;</span>
		</div>
		<input type="password" name="upw"placeholder="PW" class="form-contorl"/><br/>
	</div>
	</div>
	<div class="row">
		<div class="col-md-5"></div>
	<div class="input-group">
		<div class="input-group-prepend">
			<span class="input-group-text">이름&nbsp;&nbsp;&nbsp;&nbsp;</span>
		</div>
		<input type="text" name="uname"placeholder="Name"/><br/>
	</div>
	</div>
	<div class="row">
		<div class="col-md-5"></div>
			<div class="input-group">
				<div class="input-group-prepend">
			<span class="input-group-text">이메일&nbsp;&nbsp;&nbsp;&nbsp;</span>
		</div>
		<input type="email" name="uemail"placeholder="EMAIL" class="form-contorl"/><br/>
		<div class="input-group-append">
			<span class="input-group-text">ex)ooo@ooo.com/net</span>
		</div>
	</div>
	</div>
	<div class="row">
		<div class="col-md-5">
		<input type="submit" value="가입" class="btn btn-info"/><br/>
		</div>
	</div>
	</form>

</body>
</html>	
