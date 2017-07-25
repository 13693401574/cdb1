
$(function(){
	
	$("#button").click(function(){
		var name=$("#studentName").val();
		var claName=$("#cla").val();
		var SC={"studentName":name,"className":claName};
		var json=$.toJSON(SC);
		$.ajax({
			type:"post",
			url:"addStudent/add",
			data:json,
			contentType:'application/json;charset=UTF-8',//关键是要加上这行
			dataType:"json",
			async:true,
			success:function(mydata){
				alert(mydata);

				var stu="<tr><td>"+mydata.student.id+"</td><td>"+mydata.student.studentName+"</td><td>"+mydata.classes.className+"</td></tr>"
				
				$("#table").append(stu);
			}
		});
	});
	$("#select").click(function(){
		var id=1;
		var json=$.toJSON(id);//将id转换成json对象
		$.ajax({
			type:"POST",
			url:"addStudent/getSutdentById",
			data:json,
			contentType:"application/json",
			async:true,
			success:function(data){
				alert(data.cla.className)
				alert(data.studentName);
			}
		});
	});
	var pageNumber=1;
	var pageSize=5;
	
	page(pageNumber,pageSize)

	$("#stu").click(function(){
		
		function page(pageNumber,pageSize){

		var id=1;
		var p={id:1,number:pageNumber,size:pageSize}
		var json=$.toJSON(p);//将id转换成json对象		
		$.ajax({
			type:"POST",
			url:"addStudent/stu",
			data:json,
			contentType:"application/json",
			async:true,
			success:function(mydata){				
				alert(mydata);		
				alert(mydata.length);
				for(var j=0;j<mydata.length;j++){				
	/*					alert(mydata[j].id);
					var a=[{
							'id': mydata[j].id,   
						    'studentName': mydata[j].studentName,
						    'calssName':mydata[j].className
						}]	*/
					//apppendRow添加行一行的数据
					$('#table').datagrid('appendRow',{
						id: mydata[j].id,
						studentName: mydata[j].studentName,
						calssName: mydata[j].className
				});
					//loadData载入本地数据，旧记录将被移除。
					/*$("#table").datagrid('loadData',a);*/					
					}	
			}

		});
		}
	});
	
	$('#table').datagrid({		
		
		 pageSize: 5,
		 pageList: [5, 10, 15, 20, 30],
	     columns:[[
	            {field:'id',title:'学生编号',width:100,align:'center'},
	            {field:'studentName',title:'学生姓名',width:100,align:'center'},
	            {field:'calssName',title:'班级名称',width:100,align:'center'}
	       ]] ,
	       idField:'id',
	       loadMsg:'Processing, please wait …'    
	}); 	
	$('#table').datagrid('reload');
	
	
	
	$('#page').pagination({

	    total:2000,   
	    pageSize:5,
	    pageList: [5, 10, 15, 20, 30],
	    onSelectPage: function(pageNumber, pageSize){   
            $('#content').panel('refresh', 'show_content.php?page='+pageNumber);   
        }
	});  

});