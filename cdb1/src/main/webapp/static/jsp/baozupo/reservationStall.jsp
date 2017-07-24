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
	<script type="text/javascript" src="static/js/jquery.json-2.4.js"></script>
	<script type="text/javascript" src="static/easyUI/locale/easyui-lang-zh_CN.js"></script>
	<script type="text/javascript" src="static/js/landlady/reservation.js"></script>
</head>
<body>
<div>
	<input type="hidden" id="id" value="1"/>
    <div class="table" >
    	 <table id="dg" title="车位预约信息" style="width:100%;height:360px" data-options="
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
				<th field="fkCorportIssueId" width="50" data-options="hidden: true">编号</th>
				<th field="carpotInfo" width="80">车位信息</th>
				<th field="startTime" width="80">租借开始时间</th>
				<th field="endTime" width="80">租借结束时间</th>
				<th field="robUserName" width="80">抢租客用户名</th>
				<th field="robJobDescribe" width="80" align="right">抢租客职业</th>
				<th field="robPhone" width="80" align="right">抢租客电话</th>
                <th field="robCredibility" width="80" align="right">抢租客信誉度</th>
                <th field="robMessage" width="80" align="right">抢租客留言</th>
			</tr>
		</thead>
	</table>
        
       

       
     

        <br/>
        <div  style="text-align: center">
           <a id="btn1" href="javascript:void(0)" class="easyui-linkbutton" plain="true">同意出租</a>
        </div>


    </div>
</div>
</body>
</html>