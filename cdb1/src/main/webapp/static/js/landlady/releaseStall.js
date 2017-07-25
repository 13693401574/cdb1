$(function(){
	var fkLandladyId=$("#id").val();
	var carportAddress;
	function getData(){
		var uri="landladys/"+fkLandladyId;
		var str="";
		var str1=""
		$.ajax({
			type:"GET",
			url:uri,
			async:true,
			success:function(data){
				for(var i=0;i<data.length;i++){	
					str+="<option>"+data[i]+"</option>";	
				}
				$("#address").html(str);
			}
		});
	}
	getData();
	var id;
	$("#address").change(function(){
		carportAddress=$(this).val();
		var publicMap={page:1,rows:1,fkLandladyId:fkLandladyId,carportAddress:carportAddress};
		var json = $.toJSON(publicMap);
		var uri="landladys/showCarportAddress";
		var str="";
		$.ajax({
			type:"POST",
			url:uri,
			data:json,
			contentType:"application/json",
			async:false,
			success:function(data){
				for(var i=0;i<data.length;i++){	
					str+="<option value="+data[i].id+">"+data[i].carportAddressCode+"</option>";	
				}
				$("#code").html(str);
			}
		});
	})
	
	$("#btn1").click(function(){
		id=$("#code").val();
		var address=$("#address").val();
		var startTime=$("#startTime").datebox("getValue");
		var endTime=$("#endTime").datebox("getValue");
		var price=$("#price").val();
		if(id==null){
			alert("请选择所在小区");
		}else if(address==null){
			alert("请选择小区车位编号");
		}else if(startTime==""||startTime.length==0){
			alert("请选择租赁开始时间");
		}else if(endTime==""||endTime.length==0){
			alert("请选择租赁结束时间");
		}else if(price==""||price.length==0){
			alert("请输入价格");
		}else{
			var uri = "landladys/fkCarportApplicationId/"+id;
			$("#btn1").attr("type","submit");
			$('#form').prop("action",uri);
		}
	})
})