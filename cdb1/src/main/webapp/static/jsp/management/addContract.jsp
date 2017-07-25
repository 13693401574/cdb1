<!DOCTYPE html>
<html>
<head lang="en">
    <meta charset="UTF-8">
    <title></title>
    <link rel="stylesheet" type="text/css" href="../../easyui/themes/default/easyui.css">
    <link rel="stylesheet" type="text/css" href="../../easyui/themes/icon.css">
    <script type="text/javascript" src="../../easyui/jquery.min.js"></script>
    <script type="text/javascript" src="../../easyui/jquery.easyui.min.js"></script>
    <script>
      /*  function submitForm(){
            $('#ff').form('submit');
        }
        function clearForm(){
            $('#ff').form('clear');
        }*/

      function  makeSure1() {
          $.messager.confirm('确认', '您确认进行此操作？', function (r) {
              if (r) {
            	  /*alert('确认删除');让浏览器再自己弹一次*/
                  $('#w').window('close');
                 // window.location.href="contract.html";
                  $(window).attr('location','contract.html');
              }
          });
      }
      function  makeSure2() {
          $.messager.confirm('确认', '您确认进行此操作？', function (r) {
              if (r) {
                  $('#w').window('close');

              }
          });
      }

      function back2(){
          $('#w').window('close');
      }

    </script>
</head>
<body>
<div style="width: 100%;margin: auto">
    <div class="easyui-panel" title="新增外部合约" style="width:100%;" >
    <div style="padding:10px 60px 20px 60px">
        <form id="ff" method="post" >
            <table cellpadding="5" style="margin: auto;text-align: right">
                <tr>
                    <td>合同编号</td>
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
                    <td>车位所在地址</td>
                    <td><input class="easyui-textbox" name="message" /></td>
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
                <tr>
                    <td>车位数量</td>
                    <td><input class="easyui-textbox" name="message" /></td>
                    <!--<td><a href="javascript:void(0)" class="easyui-linkbutton" onclick="$('#w').window('open')">æ·»å è½¦ä½</a></td>-->
                </tr>
            </table>
        </form>
        <div style="text-align:center;padding:5px">
            <a href="javascript:void(0)" class="easyui-linkbutton" onclick="makeSure1()">保存</a>
            <a href="contract.jsp" class="easyui-linkbutton" >返回</a>
        </div>
    </div>

</div>
    </div>
<!--<div id="w" class="easyui-window" title="æ·»å è½¦ä½" data-options="modal:true,closed:true,iconCls:'icon-save'" style="width:600px;">
    <table id="car" class="easyui-datagrid"  style="width:100%;height: 400px;"
           data-options="singleSelect:true,collapsible:true,url:'datagrid_data1.json',method:'get'">
        <thead>
        <tr>
            <th data-options="field:'sort',align:'center',width:80">åºå·</th>
            <th data-options="field:'address',align:'center',width:150">è½¦ä½æå¨å°å</th>
            <th data-options="field:'number',align:'center',width:150">è½¦ä½ç¼å·</th>
            <th data-options="field:'operation',align:'center',width:100">æä½</th>

        </tr>
        </thead>
        <tbody id="bb">
        <tr>
            <td>1</td>
            <td><select name="sort" style="width: 140px;" ></select></td>
            <td><select name="address" style="width: 140px;"></select></td>
            <td><input type="button" value="å é¤"/></td>
        </tr>



        </tbody>
    </table>

    <div style="text-align:center;padding:5px">
        <a href="javascript:void(0)" class="easyui-linkbutton"  style="width: 100px;" onclick="makeSure2()">ä¿å­</a>
        <a href="javascript:void(0)" class="easyui-linkbutton"  style="width: 100px;" onclick="back2()">è¿å</a>
        <a href="javascript:void(0)" onclick="addNewRow()"  style="width: 100px;" class="easyui-linkbutton" >æ°å¢è¡</a>
    </div>

</div>-->
</body>
</html>