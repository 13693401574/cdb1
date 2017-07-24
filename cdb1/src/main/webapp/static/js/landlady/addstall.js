function changeurl(){
	var id=$("#id").val();
	var uri = "landladys/"+id;
	$('#form').prop("action",uri);
	return true;
}

$(function(){
//	var carportEquityCode=$("#carportEquityCode").val();
	alert("carportEquityCode");
//	var uri="landladys/"+carportEquityCode;
//	$.ajax({
//		type:"GET",
//		url:uri,
//		async:false,
//		success:function(data){
//			
//		}
//	})
});


