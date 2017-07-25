function changeurl(){
	var id=$("#id").val();
	var uri = "landladys/"+id;
	$('#form').prop("action",uri);
	return true;
}

$(function(){
	var carportEquityCode=$("#carportEquityCode").val();
	var carportAddress=$("#carportAddress").val();
	var carportAddressCode=$("#carportAddressCode").val();
	var file=$("#file").val();
	var isExist;
	var rex=new RegExp("^[a-zA-Z0-9\u4E00-\u9FA5]{2,}$");
	var rex1=new RegExp("^[a-zA-Z0-9]$")
	if(carportEquityCode==""||carportEquityCode.length==0){
		$("#isExist").html("※请输入车位产权编号");
		$("#isExist").css("color","red");
	}
	if(carportAddress==""||carportAddress.length==0){
		$("#carportAddress1").html("※请输入小区地址");
		$("#carportAddress1").css("color","red");
	}
	if(carportAddressCode==""||carportAddressCode.length==0){
		$("#carportAddressCode1").html("※请输入小区车位号码");
		$("#carportAddressCode1").css("color","red");
	}
	if(file==""||file.length==0){
		$("#file1").html("※请选择图片");
		$("#file1").css("color","red");
	}
	
	
	$("#carportEquityCode").blur(function(){
		carportEquityCode=$("#carportEquityCode").val();
		
		if(carportEquityCode==""||carportEquityCode.length==0){
			$("#isExist").html("※请输入车位产权编号");
			$("#isExist").css("color","red");
			return;
		}
		var uri="landladys/carportApplicationIsexist/"+carportEquityCode;
		$.ajax({
			type:"GET",
			url:uri,
			async:false,
			success:function(data){
				isExist=data;
				if("1"==data){
					
					$("#isExist").html("×相同的车位不能重复添加申请");
					$("#isExist").css("color","red");
				}else{
					$("#isExist").html("√格式正确");
				}
			}
		})
	})
	$("#carportAddress").blur(function(){
		carportAddress=$("#carportAddress").val();
		if(!rex.test(carportAddress)){
			$("#carportAddress1").html("小区地址必须为2位以上的汉字、字母和数字构成");
			$("#carportAddress1").css("color","red");
		}else{
			$("#carportAddress1").html("√格式正确");
			$("#carportAddress1").css("color","blue");
		}
	})
	$("#carportAddressCode").blur(function(){
		carportAddressCode=$("#carportAddressCode").val();
		if(!rex.test(carportAddressCode)){
			$("#carportAddressCode1").html("小区地址必须为2位以上的汉字、字母和数字构成");
			$("#carportAddressCode1").css("color","red");
		}else{
			$("#carportAddressCode1").html("√格式正确");
			$("#carportAddressCode1").css("color","blue");
		}
	})
	$("#file").blur(function(){
		file=$("#file").val();
		if(file==""||file.length==0){
			$("#file1").html("※请选择图片");
			$("#file1").css("color","red");
		}else{
			$("#file1").html("");
		}
	})
	$("#btn1").click(function(){
		if(isExist!="0"||rex.test(carportAddress)==false||rex.test(carportAddressCode)==false||file==""||file.length==0){
			alert("输入的格式不正确");
			return;
		}
		else{
			$("#btn1").attr("type","submit");
		}
		
	})
})


