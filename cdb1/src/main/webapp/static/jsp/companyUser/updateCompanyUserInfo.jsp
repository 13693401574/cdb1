<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head lang="en">
    <meta charset="UTF-8">
    <title></title>
    <link rel="stylesheet" type="text/css" href="../../easyUI/themes/default/easyui.css">
    <link rel="stylesheet" type="text/css" href="../../easyUI/themes/icon.css">

    <link rel="stylesheet" type="text/css" href="../../easyUI/themes/default/easyui.css">
    <link rel="stylesheet" type="text/css" href="../../easyUI/themes/metro/icon.css">

    <script type="text/javascript" src="../../easyUI/jquery.min.js"></script>
    <script type="text/javascript" src="../../easyUI/jquery.easyui.min.js"></script>

</head>
<body>
<div id="cc" class="easyui-layout" style="width:100%;height:520px;margin: 0px auto">
<div data-options="region:'center',title:'修改企业信息'">
<div>
    <br/>
    <form id="ff2" method="post" style="margin-left: 30px;margin: 0px auto;">
        <table cellpadding="5" style="height: 300px;margin: 0px auto;">
            <tr>
                <td>企业登录名:</td>
                <td><input class="easyui-textbox" type="text" name="name" data-options="required:true"/></td>
                <td>企业联系电话:</td>
                <td><input class="easyui-textbox" type="text" name="phone" data-options="required:true,validType:'email'"/></td>

            </tr>
            <tr>
                <td>企业登录密码:</td>
                <td><input class="easyui-textbox" type="text" name="password" data-options="required:true,validType:'email'"/></td>
                <td>企业联系人:</td>
                <td><input class="easyui-textbox" type="text" name="linkman" data-options="required:true,validType:'email'"/></td>

            </tr>
            <tr>
                <td>企业名称:</td>
                <td><input class="easyui-textbox" type="text" name="complanName" data-options="required:true" disabled/></td>
                <td>企业楼层位置:</td>
                <td><input class="easyui-textbox" type="text" name="address" data-options="required:true,validType:'email'" disabled/></td>

            </tr>


        </table>
        <div style="text-align:center;padding:5px">
            <a href="javascript:void(0)" class="easyui-linkbutton" onclick="submitForm()" style="width: 60px;margin-right: 15px;">修改</a>
            <a href="javascript:void(0)" class="easyui-linkbutton" onclick="clearForm()" style="width: 60px;margin-right: 25px;">取消</a>
        </div>
    </form>
</div>


</div>
</div>
</body>
</html>