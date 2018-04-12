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
</head>

<body>

    <div class="container">
        <h1>Twitter bootstrap tutorial</h1>
        <nav class="navbar navbar-inverse">
            <div class="navbar-collapse">
                <ul class="nav navbar-nav">
                    <li class="active"><a href="#">Home</a></li>
                    <li><a href="left.ftl">Page One</a></li>
                    <li><a href="#">Page Two</a></li>
                </ul>
            </div>
        </nav>
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
            <img alt="300x200" src="https://timgsa.baidu.com/timg?image&quality=80&size=b9999_10000&sec=1516814304735&di=d57dc3a7ed3bcb679212ba0495416ecc&imgtype=0&src=http%3A%2F%2Fpic.58pic.com%2F58pic%2F12%2F56%2F79%2F31658PICudw.jpg" alt="First slide">
        </div>
        <div class="item">
            <img alt="30x20" src="https://timgsa.baidu.com/timg?image&quality=80&size=b9999_10000&sec=1516814304736&di=e9a7e74f24d41c063671af385f4d7b7a&imgtype=0&src=http%3A%2F%2Fpic1.win4000.com%2Fwallpaper%2F4%2F5913c6a7a3752.jpg%3Fdown" alt="Second slide">
        </div>
        <div class="item">
            <img alt="12x40" src="https://timgsa.baidu.com/timg?image&quality=80&size=b9999_10000&sec=1516814304740&di=275d545d385f44631bb7dbafd671e094&imgtype=0&src=http%3A%2F%2Fimg.article.pchome.net%2F00%2F57%2F54%2F66%2Fpic_lib%2Fwm%2Fm7.jpg" alt="Third slide">
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


</body>
<script>

</script>
</html>
