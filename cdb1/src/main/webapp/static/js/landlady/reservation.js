



$(function(){
	
	var rows;
	var fkLandladyId;
	var startTime;
	var endTime;
	function findData(page,rows){
		fkLandladyId=$("#id").val();
		
		
		var publicMap={page:page,rows:rows,fkLandladyId:fkLandladyId};
		var json = $.toJSON(publicMap);
		var uri="landladys/findReservation";
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
						fkCorportIssueId:data[i].carBean.id,
						carpotInfo: data[i].carBean.appBean.carportAddress+""+data[i].carBean.appBean.carportAddressCode,
						startTime: data[i].carBean.startTime,
						endTime: data[i].carBean.endTime,
						robUserName: data[i].robBean.userName,
						robJobDescribe: data[i].robBean.jobDescribe,
						robPhone:data[i].robBean.phone,
						robCredibility:data[i].robBean.credibility,
						robMessage:data[i].message
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
		 var row = $('#dg').datagrid('getSelected');
        
         if (row==null){
        	alert("请选择行") 
         }
         else{
        	 var publicMap={fkCorportIssueId:row.fkCorportIssueId}
             var json = $.toJSON(publicMap);
        	 
             uri = "landladys/fkCarportApplicationId/"+row.id;
             $.ajax({
     			type:"PUT",
     			url:uri,
     			data:json,
     			contentType:"application/json",
     			async:true,
     			success:function(data){
     				findData(1,1);
     			}
     		});
         }
	})
})