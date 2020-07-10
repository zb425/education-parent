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
    <title>课程主页</title>
    <link rel="stylesheet" href="${PATH}/css/remodal.css">
    <link rel="stylesheet" href="${PATH}/css/remodal-default-theme.css">
    <link rel="stylesheet" href="${PATH}/css/monokai-sublime.min.css">
    <link rel="stylesheet" href="${PATH}/css/bootstrap.min.css">
    <link rel="stylesheet" href="${PATH}/css/katex.min.css">
    <link rel="stylesheet" href="${PATH}/css/video-js.min.css">
    <script type="text/javascript" src="${PATH}/js/jquery.min.js"></script>
    <script type="text/javascript" src="${PATH}/js/remodal.min.js"></script>
    <link rel="stylesheet" href="${PATH}/css/styles.css?=2016121272249">

    <style>
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

        .en-footer {
            padding: 30px;
            text-align: center;
            font-size: 14px;
        }
    </style>


</head>

<body>

<jsp:include page="../comment/head.jsp"></jsp:include>

<div class="container layout layout-margin-top">


    <div class="row">
        <div class="col-md-9 layout-body">

            <div class="content">
                <div class="row course-cates">
                    <div class="col-md-1 course-cates-title">类别：</div>
                    <div class="col-md-11 course-cates-content">
                        <a class="active" href="${PATH}index.action?type=all&page=1">全部</a>
                        <a class="" href="${PATH}index.html?type=free&page=1" id="CourseFree">免费</a>
                        <div class="course-cates-vip ">
                            <a class="" href="${PATH}index.html?type=isFree&page=1">会员</a>
                        </div>
                    </div>
                </div>
                <div class="row course-cates">
                    <div class="col-md-1 course-cates-title">标签：</div>
                    <div class="col-md-11 course-cates-content">
                        <a class="active" href="${PATH}index.action?type=all&page=1">全部</a>

                        <c:forEach items="${isCourse}" var="iscourse">
                            <a class=""
                               href="${PATH}index.html?type=${iscourse.zbParentCode}-${iscourse.zbName}&page=1">${iscourse.zbName}</a>
                        </c:forEach>
                    </div>
                </div>
            </div>
            <div class="content position-relative">
                <ul class="nav nav-tabs" role="tablist">
                    <li class="active"><a href="javascript:void(0)">${courseType.typeName}</a></li>
                </ul>
                <div class="clearfix"></div>
                <div class="search-result"></div>
                <div class="row">

                    <c:forEach items="${courseType.rows}" var="course">
                        <div class="col-md-4 col-sm-6  course">
                            <a class="course-box"
                               href="${PATH}show.html?cid=${course.zbId}&count=${course.zbStudyCount}&tuser=${course.zbUsername}&cuname=${course.zbName}">
                                <div class="sign-box">

                                    <i class="fa fa-star-o course-follow pull-right"
                                       data-follow-url="/courses/63/follow"
                                       data-unfollow-url="/courses/63/unfollow" style="display:none">
                                    </i>
                                </div>
                                <div class="course-img">
                                    <img alt="头像" src="http://localhost:8080/upload/${course.zbPicture}">
                                </div>

                                <div class="course-body">
                                    <span class="course-title" data-toggle="tooltip" data-placement="bottom"
                                          title="${course.zbName}">${course.zbName}</span>
                                </div>
                                <div class="course-footer">
                                    <span class="course-per-num pull-left">
                                        <i class="fa fa-users"></i>
                                        ${course.zbStudyCount}
                                    </span>
                                    <c:if test="${course.zbFree=='0'}">
                                        <span class="course-money pull-right">会员</span>
                                    </c:if>
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
                                    <a class="page-next" href="${PATH}index.html?type=${courseType.type}&page=1">首
                                        页</a>
                                    <a class="page-next"
                                       href="${PATH}index.html?type=${courseType.type}&page=${courseType.pageNow-1}">上一页</a>
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
                            <a href="${PATH}index.html?type=${courseType.type}&page=1">${courseType.pageNow}</a>
                        </li>
                        <li class="">
                            <a href="${PATH}index.html?type=${courseType.type}&page=2">2</a>
                        </li>
                        <li class="">
                            <a href="${PATH}index.html?type=${courseType.type}&page=3">3</a>
                        </li>
                        <span class="page-omit">...</span>
                        <c:choose>
                            <c:when test="${courseType.pageNow<courseType.total/15}">
                                <li class="">
                                    <a class="page-next"
                                       href="${PATH}index.html?type=${courseType.type}&page=${courseType.pageNow+1}">下一页</a>
                                    <a class="page-next"
                                       href="${PATH}index.html?type=${courseType.type}&page=${courseType.totalPage}">尾
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
        <div class="col-md-3 layout-side">

            <div class="panel panel-default panel-userinfo">
                <div class="panel-body body-userinfo">
                    <div class="media userinfo-header">
                        <div class="media-left">
                            <div class="user-avatar">

                                <a class="avatar" href="#sign-modal" data-toggle="modal" data-sign="signin">
                                    <img class="circle" src="${PATH}/images/log.png">
                                </a>

                            </div>
                        </div>
                        <div class="media-body">

                            <span class="media-heading username">欢迎来到425</span>
                            <p class="vip-remain">只有不想做的，没有做不到的</p>

                        </div>
                    </div>

                    <div class="row userinfo-data">

                        <hr>
                        <div class="btn-group-lr">
                               <a data-remodal-target="modal" class="btn btn-success col-md-5 col-xs-6 login-btn" style="cursor: pointer">登录</a>
                               <a data-remodal-target="modalRegister" class="btn btn-success col-md-5 col-xs-6 col-md-offset-1 register-btn" style="cursor: pointer">注册</a>
                        </div>

                    </div>
                </div>
            </div>


            <div class="sidebox">

                <div class="sidebox-header">
                    <h4 class="sidebox-title">最热路径</h4>
                </div>
                <div class="sidebox-body course-content side-list-body">
                    <a href="javascript:void(0)"><img style="width:25px;height:25px" src="${PATH}/images/DVP-46.png">java开发</a>
                    <a href="javascript:void(0)"><img style="width:25px;height:25px" src="${PATH}/images/DVP-47.png">php开发</a>
                    <a href="javascript:void(0)"><img style="width:25px;height:25px" src="${PATH}/images/DVP-48.png"> C++开发</a>
                    <a href="javascript:void(0)"><img style="width:25px;height:25px" src="${PATH}/images/DVP-49.png">aspx.net开发</a>
                    <a href="javascript:void(0)"><img style="width:25px;height:25px" src="${PATH}/images/DVP-50.png"> Linux系统开发</a>
                </div>

            </div>

        </div>
    </div>
</div>

<div class="modal fade" id="flash-message" tabindex="-1" role="dialog">
    <div class="modal-dialog" rolw="document">
    </div>
</div>
<jsp:include page="../comment/footer.jsp"></jsp:include>
</body>
</html>
