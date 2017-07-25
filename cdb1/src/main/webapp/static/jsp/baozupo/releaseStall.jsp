<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
      <%
	String path= request.getContextPath();//项目名称
	String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%> 
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head lang="en">
<base href="<%= basePath%>">
    <meta charset="UTF-8">
    <title></title>

     <link rel="stylesheet" type="text/css" href="static/easyUI/themes/default/easyui.css">
    <link rel="stylesheet" type="text/css" href="static/easyUI/themes/icon.css">
	<link rel="stylesheet" type="text/css" href="static/easyUI/demo/demo.css">
    
    <script type="text/javascript" src="static/easyUI/jquery.min.js"></script>
    <script type="text/javascript" src="static/easyUI/jquery.easyui.min.js"></script>
    <script type="text/javascript" src="static/js/jquery.json-2.4.js"></script>
    <script type="text/javascript" src="static/easyUI/locale/easyui-lang-zh_CN.js"></script>
 <script type="text/javascript" src="static/js/landlady/releaseStall.js"></script> 
</head>
<body>
<div align="center">
    <h3>发布车位信息</h3>
</div>
<div align="center" style="margin-top: 60px">
	<form id="form" method="post" enctype="multipart/form-data">
	
		<input type="hidden" id="id" value="1"/>
	    <div style="margin-top: 50px">
	        <label>所在小区</label>
	        <select id="address" style="margin-left: 30px;width:173px;height: 21px;">   
			    
			</select>  
	    </div>
	    <div style="margin-top: 50px">
	        <label>小区车位编号</label>
	         <select id="code" style="margin-left: 30px;width:173px;height: 21px;">   
			    
			</select>  
	    </div>
	    <div style="margin-top: 50px">
	        <label>租赁开始时间</label>
	     	<input id="startTime" name="startTime" class="easyui-datebox" style="margin-left: 30px;" data-options="sharedCalendar:'#cc'">
	    </div>
	    <div style="margin-top: 50px">
	        <label>租赁结束时间</label>
	        <input id="endTime" name="endTime" class="easyui-datebox" style="margin-left: 30px;" data-options="sharedCalendar:'#cc'" value="">
	    </div>
	    <div style="margin-top: 50px">
	        <label>出租价格</label>
	        <input id="price" name="price" type="text" style="margin-left: 30px"/>
	    </div>
	
	    <div style="margin-top: 50px">
	        <input id="btn1" type="button" target="show" class="easyui-linkbutton" style="width: 150px;height: 30px" value="确认"/>
	        &nbsp;&nbsp;&nbsp;
	        <a id="btn2" href="static/jsp/baozupo/LandladyMain.jsp" target="show" class="easyui-linkbutton" style="width: 150px">取消</a>
	    </div>
	    <div id="cc" class="easyui-calendar"></div>
    </form>
</div>
</body>
</html>

