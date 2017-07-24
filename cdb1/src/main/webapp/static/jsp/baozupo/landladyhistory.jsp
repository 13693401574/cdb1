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
    <title>成交记录</title>

    
    <link rel="stylesheet" type="text/css" href="static/easyUI/themes/default/easyui.css">
    <link rel="stylesheet" type="text/css" href="static/easyUI/themes/icon.css">
	<link rel="stylesheet" type="text/css" href="static/easyUI/demo/demo.css">
	
	<!-- <link rel="stylesheet" href="static/css/chengjiaojilu.css"/> -->
    <script type="text/javascript" src="static/easyUI/jquery.min.js"></script>
    <script type="text/javascript" src="static/easyUI/jquery.easyui.min.js"></script>
    <script type="text/javascript" src="static/js/jquery.json-2.4.js"></script>
	<script type="text/javascript" src="static/easyUI/locale/easyui-lang-zh_CN.js"></script>
    <script type="text/javascript" src="static/js/landlady/landladyhistory.js"></script>
    <script>


       

    </script>

</head>
<body>

<div style="width:100%;height: 100%;">
	<div class="time" id="1">
		<input type="hidden" id="id" value="1"/>
		<span>状态：</span> 
		<select id="status">
			<option value="已投诉">已投诉</option>
			<option value="未投诉">未投诉</option>
		</select>
		 <a id="btn1" href="javascript:void(0)" class="easyui-linkbutton" style="width: 150px">查询</a>
	</div>
	    <br/>
	    <div class="table" >
	    <table id="dg" title="历史记录" style="width:100%;height:360px" data-options="
					rownumbers:true,
			         singleSelect:true,
			         autoRowHeight:false,
			         fitColumns:true,
			         pagination:true,  
			         pageList:[4,6,8,10],
			         pageSize:4">
			<thead>
				<tr>
					<th field="id" width="50" data-options="hidden: true">编号</th>
					<th field="carpotInfo" width="80">车位信息</th>
					<th field="startTime" width="100">租借开始时间</th>
					<th field="endTime" width="80">租借结束时间</th>
					<th field="robName" width="80" align="right">抢租客用户名</th>
					<th field="status" width="80" align="right">状态</th>
				</tr>
			</thead>
		</table>
	        
	
	      
	  
	   
	        <div  style="margin-left:70%;margin-top:50px;">
	            <a id="yuding" href="javascript:void(0)" class="easyui-linkbutton">投诉</a>
	        	<a href="static/jsp/baozupo/LandladyMain.jsp" class="easyui-linkbutton">返回</a>
	        </div>
	
	        
	    </div>
	
	
	
	</div>


<div id="dlg" class="easyui-window" title="投诉窗口" data-options="modal:true,closed:true" style="width:650px;height:380px;padding:10px;" >

    <div id="duohang">

        <form action="">
            <span>投诉理由:</span>
            <textarea name="yuding" id="yu" cols="30" rows="10"></textarea>

            <br/>
            <div style="text-align:center;width: 100%;margin-top: 40px">
                <a id="submit" href="javascript:void(0)" style="width: 100px;" class="easyui-linkbutton"  style="padding: 5px">提交投诉</a>
                <a href="javascript:void(0)" onclick="back()"  style="width: 100px;" class="easyui-linkbutton"  style="padding: 5px">返回</a>
            </div>
        </form>
    </div>


</div>

</body>
</html>