<!DOCTYPE html>
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

            <label style="font-weight: bolder;margin-left: 0px">企业用户名称 </label><input class="easyui-textbox" type="text" name="name"/>
            <label style="font-weight: bolder;margin-left: 31px">合同编号 </label><input class="easyui-textbox" type="text" name="name"/>
            <br/>
            <br/>
            <label style="font-weight: bolder;">合同生效日期 </label><input class="easyui-textbox" type="text" name="name"/>
            <label style="font-weight: bolder;">合同截止日期 </label><input class="easyui-textbox" type="text" name="name"/>
            &nbsp; &nbsp; &nbsp;
            <input  type="button" value="查询"  style="font-weight: bolder;width: 100px;height: 30px;background-color: #95B8E7;border-radius: 10px"/>



        </form>

    </div>
    <table class="easyui-datagrid"  style="width:100%;height:250px"
           data-options="singleSelect:true,collapsible:true,url:'datagrid_data1.json',method:'get'">
        <thead>
        <tr>
            <th data-options="field:'itemid',align:'center'">序号</th>
            <th data-options="field:'itemd',align:'center'">企业用户名称</th>
            <th data-options="field:'productid',align:'center'">合同编号</th>
            <th data-options="field:'attr1',align:'center'">合同生效日期</th>
            <th data-options="field:'status',align:'center'">合同截止日期</th>
            <th data-options="field:'produtid',align:'center'">承租车位</th>

        </tr>
        </thead>
        <tbody>
        <tr>
            <td>s</td>
            <td>ass</td>
            <td>sa</td>
            <td>asa</td>
            <td>s</td>
            <td>ss</td>

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

    <div style="text-align:center;padding:5px;width: 100%;">
        <a href="addLessee.jsp" class="easyui-linkbutton"  style="padding: 5px">租户签约</a>
        <a href="continueLessee.jsp" class="easyui-linkbutton"  style="padding: 5px">租户续约</a>
        <a href="javascript:void(0)" class="easyui-linkbutton"  style="padding: 5px">租户解约</a>
    </div>
</div>

</body>
</html>