
function winOnload(currPage, pageSize){
	debugger;
	var url = "/system/topRes"
	var params = {};
	var gogoResource = {};
	gogoResource.currentPage = currPage;
	gogoResource.numPerPage = pageSize;
	params.params=gogoing.ToJson(gogoResource);
	InvokeMethodAsyn(url,params,function(msg){
		debugger;
		if(msg!=null){
			var resource = msg.root;
			var list="";
			var listTable="<thead><tr><th>资源名称</th><th>创建时间</th><th>点击量</th> </tr> </thead> <tbody>";
			//加载我的审批
			for (var i=0;i<resource.length;i++){
				if(i<6){
					var title =	resource[i].resourceType+ "-"+resource[i].resourceName;
					  list +="<li id="+resource[i].id+" style='color:#EE1B2E;font-size:18px;'><a href='javascript:ruizhi.includes.index_head.myTaskClick(\""+resource[i].id+"\")'>"+title+"</a></li>";
					 
				}
				 listTable +="<tr onclick='post("+resource[i].id+")'>" +
			  		"<td><a href='/index/posts?id="+resource[i].id+"'>"+resource[i].resourceName+"</td>" +
			  		"<td>"+resource[i].createTime+"</a></td>" +
			  		"<td>"+resource[i].click+"</td>" +
			  		"</tr>"
			}
			debugger;
			listTable +="</tbody>";
			document.getElementById('ul-resList').innerHTML = list;
			document.getElementById('realTime_Table').innerHTML = listTable;
			$("#pagination").whjPaging("setPage", msg.page, msg.total);
			
		}
		
	});
	
}
function winBookloadClick(){
	winBookload(1, 5);
}
function winBookload(currPage, pageSize){
	debugger;
	var url = "/system/qryBookItList"
	var params = {};
	var gogoResource = {};
	gogoResource.currentPage = currPage;
	gogoResource.numPerPage = pageSize;
	params.params=gogoing.ToJson(gogoResource);
	InvokeMethodAsyn(url,params,function(msg){
		debugger;
		if(msg!=null){
			var resource = msg.root;
			var list="";
			var listTable="<thead><tr><th>名称</th><th>城市</th><th>邮编</th> </tr> </thead> <tbody>";
			//加载我的审批
			for (var i=0;i<resource.length;i++){
				if(i<6){
					var title =	resource[i].resourceType+ "-"+resource[i].resourceName;
					  list +="<li id="+resource[i].id+" style='color:#F00;font-size:18px;'><a href='javascript:ruizhi.includes.index_head.myTaskClick(\""+resource[i].id+"\")'>"+title+"</a></li>";
					 
				}
				 listTable +="<tr onclick='post("+resource[i].id+")'>" +
			  		"<td>"+resource[i].resourceType+"</td>" +
			  		"<td><a href='/index/posts?id="+resource[i].id+"'>"+resource[i].resourceName+"</a></td>" +
			  		"<td>"+resource[i].resourceType+"</td>" +
			  		"</tr>"
			}
			debugger;
			listTable +="</tbody>";
			//document.getElementById('ul-resList').innerHTML = list;
			document.getElementById('book_tables').innerHTML = listTable;
			$("#pagination1").whjPaging("setPage", msg.page, msg.total);
			
		}
		
	});
	
}



//
winOnload(1, 5);
//winBookload(1, 5);
function login() {
	 debugger;
     $.ajax({
     //几个参数需要注意一下
         type: "POST",//方法类型
         dataType: "json",//预期服务器返回的数据类型
         url: "/users/login" ,//url
         data: $('#form1').serialize(),
         success: function (result) {
             console.log(result);//打印服务端返回的数据(调试用)
             if (result.resultCode == 200) {
                 alert("SUCCESS");
             }
             ;
         },
         error : function() {
             alert("异常！");
         }
     });
 }

function movicload(currPage, pageSize){
	debugger;
	var url = "/system/topRes"
	var params = {};
	var gogoResource = {};
	gogoResource.currentPage = currPage;
	gogoResource.numPerPage = pageSize;
	params.params=gogoing.ToJson(gogoResource);
	InvokeMethodAsyn(url,params,function(msg){
		debugger;
		if(msg!=null){
			var resource = msg.root;
			var list="";
			var listTable="<thead><tr><th>名称</th><th>城市</th><th>邮编</th> </tr> </thead> <tbody>";
			//加载我的审批
			for (var i=0;i<resource.length;i++){
				if(i<6){
					var title =	resource[i].resourceType+ "-"+resource[i].resourceName;
					  list +="<li id="+resource[i].id+" style='color:#F00;font-size:18px;'><a href='javascript:ruizhi.includes.index_head.myTaskClick(\""+resource[i].id+"\")'>"+title+"</a></li>";
					 
				}
				 listTable +="<tr onclick='post("+resource[i].id+")'>" +
			  		"<td>"+resource[i].resourceType+"</td>" +
			  		"<td><a href='/index/posts?id="+resource[i].id+"'>"+resource[i].resourceName+"</a></td>" +
			  		"<td>"+resource[i].resourceType+"</td>" +
			  		"</tr>"
			}
			debugger;
			listTable +="</tbody>";
			document.getElementById('ul-resList').innerHTML = list;
			document.getElementById('realTime_Table').innerHTML = listTable;
			$("#pagination").whjPaging("setPage", msg.page, msg.total);
			
		}
		
	});
	
}

 function post(){
	 		debugger;
	 		var url = "/index/redirectIndex"
			var params = {};
			var gogoResource = null
			params.params=gogoResource;
			InvokeMethod(url,params);
 }
	/* 远程方法调用--未测试  */
function InvokeMethod(url,paramObj){
		var ret = null;
		$.ajax({
			url : url,
			type: 'POST', 
			async : false,
			data : paramObj,
			dataType: 'json',
			success : function(msg) {
				debugger;
				if(!gogoing.IsNull(msg)){
					if(msg.returnCode == '999'){//后台抛出异常
						if(!gogoing.IsNull(msg.returnMsg)){
							gogoing.Alert(msg.returnMsg);
						}else{
							gogoing.Alert("操作失败");
						}
					}else if(msg.returnCode == '1000'){
						gogoing.Alert("操作成功");
					}
					if(gogoing.IsNull(msg.returnData)){//兼容以前代码外面并没有套处理结果DealResult那一层
						ret = msg;
					}else{
						ret = msg.returnData;
					}
				}
			}
			

		});
		return ret;
	}
	
	/* 远程方法调用--未测试  */
function InvokeMethodAsyn(url,paramObj,fn){
		$.ajax({
			url : url,
			type: 'POST', 
			async : true,
			data : paramObj,
			dataType: 'json',
			success : function(msg) {
				debugger;
				if(!gogoing.IsNull(msg)){
					if(msg.returnCode == '999'){//后台抛出异常
						if(!gogoing.IsNull(msg.returnMsg)){
							gogoing.Alert(msg.returnMsg);
						}else{
							gogoing.Alert("操作失败");
						}
					}else if(msg.returnCode == '1000'){
						gogoing.Alert("操作成功");
					}
					if(fn!=null){
						if(gogoing.IsNull(msg.returnData)){//兼容以前代码外面并没有套处理结果DealResult那一层
							fn(msg);
						}else{
							fn(msg.returnData);
						}
					}
				}
			}

		});
	}
	
