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
    </style>
    <script type="text/javascript" src="../../easyUI/jquery.min.js"></script>
    <script type="text/javascript" src="../../easyUI/jquery.easyui.min.js"></script>
</head>
<body>

    <div class="easyui-layout" style="width:100%;height:560px;">
        <div data-options="region:'north',title:'用户权限'" style="height:0px"></div>
        <div data-options="region:'center',title:''"style="width:100%;height: 550px">
            <div class="easyui-layout" style="width:100%;height: 460px">
                <div data-options="region:'north',title:'搜索'" style="height:100px">
                    <div style="margin-top: 10px;margin-left: 10px;">
                        员工姓名：<input class="easyui-textbox" data-options="buttonText:'搜索',buttonIcon:'icon-search',prompt:'请输入员工姓名'" style="width:300px;height:30px;">
                        员工工号：<input class="easyui-textbox" data-options="buttonText:'搜索',buttonIcon:'icon-search',prompt:'请输入员工工号'" style="width:300px;height:30px;">
                    </div>
                </div>
                <div data-options="region:'center',title:'员工信息'">
                    <table class="easyui-datagrid"
                           data-options="fitColumns:true" style="width: 100%">
                        <thead>
                        <tr>
                            <th data-options="field:'itemid'" width="100">工号</th>
                            <th data-options="field:'productid'" width="100">姓名</th>
                            <th data-options="field:'listprice',align:'right'" width="100">电话</th>
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

                        <a href="#" class="easyui-linkbutton" style="width: 80px;height: 30px;margin-left: 30px;margin-top: 20px" data-options="iconCls:'icon-reload'" onclick="$('#r').window('open')">修改</a>
                    </div>

                </div>
            </div>
            <div id="w" class="easyui-window" title="查看用户" data-options="modal:true,closed:true" style="width:400px;height:auto;">
                <div class="easyui-panel">
                    <div style="width: 380px">
                        <ul class="ul">
                            <li>工号:</li>
                            <li>密码:</li>
                            <li>姓名:</li>
                            <li>电话号码:</li>
                            <li>操作权限:</li>
                        </ul>
                        <ul class="ul1">
                            <li>001</li>
                            <li>123456</li>
                            <li>张三</li>
                            <li>12345678901</li>
                            <li>
                                <input type="checkbox"/>用户管理权限
                                <input type="checkbox"/>车位管理权限
                                <br/>
                                <input type="checkbox"/>合同管理权限
                                <input type="checkbox"/>投诉管理权限
                            </li>
                        </ul>
                    </div>
                    <div style="text-align:center;padding:5px;margin-top: 350px">
                        <a href="javascript:void(0)" class="easyui-linkbutton btn" onclick="$('#w').window('close')">返回</a>

                    </div>

                </div>
            </div>
            <div id="m" class="easyui-window" title="添加用户" data-options="modal:true,closed:true" style="width:400px;height:auto;">
                <div class="easyui-panel">
                    <div style="width: 380px">
                        <ul class="ul">
                            <li>工号:</li>
                            <li>密码:</li>
                            <li>姓名:</li>
                            <li>电话号码:</li>
                            <li>操作权限:</li>
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
                                <input type="checkbox"/>用户管理权限
                                <input type="checkbox"/>车位管理权限
                                <br/>
                                <input type="checkbox"/>合同管理权限
                                <input type="checkbox"/>投诉管理权限
                            </li>
                        </ul>
                    </div>
                    <div style="text-align:center;padding:5px;margin-top: 350px">
                        <a href="javascript:void(0)" class="easyui-linkbutton btn" onclick="$('#e').window('close')">确定</a>
                        <a href="javascript:void(0)" class="easyui-linkbutton btn" onclick="$('#e').window('close')">返回</a>
                    </div>
                </div>
            </div>
            <div id="r" class="easyui-window" title="修改用户" data-options="modal:true,closed:true" style="width:400px;height:auto;">
                        <div class="easyui-panel">
                            <div style="width: 380px">
                                <ul class="ul">
                                    <li>工号:</li>
                                    <li>密码:</li>
                                    <li>姓名:</li>
                                    <li>电话号码:</li>
                                    <li>操作权限:</li>
                                </ul>
                                <ul class="ul1">
                                    <li>001</li>
                                    <li>123456</li>
                                    <li>张三</li>
                                    <li>12345678901</li>
                                    <li>
                                        <input type="checkbox"/>用户管理权限
                                        <input type="checkbox"/>车位管理权限
                                        <br/>
                                        <input type="checkbox"/>合同管理权限
                                        <input type="checkbox"/>投诉管理权限
                                    </li>
                                </ul>
                            </div>
                            <div style="text-align:center;padding:5px;margin-top: 350px">
                                <a href="javascript:void(0)" class="easyui-linkbutton btn" onclick="$('#r').window('close')">确定</a>
                                <a href="javascript:void(0)" class="easyui-linkbutton btn" onclick="$('#r').window('close')">返回</a>
                            </div>
                        </div>
                    </div>
        </div>


    </div>

</body>
</html>
