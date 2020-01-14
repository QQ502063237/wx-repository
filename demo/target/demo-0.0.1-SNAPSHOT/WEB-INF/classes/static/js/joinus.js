//电话号码校验
var phone_check=function(){
	var value=$("#phone_number").val();
	if($("#phone_number").val()==""){
		$("#phone_number_error").text("**请输入您的联系方式**");
		$("#phone_number_error").show();
	}else if(value.length!=11||value%1!=0||!(value.startsWith("13")||value.startsWith("14")||value.startsWith("15")||value.startsWith("17")||value.startsWith("18"))){
		$("#phone_number").val("");
		$("#phone_number_error").text("**输入有误,请重新输入**");
		$("#phone_number_error").show();
	}else{
		$("#phone_number_error").hide();
	}
}
$("#phone_number").change(phone_check);
//点击确定之后的名字验证
$("#join_us_button").click(function(){
	if($("#joinner_name").val()==""){
		$("#joinner_name_error").show();
	}else{
		$("#joinner_name_error").hide();
	}
	phone_check();
	//如果全都填写正常
	if($("#joinner_name_error").css("display")=="none"&&$("#phone_number_error").css("display")=="none"){
		/*ajax发送请求，而后停止按钮，并且通知用户*/
		$.ajax({
			type:"post",
			url:"",
			async:true,
			data:{"name":$("#joinner_name").val(),"phoneNumber":$("#phone_number").val()},
			success:function(fb){
				$("#join_us_button").prop("disabled","disabled");
				$("#join_us_button").text("您已经成功申请，请静待联系");
			}
		});
		
		/*test,临时测试用*/
		$("#join_us_button").prop("disabled","disabled");
		$("#join_us_button").text("您已经成功申请，请静待联系");
		
		
		
		
	};
})
//名字改变之后的校验
$("#joinner_name").change(function(){
	if($("#joinner_name").val()==""){
		$("#joinner_name_error").show();
	}else{
		$("#joinner_name_error").hide();
	}
})