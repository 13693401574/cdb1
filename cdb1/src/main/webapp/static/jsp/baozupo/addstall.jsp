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

    <script type="text/javascript" src="static/easyUI/jquery.min.js"></script>
    <script type="text/javascript" src="static/easyUI/jquery.easyui.min.js"></script>


</head>
<body>
<div align="center">
    <h3>添加车位信息</h3>
</div>
<div align="center" style="margin-top: 60px">
    <div style="margin-top: 50px">
        <label >车位产权证编号</label>
        <input type="text" style="margin-left: 30px"/>
    </div>
    <div style="margin-top: 50px">
        <label>车位所在小区</label>
        <input type="text" style="margin-left: 30px"/>
    </div>
    <div style="margin-top: 50px">
        <label>小区车位编号</label>
        <input type="text" style="margin-left: 30px"/>
    </div>
    <div style="margin-top: 50px">
        <label>车位产权复印件</label>
        <input type="button" value="选择文件" style="margin-left: 30px"/>
    </div>

    <br/><br/><br/><br/><br/><br/><br/>

    <a id="btn1" href="LandladyMain.jsp" target="show" class="easyui-linkbutton" style="width: 150px">确认</a>
    &nbsp;&nbsp;&nbsp;&nbsp;
    <a id="btn2" href="LandladyMain.jsp" target="show" class="easyui-linkbutton" style="width: 150px">取消</a>
</div>

</body>
</html>