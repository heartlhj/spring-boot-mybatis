<nav class="navbar navbar-default" role="navigation">
		    <div class="container-fluid">
			    <div class="navbar-header">
			        <a class="navbar-brand" href="#">gogo畅游</a>
			    </div>
			      <div>
		       	 <form class="navbar-form navbar-right" role="search">
			           
			            <div class="form-group">
			                <input type="text" class="form-control" placeholder="Search">
			            </div>
			             <button type="submit" class="btn btn-default">
			                    搜索
			            </button>
			        </form>
		    </div>
	    </div>
	</nav>
<FORM id=Form1 name=Form1  method=post>
<table border="0" width="100%" height="9" cellspacing="0" cellpadding="0">
  <tr>
    <td width="20%" height="19" bgcolor="#0965CA">
    <table border="0" width="100%" cellspacing="0" cellpadding="0">
      <tr>
        <td width="15%" align="center"><font color="#FFFFFF"><b>|</b></font></td>
        <td width="70%" align="center">
        <FONT color=#0033cc>
            <b>
            <SCRIPT language=JavaScript>
										
										tmpDate = new Date();
										date = tmpDate.getDate();
										month= tmpDate.getMonth() + 1 ;
										year=tmpDate.getFullYear();   
										document.write(year);
										document.write("年");
										document.write(month);
										document.write("月");
										document.write(date);
										document.write("日 ");

										myArray=new Array(6);
										myArray[0]="星期日"
										myArray[1]="星期一"
										myArray[2]="星期二"
										myArray[3]="星期三"
										myArray[4]="星期四"
										myArray[5]="星期五"
										myArray[6]="星期六"
										weekday=tmpDate.getDay();
										if (weekday==0 | weekday==6)
										{
										document.write(myArray[weekday])
										}
										else
										{document.write(myArray[weekday])
										};
										
										</SCRIPT>
            </b>
            </FONT></td>
        <td width="15%" align="center"><font color="#0033cc"><b>|</b></font></td>
      </tr>
    </table>
    
    <td width="16%" height="19" bgcolor="#0965CA">
    <table cellSpacing="2" height="19" cellPadding="0" width="100%" border="0" ><tr><td valign="top">
    <b><font color="#0033cc">欢迎您!&nbsp;&nbsp;&nbsp;<span id="menu_userName"></span></font></b>
    </td></tr></table>
    </td>
    <td width="46%" height="19" bgcolor="#0965CA">　</td>
    <td width="18%" height="19" bgcolor="#0965CA" align="center">
      <table border="0" width="100%" cellspacing="0" cellpadding="0">
        <tr>
          <td width="100%" align="center">
          <A href="/index/main" target="_top"><font color="#0033cc"><b>返回首页</b></font></a>
          <font color="#0033cc"><b>|</b></font>
          <A href="/logout"   target="_top"> <font color="#0033cc"><b>重新登录</b></font></A>
          </td>
        </tr>
      </table>
    </td>
  </tr>
</table>
</FORM>

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
					  		   <form  role="form" id="form1" method="post" >
						  		   <div class="row" id="remessage">
						  		    &nbsp;
						  		   </div>
						  		   <div class="row">
						  		   <div class="col-md-12">
									 <div class="form-group">
									    <label for="inputPassword" class="col-sm-5 control-label text-right"">账号：</label>
									    <div class="col-sm-7">
									      <input type="text" class="form-control input-sm" id="userName" name= "userName" placeholder="请输入账号" >
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
									      <input type="password" class="form-control input-sm" id="userPassword" name= "userPassword" placeholder="请输入密码">
									    </div>
									  </div>
									  </div>
								    </div>
								     <div class="row">
								       &nbsp;
								  </div>
								 
								</form>
								 <div class="row">
								  <div class="col-md-4">
								  &nbsp;
								  </div>
								   <div class="col-md-4">
									  <div class="form-group">
										  <div class="checkbox">
									        <label>
									          <input type="checkbox" id= "checkbox" name = "checkbox">请记住我
									        </label>
									      </div>
									  </div>
									   </div>
								  
									  <div class="col-md-2">
										  <div class="form-group">
										      <button type="submit" class="btn btn-primary" onclick="login()">登录</button>
										  </div>
									  </div>
									  <div class="col-md-2">
										   <div class="form-group">
											  <button class="btn btn-default" data-toggle="modal" data-target="#myModalRegist">
												注册
											 </button>
										 </div>
									  </div>
								    </div>
				  		     </div>
				  		  </div>
				  		
				  </div>
			 </div>
		</div>
		 <#include "regist.ftl">
