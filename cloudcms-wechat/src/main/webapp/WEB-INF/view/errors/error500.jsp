<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%
	response.setStatus(200);
	String path = request.getContextPath();
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>服务器错误</title>
<link href="<%=path%>/css/basic.css" rel="stylesheet" type="text/css" />
</head>
<body>
	<div class="clsboxshow" style="width: 500px; height: 300px; margin-top: 90px; margin-left: auto; margin-right: auto; border: solid 1px gray; padding: 10px; background-color: #EEEEE0;">
		<div style="width: 240px; height: 298px; text-align: center; font-size: 40px; line-height: 298px; float: left;">服务器错误</div>
		<div style="width: 240px; height: 298px; text-align: center; font-size: 20px; line-height: 298px; border-left: solid 1px gray; float: left;">
			<div>SORRY,请联系客服解决</div>
		</div>
	</div>
</body>
</html>