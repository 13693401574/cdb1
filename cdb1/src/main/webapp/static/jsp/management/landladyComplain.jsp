
<!DOCTYPE html>
<%@ page contentType="text/html; charset=gb2312"%>
<html>
<head lang="en">
    <meta charset="UTF-8">
    <title></title>
    <link rel="stylesheet" type="text/css" href="../../easyui/themes/default/easyui.css">
    <link rel="stylesheet" type="text/css" href="../../easyui/themes/icon.css">
    <script type="text/javascript" src="../../easyui/jquery.min.js"></script>
    <script type="text/javascript" src="../../easyui/jquery.easyui.min.js"></script>
    <script>


      function  makeSure(){
          $.messager.confirm('确认','您确认进行此操作？',function(r){
              if (r){
                  /*alert('确认删除');让浏览器再自己弹一次*/
                  $('#w').window('close');
              }
          });
       /*   alert(22);异步*/
      }

    </script>
</head>
<body>
<div style="width: 100%;margin: auto">
    <div id="p" class="easyui-panel" title="包租婆投诉受理" style="width:100%;">
        <table class="easyui-datagrid"  style="width:100%;height:400px"
               data-options="singleSelect:true,collapsible:true,url:'datagrid_data1.json',method:'get'">
            <thead>
            <tr>
                <th data-options="field:'itemid',width:150,align:'center'">投诉方</th>
                <th data-options="field:'itemid',width:150,align:'center'">被投诉方</th>
                <th data-options="field:'productid',width:150,align:'center'">投诉时间</th>
                <th data-options="field:'attr1',width:100,align:'center'">操作</th>

            </tr>
            </thead>
            <tbody>
            <tr>
                <td>酒店水电费</td>
                <td>的看法和这款手机的</td>
                <td>而通过的官方</td>
                <td><a href="javascript:void(0)" class="easyui-linkbutton" onclick="$('#w').window('open')">受理</a></td>
            </tr>


            </tbody>
        </table>

        <div style="margin: 30px 0;">
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
    </div>

</div>
<div id="w" class="easyui-window" title="投诉详情" data-options="modal:true,closed:true,iconCls:'icon-save'" style="width:800px;height: 400px;">
    <br/>
   <label style="font-weight: bolder;font-size: 15px">事件记录</label>
    <br/>
    <table class="easyui-datagrid"  style="width:100%;"
           data-options="singleSelect:true,collapsible:true,url:'datagrid_data1.json',method:'get'">
        <thead>
        <tr>
            <th data-options="field:'itemid',width:200,align:'center'">车位小区地址</th>
            <th data-options="field:'itemid',width:150,align:'center'">车位编号</th>
            <th data-options="field:'productid',width:150,align:'center'">租赁开始时间</th>
            <th data-options="field:'attr1',width:150,align:'center'">租赁结束时间</th>

        </tr>
        </thead>
        <tbody>
        <tr>
            <td>酒店水电费</td>
            <td>的看法和这款手机的</td>
            <td>而通过的官方</td>
            <td>啥的</td>
        </tr>


        </tbody>
    </table>
    <br/>
    <label style="font-weight: bolder;font-size: 15px">投诉方</label>
    <br/>
    <table class="easyui-datagrid"  style="width:100%;"
           data-options="singleSelect:true,collapsible:true,url:'datagrid_data1.json',method:'get'">
        <thead>
        <tr>
            <th data-options="field:'itemid',width:150,align:'center'">用户名</th>
            <th data-options="field:'itemid',width:150,align:'center'">真实姓名</th>
            <th data-options="field:'productid',width:150,align:'center'">身份证号码</th>
            <th data-options="field:'attr1',width:150,align:'center'">职业</th>
            <th data-options="field:'attr1',width:100,align:'center'">电话</th>

        </tr>
        </thead>
        <tbody>
        <tr>
            <td>酒店水电费</td>
            <td>的看法和这款手机的</td>
            <td>而通过的官方</td>
            <td>啥的</td>
            <td>啥的</td>
        </tr>


        </tbody>
    </table>
    <br/>
    <label style="font-weight: bolder;font-size: 15px">被投诉方</label>
    <br/>
    <table class="easyui-datagrid"  style="width:100%;"
           data-options="singleSelect:true,collapsible:true,url:'datagrid_data1.json',method:'get'">
        <thead>
        <tr>
            <th data-options="field:'itemid',width:150,align:'center'">用户名</th>
            <th data-options="field:'itemid',width:150,align:'center'">真实姓名</th>
            <th data-options="field:'productid',width:150,align:'center'">身份证号码</th>
            <th data-options="field:'attr1',width:150,align:'center'">职业</th>
            <th data-options="field:'attr1',width:100,align:'center'">电话</th>

        </tr>
        </thead>
        <tbody>
        <tr>
            <td>酒店水电费</td>
            <td>的看法和这款手机的</td>
            <td>而通过的官方</td>
            <td>啥的</td>
            <td>啥的</td>
        </tr>


        </tbody>
    </table>


    <div style="text-align:center;width: 100%;margin-top: 40px">
        <a href="javascript:void(0)" onclick="makeSure()"  style="width: 100px;" class="easyui-linkbutton"  style="padding: 5px">投诉生效</a>
        <a href="javascript:void(0)" onclick="makeSure()"  style="width: 100px;" class="easyui-linkbutton"  style="padding: 5px">投诉无效</a>
        <a href="javascript:void(0)" onclick="makeSure()"  style="width: 100px;" class="easyui-linkbutton"  style="padding: 5px">暂缓处理</a>
    </div>

</div>




</body>
</html>