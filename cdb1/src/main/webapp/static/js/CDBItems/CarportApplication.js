
$(function(){
	//初始化每页显示的 数据
	var pageS=2
	//初始化第一页
	var pageNum=1;
		pageNumber=(pageNum-1)*pageS;
	
	
	
	//模糊查询
	$("#select").click(function(){
		var realName=$("#realName").val();
		var carCode=$("#carCode").val();
		var idCard=$("#idCard").val();
		var phone=$("#phone").val();
		alert(realName);
		alert(carCode);
		alert(idCard);
		alert(phone);
		var map={"realName":realName,"carportEquityCode":carCode,"idCard":idCard,"phone":phone}
		shuaxing(map);
	})

	//初始页面加载数据
	var car={"realName":null,"carportEquityCode":null,"idCard":null,"phone":null}
	


	//加载数据	
	//shuaxing(car);
	function shuaxing(car){	
	var rows=[];
	var json=$.toJSON(car);
	var url="carportApplication/init";
	$.ajax({
		type:"POST",
		data:json,
		url:url,
		contentType:"application/json",
		async:true,
		success:function(data){
	
			for(var i=0;i<data.length;i++){			
			//添加数据
			rows.push({   
				id: data[i].id, 
				userName:data[i].landlady.userName,
				realName: data[i].landlady.realName, 
				idCard: data[i].landlady.idCard ,
				phone:data[i].landlady.phone,
				carportEquityCode:data[i].carportEquityCode,
				equityCopies:data[i].equityCopies,  
				
			}); 			
			}
			$("#table").datagrid('loadData',rows);
		}
	});
	}
	
	//得到当前行idonClickRow
	var carId=-1;
	$('#table').datagrid({
		onClickRow: function(rowIndex,rowData){
			carId=parseInt(rowData.id);
			alert(carId);
		}
			
	});	
	//查看信息
	$("#selectcar").click(function(){
		alert(carId);
		var url="carportApplication/selectcar"
		$.ajax({
			type:"POST",
			url:url,
			data:{"id":carId},
			dataType:"json",
			async:true,
			success:function(mydata){
				alert(mydata);
				$(".ul1 li").eq(0).html(mydata.landlady.userName);
				$(".ul1 li").eq(1).html(mydata.landlady.realName);
				$(".ul1 li").eq(2).html(mydata.landlady.idCard);
				$(".ul1 li").eq(3).html(mydata.landlady.phone);
				$(".ul1 li").eq(4).html(mydata.landlady.address);
				$(".ul1 li").eq(5).html(mydata.carportEquityCode);
				$(".ul1 li").eq(6).html(mydata.equityCopies);
				$(".ul1 li").eq(7).html(mydata.status);
				
				
				$('#w').window('open');
				
			}
		});	
		
	});
	
	//通过操作
	$("#pass").click(function(){
		var status="通过";
		var url="carportApplication/pass";	
		$.ajax({
			type:"POST",
			url:url,
			data:{"status":status,"id":carId},
			dataType:"json",
			async:true,
			success:function(mydata){
				alert(mydata.msg)
				$('#w').window('close');
				shuaxing(car);
			}
		});	
	});
	
	//驳回操作
	$("#noPass").click(function(){
		var status="驳回";
		var url="carportApplication/pass";	
		$.ajax({
			type:"POST",
			url:url,
			data:{"status":status,"id":carId},
			dataType:"json",
			async:true,
			success:function(mydata){
				alert(mydata.msg)
				$('#w').window('close');
				shuaxing(car);
			}
		});	
	});
	
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
	$('#table').datagrid({loadFilter:pagerFilter}).datagrid('loadData', shuaxing(car));
		
/*var grid = $('#grid');
var options = grid.datagrid('getPager').data("pagination").options;
var curr = options.pageNumber;
alert('当前页数:'+curr);
var total = options.total;
alert('总记录数:'+total);
var max = Math.ceil(total/options.pageSize);
alert('总页数:'+max);
var data=$('#grid').datagrid('getData');
alert('当前页数据量:'+data.rows.length); */
	


	
	
})