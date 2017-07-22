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
    <link rel="stylesheet" type="text/css" href="static/css/managementPanle.css">

    <link rel="stylesheet" type="text/css" href="static/easyUI/themes/default/easyui.css">
    <!-- <link rel="stylesheet" type="text/css" href="../../easyUI/themes/icon.css"> -->

    <link rel="stylesheet" type="text/css" href="static/easyUI/themes/default/easyui.css">
    <link rel="stylesheet" type="text/css" href="static/easyUI/themes/metro/icon.css">
	
    <script type="text/javascript" src="static/easyUI/jquery.min.js"></script>
    <script type="text/javascript" src="static/easyUI/jquery.easyui.min.js"></script>
   <script type="text/javascript" src="static/js/jquery.json-2.4.js"></script>
    <script type="text/javascript" src="static/js/landlady/landladyPanle.js"></script>
<!--     <script type="text/javascript" src="static/js/landlady/landladyMain.js"></script> -->
</head>
<body>
<div id="cc" class="easyui-layout" style="width:100%;height:840px;">
    <div data-options="region:'north',split:true" style="height:100px;">
        <div id="welcome">
            欢迎你<label id="1"></label>
        </div>
        <div class="welcome">
            <h1>CBD停车管理平台系统</h1>
        </div>
        <div id="cancel">
            <a id="btn" href="#" class="easyui-linkbutton">注销</a>
        </div>

    </div>
    <div data-options="region:'south',split:true" style="height:100px;"></div>
    <div data-options="region:'west',title:'导航栏',split:true" style="width:200px;">
        <div style="width:100%;height: 100%">
            <div class="easyui-accordion" style="height: 300px;border: none" >
                <div title="包租婆用户" style="padding:10px;">
                    <a id="btn1" href="static/jsp/baozupo/LandladyMain.jsp?id=1" target="show" class="easyui-linkbutton" style="width: 150px">招租车位信息</a>
                    <br/><br/><br/>
                    <a id="btn2" href="updateUserInfo.jsp" target="show" class="easyui-linkbutton" style="width: 150px">个人信息修改</a>
                </div>
            </div>

        </div>
    </div>
    <div data-options="region:'center',title:'详细操作'" style="background:#eee;">
        <iframe class="frame" style="width: 100%;height: 99%;border: none" name="show" ></iframe>

    </div>
</div>
</body>
<!--<script  type="text/javascript">
    $(function(){
        $("#btn1").click(function(){
            $(".frame").attr("src","landladyMain.html");

        });

    })
</script>-->
</html>
