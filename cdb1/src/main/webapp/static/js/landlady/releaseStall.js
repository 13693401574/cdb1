



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
				console.log(data);
				for(var i=0;i<data.length;i++){	
					str+="<option value="+data[i].id+">"+data[i].carportAddressCode+"</option>";	
				}
				
				$("#code").html(str);
			}
		});
//		alert($("#code").val());
		
	})
	
	$("#btn1").click(function(){
		id=$("#code").val();
		var uri = "landladys/fkCarportApplicationId/"+id;
		$('#form').prop("action",uri);
	})
	
})