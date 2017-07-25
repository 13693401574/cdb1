$(function(){
	
	$('#insert').click(function(){
		
		var user= {id:"",userName:"张三",loginName:"zs",password:"123456"};
		var json = $.toJSON(user);//将user封装成json对象
		var url = "users/0";
		$.ajax({
			
			type:"POST",
			url:url,
			data:json,
			contentType:"application/json",
			async:true,
			success:function(data){
				alert(data.state);
				alert(data.msg);
			}
		});
		
	});
	
$('#update').click(function(){
		
		var user= {userName:"李四",loginName:"ls",password:"123456"};
		var id = "1";
		var json = $.toJSON(user);
		var url = "users/"+id;
		$.ajax({			
			type:"PUT",
			url:url,
			data:json,
			contentType:"application/json",
			async:true,
			success:function(data){
				alert(data.state);
				alert(data.msg);
			}
		});
		
	});

$('#delete').click(function(){
	
	var id = "1";
	var url = "users/"+id;
	$.ajax({
		type:"DELETE",
		url:url,
		async:true,
		success:function(data){
			alert(data.state);
			alert(data.msg);
		}
	});
	
});
	
$('#query').click(function(){
	var userName = "张三";
	var url = "users/" + userName;
	
	$.ajax({
		type:"GET",
		url:url,
		async:true,
		contentType:"text/json;charset=UTF-8",
		success:function(data){
			alert(data.loginName);
			alert(data.password);
		}
	});
	
	
	
	
});
	
	
	
});