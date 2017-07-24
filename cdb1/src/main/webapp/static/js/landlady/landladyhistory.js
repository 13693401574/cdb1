
 function back(){
	 	$("#yu").val("");
        $('#dlg').window('close');
    }
	



$(function(){
	
	var rows;
	var fkLandladyId;
	var status=null;
	function findData(page,rows){
		fkLandladyId=$("#id").val();
		$("#status").change(function(){
			status=$("#status").val();
			
		})
		
		
		var publicMap={page:page,rows:rows,fkLandladyId:fkLandladyId,status:status};
		var json = $.toJSON(publicMap);
		var uri="landladys/deal/"+fkLandladyId;
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
						id:data[i].id,
						carpotInfo: data[i].carportIssue.appBean.carportAddress+""+data[i].carportIssue.appBean.carportAddressCode,
						startTime: data[i].carportIssue.startTime,
						endTime: data[i].carportIssue.endTime,
						robName: data[i].robTenants.userName,
						status: data[i].status
					});
				}
				$('#dg').datagrid('loadData', rows);
					
			}
		});
	}
	
	/*f分页*/

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
	
	
	$("#btn1").click(function(){
		findData(1,1);
	})
	
	
	
      
   
	
	$("#yuding").click(function(){
		var row = $('#dg').datagrid('getSelected');
		if(row==null){
			alert("请选择行");
			return;
		}
		if(row.status=="已投诉"){
			alert("不能多次投诉");
			return;
		}
		$('#dlg').dialog('open');
	})
	$("#submit").click(function(){
		var row = $('#dg').datagrid('getSelected');
		var dealId=row.id;
		var reason=$("#yu").val();
		if(reason==""||reason.length==0){
			alert("投诉理由不能为空");
			return;
		}
		 $.messager.confirm('确认','您确认进行此操作？',function(r){
	            if (r){
	            	var uri = "landladys/saveLandladyComplain/"+dealId;
	        		var publicMap={reasons:reason}
	                var json = $.toJSON(publicMap);
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
	                /*alert('确认删除');让浏览器再自己弹一次*/
	                $('#dlg').window('close');
	            }
	        });
	        /*   alert(22);异步*/
	    
		
		
	})
})