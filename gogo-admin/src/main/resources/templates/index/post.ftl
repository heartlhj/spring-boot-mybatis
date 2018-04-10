<!DOCTYPE html>
<html lang="en">

<meta http-equiv="content-type" content="text/html;charset=UTF-8" />

<!-- 不缓存，测试阶段，后面上线可去掉 -->
<META HTTP-EQUIV="Pragma" CONTENT="no-cache"> 
<META HTTP-EQUIV="Cache-Control" CONTENT="no-cache"> 
<META HTTP-EQUIV="Expires" CONTENT="0"> 
<!-- 不缓存，测试阶段，后面上线可去掉 -->

<head>
<#include "index-head.ftl">	
<style type="text/css">
        
  </style>
</head>
<body>

<div class="container">
 <div id="goToTop"><a href="javascript:;">点我回到页面顶部</a></div>
			 <div class="row">
				 <#include "title.ftl">	
			 </div>
			 <div class="div-top">
			 <div class="row" id="divc-top">
				  <div class="col-md-7">
				  	<div >
					        <img height="120" width="652" src="https://ss2.bdstatic.com/70cFvnSh_Q1YnxGkpoWK1HF6hhy/it/u=3180016488,1208322054&fm=27&gp=0.jpg" alt="First slide">
					    </div>
				  </div>
				  <div class="col-md-5">
				  		 <div class="row">
				  		   	<div class="col-md-12">
					  		   <form  role="form" id="form1">
						  		   <div class="row">
						  		   <div class="col-md-12">
									 <div class="form-group">
									    <label for="inputPassword" class="col-sm-5 control-label text-right"">账号：</label>
									    <div class="col-sm-7">
									      <input type="text" class="form-control input-sm" id="name" placeholder="请输入账号" >
									    </div>
									  </div>
									  </div>
									 
								    </div>
								     <div class="row">
								       &nbsp;
								  </div>
								  <div class="row">
								 <div class="col-md-12">
								  
									  <div class="form-group">
									    <label for="inputPassword" class="col-sm-5 control-label text-right"">密码：</label>
									    <div class="col-sm-7">
									      <input type="password" class="form-control input-sm" id="inputPassword" placeholder="请输入密码">
									    </div>
									  </div>
									  </div>
								    </div>
								     <div class="row">
								       &nbsp;
								  </div>
								  <div class="row">
								  <div class="col-md-4">
								  &nbsp;
								  </div>
								   <div class="col-md-5">
									  <div class="form-group">
										  <div class="checkbox">
									        <label>
									          <input type="checkbox">请记住我
									        </label>
									      </div>
									  </div>
									   </div>
								  
									  <div class="col-md-2">
									  <div class="form-group">
									      <button type="submit" class="btn btn-default" onclick="login()">登录</button>
									  </div>
									  </div>
								    </div>
								</form>
				  		     </div>
				  		  </div>
				  		
				  </div>
			 </div>
		
		<div>
	       
	        <HR style="border:1 dashed #987cb9" width="100%" color=#987cb9 SIZE=1>
	        </div> 
	          <div class="row" >
			      <div class="col-xs-6 col-sm-1" 
			         style="background-color: #dedef8;">
			         <p  align="center">&nbsp;</p>
			         <p>楼主</p>
			          <img height="80" width="360" src="/images/user.png" alt="First slide">
			          	<a  align="center">小小鸟</a>
			      </div>
			      <div class="col-xs-6 col-sm-10">
			            <h1>${gogoResource.resourcePath}</h1>
			            
			        	 <h5> <p>
			           ${gogoResource.remark}
			            </p></h5>
			   </div> 
			    
	        </div> 
	        <#if gogoComments??>
                <#list gogoComments as gogoComment>
			      <HR style="border:1 dashed #987cb9" width="100%" color=#987cb9 SIZE=1>
	          <div class="row" >
			      <div class="col-xs-6 col-sm-1" 
			         style="background-color: #dedef8;">
			         <p  align="center">&nbsp;</p>
			         <p>层主</p>
			          <img height="80" width="360" src="/images/user.png" alt="First slide">
			          	<a  align="center">小小小鸟</a>
			      </div>
			      <div class="col-xs-6 col-sm-10">
				<div>发表时间：${gogoComment.cteateTime?datetime}</div>
				<HR width="110%">
			            <h1>${gogoComment.text}</h1>
			            
			        	 <h5> <p>
			           ${gogoResource.remark}
			            </p></h5>
			          <table  height="100">
			          <tr height="70"></tr>
			          <tr>
			              <td width="900"></td>
						<td width="50">Tanmay</td>
						<td width="5%" align="center"><font color="red"><b>|</b></font></td>
					      <td>Bangalore</td>
					      <td width="5%" align="center"><font color="red"><b>|</b></font></td>
					      <td><button type="button" class="btn btn-primary" data-toggle="collapse" 
								data-target="#demo">
							收起回复
						</button></td>
					      </tr>
					</table>
					<div id="demo" class="collapse in">
						Nihil anim keffiyeh helvetica, craft beer labore wes anderson 
						cred nesciunt sapiente ea proident. Ad vegan excepteur butcher 
						vice lomo.
					</div>
			      </div>
			
			      <div class="clearfix visible-xs"></div>
			
			   </div> 
			   </#list>
                </#if>
			   <#assign base=request.contextPath />
			   <div>  
			   <br>
			   <p style='font-size:18px'>评论</p>
			   <form action="${base}/system/comment/save" method="post"  class="pageForm required-validate" onsubmit="return validateCallback(this, dialogAjaxDone);">
				<input type="hidden"  class="form-control" name="userId"  value="">
				<input type="hidden"  class="form-control" name="resourceId" value="${gogoResource.id}">
				 <div>
				   	<textarea rows="5"  class="form-control" placeholder="备注" style="overflow-y:scroll;resize:none;" name="text"></textarea>
				     </div>
				 <br>
				 <br>
			 		  <div class="formBar">
			            <ul>
			                <li><div class="buttonActive"><div class="buttonContent"><button type="submit">保存</button></div></div></li>
			            </ul>
			        </div>
			 	 </div>
			   </form>
			   </div> 
			 <div id="footer">
				Copyright &copy; 2015- <span id="year"></span>
				<a href="http://www.roncoo.com" target="_blank">gogo畅游</a> 粤ICP备16009964号
				<script language="javascript">var now=new Date();document.getElementById("year").innerHTML = now.getFullYear();</script>
			</div>  
    </div>  
    
</body>
<script>
  // 编写jQuery返回顶部插件
    jQuery.fn.goToTop = function(){
        
        // 判断如果窗口滚动距离小于0，隐藏按钮
        if($(window).scrollTop() < 0){
            $('#goToTop').hide();
        }

        // 窗口滚动时，判断当前窗口滚动距离
        $(window).scroll(function(){
            if($(this).scrollTop() > 1){
                $('#goToTop').fadeIn();
            }else{
                $('#goToTop').fadeOut();
            }
        });

        // 给这个按钮绑定一个click事件
        this.bind('click',function(){
            $('html ,body').animate({scrollTop: 0},500);
            return false;
        });
    };

    //调用这个插件
    $(function(){
        $('#goToTop').goToTop();
    });
</script>
</html>
