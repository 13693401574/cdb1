/**
 * Created by Administrator on 17-7-15.
 */

$(function(){
    $('#win').window('close');  // close a window

   $("#yuding").click(function(){
       /* alert(4588);*/
       $('#win').window('open');

   });
    $("#celect").click(function(){
        alert(4755);
        window.location="chaxunInfo.html";
    });

    $("#yudingcar").click(function(){

        //创建一个窗体 dialog
/*        $("#dd").dialog({
            title:"对话框",
            width:500,
            height:500,
            //href: 'get_content.php',
            closed:false,
            modal:true,
            collapsible:true,
            maximizable:true,
            buttons:[{
                text:'保存',
                iconCls:'icon-save',
                handler:function() {
                    alert('保存')
                }
            },{
                text:'取消',
                handler:function(){
                    alert('取消')
                }

            }]

        });*/

        $('#dd').window('open');
      /*  $('#dd').window('refresh', 'yudingInfo.html');*/

    });



});
