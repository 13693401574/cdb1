//这里是调用操作里面的formatter　格式化列的属性
function caozuo(val, row) {
	    return "<a href='javascript:void(0)' class='easyui-linkbutton' onclick='sholi("+row.id+")' >受理</a>";
	}
	//得到当前行的id和打开窗体
	function sholi(row){
		$('#w').window('open');
		//alert(row);		
	//向打开的窗体列写入
	//一 ：事件记录
	var url="RobTeantsComplain/shijian";	
	$.ajax({
		type:"POST",
		data:{"id":row},
		url:url,
		dataType:"json",
		async:true,
		success:function(mydata){
			//alert(mydata.carportEquityCode);
			$("#shijian").datagrid('loadData',{total:0,rows:[]})
			$('#shijian').datagrid('appendRow',{
				carportAddress:mydata.carportAddress,
				carportEquityCode:mydata.carportEquityCode,
				startTime:mydata.startTime,
				endTime:mydata.endTime
			});
		}
	});
	
	//投诉方(抢租客)
	$.ajax({
		type:"POST",
		data:{"id":row},
		url:url,
		dataType:"json",
		async:true,
		success:function(mydata){
			//alert(mydata.tuserName);
			//$("#tousufang").datagrid('loadData',{total:0,rows:[]})
			$('#tousufang').datagrid('appendRow',{
				userName:mydata.tuserName,
				realName:mydata.trealName,
				idCard:mydata.tidCard,
				jobDescribe:mydata.tjobDescribe,
				phnoe:mydata.tphone
			});
		}
	});
	
	//被诉方(包租婆)
	$.ajax({
		type:"POST",
		data:{"id":row},
		url:url,
		dataType:"json",
		async:true,
		success:function(mydata){
			//alert(mydata.tuserName);
			//$("#tousufang").datagrid('loadData',{total:0,rows:[]})
			$('#bei').datagrid('appendRow',{
				userName:mydata.buserName,
				realName:mydata.brealName,
				idCard:mydata.bidCard,
				jobDescribe:mydata.bjobDescribe,
				phnoe:mydata.bphone
			});
		}
	});
	
	//通过
	$("#pass").click(function(){
		$.ajax({
			type:"POST",
			data:{"status":"通过","id":row},
			url:"RobTeantsComplain/panduan",
			dataType:"json",
			async:true,
			success:function(mydata){
				
			}			
		});
		
	});
	
	//投诉无效
	$("#nopass").click(function(){
		$.ajax({
			type:"POST",
			data:{"status":"投诉无效","id":row},
			url:"RobTeantsComplain/panduan",
			dataType:"json",
			async:true,
			success:function(mydata){
				
			}			
		});
		
	});
	
	//等待
	$("#wait").click(function(){
		$.ajax({
			type:"POST",
			data:{"status":"等待","id":row},
			url:"RobTeantsComplain/panduan",
			dataType:"json",
			async:true,
			success:function(mydata){
				
			}			
		});
		
	});
	
	}
	
	
$(function(){
//得到总的行数据 初始化页面
	function shuaxing(){	
		var rows=[];		
		var url="RobTeantsComplain/findAll";
		$.ajax({
			type:"POST",
			url:url,
			dataType:"json",
			async:true,
			success:function(data){	
				//alert(data)
				for(var i=0;i<data.length;i++){			
				//添加数据
				rows.push({   
					id: data[i].id, 
					complainant:data[i].complainant,
					beComplaint: data[i].beComplaint, 
					complainantDate: data[i].complainantDate,	
				}); 			
				}
				$("#table").datagrid('loadData',rows);
			}
		});
		}

	//进行的分页操作	
	function pagerFilter(data){
	if (typeof data.length == 'number' && typeof data.splice == 'function'){	// is array
			data = {
				total: data.length,
				rows: data
			}
		}
	//当进行翻页时触发下面的函数
	var p=$("#table").datagrid('options');
	//得到页面对象
	var pager = $("#table").datagrid('getPager');

	pager.pagination({		
		onSelectPage:function(pageNum,pageSize){	
			p.pageNumber=pageNum;
			p.pageSize=pageSize;
			pager.pagination('refresh',{
				pageNumber:pageNum,
				pageSize:pageSize
			});
			$("#table").datagrid('loadData',data);

		}
	});
	if (!data.originalRows){
		data.originalRows = (data.rows);
	}
	var start = (p.pageNumber-1)*parseInt(p.pageSize);
	var end = start + parseInt(p.pageSize);
	data.rows = (data.originalRows.slice(start, end));
	return data;

	}
	//调用分页方法
	$('#table').datagrid({loadFilter:pagerFilter}).datagrid('loadData', shuaxing());

});