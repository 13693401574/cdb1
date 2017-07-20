<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head lang="en">
    <meta charset="UTF-8">
    <title></title>
    <link rel="stylesheet" type="text/css" href="../../easyUI/themes/default/easyui.css">
    <link rel="stylesheet" type="text/css" href="../../easyUI/themes/icon.css">
    <link rel="stylesheet" type="text/css" href="../../static/css/managementChangeSele.css">
    <script type="text/javascript" src="../../easyUI/jquery.min.js"></script>
    <script type="text/javascript" src="../../easyUI/jquery.easyui.min.js"></script>
</head>
<body>

<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Basic Form - jQuery EasyUI Demo</title>
    <link rel="stylesheet" type="text/css" href="../../themes/default/easyui.css">
    <link rel="stylesheet" type="text/css" href="../../themes/icon.css">
    <link rel="stylesheet" type="text/css" href="../../css/managementChangeSele.css">
    <script type="text/javascript" src="../../jquery.min.js"></script>
    <script type="text/javascript" src="../../jquery.easyui.min.js"></script>
</head>
<body>

<div class="easyui-panel" style="width:100%" >
    <div style="padding:10px 60px 20px 60px">
        <form id="ff" method="post">
            <table cellpadding="5" style="margin: auto">
                <tr class="tr">
                    <td class="td">工号:</td>
                    <td><input class="input easyui-textbox" type="text" disabled/></td>
                    <td class="td">密码:</td>
                    <td><input class="easyui-textbox input" type="text"/></td>
                </tr>
                <tr class="tr">
                    <td class="td">姓名:</td>
                    <td><input class="easyui-textbox input" type="text" disabled="disabled"/></td>
                    <td class="td">电话号码:</td>
                    <td><input class="easyui-textbox input" type="text"/></td>
                </tr>

                <tr class="tr">

                    <td class="td">身份证号码:</td>
                    <td><input class="easyui-textbox input" type="text" disabled/></td>
                    <td class="td">权限:</td>
                    <td >
                        <input type="checkbox" checked disabled/>用户管理权限
                        <input type="checkbox" disabled/>车位管理权限
                        <br/>
                        <input type="checkbox" disabled/>合同管理权限
                        <input type="checkbox" disabled/>投诉管理权限
                    </td>
                </tr>



            </table>
        </form>
        <div style="text-align:center;padding:5px">
            <a href="javascript:void(0)" class="easyui-linkbutton btn">修改</a>
            <a href="javascript:void(0)" class="easyui-linkbutton btn">返回</a>
        </div>
    </div>
</div>

</body>
</html>