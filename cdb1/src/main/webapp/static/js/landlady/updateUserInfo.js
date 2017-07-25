$(function(){
	var pwd=$("#oldPassword").val();
	var rex=new RegExp("^[a-zA-Z0-9\u4e00-\u9fa5]{2,}$");
	var rex1=new RegExp("[a-zA-Z0-9]{6,}$");
	var rex2=new RegExp("^[0-9]{11}$");
	var rex3=new RegExp("^[a-zA-Z0-9\uFE30-\uFFA0\u4E00-\u9FA5]{6,}$");
	var reg = /^([a-zA-Z0-9_-])+@([a-zA-Z0-9_-])+(.[a-zA-Z0-9_-])+/
	$("#btn1").click(function(){
		var newPwd=$("#newPwd").val();
		var newPwd1=$("#newPwd1").val()
		var userName=$("#userName").val();
		var realName=$("#realName").val();
		var address=$("#address").val();
		var phone=$("#phone").val();
		var idCard=$("#idCard").val();
		var jobDescribe=$("#jobDescribe").val();
		var email=$("#email").val();
		var msg;
		var id=$("#id").val();
		pwd=$("#oldPassword").val();
		var landlady={id:id,pwd:pwd}
		var json=$.toJSON(landlady);
		var uri="landladys/decidePassword"
		$.ajax({
			type:"POST",
			url:uri,
			data:json,
			contentType:"application/json",
			async:false,
			success:function(data){
				msg=data.msg;
			}
		})
		if(msg=="0"){
			alert("旧密码错误");
			
		}else if(newPwd!=newPwd1){
			alert("两次输入的密码不一致");
		}else if(newPwd==pwd&newPwd1==pwd){
			alert("新密码不能和旧密码一样");
		}else if(rex1.test(newPwd)==false||rex1.test(newPwd1)==false){
			alert("密码必须是6位以上的字母数字构成");
		}else if(rex.test(address)==false){
			alert("地址必须是2位以上的汉字、数字和字母构成");
		}else if(rex2.test(phone)==false){
			alert("电话号码必须是11位的数字构成");
		}else if(rex3.test(jobDescribe)==false){
			alert("职业描述必须超过6个字");
		}else if(reg.test(email)==false){
			alert("电子邮箱格式是xxxx@xxx.com");
		}else{
			var landlady={id:id,pwd:newPwd,userName:userName,realName:realName,address:address,phone:phone,idCard:idCard,jobDescribe:jobDescribe,email:email}
			var json=$.toJSON(landlady);
			var uri="landladys/updateLandlady"
			$.ajax({
				type:"PUT",
				url:uri,
				data:json,
				contentType:"application/json",
				async:false,
				success:function(data){
					alert(data.msg);
					window.location.href="static/jsp/baozupo/LandladyMain.jsp";
				}
			})
		}
		
	})
	
})