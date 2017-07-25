<!DOCTYPE html>
<html>
<head lang="en">
    <meta charset="UTF-8">
    <title>成交记录</title>

<!--    <link rel="stylesheet" href="../../css/chengjiaojilu.css"/>-->
    <link rel="stylesheet" type="text/css" href="../../easyUI/themes/default/easyui.css">
    <link rel="stylesheet" type="text/css" href="../../easyUI/themes/icon.css">

    <script type="text/javascript" src="../../easyUI/jquery.min.js"></script>
    <script type="text/javascript" src="../../easyUI/jquery.easyui.min.js"></script>
    <script>


        function  makeSure(){
            $.messager.confirm('确认','您确认进行此操作？',function(r){
                if (r){
                    /*alert('确认删除');让浏览器再自己弹一次*/
                    $('#dlg').window('close');
                }
            });
            /*   alert(22);异步*/
        }
        function back(){
            $('#dlg').window('close');
        }

    </script>

</head>
<body>
<div class="table" style="width: 100%;">

    <table class="easyui-datagrid"style="height: 400px"
           data-options="singleSelect:true">

        <thead>
        <tr>
            <th data-options="field:'code',width:200,align:'center' ">租赁信息</th>
            <th data-options="field:'name',width:200,align:'center' ">租借开始时间</th>
            <th data-options="field:'price',width:200,align:'center' ">租借结束时间</th>
            <th data-options="field:'price',width:200,align:'center' ">抢租客用户名</th>

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
             <span style="margin-left: 0px;">
                 共有XXX条记录，每页<input class="easyui-validatebox" type="text" name="name" style="width:20px;" />条，
                 当前<label>X</label>/<label>XX</label>页
             </span>
            <span style="margin-left: 30px">
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
        <a id="yuding" href="#" class="easyui-linkbutton" onclick="$('#dlg').dialog('open')">投诉</a>
        <a href="landladyMain.html" class="easyui-linkbutton">返回</a>
    </div>
</div>

<div id="dlg" class="easyui-window" title="注册窗口" data-options="modal:true,closed:true" style="width:650px;height:380px;padding:10px;" >

    <div id="duohang">

        <form action="">
            <span>投诉理由:</span>
            <textarea name="yuding" id="yu" cols="30" rows="10"></textarea>

            <br/>
            <div style="text-align:center;width: 100%;margin-top: 40px">
                <a href="javascript:void(0)" onclick="makeSure()"  style="width: 100px;" class="easyui-linkbutton"  style="padding: 5px">提交投诉</a>
                <a href="javascript:void(0)" onclick="back()"  style="width: 100px;" class="easyui-linkbutton"  style="padding: 5px">返回</a>
            </div>
        </form>
    </div>


</div>

</body>
</html>