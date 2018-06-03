<!DOCTYPE html>
<html lang="en">

<meta http-equiv="content-type" content="text/html;charset=UTF-8" />



<head>
<#include "index-head.ftl">	
<style type="text/css">
        
  </style>
  <script type="text/javascript" src="/jquery/index.js"></script>
</head>
<meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1">
<body>

<div class="container">
 <div id="goToTop"><a href="javascript:;">点我回到页面顶部</a></div>
			 <div class="row">
				 <#include "title.ftl">	
			 </div>
		<hr>
			 <div class="row">
		         <div class="col-md-8">
				<nav class="navbar navbar-default" role="navigation">
				    <div class="container-fluid">
					    <div class="navbar-header">
					        <a class="navbar-brand" href="#">模块分类</a>
					    </div>
					      <div>
				       	 <ul class="nav navbar-nav">
				            <li class="active"><a href="#">资源区</a></li>
				            <li><a href="#">讨论组</a></li>
				        </ul>
		            </li>
		        </ul>
				    </div>
			    </div>
			</nav>
			</div>
         <div class="col-md-4">
			 <nav class="navbar navbar-default" role="navigation"> 
			    <div class="container-fluid"> 
			        <div class="navbar-header"> 
			            <a class="navbar-brand" href="#">系统通告</a> 
			        </div> 
			    </div> 
			</nav>
			</div>
		</div>
        <div class="row">
         <div class="col-md-4" id="boack" height="100">
	            <div id="myCarousel" class="carousel slide">
					<!-- 轮播（Carousel）指标 -->
					<ol class="carousel-indicators">
					    <li data-target="#myCarousel" data-slide-to="0" class="active"></li>
					    <li data-target="#myCarousel" data-slide-to="1"></li>
					    <li data-target="#myCarousel" data-slide-to="2"></li>
					</ol>   
					<!-- 轮播（Carousel）项目 -->
					<div class="carousel-inner">
					    <div class="item active">
					        <img height="100" width="360" src="https://ss2.bdstatic.com/70cFvnSh_Q1YnxGkpoWK1HF6hhy/it/u=3180016488,1208322054&fm=27&gp=0.jpg" alt="First slide">
					    </div>
					    <div class="item">
					        <img height="100" width="360" src="https://timgsa.baidu.com/timg?image&quality=80&size=b9999_10000&sec=1516814304736&di=e9a7e74f24d41c063671af385f4d7b7a&imgtype=0&src=http%3A%2F%2Fpic1.win4000.com%2Fwallpaper%2F4%2F5913c6a7a3752.jpg%3Fdown" alt="Second slide">
					    </div>
					    <div class="item">
					        <img height="100" width="360" src="https://timgsa.baidu.com/timg?image&quality=80&size=b9999_10000&sec=1516814304740&di=275d545d385f44631bb7dbafd671e094&imgtype=0&src=http%3A%2F%2Fimg.article.pchome.net%2F00%2F57%2F54%2F66%2Fpic_lib%2Fwm%2Fm7.jpg" alt="Third slide">
					    </div>
					</div>
					<!-- 轮播（Carousel）导航 -->
					<a class="carousel-control left" href="#myCarousel" 
					    data-slide="prev">&lsaquo;
					</a>
					<a class="carousel-control right" href="#myCarousel" 
					    data-slide="next">&rsaquo;
					</a>
				</div>
			 </div>
            <div class="col-md-4" id="boack" height="100">
	        	<ul class="nav nav-pills" role="tablist">
				  <li class="active"><a href="#">最新</a>
				  </li>
				  <li><a href="#">点击量最多</a></li>
				</ul>
				   <ol id="ul-resList">
					  <li>Item 1</li>
					  <li>Item 2</li>
					  <li>Item 3</li>
					  <li>Item 4</li>
					</ol>
            </div>
            <div class="col-md-4" id="boack" height="100">
           
                <h5>asdfadsfaasdfasdf
                    阿斯顿发的事发adfasdf都发生地方阿斯顿发撒的发生到付asdfasdfa阿斯顿发撒的发爱的色放
                    asdfasdfa爱的色放阿斯顿发asdfasdfa爱的色放爱迪生法定 沙发电视发生的发生的f</h5>
                <div class="row">
                    <!--如果是字母，这里的换行是以空格来换行的，如果是一串字母的话 就不会换行-->
                    <!--如果是汉字，这里的换行是汉字来换行的-->
                    <div class="span20">我们是网格布局下的嵌套布局</div>
                    <div class="span2">我们是网格布局下的嵌套布局</div>
                </div>
            </div>
        </div>
        <hr>
     	<div class="row">
			<ul class="nav nav-pills" role="tablist">
				  <li class="active"><a href="#dman_Table"  onclick="winOnload()" data-toggle="tab">教学视频</a></li>
				  <li><a href="#movie_Table" data-toggle="tab">电影</a></li>
				  <li><a href="#book_Table" onclick="winBookloadClick()" data-toggle="tab">书籍</a></li>
				  <li><a href="#">里番</a></li>
				</ul>
		 </div>
		  <hr>
		<div class="tab-content">
			<div class="tab-pane active" id="dman_Table">
				<table class="table table-striped"  id="realTime_Table">
				</table>
				<div id="pagination" class="pagination"></div>
			</div>
			
			<#include "movieTable.ftl">	
			
			<div class="tab-pane" id="book_Table">
				<table class="table table-striped" id= "book_tables">
				</table>
				<div id="pagination1" class="pagination"></div>
			</div>
			
	     </div>
	     	<div id="footer">
				Copyright &copy; 2015- <span id="year"></span>
				<a href="http://www.roncoo.com" target="_blank">龙果学院</a> 粤ICP备16009964号
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
    
     $("#pagination").whjPaging({
            pageSizeOpt: [
                {'value': 5, 'text': '5条/页', 'selected': true},
                {'value': 10, 'text': '10条/页'},
                {'value': 15, 'text': '15条/页'},
                {'value': 20, 'text': '20条/页'}
            ],
            totalPage: 5,
            showPageNum: 5,
            firstPage: '首页',
            previousPage: '上一页',
            nextPage: '下一页',
            lastPage: '尾页',
            skip: '跳至',
            confirm: '确认',
            refresh: '刷新',
            totalPageText: '共{}页',
            isShowFL: true,
            isShowPageSizeOpt: true,
            isShowSkip: true,
            isShowRefresh: true,
            isShowTotalPage: true,
            isResetPage: false,
            callBack: function (currPage, pageSize) {
                winOnload(currPage, pageSize);
            }
        });
        
          $("#pagination1").whjPaging({
             css: 'css-3',
            totalPage: 18,
            callBack: function (currPage, pageSize) {
               winBookload(currPage, pageSize);
            }
        });
   
</script>
</html>
