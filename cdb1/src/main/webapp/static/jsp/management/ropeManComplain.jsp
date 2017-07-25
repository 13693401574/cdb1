<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
  <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>    
<!-- 启用EL表达式 -->  
<%@ page isELIgnored="false"%> 
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>

<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<% String path=request.getContextPath(); //得到项目名称
	String basePath=request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%> 
    <title>投诉管理</title>
    <base href="<%=basePath%>">
    <link rel="stylesheet" type="text/css" href="<%=basePath%>static/easyUI/themes/default/easyui.css">
    <link rel="stylesheet" type="text/css" href="<%=basePath%>static/easyUI/themes/icon.css">
    <link rel="stylesheet" type="text/css" href="<%=basePath%>static/easyUI/demo/demo.css">
    
    <script type="text/javascript" src="<%=basePath%>static/easyUI/jquery.min.js"></script>
    <script type="text/javascript" src="<%=basePath%>static/easyUI/jquery.easyui.min.js"></script>
	<script type="text/javascript" src="<%=basePath%>static/easyUI/locale/easyui-lang-zh_CN.js"></script>
	
	<script type="text/javascript" src="<%=basePath%>static/js/jquery.json-2.4.js"></script>
	<script type="text/javascript" src="<%=basePath%>static/js/CDBItems/ropeManComplainJS.js"></script>
    
    <style type="text/css">
    	#w{
    		width:600;   
    		height:400;  


    	}
    </style>
    
    <script>

      function  makeSure(){
          $.messager.confirm('确认','您确认进行此操作？',function(r){
              if (r){
                  /*alert('确认删除');让浏览器再自己弹一次*/
                  $('#w').window('close');
              }
          });
       /*   alert(22);异步*/
      }

    </script>
</head>
<body>
<div style="width:100%">
    <div id="p" class="easyui-panel" title="抢租客投诉受理" style="width:960px;">
        <table id="table" class="easyui-datagrid"  style="width:960px;height:400px"
               data-options="singleSelect:true,           
	           pagination:true,
	           pageSize:2,
	           pageList: [2,4,5,10]

               ">
            <thead >
            <tr>
                <th data-options="field:'id',width:150,hidden:true,align:'center'">id</th>
                <th data-options="field:'complainant',width:150,align:'center'">投诉方</th>
                <th data-options="field:'beComplaint',width:150,align:'center'">被投诉方</th>
                <th data-options="field:'complainantDate',width:300,align:'center'">投诉时间</th>
             	<th data-options="field:'a',formatter:caozuo, width:140,align:'center'">操作</th>

            </tr>
            </thead>
            <tbody>
            <tr>
            	<td>id</td>
                <td>酒店水电费</td>
                <td>的看法和这款手机的</td>
                <td>而通过的官方</td>
                <td><a href="javascript:void(0)" class="easyui-linkbutton" onclick="$('#w').window('open')">受理</a></td>
            </tr>


            </tbody>
        </table>

  
    </div>

</div>
<div id="w" class="easyui-window" title="投诉详情" data-options="modal:true,closed:true,iconCls:'icon-save'" style="width:1000px;height: 400px;">
    <br/>
   <label style="font-weight: bolder;font-size: 15px">事件记录</label>
    <br/>
    <table id="shijian" class="easyui-datagrid"  style="width:960px;height:300px"
           data-options="singleSelect:true,
           pagination:true,
           pageSize:2,
	       pageList: [2,4,5,10]
           ">
        <thead>
        <tr>
            <th data-options="field:'carportAddress',width:200,align:'center'">车位小区地址</th>
            <th data-options="field:'carportEquityCode',width:150,align:'center'">车位编号</th>
            <th data-options="field:'startTime',width:150,align:'center'">租赁开始时间</th>
            <th data-options="field:'endTime',width:150,align:'center'">租赁结束时间</th>
        </tr>
        </thead>
        <tbody>
<%--         <tr>
            <td>${rob.carportAddress}</td>
            <td>${rob.carportEquityCode}</td>
            <td>${rob.startTime}</td>
            <td>${rob.endTime}</td>
        </tr> --%>


        </tbody>
    </table>
    <br/>
    <label style="font-weight: bolder;font-size: 15px">投诉方</label>
    <br/>
    <table id="tousufang" class="easyui-datagrid"  style="width:960px;"
           data-options="singleSelect:true,collapsible:true,">
        <thead>
        <tr>
            <th data-options="field:'userName',width:150,align:'center'">用户名</th>
            <th data-options="field:'realName',width:150,align:'center'">真实姓名</th>
            <th data-options="field:'idCard',width:150,align:'center'">身份证号码</th>
            <th data-options="field:'jobDescribe',width:150,align:'center'">职业</th>
            <th data-options="field:'phnoe',width:100,align:'center'">电话</th>

        </tr>
        </thead>
        <tbody>
    <!--     <tr>
            <td>酒店水电费</td>
            <td>的看法和这款手机的</td>
            <td>而通过的官方</td>
            <td>啥的</td>
            <td>啥的</td>
        </tr> -->


        </tbody>
    </table>
    <br/>
    <label style="font-weight: bolder;font-size: 15px">被投诉方</label>
    <br/>
    <table id="bei"  class="easyui-datagrid"  style="width:960px;"
           data-options="singleSelect:true,collapsible:true,method:'get'">
        <thead>
        <tr>
            <th data-options="field:'userName',width:150,align:'center'">用户名</th>
            <th data-options="field:'realName',width:150,align:'center'">真实姓名</th>
            <th data-options="field:'idCard',width:150,align:'center'">身份证号码</th>
            <th data-options="field:'jobDescribe',width:150,align:'center'">职业</th>
            <th data-options="field:'phone',width:100,align:'center'">电话</th>

        </tr>
        </thead>
        <tbody>
  <!--       <tr>
            <td>酒店水电费</td>
            <td>的看法和这款手机的</td>
            <td>而通过的官方</td>
            <td>啥的</td>
            <td>啥的</td>
        </tr> -->


        </tbody>
    </table>


    <div style="text-align:center;width: 100%;margin-top: 40px">
        <a id="pass" href="javascript:void(0)" onclick="makeSure()"  style="width: 100px;" class="easyui-linkbutton"  style="padding: 5px">投诉生效</a>
        <a id="nopass" href="javascript:void(0)" onclick="makeSure()"  style="width: 100px;" class="easyui-linkbutton"  style="padding: 5px">投诉无效</a>
        <a id="wait" href="javascript:void(0)" onclick="makeSure()"  style="width: 100px;" class="easyui-linkbutton"  style="padding: 5px">暂缓处理</a>
    </div>

</div>




</body>
</html>


<!-- <script type="text/javascript">
 
		function caozuo(val, row) {
		    return "<a href='javascript:void(0)' class='easyui-linkbutton' onclick='sholi()' >受理</a>";
		}

</script> -->