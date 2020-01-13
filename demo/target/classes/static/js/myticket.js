$.ajax({
	type:"get",
	url:"/test01",
	async:true,
	dataType:"json",
	success:function(fb){

		if(fb.tickets.length==0){
			$("body").append("<div class='couponBox have_none'>暂无优惠券</div>");
		}else{
			for(var i=0;i<fb.tickets.length;i++){
                $("body").append("<div class='couponBox'><div class='coupon'><span>"+fb.tickets[i].cash+"</span>元 <span class='tickets_number'>X"+fb.tickets[i].number+"张</span></div></div>");
			}

		}
	},
  
});