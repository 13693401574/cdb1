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
    <title>包租婆管理页面</title>
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
            margin-top: 15px;
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
            margin-top: 15px;
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
    <script type="text/javascript" src="<%=basePath%>static/easyUI/jquery.min.js"></script>
    <script type="text/javascript" src="<%=basePath%>static/easyUI/jquery.easyui.min.js"></script>
    <script type="text/javascript" src="<%=basePath%>static/easyUI/locale/easyui-lang-zh_CN.js"></script>
      <script type="text/javascript" src="<%=basePath%>static/js/jquery.json-2.4.js"></script>
    <script type="text/javascript" src="<%=basePath%>static/js/CDBItems/CarportApplication.js"></script>
</head>
<body>

<div class="easyui-layout" style="width:100%;height:560px;">
    <div data-options="region:'north',title:'包租婆车位管理'" style="height:0px " ></div>
    <div data-options="region:'center',title:''"style="width:100%;height: 550px">
        <div class="easyui-layout" style="width:100%;height: 460px">
            <div data-options="region:'north',title:'搜索'" style="height:100px">
                <div style="margin-top: 10px;margin-left: 10px;">
                    <form>
                        <table>
                            <tr>
                                <td class="td">
                                    真实姓名:
                                    <input class="easyui-textbox" style="width:150px;height:25px" name="realName" id="realName">
                                    
                                </td>
                                <td class="td">
                                    车位编号:
                                    <input class="easyui-textbox" style="width:150px;height:25px" name="carportEquityCode" id="carCode">
                                </td>
                                <td class="td">
                                    身份证号码：<input class="easyui-textbox" style="width:150px;height:25px" name="idCard" id="idCard">
                                </td>
                                <td class="td">
                                    联系电话：<input class="easyui-textbox" style="width:150px;height:25px" name="phone" id="phone">
                                </td>
                                <td>
                                   <a id="select" href="javascript:void(0)" class="easyui-linkbutton" style="width: 80px;height: 30px;margin-left: 30px" data-options="iconCls:'icon-search'">搜索</a>
                                </td>
                            </tr>
                        </table>
                  </form>
                </div>
            </div>
            <div data-options="region:'center',title:'包租婆车位信息'">
                <table id="table" class="easyui-datagrid"
                       data-options="fitColumns:true,
                      
                       autoRowHeight:true,
                       pagination:true,
                       singleSelect:true,
                       pageSize:2,
                       pageList: [2,4,6,10],
                       rownumbers: true 
                       " style="height:300px">
                    <thead>
                    <tr>
                        <th data-options="field:'id', hidden:true,width:80">id</th>
                        <th data-options="field:'userName',width:80">用户名</th>
                        <th data-options="field:'realName',width:80">真实姓名</th>
                        <th data-options="field:'idCard',width:80">身份证号码</th>
                        <th data-options="field:'phone',width:80">电话号码</th>
                        <th data-options="field:'carportEquityCode',width:80">车位编号</th>
                        <th data-options="field:'equityCopies',width:80,align:'center'">产权证编号</th>
                    </tr>

                    </thead>
    
                </table>
               
                <div style="padding:5px 0;margin-left: 60%">
                    <a id="selectcar" href="javascript:void(0)" class="easyui-linkbutton" style="width: 120px;height: 30px;margin-left: 30px;margin-top: 20px" data-options="iconCls:'icon-search'" >查看车位信息</a>

                </div>

            </div>
        </div>
        <div id="w" class="easyui-window" title="查看车位信息" data-options="modal:true,closed:true" style="width:400px;height:auto;">
            <div class="easyui-panel">
                <div style="width: 380px;text-align: center">
                    <ul class="ul">
                        <li>用户名:</li>
                        <li>真实姓名:</li>
                        <li>身份证号码:</li>
                        <li>电话号码:</li>
                        <li>家庭地址:</li>
                        <li>车位编号:</li>
                        <li>产权证编号:</li>
                        <li>状态:</li>
                      
                    </ul>
                    <ul class="ul1">
                        <li></li>
                        <li></li>
                        <li></li>
                        <li></li>
                        <li></li>
                        <li></li>
                        <li></li>
                        <li></li>
                    </ul>
                </div>

                <div style="text-align:center;padding:5px;margin-top: 350px">
                    <a  id="pass" href="javascript:void(0)" class="easyui-linkbutton btn" >审批通过</a>
                    <a  id="noPass" href="javascript:void(0)" class="easyui-linkbutton btn" >驳回</a>
                    <a   href="javascript:void(0)" class="easyui-linkbutton btn" onclick="$('#w').window('close')">返回</a>

                </div>

            </div>
        </div>
       </div>

</div>

</body>
</html>
