<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
 <%@ include file="commons.jsp" %>  
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<base href="<%=basePath %>">
</head>
<body>

	<button id="insert">新增</button>
	<button id="update">修改</button>
	<button id="delete">删除</button>
	<button id="query">查询</button>

<form method="post" id="userForm" onsubmit="return changeurl()">
	<!-- _method里面写put或者是delete -->
	<input type="hidden" value="put" name="_method"/><br/>
	<input type="hidden" value="4" name="id" id="userId"/><br/>
	用户名：<input type="text" name="userName"/><br/>
	登录名：<input type="text" name="loginName"/><br/>
	密码：<input type="text" name="password"/>
	<br/>
	<input type="submit" value="提交"/>
</form>

</body>
	
<script type="text/javascript" src="<%=basePath %>static/js/jquery-3.2.1.min.js?version=20170629"></script>
<script type="text/javascript" src="<%=basePath %>static/js/jquery.json-2.4.js?version=20170629" charset="utf-8"></script>
<script type="text/javascript" src="<%=basePath %>static/js/userlist.js?version=20170629" charset="utf-8"></script>
<script type="text/javascript">

	function changeurl(){
		var id = $('#userId').val();
		var url = "persons/"+id;
		$('#userForm').prop("action",url);
		return true;
	}

</script>
</html>