<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="tag" tagdir="/WEB-INF/tags" %>
<!DOCTYPE html>

<head>
    <title>HOME</title>
</head>

<tag:main>
	<jsp:include page="/view/component/header.jsp"></jsp:include>
    <main class="home-wrap">
        <div id="myCarousel" class="carousel slide home-imgs" data-ride="carousel"  data-interval="15000">
            <!-- Indicators -->
            <ol class="carousel-indicators">
                <li data-target="#myCarousel" data-slide-to="0" class="active"></li>
                <li data-target="#myCarousel" data-slide-to="1"></li>
                <li data-target="#myCarousel" data-slide-to="2"></li>
            </ol>
      
            <!-- Wrapper for slides -->
            <!-- 새로고침하면 랜덤으로 새로운 이미지가 나온다 -->
            <div class="carousel-inner">
           
                <div class="item active">
                    <video type="video/mp4" src="${pageContext.request.contextPath }/media/nike_video.mp4" width="1920" muted loop autoplay></video>
                    <div class="carousel-caption">
                    </div>
                </div>
            
                <div class="item">
                     <video type="video/mp4" src="${pageContext.request.contextPath }/media/team_video.mp4" width="1920" muted loop autoplay></video>
                    <div class="carousel-caption">
                    </div>
                </div>
            
                <div class="item">
                    <img src="https://picsum.photos/1920/1200?random=1" alt="picsum random image" style="width:100%;">
<%--                     <video type="video/mp4" src="${pageContext.request.contextPath }/media/team4.mp4" width="1920" muted loop autoplay></video> --%>
                    <div class="carousel-caption">
                    </div>
                </div>
            
            </div>
      
            <!-- Left and right controls -->
            <a class="left carousel-control" href="#myCarousel" data-slide="prev">
                <span class="glyphicon glyphicon-chevron-left"></span>
                <span class="sr-only">Previous</span>
            </a>
            <a class="right carousel-control" href="#myCarousel" data-slide="next">
                <span class="glyphicon glyphicon-chevron-right"></span>
                <span class="sr-only">Next</span>
            </a>
        </div>
    </main>
    
<%@ include file="/view/component/footer.jsp"%>
</tag:main>
