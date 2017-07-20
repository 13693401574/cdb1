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
    <link rel="stylesheet" type="text/css" href="static/css/bootstrap.min.css">
    <link rel="stylesheet" type="text/css" href="static/easyUI/themes/default/easyui.css">
    <link rel="stylesheet" type="text/css" href="static/easyUI/themes/icon.css">
	
    <script type="text/javascript" src="static/easyUI/jquery.min.js"></script>
    <script type="text/javascript" src="static/js/jquery.json-2.4.js"></script>
    <script type="text/javascript" src="static/easyUI/jquery.easyui.min.js"></script>
    <script type="text/javascript" src="static/My97DatePicker/WdatePicker.js"></script>
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
<div class="time">
    <form action="#">
        <span>起始日期：</span><input class="easyui-datebox" data-options="sharedCalendar:'#cc'">
        <span>结束日期：</span><input class="easyui-datebox" data-options="sharedCalendar:'#cc'">
        <br/><br/>

        <a id="btn1" href="javascript:void(0)" class="easyui-linkbutton" style="width: 150px">查询</a>

		<div id="cc" class="easyui-calendar"></div>
    </form>
</div>
    <br/>
    <div class="table" >
        <table class="easyui-datagrid"style="height: 300px"
               data-options="singleSelect:true" id="show">
			<tbody>
            <thead>
	            <tr>
	            
	<!--                 <th data-options="field:'carpotInfo',width:130,align:'center' ">车位信息</th>
	                <th data-options="field:'startTime',width:130,align:'center' ">租借开始时间</th>
	                <th data-options="field:'endTime',width:130,align:'center' ">租借结束时间</th>
	                <th data-options="field:'price',width:130,align:'center' ">出租价格</th>
	                <th data-options="field:'status',width:130,align:'center' ">出租状态</th> -->
	            </tr>
            </thead>
            </tbody>
        </table>

        <br/>
        <div style="margin-top: 32px;">
             <span style="margin-left: 10px;">
                 共有<span id="tolRows"></span>条记录，每页<input id="rows" class="easyui-validatebox" type="text" name="name" style="width:20px;" />条，
                 当前<label id="page"></label>/<label id="tolpage"></label>页
             </span>
            <span style="margin-left: 80px;margin-right: 30px;">
                <a id="first" href="#" class="easyui-linkbutton" style="width: 50px;margin: 4px;">首页</a>
                <a id="up" href="#" class="easyui-linkbutton" style="width: 50px;margin: 4px;">上页</a>
                <a id="down" href="#" class="easyui-linkbutton" style="width: 50px;margin: 4px;">下页</a>
                <a id="last" href="#" class="easyui-linkbutton" style="width: 50px;margin: 4px;">尾页</a>
            </span>
            <label>跳转到:</label><input id="choose" class="easyui-validatebox" type="text" name="name" style="width:20px;" />
            <a id="goOn" href="javascript:void(0)" class="easyui-linkbutton" style="width: 70px">跳转到</a>
        </div>

        <br/>
        <div  style="text-align: center">
            <a id="add" href="static/jsp/baozupo/addstall.jsp" class="easyui-linkbutton">申请添加车位</a>
            <a id="fabu" href="static/jsp/baozupo/releaseStall.jsp" class="easyui-linkbutton">发布车位信息</a>
            <a id="yuding" href="static/jsp/baozupo/reservationStall.jsp" class="easyui-linkbutton">预定车位信息</a>
            <a href="static/jsp/baozupo/landladyhistory.jsp" class="easyui-linkbutton">历史成交记录</a>
        </div>

        
    </div>



</div>

</body>

</html>