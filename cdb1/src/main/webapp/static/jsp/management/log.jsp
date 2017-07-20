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
</head>
<body>
<div style="width: 100%;margin: auto">
    <div style="width:100%;height:100px;border: 1px #95B8E7 solid;background-color: #CECBCB">
        <form id="ff" method="post" style="display: block;padding: 15px 0 20px 20px " >

            <label style="font-weight: bolder;margin-left: 16px">日志信息</label><input class="easyui-textbox" type="text" name="name"/>
            <br/>
            <br/>
            <label style="font-weight: bolder">日志时间</label><input class="easyui-textbox" type="text" name="name"/>
            <label style="font-weight: bolder">至 </label><input class="easyui-textbox" type="text" name="name"/>
            &nbsp; &nbsp; &nbsp;
            <input type="button" value="查询"  style="font-weight: bolder;width: 100px;height: 30px;background-color: #95B8E7;border-radius: 10px"/>



        </form>

    </div>
    <table class="easyui-datagrid"  style="width:100%;height:250px"
           data-options="singleSelect:true,collapsible:true,url:'datagrid_data1.json',method:'get'">
        <thead>
        <tr>
            <th data-options="field:'itemid',align:'center'">序号</th>
            <th data-options="field:'productid',align:'center'">日志信息</th>
            <th data-options="field:'listpice',align:'center'">日志时间</th>


        </tr>
        </thead>
        <tbody>
        <tr>
            <td>33</td>
            <td>55</td>
            <td>55</td>


        </tr>
        </tbody>
    </table>

    <div style="margin: 30px 0 ;">
                            <span style="margin-left: 30px;">
                            共有XXX条记录，每页<input class="easyui-validatebox" type="text" name="name" style="width:20px;" />条，
                            当前<label>X</label>/<label>XX</label>页
                            </span>
                            <span style="margin-left: 320px;margin-right: 30px;">
                            <a id="btn2" href="#" class="easyui-linkbutton" style="width: 50px;margin: 4px;">首页</a>
                            <a id="btn3" href="#" class="easyui-linkbutton" style="width: 50px;margin: 4px;">上页</a>
                            <a id="btn4" href="#" class="easyui-linkbutton" style="width: 50px;margin: 4px;">下页</a>
                            <a id="btn5" href="#" class="easyui-linkbutton" style="width: 50px;margin: 4px;">尾页</a>
                            </span>
        <label>跳转到：</label><input class="easyui-validatebox" type="text" name="name" style="width:20px;" />
        <a id="btn6" href="#" class="easyui-linkbutton" style="width: 50px">跳转到</a>
    </div>

</div>

</body>
</html>