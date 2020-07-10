<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%
    /*获取工程路径*/
    String path = request.getContextPath();
    request.setAttribute("PATH", path);
%>
<!DOCTYPE html>
<html lang="zh-CN">
<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>高校在线学习平台</title>
    <link rel="stylesheet" href="${PATH}/css/remodal.css">
    <link rel="stylesheet" href="${PATH}/css/remodal-default-theme.css">
    <link rel="stylesheet" href="${PATH}/css/monokai-sublime.min.css">
    <link rel="stylesheet" href="${PATH}/css/bootstrap.min.css">
    <link rel="stylesheet" href="${PATH}/css/katex.min.css">
    <link rel="stylesheet" href="${PATH}/css/video-js.min.css">
    <script type="text/javascript" src="${PATH}/js/jquery.min.js"></script>
    <script type="text/javascript" src="${PATH}/js/remodal.min.js"></script>
    <script type="text/javascript" src="${PATH}/js/slider.js"></script>
    <link rel="stylesheet" href="${PATH}/css/styles.css?=2016121272249">

    <style>
        .flexslider {
            margin: 0px auto 20px;
            position: relative;
            width: 100%;
            height: 482px;
            overflow: hidden;
            zoom: 1;
        }

        .flexslider .slides li {
            width: 100%;
            height: 100%;
        }

        .flex-direction-nav a {
            width: 70px;
            height: 70px;
            line-height: 99em;
            overflow: hidden;
            margin: -35px 0 0;
            display: block;
            background: url(images/ad_ctr.png) no-repeat;
            position: absolute;
            top: 50%;
            z-index: 10;
            cursor: pointer;
            opacity: 0;
            filter: alpha(opacity=0);
            -webkit-transition: all .3s ease;
            border-radius: 35px;
        }

        .flex-direction-nav .flex-next {
            background-position: 0 -70px;
            right: 0;
        }

        .flex-direction-nav .flex-prev {
            left: 0;
        }

        .flexslider:hover .flex-next {
            opacity: 0.8;
            filter: alpha(opacity=25);
        }

        .flexslider:hover .flex-prev {
            opacity: 0.8;
            filter: alpha(opacity=25);
        }

        .flexslider:hover .flex-next:hover,
        .flexslider:hover .flex-prev:hover {
            opacity: 1;
            filter: alpha(opacity=50);
        }

        .flex-control-nav {
            width: 100%;
            position: absolute;
            bottom: 10px;
            text-align: center;
        }

        .flex-control-nav li {
            margin: 0 2px;
            display: inline-block;
            zoom: 1;
            *display: inline;
        }

        .flex-control-paging li a {
            background: url(images/dot.png) no-repeat 0 -16px;
            display: block;
            height: 16px;
            overflow: hidden;
            text-indent: -99em;
            width: 16px;
            cursor: pointer;
        }

        .flex-control-paging li a.flex-active,
        .flex-control-paging li.active a {
            background-position: 0 0;
        }

        .flexslider .slides a img {
            width: 100%;
            height: 482px;
            display: block;
        }
    </style>


</head>

<body>
    <jsp:include page="./comment/head.jsp"></jsp:include>

    <div id="banner_tabs" class="flexslider">
        <ul class="slides">
            <c:forEach items="${home}" var="homeimages">
                <li>
                    <a title="" target="_blank" href="#">
                        <img width="1920" height="800" alt="" style="background: url(http://localhost:8080/upload/${homeimages.zbPicture}) no-repeat center;" src="../../images/alpha.png">
                    </a>
                </li>
            </c:forEach>
        </ul>
        <ul class="flex-direction-nav">
            <li><a class="flex-prev" href="javascript:;">Previous</a></li>
            <li><a class="flex-next" href="javascript:;">Next</a></li>
        </ul>
        <ol id="bannerCtrl" class="flex-control-nav flex-control-paging">
            <c:forEach items="${home}" varStatus="status">
                <li><a>${status.count}</a></li>
            </c:forEach>
        </ol>
    </div>

<div class="line-and-laboratory">
    <div class="container">
        <div class="clearfix text-center item-header">
            <span class="line"></span>
            <span class="text-center item-title">框架式学习</span>
            <span class="line"></span>
        </div>
        <div class="tab-content">
            <div class="tab-pane clearfix active" id="study-line">

                <c:forEach items="${course}" var="list" varStatus="stauts">
                    <div class="col-xs-12 col-sm-6 col-md-4">
                        <a href="${PATH}courseModel.html?type=${list.zbCode}&name=${list.zbName}">
                            <div class="path-item">
                                <div class="col-xs-5 col-sm-4 path-img">
                                    <img src="${PATH}/images/${stauts.index}.jpg">
                                </div>
                                <div class="col-xs-7 col-sm-8">
                                    <div class="path-name">${list.zbName}</div>
                                    <div class="path-course-num">
                                        <span>6</span>
                                        门课程
                                    </div>
                                </div>
                                <div class="desc-layer">
                                    <div class="center">
                                        ${list.zbName}
                                    </div>
                                </div>
                            </div>
                        </a>
                    </div>
                </c:forEach>
            </div>
        </div>
    </div>
</div>

<div class="line-and-laboratory">
    <div class="container">
        <div class="clearfix text-center item-header">
            <span class="line"></span>
            <div class="text-center item-title">课程列表</div>
            <span class="line"></span>
        </div>
        <div class="clearfix courses">
            <c:choose>
                <c:when test="${indexCourse.size()>0}">
                    <c:forEach items="${indexCourse}" var="index">
                        <div class="col-md-3 col-sm-6  course">
                            <a class="course-box" href="courses/show.html?cid=${index.zbId}&count=${index.zbStudyCount}&cuname=${index.zbUsername}&tuser=${index.zbName}">
                                <div class="sign-box">

                                    <i class="fa fa-star-o course-follow pull-right"
                                       data-follow-url="/courses/1/follow"
                                       data-unfollow-url="/courses/1/unfollow" style="display:none"></i>

                                </div>
                                <div class="course-img">
                                    <img alt="${index.zbName}" src="http://localhost:8080/upload/${index.zbPicture}">
                                </div>

                                <div class="course-body">
                                    <span class="course-title" data-toggle="tooltip" data-placement="bottom" title="${index.zbName}">${index.zbName}</span>
                                </div>
                                <div class="course-footer">
			<span class="course-per-num pull-left">
                <i class="fa fa-users"></i>
                ${index.zbStudyCount}
			</span>
                                </div>
                            </a>
                        </div>
                    </c:forEach>
                </c:when>
                <c:otherwise>
                    此地方还没有课程，请到全部课程查看
                </c:otherwise>
            </c:choose>

        </div>
        <div class="clearfix item-footer">
            <div class="pull-right watch-all">
                <a href="${PATH}courses/index.html?type=all&page=1">查看更多 ></a>
            </div>
        </div>
    </div>
</div>
    <jsp:include page="./comment/footer.jsp"></jsp:include>

<script type="text/javascript">
    $(function() {
        var bannerSlider = new Slider($('#banner_tabs'), {
            time: 5000,
            delay: 400,
            event: 'hover',
            auto: true,
            mode: 'fade',
            controller: $('#bannerCtrl'),
            activeControllerCls: 'active'
        });
        $('#banner_tabs .flex-prev').click(function() {
            bannerSlider.prev()
        });
        $('#banner_tabs .flex-next').click(function() {
            bannerSlider.next()
        });
    })
</script>
</body>
</html>
