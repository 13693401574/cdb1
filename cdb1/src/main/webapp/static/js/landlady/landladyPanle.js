$(function(){
	var id=$("#id").val();
	
	var uri="landladys/login/"+id;
	
	$.ajax({
		type:"GET",
		url:uri,
		async:true,
		success:function(data){
			alert(data.msg);
		}
	})
	
})