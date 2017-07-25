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
	<script type="text/javascript" src="static/js/landlady/addstall.js"></script>
</head>
<body>
<div align="center" class="id" id="1">
	<input id="id" type="hidden" value="1">
    <h3>添加车位信息</h3>
</div>
<div align="center" style="margin-top: 60px">
	<form id="form" method="post"  enctype="multipart/form-data" onsubmit="return changeurl()">
	    <div style="margin-top: 50px">
	        <label>车位产权证编号</label>
	        <input id="carportEquityCode" name="carportEquityCode" type="text" style="margin-left: 30px"/>
	        <label id="isExist"></label>
	    </div>
	    <div style="margin-top: 50px">
	        <label>车位所在小区</label>
	        <input id="carportAddress" name="carportAddress" type="text" style="margin-left: 30px"/>
	    	<label id="carportAddress1"></label>
	    </div>
	    <div style="margin-top: 50px">
	        <label>小区车位编号</label>
	        <input id="carportAddressCode" name="carportAddressCode" type="text" style="margin-left: 30px"/>
	    	<label id="carportAddressCode1"></label>
	    </div>
	    <div style="margin-top: 50px">
	        <label>车位产权复印件</label>
	        <input id="file" type="file" name="fileName" onchange="changePhoto(this)" style="margin-left: 30px"/>
	   		<label id="file1"></label>
	    </div>
		<div style="margin-top:50px;outline: 1px,red,solid;" class="showPhoto" id="show">
			
		</div>
	    <br/><br/><br/><br/><br/><br/><br/>
	
	    <input id="btn1" type="button" target="show" class="easyui-linkbutton" value="确认" style="width: 150px;height:30px ">
	    &nbsp;&nbsp;&nbsp;&nbsp;
	    <a id="btn2" href="static/jsp/baozupo/LandladyMain.jsp" target="show" class="easyui-linkbutton" style="width: 150px;height:30px">取消</a>
	</form>
</div>

</body>
<script type="text/javascript">
	var equityCopies = $("#file");
	var showDiv = $("#show");
	function changePhoto(imgObj){
    	//alert(imgObj.value);
    	showDiv.html("");
    	var img = null;
    	if(document.all){
    		img = document.createElement(img);
    		img.src=imgObj.value;
    		//alert(img.src);
    	}else{
    		var fileList = imgObj.files;
    		//console.log(fileList);
    		var file = fileList[0];
    		img = new Image();
    		img.src=window.URL.createObjectURL(file);
    	}
    	showDiv.append(img);
    	img.style.width="80px";
    	img.style.height="100px";
    }  
</script>
</html>