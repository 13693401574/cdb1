<!DOCTYPE html>
<html>


<head lang="en">
    <meta charset="UTF-8">
    <title>招租客主页面</title>
    <!--<link rel="stylesheet" href="../../css/zhao_index.css"/>-->
    <link rel="stylesheet" type="text/css" href="../../easyUI/themes/default/easyui.css">
    <link rel="stylesheet" type="text/css" href="../../easyUI/themes/icon.css">

    <script type="text/javascript" src="../../easyUI/jquery.min.js"></script>
    <script type="text/javascript" src="../../easyUI/jquery.easyui.min.js"></script>
    <script type="text/javascript" src="../../../My97DatePicker/WdatePicker.js"></script>
    <script type="text/javascript" src="../../static/js/CDBItems/zhao_indexjs.js"></script>
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
<div style="width:100%;height: 100%;">
<div class="time">
    <form action="#">
        <span>起始日期：</span><input id="startDate" type="text" class="Wdate" onFocus="WdatePicker({maxDate:'#F{$dp.$D(\'endDate\')||\'new Date()\'}'})"/>

        <span>结束日期：</span><input id="endDate" type="text" class="Wdate" onFocus="WdatePicker({minDate:'#F{$dp.$D(\'startDate\')}',maxDate:new Date()})"/>
        <br/><br/>

        <a id="btn1" href="javascript:void(0)" class="easyui-linkbutton" style="width: 150px">查询</a>


    </form>
</div>
    <br/>
    <div class="table" >
        <table class="easyui-datagrid"style="height: 300px"
               data-options="singleSelect:true">

            <thead>
            <tr>
                <th data-options="field:'code',width:130,align:'center' ">车位信息</th>
                <th data-options="field:'name',width:130,align:'center' ">租借开始时间</th>
                <th data-options="field:'price',width:130,align:'center' ">租借结束时间</th>
                <th data-options="field:'price',width:130,align:'center' ">出租价格</th>
                <th data-options="field:'price',width:130,align:'center' ">出租状态</th>
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
            <a id="add" href="addstall.jsp" class="easyui-linkbutton">申请添加车位</a>
            <a id="fabu" href="releaseStall.jsp" class="easyui-linkbutton">发布车位信息</a>
            <a id="yuding" href="reservationStall.jsp" class="easyui-linkbutton">预定车位信息</a>
            <a href="landladyhistory.jsp" class="easyui-linkbutton">历史成交记录</a>
        </div>

        
    </div>



</div>

</body>
</html>