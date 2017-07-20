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


        function makeSure(){
            $.messager.confirm('确认', '您确认进行此操作？', function (r) {
                if (r) {
                    $('#w1,#w2').window('close');

                }
            });

        }
        function back(){
            $('#w1,#w2').window('close');
        }

    </script>
</head>
<body>
<div style="width: 100%;margin: auto">
    <div style="width:100%;height:100px;border: 1px #95B8E7 solid;background-color: #CECBCB">
        <form id="ff" method="post" style="display: block;margin-left: 10px" >
            <br/>
            <label style="font-weight: bolder;margin-left: 33px">车位所在地址 </label><input class="easyui-textbox" type="text" name="name"/>
            <label style="font-weight: bolder;margin-left: 31px">车位编号 </label><input class="easyui-textbox" type="text" name="name"/>

            &nbsp; &nbsp; &nbsp;
            <input type="button" value="查询"  style="font-weight: bolder;width: 100px;height: 30px;background-color: #95B8E7;border-radius: 10px"/>



        </form>

    </div>
    <table class="easyui-datagrid"  style="width:100%;height:250px"
           data-options="singleSelect:true,collapsible:true,url:'datagrid_data1.json',method:'get'">
        <thead>
        <tr>
            <th data-options="field:'itemid',width:40,align:'center'">序号</th>
            <th data-options="field:'iteid',width:200,align:'center'">车位所在地址</th>
            <th data-options="field:'productid',width:150,align:'center'">车位编号</th>
            <th data-options="field:'listprice',width:60,align:'center'">状态</th>
        </tr>
        </thead>

        <tbody>
        <tr>
            <td>1</td>
            <td>的看法和这款手机的</td>
            <td>而通过的官方</td>
            <td>待租</td>
        </tr>


        </tbody>
    </table>
    <div style="margin: 30px 0;">
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
        <a href="javascript:void(0)" class="easyui-linkbutton" onclick="$('#w1').window('open')" style="padding: 5px">单车位添加</a>
        <a href="javascript:void(0)" class="easyui-linkbutton" onclick="$('#w2').window('open')" style="padding: 5px">批量车位添加</a>

    </div>
</div>
<div id="w1" class="easyui-window" title="单车位添加" data-options="modal:true,closed:true,iconCls:'icon-save'" style="width:600px;height: 200px;">
    <form id="f1" method="post" style="display: block;margin-top: 30px" >
        <br/>
        <label style="font-weight: bolder;margin-left: 33px">车位所在地址 </label>
        <select class="easyui-combobox" name="language"><option value="ar">Arabic</option><option value="bg">Bulgarian</option><option value="ca">Catalan</option><option value="zh-cht">Chinese Traditional</option><option value="cs">Czech</option><option value="da">Danish</option><option value="nl">Dutch</option><option value="en" selected="selected">English</option><option value="et">Estonian</option><option value="fi">Finnish</option><option value="fr">French</option><option value="de">German</option><option value="el">Greek</option><option value="ht">Haitian Creole</option><option value="he">Hebrew</option><option value="hi">Hindi</option><option value="mww">Hmong Daw</option><option value="hu">Hungarian</option><option value="id">Indonesian</option><option value="it">Italian</option><option value="ja">Japanese</option><option value="ko">Korean</option><option value="lv">Latvian</option><option value="lt">Lithuanian</option><option value="no">Norwegian</option><option value="fa">Persian</option><option value="pl">Polish</option><option value="pt">Portuguese</option><option value="ro">Romanian</option><option value="ru">Russian</option><option value="sk">Slovak</option><option value="sl">Slovenian</option><option value="es">Spanish</option><option value="sv">Swedish</option><option value="th">Thai</option><option value="tr">Turkish</option><option value="uk">Ukrainian</option><option value="vi">Vietnamese</option></select>
        <label style="font-weight: bolder;margin-left: 31px">车位编号 </label><input class="easyui-textbox" type="text" name="name"/>

    </form>

    <div style="text-align:center;margin-top: 40px">
        <a href="javascript:void(0)" onclick="makeSure()"  style="width: 100px;" class="easyui-linkbutton" >保存</a>
        <a href="javascript:void(0)" onclick="back()"  style="width: 100px;" class="easyui-linkbutton" >返回</a>
    </div>

</div>
<div id="w2" class="easyui-window" title="批量车位添加" data-options="modal:true,closed:true,iconCls:'icon-save'" style="width:600px;height: 200px;">
    <form id="f2" method="post" style="display: block;margin-top: 30px" >
        <br/>
        <label style="font-weight: bolder;margin-left: 33px">车位所在地址 </label>
        <select class="easyui-combobox" name="language"><option value="ar">Arabic</option><option value="bg">Bulgarian</option><option value="ca">Catalan</option><option value="zh-cht">Chinese Traditional</option><option value="cs">Czech</option><option value="da">Danish</option><option value="nl">Dutch</option><option value="en" selected="selected">English</option><option value="et">Estonian</option><option value="fi">Finnish</option><option value="fr">French</option><option value="de">German</option><option value="el">Greek</option><option value="ht">Haitian Creole</option><option value="he">Hebrew</option><option value="hi">Hindi</option><option value="mww">Hmong Daw</option><option value="hu">Hungarian</option><option value="id">Indonesian</option><option value="it">Italian</option><option value="ja">Japanese</option><option value="ko">Korean</option><option value="lv">Latvian</option><option value="lt">Lithuanian</option><option value="no">Norwegian</option><option value="fa">Persian</option><option value="pl">Polish</option><option value="pt">Portuguese</option><option value="ro">Romanian</option><option value="ru">Russian</option><option value="sk">Slovak</option><option value="sl">Slovenian</option><option value="es">Spanish</option><option value="sv">Swedish</option><option value="th">Thai</option><option value="tr">Turkish</option><option value="uk">Ukrainian</option><option value="vi">Vietnamese</option></select>
        <label style="font-weight: bolder;margin-left: 31px">车位总数 </label><input class="easyui-textbox" type="text" name="name"/>

    </form>

    <div style="text-align:center;margin-top: 40px">
        <a href="javascript:void(0)" onclick="makeSure()"  style="width: 100px;" class="easyui-linkbutton" >保存</a>
        <a href="javascript:void(0)" onclick="back()"  style="width: 100px;" class="easyui-linkbutton" >返回</a>
    </div>

</div>
</body>
</html>