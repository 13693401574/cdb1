<!DOCTYPE html>
<html>
<head lang="en">
    <meta charset="UTF-8">
    <title></title>

    <link rel="stylesheet" type="text/css" href="../../easyUI/themes/default/easyui.css">
    <link rel="stylesheet" type="text/css" href="../../easyUI/themes/icon.css">

    <script type="text/javascript" src="../../easyUI/jquery.min.js"></script>
    <script type="text/javascript" src="../../easyUI/jquery.easyui.min.js"></script>

</head>
<body>
<div>
    <div class="table" >
        <table class="easyui-datagrid"style="height: 300px"
               data-options="singleSelect:true">

            <thead>
            <tr>
                <th data-options="field:'code',width:130,align:'center' ">车位信息</th>
                <th data-options="field:'name',width:130,align:'center' ">租借开始时间</th>
                <th data-options="field:'price',width:130,align:'center' ">租借结束时间</th>
                <th data-options="field:'price',width:130,align:'center' ">抢租客用户名</th>
                <th data-options="field:'price',width:130,align:'center' ">抢租客职业</th>
                <th data-options="field:'price',width:130,align:'center' ">抢租客电话</th>
                <th data-options="field:'price',width:130,align:'center' ">抢租客信誉度</th>
                <th data-options="field:'price',width:130,align:'center' ">抢租客留言</th>

            </tr>
            </thead>
            <tbody>
            <tr>
                <td>001</td><td>name1</td><td>2323</td>
            </tr>
            <tr>
                <td>002</td><td>name2</td><td>4612</td>
            </tr>
            </tbody>
        </table>

        <br/>
        <div style="margin-top: 32px;">
             <span style="margin-left: 10px;">
                 共有XXX条记录，每页<input class="easyui-validatebox" type="text" name="name" style="width:20px;" />条，
                 当前<label>X</label>/<label>XX</label>页
             </span>
            <span style="margin-left: 80px;margin-right: 30px;">
                <a id="btn2" href="#" class="easyui-linkbutton" style="width: 50px;margin: 4px;">首页</a>
                <a id="btn3" href="#" class="easyui-linkbutton" style="width: 50px;margin: 4px;">上页</a>
                <a id="btn4" href="#" class="easyui-linkbutton" style="width: 50px;margin: 4px;">下页</a>
                <a id="btn5" href="#" class="easyui-linkbutton" style="width: 50px;margin: 4px;">尾页</a>
            </span>
            <label>跳转到：</label><input class="easyui-validatebox" type="text" name="name" style="width:20px;" />
            <a id="btn6" href="#" class="easyui-linkbutton" style="width: 70px">跳转到</a>
        </div>

        <br/>
        <div  style="text-align: center">
            <a id="add" href="#" class="easyui-linkbutton">同意出租</a>
        </div>


    </div>
</div>
</body>
</html>