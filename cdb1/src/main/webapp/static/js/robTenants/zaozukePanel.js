$(function(){
	var id=$("#id").val();
	
	var uri="robTenants/login/"+id;
	
	$.ajax({
		type:"GET",
		url:uri,
		async:true,
		success:function(data){
			alert(data.msg);
		}
	})
	
})