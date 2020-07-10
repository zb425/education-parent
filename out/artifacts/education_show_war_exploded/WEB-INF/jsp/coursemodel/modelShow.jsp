<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%
    /*获取工程路径*/
    String path = request.getContextPath();
    //String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
    request.setAttribute("PATH", path);
%>
<html>
<head>
    <title>课程框架学习</title>
    <%--<link rel="shortcut icon" href="favicon.ico">--%>
    <link rel="stylesheet" href="${PATH}/css/remodal.css">
    <link rel="stylesheet" href="${PATH}/css/remodal-default-theme.css">
   <%-- <link rel="stylesheet" href="${PATH}/css/font-awesome.min.css">--%>
    <link rel="stylesheet" href="${PATH}/css/monokai-sublime.min.css">
    <link rel="stylesheet" href="${PATH}/css/bootstrap.min.css">
    <link rel="stylesheet" href="${PATH}/css/katex.min.css">
    <link rel="stylesheet" href="${PATH}/css/video-js.min.css">
    <script type="text/javascript" src="${PATH}/js/jquery.min.js"></script>
    <script type="text/javascript" src="${PATH}/js/remodal.min.js"></script>
    <link rel="stylesheet" href="${PATH}/css/styles.css?=2016121272249">
    <style>
       /* @font-face {
            font-family: "lantingxihei";
            src: url("fonts/FZLTCXHJW.TTF");
        }*/

        /* modal 模态框*/
        #invite-user .modal-body {
            overflow: hidden;
        }

        #invite-user .modal-body .form-label {
            margin-bottom: 16px;
            font-size: 14px;
        }

        #invite-user .modal-body .form-invite {
            width: 80%;
            padding: 6px 12px;
            background-color: #eeeeee;
            border: 1px solid #cccccc;
            border-radius: 5px;
            float: left;
            margin-right: 10px;
        }

        #invite-user .modal-body .msg-modal-style {
            background-color: #7dd383;
            margin-top: 10px;
            padding: 6px 0;
            text-align: center;
            width: 100%;
        }

        #invite-user .modal-body .modal-flash {
            position: absolute;
            top: 53px;
            right: 74px;
            z-index: 999;
        }

        /* end modal */

        /*.en-footer {
            padding: 30px;
            text-align: center;
            font-size: 14px;
        }

        .navbar-banner {
            margin-top: 50px;
            background: url("img/homepage-bg.png");
            background-size: cover;
            backgtound-repeat: no-repeat;
        }*/
    </style>
</head>
<body>
<jsp:include page="../comment/head.jsp"></jsp:include>
<div class="container layout layout-margin-top">
    <ol class="breadcrumb">
        <li><a href="/paths/">学习路径</a></li>
        <li class="active"><a href="${PATH}courseModel.html?type=${courseType.type}">${name}</a></li>
    </ol>
    <div class="row">
        <div class="col-md-9 layout-body">
            <div class="content" style="padding:0px">
                <div class="path-description" style="margin:0px">
                    <div class="path-desc-top clearfix"
                         style="background: url('../../../images/1471513740139.png') no-repeat;background-size: cover;">
                        <div class="name-total-box clearfix">
                            <div class="col-md-6 col-sm-6 col-md-offset-1 path-name">
                                <h4>${name}</h4>
                            </div>
                            <div class="col-md-3 col-sm-6 col-md-offset-1 path-total-courses">
                                <span class="total-courses-box">课程 <span class="num">${courseType.total}</span></span>
                            </div>
                        </div>
                        <div class="col-md-10 col-md-offset-1 path-desc-text">新手入门路径帮助对 IT
                            技术感兴趣的新手0基础入门计算机编程。本路径通过新手入门、Linux 及 Vim课程熟悉实验楼的实践学习环境，再以 C 语言和一个简单的项目引导你一步步进入计算机技术的殿堂。
                        </div>
                    </div>
                    <div class="path-desc-btm">
                        <div class="col-sm-12 col-md-4 clearfix learn-time-div">
                            <div class="col-md-12 text-left need-learn-time">奔跑在梦想的道路上</div>
                        </div>
                    </div>
                </div>
            </div>
            <div class="content">
                <ul class="nav nav-tabs" role="tablist">
                    <li role="presentation" class="active">
                        <a href="#path-details" aria-controls="path-details" role="tab" data-toggle="tab">路径详情</a>
                    </li>
                </ul>
                <div class="tab-content">
                    <div role="tabpanel" class="tab-pane path-details active" id="path-details">
                        <div class="details-box">
                            <div class="row">
                                <c:forEach items="${courseType.rows}" var="typeCourse">
                                    <div class="col-md-4 col-sm-6  course">
                                        <a class="course-box" href="/courses/63">
                                            <div class="sign-box">
                                                <i class="fa fa-star-o course-follow pull-right"
                                                   data-follow-url="/courses/63/follow"
                                                   data-unfollow-url="/courses/63/unfollow" style="display:none">
                                                </i>
                                            </div>
                                            <div class="course-img">
                                                <img alt="课程框架之模块" src="http://localhost:8080/upload/${typeCourse.zbPicture}">
                                            </div>
                                            <div class="course-body">
                                            <span class="course-title" data-toggle="tooltip" data-placement="bottom"
                                                  title="课程框架之模块">${typeCourse.zbName}</span>
                                            </div>
                                            <div class="course-footer">
                                            <span class="course-per-num pull-left">
                                                <i class="fa fa-users"></i>
                                                ${typeCourse.zbStudyCount}
                                            </span>
                                            </div>
                                        </a>
                                    </div>
                                </c:forEach>
                            </div>
                            <nav class="pagination-container">
                                <ul class="pagination">
                                    <c:choose>
                                        <c:when test="${courseType.pageNow>'1'}">
                                            <li class="">
                                                <a class="page-next" href="${PATH}courseModel.html?type=${courseType.type}&page=1">首
                                                    页</a>
                                                <a class="page-next"
                                                   href="${PATH}courseModel.html?type=${courseType.type}&page=${courseType.pageNow-1}">上一页</a>
                                            </li>
                                        </c:when>
                                        <c:otherwise>
                                            <li class="disabled">
                                                <a class="page-next" href="javascript:void(0);" title="已是首页">首 页</a>
                                                <a class="page-next" href="javascript:void(0);" title="已是第一页">上一页</a>
                                            </li>
                                        </c:otherwise>
                                    </c:choose>
                                    <li class="active">
                                        <a href="javascript:void(0)">${courseType.pageNow}</a>
                                    </li>
                                    <li class="">
                                        <a href="${PATH}courseModel.html?type=${courseType.type}&page=2">2</a>
                                    </li>
                                    <li class="">
                                        <a href="${PATH}courseModel.html?type=${courseType.type}&page=3">3</a>
                                    </li>
                                    <span class="page-omit">...</span>
                                    <c:choose>
                                        <c:when test="${courseType.pageNow<courseType.total/9}">
                                            <li class="">
                                                <a class="page-next"
                                                   href="${PATH}courseModel.html?type=${courseType.type}&page=${courseType.pageNow+1}">下一页</a>
                                                <a class="page-next"
                                                   href="${PATH}courseModel.html?type=${courseType.type}&page=${courseType.totalPage}">尾
                                                    页</a>
                                            </li>
                                        </c:when>
                                        <c:otherwise>
                                            <li class="disabled">
                                                <a class="page-next" href="javascript:void(0);" title="没有下一页">下一页</a>
                                                <a class="page-next" href="javascript:void(0);" title="已到最后一页">尾 页</a>
                                            </li>
                                        </c:otherwise>
                                    </c:choose>

                                </ul>
                            </nav>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </div>
</div>
</body>
</html>
