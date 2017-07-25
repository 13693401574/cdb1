$(function(){
	
	var rows;
	var startTime;
	var endTime;
	function findData(page,rows){
		fkLandladyId=$(".time").attr("id");
		startTime=$("#startTime").datebox("getValue");
		endTime=$("#endTime").datebox("getValue");
		var publicMap={page:page,rows:rows,startTime:startTime,endTime:endTime};
		var json = $.toJSON(publicMap);
		var uri="robTenants/showAllCarportIssue";
		rows = [];
		$.ajax({
			type:"POST",
			url:uri,
			data:json,
			contentType:"application/json",
			async:false,
			success:function(data){
				for(var i=0;i<data.length;i++){
					rows.push({
						carIssueId:data[i].id,
						carpotInfo: data[i].appBean.carportAddress+""+data[i].appBean.carportAddressCode,
						startTime: data[i].startTime,
						endTime: data[i].endTime,
						landladyUserName:data[i].landlady.userName,
						landladyJobDescribe: data[i].landlady.jobDescribe,
						landladyCredibility:data[i].landlady.credibility,
						price:data[i].price
							
					});
				}
				$('#dg').datagrid('loadData', rows);
			}
		});
	}
	
	
	
	

	//分页函数 
    function pagerFilter(data){
        if (typeof data.length == 'number' && typeof data.splice == 'function'){	// is array
            data = {
                total: data.length,
                rows: data
            }
        }
        var dg = $(this);
        var opts = dg.datagrid('options');
        var pager = dg.datagrid('getPager');
        pager.pagination({
            onSelectPage:function(pageNum, pageSize){
                opts.pageNumber = pageNum;
                opts.pageSize = pageSize;
                pager.pagination('refresh',{
                    pageNumber:pageNum,
                    pageSize:pageSize
                });
                dg.datagrid('loadData',data);
            }
        });
        if (!data.originalRows){
            data.originalRows = (data.rows);
        }
        var start = (opts.pageNumber-1)*parseInt(opts.pageSize);
        var end = start + parseInt(opts.pageSize);
        data.rows = (data.originalRows.slice(start, end));
        return data;
    }
	
	$('#dg').datagrid({loadFilter:pagerFilter});
	findData(1,1);
	var id;
	$("#yuding").click(function(){
		 var row = $('#dg').datagrid('getSelected');
		 if(row==null){
			 alert("请选择行")
		 }else{
			 $('#dlg').dialog('open');
			 id=row.carIssueId;
		 }
	})
	$("#yu").click(function(){
		var row = $('#dg').datagrid('getSelected');
		var message=$("#message").val();
		var robId=$("#robId").val();
		id=row.carIssueId;
		if(message==""||message.length==0){
			alert("请输入预约信息");
		}else{
			 $.messager.confirm('确认','您确认进行此操作？',function(r){
	                if (r){
	                	var publicMap={page:"1",rows:"1",robId:robId,message:message}
	                	var json = $.toJSON(publicMap);
	                	var uri="robTenants/savePredetermineCarport/"+id;
	                	 $.ajax({
	              			type:"POST",
	              			url:uri,
	              			data:json,
	              			contentType:"application/json",
	              			async:true,
	              			success:function(data){
	              				alert(data.msg);
	              				findData(1,1);
	              			}
	              		});
	                    $('#dlg').window('close');
	                }
	           });
		}
	})
})

