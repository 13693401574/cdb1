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
    <title>招租客主页面</title>
    <!--<link rel="stylesheet" href="../../css/zhao_index.css"/>-->
    <link rel="stylesheet" type="text/css" href="static/easyUI/themes/default/easyui.css">
    <link rel="stylesheet" type="text/css" href="static/easyUI/themes/icon.css">
	<link rel="stylesheet" type="text/css" href="static/easyUI/demo/demo.css">
    <script type="text/javascript" src="static/easyUI/jquery.min.js"></script>
    <script type="text/javascript" src="static/js/jquery.json-2.4.js"></script>
    <script type="text/javascript" src="static/easyUI/jquery.easyui.min.js"></script>
    <script type="text/javascript" src="static/easyUI/locale/easyui-lang-zh_CN.js"></script>
    
    <script type="text/javascript" src="static/js/CDBItems/zhao_indexjs.js"></script>
    <script >

	
        function  makeSure(){
            $.messager.confirm('确认','您确认进行此操作？',function(r){
                if (r){
                    /*alert('确认删除');让浏览器再自己弹一次*/
                    $('#dlg').window('close');
                }
            });
            /*   alert(22);异步*/
        }
        function back(){
            $('#dlg').window('close');
        }

    </script>
    <script type="text/javascript" src="static/js/landlady/landladyMain.js"></script>
</head>
<body>
<div style="width:100%;height: 100%;">
<div class="time" id="1">
    <form action="#">
        <span>起始日期：</span> <input id="startTime" class="easyui-datebox" data-options="sharedCalendar:'#cc'" value="">
       
        <span>结束日期：</span><input id="endTime" class="easyui-datebox" data-options="sharedCalendar:'#cc'" value="">
        <br/><br/>

        <a id="btn1" href="javascript:void(0)" class="easyui-linkbutton" style="width: 150px">查询</a>

		<div id="cc" class="easyui-calendar"></div>
    </form>
</div>
    <br/>
    <div class="table" >
    <table id="dg" title="你的车位信息" style="width:100%;height:360px" data-options="
				rownumbers:true,
		         singleSelect:true,
		         autoRowHeight:false,
		         fitColumns:true,
		         pagination:true,  
		         pageList:[4,6,8,10],
		         pageSize:4">
		<thead>
			<tr>
				<th field="carpotInfo" width="80">车位信息</th>
				<th field="startTime" width="100">租借开始时间</th>
				<th field="endTime" width="80">租借结束时间</th>
				<th field="price" width="80" align="right">出租价格</th>
				<th field="status" width="80" align="right">出租状态</th>

			</tr>
		</thead>
	</table>
        

      
  
   
        <div  style="margin-left:70%;margin-top:50px;">
            <a id="add" href="static/jsp/baozupo/addstall.jsp?id=<%= request.getParameter("id")%>" class="easyui-linkbutton" style="margin-left: 0px">申请添加车位</a>
            <a id="fabu" href="static/jsp/baozupo/releaseStall.jsp" class="easyui-linkbutton" style="margin-left: 5%" >发布车位信息</a>
            <a id="yuding" href="static/jsp/baozupo/reservationStall.jsp" class="easyui-linkbutton" style="margin-left: 5%">预定车位信息</a>
            <a href="static/jsp/baozupo/landladyhistory.jsp" class="easyui-linkbutton" style="margin-left: 5%">历史成交记录</a>
        </div>

        
    </div>



</div>

</body>

    

</html>