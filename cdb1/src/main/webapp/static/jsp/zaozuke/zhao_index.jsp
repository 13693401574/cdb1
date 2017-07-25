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
    <!--<link rel="stylesheet" href="../../static/css/zhao_index.css"/>-->
    <link rel="stylesheet" type="text/css" href="static/easyUI/themes/default/easyui.css">
    <link rel="stylesheet" type="text/css" href="static/easyUI/themes/icon.css">

    <script type="text/javascript" src="static/easyUI/jquery.min.js"></script>
    <script type="text/javascript" src="static/easyUI/jquery.easyui.min.js"></script>
    <script type="text/javascript" src="static//js/CDBItems/zhao_indexjs.js"></script>
    <script type="text/javascript" src="static/js/jquery.json-2.4.js"></script>
	<script type="text/javascript" src="static/easyUI/locale/easyui-lang-zh_CN.js"></script>
   	<script type="text/javascript" src="static/js/robTenants/zhao_index.js"></script>
   
    <script>


        
           
       
        function back(){
            $('#dlg').window('close');
        }

    </script>
</head>
<body>
<div style="width:100%;height: 100%;">
<input id="robId" type="hidden" value="1">
<div class="time">
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
				<th field="carIssueId" data-options="hidden: true" width="80">编号</th>
				<th field="carpotInfo" width="80">待租车位信息</th>
				<th field="startTime" width="100">租借开始时间</th>
				<th field="endTime" width="80">租借结束时间</th>
				<th field="landladyUserName" width="80" align="right">包租婆用户名</th>
				<th field="landladyJobDescribe" width="80" align="right">包租婆职业</th>
				<th field="landladyCredibility" width="80" align="right">包租婆信誉度</th>
				<th field="price" width="80" align="right">出售价格</th>

			</tr>
		</thead>
	</table>

        <br/>


        <br/>
        <div  style="text-align: center">
            <a id="yuding" href="javascript:void(0)" class="easyui-linkbutton">预定车位</a>
            <a href="static/jsp/zaozuke/chengjiaojilu.jsp" class="easyui-linkbutton">查看历史记录</a>
        </div>


        
    </div>



</div>

<div id="dlg" class="easyui-window" title="注册窗口" data-options="modal:true,closed:true" style="width:650px;height:380px;padding:10px;" >

        <div id="duohang">

            <form action="">
                <span>预定留言:</span>
                <textarea name="yuding" id="message" cols="30" rows="5"></textarea>

                <br/>
                <div style="text-align:center;width: 100%;margin-top: 40px">

                <a id="yu" href="javascript:void(0)" style="width: 100px;" class="easyui-linkbutton"  style="padding: 5px">提交并返回</a>
                    <a href="javascript:void(0)" onclick="back()"  style="width: 100px;" class="easyui-linkbutton"  style="padding: 5px">返回</a>
                 </div>
            </form>
        </div>


</div>

</body>
</html>