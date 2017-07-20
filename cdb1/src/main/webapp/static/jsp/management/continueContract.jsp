<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head lang="en">
    <meta charset="UTF-8">
    <title></title>
    <link rel="stylesheet" type="text/css" href="../../easyui/themes/default/easyui.css">
    <link rel="stylesheet" type="text/css" href="../../easyui/themes/icon.css">
    <script type="text/javascript" src="../../easyui/jquery.min.js"></script>
    <script type="text/javascript" src="../../easyui/jquery.easyui.min.js"></script>
    <script>

        function  makeSure() {
            $.messager.confirm('确认', '您确认进行此操作？', function (r) {
                if (r) {
                    $('#w').window('close');
                    $(window).attr('location','contract.html');
                }
            });
        }

    </script>
</head>
<body>
<div style="width: 100%;margin: auto">
    <div class="easyui-panel" title="续约外部合约" style="width:100%;" >
        <div style="padding:10px 60px 20px 60px">
            <form id="ff" method="post" >
                <table cellpadding="5" style="margin: auto;text-align: right">
                    <tr>
                        <td>原合同编号</td>
                        <td><input class="easyui-textbox" type="text" name="name" /></td>
                    </tr>
                    <tr>
                        <td>新续合同编号</td>
                        <td><input class="easyui-textbox" type="text" name="name" /></td>
                    </tr>
                    <tr>
                        <td>合同单位</td>
                        <td><input class="easyui-textbox" type="text" name="email" /></td>
                    </tr>
                    <tr>
                        <td>对方联系人</td>
                        <td><input class="easyui-textbox" type="text" name="subject"/></td>
                    </tr>
                    <tr>
                        <td>对方联系电话</td>
                        <td><input class="easyui-textbox" type="text" name="subject"/></td>
                    </tr>
                    <tr>
                        <td>合同生效日期</td>
                        <td><input class="easyui-textbox" name="message" /></td>
                    </tr>
                    <tr>
                        <td>合同截止日期</td>
                        <td><input class="easyui-textbox" name="message" /></td>
                    </tr>
                    <tr>
                        <td>上传合同复印件</td>
                        <td><input class="easyui-textbox" name="message" /></td>
                    </tr>
                </table>
            </form>
            <div style="text-align:center;padding:5px">
                <a href="javascript:void(0)" class="easyui-linkbutton" onclick="makeSure()">保存</a>
                <a href="contract.jsp" class="easyui-linkbutton" onclick="back()">返回</a>
            </div>
        </div>
    </div>
</div>
</body>
</html>