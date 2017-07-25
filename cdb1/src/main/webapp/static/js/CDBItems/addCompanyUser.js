$(function(){
	//初始化页面显示的条数
	var rows=2;
	//得到当前页数
	var pages=1;
	page=(pages-1)*rows;

	var company={"loginName":null,"pwd":null,"companyName":null,"floor":null,"linkMan":null,"linkPhone":null,"page":page,"rows":rows};
	shuaxing(company);
	//使用ajax刷新页面
	function shuaxing(company){
		
	var json=$.toJSON(company);
	var url="company/all";
	$.ajax({
		type:"POST",
		url:url,
		data:json,
		contentType:"application/json",
		async:true,
		success:function(mydata){
			
			//清空数据
			$('#table').datagrid('loadData',{total:0,rows:[]});
			//alert(mydata.totalRows);
			//获取总条数
			$("#tol").html(mydata.totalRows);
			
			//共几页
			$("#totalPage").html(mydata.totalPage);
			for(var i=0;i<mydata.datas.length;i++){
				var a={						
						id:mydata.datas[i].id,
						logName:mydata.datas[i].loginName,
						companyName:mydata.datas[i].companyName,
						floor:mydata.datas[i].floor,
						linkMan:mydata.datas[i].linkMan,
						linkPhone:mydata.datas[i].linkPhone		        
				}
				$('#table').datagrid('appendRow',a);
			}					
		}				
	})
}

	//模糊查询
	$("#find").click(function(){	
		var companyName=$("#companyName1").val();
		var floor=$("#floor1").val();
		var linkMan=$("#linkMan1").val();
		var linkPhone=$("#linkPhone1").val(); 
		alert(companyName+"="+floor+"="+linkMan+"="+linkPhone)
		var find={"companyName":companyName,"floor":floor,"linkMan":linkMan,"linkPhone":linkPhone,"page":page,"rows":rows};
		//模糊刷新		
		shuaxing(find);				

	})		

	//添加企业用户
	$("#enter").click(function(){	
		var logName=$("#logName").val();
		var pwd=$("#pwd").val();
		var companyName=$("#CompanyName").val();
		var floor=$("#floor").val();
		var linkMan=$("#linkMan").val();
		var linkPhone=$("#linkPhone").val();
		alert(logName+"="+pwd+"="+companyName+"="+floor+"="+linkMan+"="+linkPhone)
		//这里的键-值方式是对应 对象的属性和数据库的字段
		var companyUser={"loginName":logName,"pwd":pwd,"companyName":companyName,"floor":floor,"linkMan":linkMan,"linkPhone":linkPhone};
		var json = $.toJSON(companyUser);//将用户封装成json对象
		var url="company/add";
		
		$.ajax({
			type:"POST",
			url:url,
			data:json,
			contentType:"application/json",
			async:true,
			success:function(mydata){				
				alert(mydata.msg);
				
				$('#e').window('close');  
				//company={"loginName":null,"pwd":null,"companyName":null,"floor":null,"linkMan":null,"linkPhone":null,"page":0,"rows":rows};
				shuaxing(company)
			}
		});

	});
	//改变页数触发事件
	$("#select").change(function(){
		//得到当前显示数据行行数		
		var row= $("#select").val();
		rows=parseInt(row);
		alert(rows);
		company={"loginName":null,"pwd":null,"companyName":null,"floor":null,"linkMan":null,"linkPhone":null,"page":0,"rows":rows};
		shuaxing(company);
	});
	
	
	//上一页
	$("#btn3").click(function(){
		var pa=$("#page").text();
		pages=parseInt(pa)-1;		
		page=(pages-1)*rows;		
		company={"loginName":null,"pwd":null,"companyName":null,"floor":null,"linkMan":null,"linkPhone":null,"page":page,"rows":rows};	
		//第几页
		$("#page").html(pages);
		shuaxing(company);
	});
	//下一页
	$("#btn4").click(function(){
		var pa=$("#page").text();
			pages=parseInt(pa)+1;		
			page=(pages-1)*rows;		
			company={"loginName":null,"pwd":null,"companyName":null,"floor":null,"linkMan":null,"linkPhone":null,"page":page,"rows":rows};	
			//第几页
			$("#page").html(pages);
			shuaxing(company);
	});
	
	//首页
	$("#btn2").click(function(){
		alert(5435);
			company={"loginName":null,"pwd":null,"companyName":null,"floor":null,"linkMan":null,"linkPhone":null,"page":0,"rows":rows};	
			//第几页
			$("#page").html(1);
			shuaxing(company);
	});
	
	//尾页
	$("#btn5").click(function(){
		//共多少页
		var wei=$("#totalPage").text();
			page=(parseInt(wei)-1)*rows;		
			company={"loginName":null,"pwd":null,"companyName":null,"floor":null,"linkMan":null,"linkPhone":null,"page":page,"rows":rows};	
			//第几页
			$("#page").html(wei);
			shuaxing(company);
	});
	
	//跳转到多少页
	$("#btn6").click(function(){
		alert(2333)
		var num=$("#tiao").val();	
		page=(parseInt(num)-1)*rows;	
		company={"loginName":null,"pwd":null,"companyName":null,"floor":null,"linkMan":null,"linkPhone":null,"page":page,"rows":rows};
		//第几页
		$("#page").html(num);
		shuaxing(company)
	});
		
	
	//点击一行时要得到数据
	
	var comId=-1; 
	$('#table').datagrid({
		onClickRow: function(rowIndex, rowData){	
			 comId=parseInt(rowData.id);
		}
	});
	
	//点击查看

	$("#chakan").click(function(){
		//alert("查看");
		$.ajax({
			type:"POST",		
			url:"company/select",
			data:{"id":comId},
			dataType:"json",
			async:false,
			success:function(mydata){
				console.log(mydata.floor);
				$('#w').window('open');
				
			}
	
		});
	
		
	});
	//删除一行数据
		$("#delete").click(function(){
			
			alert(comId);
			$.ajax({
				type:"POST",
				url:"company/delete",
				data:{"id":comId},
				dataType:"json",
				async:true,
				success:function(mydata){
					alert(mydata.msg);
					shuaxing(company);
					
				}
			});
			
			
		});
	
	
	
	
	
	
	
});