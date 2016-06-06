<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<%
	String path = request.getContextPath();
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html lang="en">
<head>
<title>智能果云平台</title>
<meta charset="UTF-8" />
<meta name="viewport" content="width=device-width, initial-scale=1.0" />
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<link rel="stylesheet" href="<%=path%>/css/bootstrap.min.css" />
<link rel="stylesheet" href="<%=path%>/css/bootstrap-responsive.min.css" />
<link rel="stylesheet" href="<%=path%>/css/unicorn.login.css" />

<script src="<%=path%>/js/jquery.min.js"></script>
<script src="<%=path%>/js/unicorn.login.js"></script>
</head>
<body>
	<div id="logo">
		<img src="<%=path%>/img/logo1.png" alt="" />
	</div>
	<div id="loginbox">
		<form id="loginform" class="form-vertical" action="<%=path%>/account/index" />
		<p>Enter username and password to continue.</p>
		<div class="control-group">
			<div class="controls">
				<div class="input-prepend">
					<span class="add-on"><i class="icon-user"></i></span><input type="text" placeholder="Username" />
				</div>
			</div>
		</div>
		<div class="control-group">
			<div class="controls">
				<div class="input-prepend">
					<span class="add-on"><i class="icon-lock"></i></span><input type="password" placeholder="Password" />
				</div>
			</div>
		</div>
		<div class="form-actions">
			<span class="pull-left"><a href="#" class="flip-link" id="to-recover">Lost password?</a></span> <span class="pull-right"><input type="submit" class="btn btn-inverse" value="Login" /></span>
		</div>
		</form>
		<form id="recoverform" action="#" class="form-vertical" />
		<p>Enter your e-mail address below and we will send you instructions how to recover a password.</p>
		<div class="control-group">
			<div class="controls">
				<div class="input-prepend">
					<span class="add-on"><i class="icon-envelope"></i></span><input type="text" placeholder="E-mail address" />
				</div>
			</div>
		</div>
		<div class="form-actions">
			<span class="pull-left"><a href="#" class="flip-link" id="to-login">&lt; Back to login</a></span> <span class="pull-right"><input type="submit" class="btn btn-inverse" value="Recover" /></span>
		</div>
		</form>
	</div>


</body>
</html>
