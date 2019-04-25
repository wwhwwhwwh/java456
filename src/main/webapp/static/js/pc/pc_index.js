


$(function(){
	
	var base_module_list = $(".base_module");
	console.log(base_module_list.size());
	
	for(var i=0;i<base_module_list.size();i++){
		var blogFenLeiId = $(base_module_list).eq(i).attr("blogFenLeiId");
		
		var temp_str = getJsonByblogFenLeiId(blogFenLeiId);
		
		$(base_module_list).eq(i).find(".m-tab-content ul").append(temp_str)
		
		console.log(blogFenLeiId);
	}
});

//根据blogFenLeiId 拿 内容
function getJsonByblogFenLeiId(blogFenLeiId){
	var rows = 10;
	var html_text = "" ;
	
	$.ajax({
	       type:"POST", 
	       url:"/index_base_module?blogFenLeiId="+blogFenLeiId+"&rows="+rows, 
	       async:false,
	       dataType:"json", 
	       success:function(result){
	    	   
    	   for(var i=0;i<result.length;i++){
	   			html_text = html_text +'<li><i></i><span>'+result[i].createDateTime+'</span><a href="/a/blog/get?id='+result[i].id+'" title="'+result[i].title+'">'+result[i].title+'</a></li>';
	   		}
	   		
	      }
	});
	
	return html_text;
	
}