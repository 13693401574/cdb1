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

    <title>企业用户管理页面</title>
    <base href="<%=basePath%>">
    <link rel="stylesheet" type="text/css" href="<%=basePath%>static/easyUI/themes/default/easyui.css">
    <link rel="stylesheet" type="text/css" href="<%=basePath%>static/easyUI/themes/icon.css">
    <link rel="stylesheet" type="text/css" href="<%=basePath%>static/easyUI/demo/demo.css">
    <style type="text/css">
        .ul {
            width: 80px;
            list-style: none;
            float: left;
        }
        .ul li{
            height: 30px;
            margin-top: 30px;
            text-align: right;
            line-height: 30px;
        }

        .ul1 {
            margin-left: -30px;
            width: 200px;
            list-style: none;
            float: left;
        }
        .ul1 li{
            height: 30px;
            margin-top: 30px;
            line-height: 30px;
        }
        .btn {
            width: 80px;
            height: 30px;
        }
        .td {
            width: 300px;
        }
    </style>
    
    <script type="text/javascript" src="<%=basePath%>static/js/jquery-3.1.0.min.js"></script>
    <script type="text/javascript" src="<%=basePath%>static/easyUI/jquery.easyui.min.js"></script>
    <script type="text/javascript" src="<%=basePath%>static/js/jquery.json-2.4.js"></script>
    <script type="text/javascript" src="<%=basePath%>static/js/CDBItems/addCompanyUser.js"></script>

</head>
<body>

<div class="easyui-layout" style="width:100%;height:560px;">
    <div data-options="region:'north',title:'企业管理'" style="height:0px"></div>
    <div data-options="region:'center',title:''"style="width:100%;height: 550px">
        <div class="easyui-layout" style="width:100%;height: 460px">
            <div data-options="region:'north',title:'搜索'" style="height:100px">
                <div style="margin-top: 10px;margin-left: 10px;">
                    <form>
                    <table>
                        <tr>
                            <td class="td">
                                企业名称:
                                <input class="easyui-textbox" style="width:150px;height:25px" name="companyName" id="companyName1">
                            </td>
                            <td class="td">
                                楼层位置:
                                <input class="easyui-textbox" style="width:150px;height:25px " name="floor" id="floor1">
                            </td>
                            <td class="td">
                                联系人：<input class="easyui-textbox" style="width:150px;height:25px" name="linkMan" id="linkMan1">
                            </td>
                            <td class="td">
                                联系电话：<input class="easyui-textbox" style="width:150px;height:25px" name="linkPhone" id="linkPhone1">
                            </td>
                            <td>
                                <a id="find" href="javascript:void(0)" class="easyui-linkbutton" style="width: 80px;height: 30px;margin-left: 30px" data-options="iconCls:'icon-search'">搜索</a>
                            </td>
                        </tr>
                    </table>
                    </form>

                </div>
            </div>
            <div data-options="region:'center',title:'企业信息'">
                <table id="table" class="easyui-datagrid" style="width:700px"
              	 data-options="fitColumns:true,singleSelect:true">  
                    <thead>  
				        <tr> 
				        	<th data-options="field:'id', hidden:true,width:100">id</th>
				            <th data-options="field:'companyName',width:100">企业名称</th>  
				            <th data-options="field:'floor',width:100">企业楼层</th>  
				            <th data-options="field:'linkMan',width:100">联系人</th>  
				            <th data-options="field:'linkPhone',width:100">联系电话</th>  
				        </tr>  
				    </thead>  
                </table>
                
                
                <div style="margin-top: 32px;">
                            <span style="margin-left: 30px;">
                            共有<span id="tol" style="color:red"></span>记录，
                            每页<select id="select" name="pageSize">
                 <option value="2">2</option>             
                 <option value="5">5</option>           
                 <option value="10">10</option>           
                 <option value="15">15</option>           
                 <option value="20">20</option>           
                            
           </select>条，
                            当前第<label id="page" style="color:red">1</label>
                            页---共<label id="totalPage" style="color:red">XX</label>页
                            </span>
                            <span style="margin-left: 380px;margin-right: 30px;">
                            <a id="btn2" href="javascript:void(0)" class="easyui-linkbutton" style="width: 50px;margin: 4px;">首页</a>
                            <a id="btn3" href="javascript:void(0)" class="easyui-linkbutton" style="width: 50px;margin: 4px;">上页</a>
                            <a id="btn4" href="javascript:void(0)" class="easyui-linkbutton" style="width: 50px;margin: 4px;">下页</a>
                            <a id="btn5" href="javascript:void(0)" class="easyui-linkbutton" style="width: 50px;margin: 4px;">尾页</a>
                            </span>
                    <label>跳转到：</label><input id="tiao" class="easyui-validatebox" type="text" name="name" style="width:20px;" />
                    <a id="btn6" href="javascript:void(0)" class="easyui-linkbutton" style="width: 50px">跳转到</a>
                </div>
                <div style="padding:5px 0;margin-left: 60%"><!-- onclick="$('#w').window('open')" -->
                    <a id="chakan" href="javascript:void(0)" class="easyui-linkbutton" style="width: 80px;height: 30px;margin-left: 30px;margin-top: 20px" data-options="iconCls:'icon-search'" >查看</a>
                    <a href="javascript:void(0)" class="easyui-linkbutton" style="width: 80px;height: 30px;margin-left: 30px;margin-top: 20px" data-options="iconCls:'icon-add'" onclick="$('#m').window('open')">添加 </a>
                    <a id="delete" href="javascript:void(0)" class="easyui-linkbutton" style="width: 80px;height: 30px;margin-left: 30px;margin-top: 20px" data-options="iconCls:'icon-remove'">删除</a>

                </div>

            </div>
        </div>
        <div id="w" class="easyui-window" title="查看企业信息" data-options="modal:true,closed:true" style="width:400px;height:auto;">
            <div class="easyui-panel">
                <div style="width: 380px">
                    <ul class="ul">
                        <li>企业登录名:</li>
                        <li>企业登录密码:</li>
                        <li>姓名:</li>
                        <li>企业楼层位置:</li>
                        <li>企业联系人:</li>
                        <li>企业联系电话:</li>
                    </ul>
                    <ul class="ul1">
                        <li>${com.loginName}</li>
                        <li>${com.pwd}</li>
                        <li>${com.companyName}</li>
                        <li>${com.floor}</li>
                        <li>${com.linkMan}</li>
                        <li>${com.linkPhone}</li>
                    </ul>
                </div>
                <div style="text-align:center;padding:5px;margin-top: 400px">
                    <a href="javascript:void(0)" class="easyui-linkbutton btn" onclick="$('#w').window('close')">返回</a>

                </div>

            </div>
        </div>
        <div id="m" class="easyui-window" title="添加用户" data-options="modal:true,closed:true" style="width:400px;height:auto;">
            <div class="easyui-panel">
                <div style="width: 380px">
                    <ul class="ul">
                        <li>企业登录名:</li>
                        <li>企业登录密码:</li>
                        <li>姓名:</li>
                        <li>企业楼层位置:</li>
                        <li>企业联系人:</li>
                        <li>企业联系电话:</li>
                    </ul>
                    <ul class="ul1">
                        <li>
                            <input class="easyui-textbox" type="text" name="logName"  id="logName"/>
                        </li>
                        <li>
                            <input class="easyui-textbox" type="text" name="pwd" id="pwd"/>
                        </li>
                        <li>
                            <input class="easyui-textbox" type="text" name="CompanyName"  id="CompanyName"/>
                        </li>
                        <li>
                            <input class="easyui-textbox" type="text" name="floor" id="floor"/>
                        </li>
                        <li>
                            <input class="easyui-textbox" type="text" name="linkMan" id="linkMan"/>
                        </li>
                        <li>
                            <input class="easyui-textbox" type="text" name="linkPhone" id="linkPhone"/>
                        </li>
                    </ul>
                </div>
                <div style="text-align:center;padding:5px;margin-top: 400px">
                    <a id="enter" href="javascript:void(0)" class="easyui-linkbutton btn" onclick="$('#m').window('close')">确定</a>
                    <a id="back" href="javascript:void(0)" class="easyui-linkbutton btn" onclick="$('#m').window('close')">返回</a>
                </div>
            </div>
        </div>

    </div>


</div>

</body>
</html>
