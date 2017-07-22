

	



$(function(){
	
	var rows;
	var fkLandladyId;
	var startTime;
	var endTime;
	function findData(page,rows){
		fkLandladyId=$(".time").attr("id");
		startTime=$("#startTime").datebox("getValue");
		endTime=$("#endTime").datebox("getValue");
		
		var publicMap={page:page,rows:rows,fkLandladyId:fkLandladyId,startTime:startTime,endTime:endTime};
		var json = $.toJSON(publicMap);
		var uri="landladys/id";
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
						carpotInfo: data[i].appBean.carportAddress+""+data[i].appBean.carportAddressCode,
						startTime: data[i].startTime,
						endTime: data[i].endTime,
						price: data[i].price,
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
	
})