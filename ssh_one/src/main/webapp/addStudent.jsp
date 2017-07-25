<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
    
<% String path=request.getContextPath();
	String basePath=request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
	%>    
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Insert title here</title>

<link rel="stylesheet" type="text/css" href="<%=basePath%>static/themes/default/easyui.css">
<link rel="stylesheet" type="text/css" href="<%=basePath%>static/themes/icon.css">
<script type="text/javascript" src="<%=basePath%>static/js/jquery-3.2.1.min.js" ></script>
<script type="text/javascript" src="<%=basePath%>static/js/jquery.json-2.4.js" ></script>
<script type="text/javascript" src="<%=basePath%>static/js/jquery.easyui.min.js"></script>
<script type="text/javascript" src="<%=basePath%>static/js/easyui-lang-zh_CN.js"></script>
<script type="text/javascript" src="<%=basePath%>static/js/addStudent.js" ></script>



</head>
<body>
	
	<form id="formId">
		学生姓名：<input type="text" name="studentName" id="studentName"/>
		<select id="cla" name="className">
			<option value="高三.一班">高三.一班</option>
			<option value="高三.二班">高三.二班</option>
			<option value="高三.三班">高三.三班</option>
			<option value="高三.四班">高三.四班</option>			
		</select>
		<button id="button" type="button">添加</button>
	</form>
	<button id="select">查询</button>
	<button id="stu">查询stu</button>
	
<!-- 	<table id="table" border="1">
		<tr>
			<td>学生编号</td>
			<td>学生姓名</td>
			<td>学生班级</td>
		</tr>	
	</table> -->
	<div>
	<table id="table"   style="width:500px;height:250px" data-options=
	        "
	         fitColumns:true, 
	         pagination:false,
	         singleSelect:true">
	    <tr>
	       <td>2</td>
	       <td>fd</td>
	       <td>df</td>
	    </tr>
	</table>
	<div id="page"  class="easyui-pagination" style="width:500px">

	</div>
	
	</div>

	
	




</body>
</html>