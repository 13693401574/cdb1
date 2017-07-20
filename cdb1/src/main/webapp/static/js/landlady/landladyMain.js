$(function(){
	
	function getData(page,rows){
		$('#show').datagrid({
//			fit : true,
	        fitColumns : true,
	        rownumbers : true,
//	        pagination : true,
	        singleSelect : true,
	        border : false,
	        striped : true,
			       
			        columns : [ [ {
			            field : 'carpotInfo',
			            title : '车位信息',
			            width : 130,
			            align : 'center',
			        }, {
			            field : 'startTime',
			            title : '租借开始时间',
			            width : 130,
			            align : 'center'
			        }, {
			            field : 'endTime',
			            title : '租借结束时间',
			            width : 130,
			            align : 'center'
			        }, {
			            field : 'price',
			            title : '出租价格',
			            width : 130,
			            align : 'center'
			        }, {
				        field : 'status',
				        title : '出租状态',
				        width : 130,
				        align : 'center'
				      }] ]
	    });
		var publicMap={page:page,rows:rows};
		var json = $.toJSON(publicMap);
		var uri="landladys/id";
		$.ajax({
			type:"POST",
			url:uri,
			data:json,
			contentType:"application/json",
			async:true,
			success:function(data){
				for(var i=0;i<data.datas.length;i++){
					var a = [ {
	                    'carpotInfo' : data.datas[i].appBean.carportAddress+""+data.datas[i].appBean.carportAddressCode,
	                    'startTime' : data.datas[i].startTime,
	                    'endTime' : data.datas[i].endTime,
	                    'price' : data.datas[i].price,
	                    'status' : data.datas[i].status
	                } ];
	                $('#show').datagrid('loadData', a);
				}
			
				/*var str="";
				for(var i=0;i<data.datas.length;i++){
					str+="<tr><td>"+data.datas[i].appBean.carportAddress+""+data.datas[i].appBean.carportAddressCode+"" +
							"</td>"+data.datas[i].startTime+"<td>" +
							"</td>"+data.datas[i].endTime+"<td>"+data.datas[i].price+"</td><td>"+data.datas[i].status+"</td></tr>"
				}
				console.log(str);
				$("#show").html(str);*/
				
				$("#tolRows").html(data.totalRows);
				$("#tolpage").html(data.totalPage)
				$("#rows").val(rows);
				$("#page").html(page);
			}
		});
	}
	getData(1,3);
})