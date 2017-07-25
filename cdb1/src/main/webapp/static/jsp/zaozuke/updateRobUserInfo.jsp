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
    <link rel="stylesheet" type="text/css" href="static/css/managementChangeSele.css">
    <script type="text/javascript" src="static/easyUI/jquery.min.js"></script>
    <script type="text/javascript" src="static/easyUI/jquery.easyui.min.js"></script>
	<script type="text/javascript" src="static/js/jquery.json-2.4.js"></script>
	<script type="text/javascript" src="static/easyUI/locale/easyui-lang-zh_CN.js"></script>
	<script type="text/javascript" src="static/js/robTenants/updateRobUserInfo.js"></script>
</head>
<body>

<div class="easyui-panel" style="width:100%" >
	<input type="hidden" id="id" value="${rob.id}"/>
    <div style="padding:10px 60px 20px 60px">
        <form id="ff" method="post">
            <table cellpadding="5" style="margin: auto">
                <tr class="tr">
                    <td class="td">用户名:</td>
                    <td><input id="userName" class="input easyui-textbox" value="${rob.userName }" type="text" disabled/></td>
                    <td class="td">旧密码:</td>
                    <td><input id="oldPassword" class="easyui-textbox input" type="password"/></td>
                </tr>
                <tr class="tr">
                    <td class="td">请输入新密码：</td>
                    <td><input id="newPwd" class="input easyui-textbox" type="password"/></td>
                    <td class="td">确认输入新密码:</td>
                    <td><input id="newPwd1" class="easyui-textbox input" type="password"/></td>
                </tr>
                <tr class="tr">
                    <td class="td">真实姓名:</td>
                    <td><input id="realName" class="easyui-textbox input" value=${rob.realName } type="text" disabled="disabled"/></td>
                    <td class="td">家庭地址:</td>
                    <td><input id="address" class="easyui-textbox input" value=${rob.address } type="text"/></td>
                </tr>
                <tr class="tr">
                    <td class="td">电话号码:</td>
                    <td><input id="phone" class="easyui-textbox input" value=${rob.phone } type="text"/></td>
                    <td class="td">身份证号码:</td>
                    <td><input id="idCard" class="easyui-textbox input" value=${rob.idCard } type="text" disabled/></td>
                </tr>
                <tr class="tr">

                    <td class="td">职业描述:</td>
                    <td><input id="jobDescribe" class="easyui-textbox input" value=${rob.jobDescribe } type="text"/></td>
                    <td class="td">邮箱地址:</td>
                    <td >
                        <input id="email" class="easyui-textbox input" value=${rob.email } type="text"/>
                    </td>
                </tr>
            </table>
             <div style="text-align:center;padding:5px">
            	<a id="btn1" href="javascript:void(0)" class="easyui-linkbutton btn">修改</a>
            	<a href="static/jsp/baozupo/LandladyMain.jsp" class="easyui-linkbutton btn">返回</a>
        	</div>
        </form>
       
    </div>
</div>

</body>
</html>