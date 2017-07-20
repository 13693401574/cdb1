<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head lang="en">
    <meta charset="UTF-8">
    <title></title>
    <link rel="stylesheet" type="text/css" href="../../easyUI/themes/default/easyui.css">
    <link rel="stylesheet" type="text/css" href="../../easyUI/themes/icon.css">
    <link rel="stylesheet" type="text/css" href="../../easyUI/demo/demo.css">
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
    <script type="text/javascript" src="../../easyUI/jquery.min.js"></script>
    <script type="text/javascript" src="../../easyUI/jquery.easyui.min.js"></script>
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
                                <input class="easyui-textbox" style="width:150px;height:25px">
                            </td>
                            <td class="td">
                                楼层位置:
                                <input class="easyui-textbox" style="width:150px;height:25px">
                            </td>
                            <td class="td">
                                联系人：<input class="easyui-textbox" style="width:150px;height:25px">
                            </td>
                            <td class="td">
                                联系电话：<input class="easyui-textbox" style="width:150px;height:25px">
                            </td>
                            <td>
                                <a href="#" class="easyui-linkbutton" style="width: 80px;height: 30px;margin-left: 30px" data-options="iconCls:'icon-search'">搜索</a>
                            </td>
                        </tr>
                    </table>
                    </form>

                </div>
            </div>
            <div data-options="region:'center',title:'企业信息'">
                <table class="easyui-datagrid"
                       data-options="fitColumns:true" style="width: 100%">
                    <thead>
                    <tr>
                        <th data-options="field:'itemid',width:80">企业名称</th>
                        <th data-options="field:'productid',width:100">企业楼层</th>
                        <th data-options="field:'listprice',width:80,align:'right'">联系人</th>
                        <th data-options="field:'unitcost',width:80,align:'right'">联系电话</th>
                    </tr>

                    </thead>
                    <tr>
                        <td>
                            111111
                        </td>
                        <td>
                            111111
                        </td>
                            <td>
                            111111
                        </td>
                        <td>
                            111111
                        </td>
                    </tr>
                </table>
                <div style="margin-top: 32px;">
                            <span style="margin-left: 30px;">
                            共有XXX条记录，每页<input class="easyui-validatebox" type="text" name="name" style="width:20px;" />条，
                            当前<label>X</label>/<label>XX</label>页
                            </span>
                            <span style="margin-left: 380px;margin-right: 30px;">
                            <a id="btn2" href="#" class="easyui-linkbutton" style="width: 50px;margin: 4px;">首页</a>
                            <a id="btn3" href="#" class="easyui-linkbutton" style="width: 50px;margin: 4px;">上页</a>
                            <a id="btn4" href="#" class="easyui-linkbutton" style="width: 50px;margin: 4px;">下页</a>
                            <a id="btn5" href="#" class="easyui-linkbutton" style="width: 50px;margin: 4px;">尾页</a>
                            </span>
                    <label>跳转到：</label><input class="easyui-validatebox" type="text" name="name" style="width:20px;" />
                    <a id="btn6" href="#" class="easyui-linkbutton" style="width: 50px">跳转到</a>
                </div>
                <div style="padding:5px 0;margin-left: 60%">
                    <a href="#" class="easyui-linkbutton" style="width: 80px;height: 30px;margin-left: 30px;margin-top: 20px" data-options="iconCls:'icon-search'" onclick="$('#w').window('open')">查看</a>
                    <a href="#" class="easyui-linkbutton" style="width: 80px;height: 30px;margin-left: 30px;margin-top: 20px" data-options="iconCls:'icon-add'" onclick="$('#m').window('open')">添加 </a>
                    <a href="#" class="easyui-linkbutton" style="width: 80px;height: 30px;margin-left: 30px;margin-top: 20px" data-options="iconCls:'icon-remove'">删除</a>

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
                        <li>001</li>
                        <li>123456</li>
                        <li>张三</li>
                        <li>12345678901</li>
                        <li>12345678901</li>
                        <li>12345678901</li>
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
                            <input class="easyui-textbox" type="text"/>
                        </li>
                        <li>
                            <input class="easyui-textbox" type="text"/>
                        </li>
                        <li>
                            <input class="easyui-textbox" type="text"/>
                        </li>
                        <li>
                            <input class="easyui-textbox" type="text"/>
                        </li>
                        <li>
                            <input class="easyui-textbox" type="text"/>
                        </li>
                        <li>
                            <input class="easyui-textbox" type="text"/>
                        </li>
                    </ul>
                </div>
                <div style="text-align:center;padding:5px;margin-top: 400px">
                    <a href="javascript:void(0)" class="easyui-linkbutton btn" onclick="$('#e').window('close')">确定</a>
                    <a href="javascript:void(0)" class="easyui-linkbutton btn" onclick="$('#e').window('close')">返回</a>
                </div>
            </div>
        </div>

    </div>


</div>

</body>
</html>
