<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%--<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>--%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jstl/fmt_rt" %>
<%
    /*获取工程路径*/
    String path = request.getContextPath();
    String imagesPath=request.getSession().getServletContext().getRealPath("video");
    request.setAttribute("images",imagesPath);
    request.setAttribute("PATH", path);
%>
<!DOCTYPE html>
<html lang="zh-CN">
<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <title>课程显示内容</title>
    <link rel="stylesheet" href="${PATH}/css/remodal.css">
    <link rel="stylesheet" href="${PATH}/css/remodal-default-theme.css">
    <link rel="stylesheet" href="${PATH}/css/monokai-sublime.min.css">
    <link rel="stylesheet" href="${PATH}/css/bootstrap.min.css">
    <link rel="stylesheet" href="${PATH}/css/katex.min.css">
    <link rel="stylesheet" href="${PATH}/css/video-js.min.css">
    <script type="text/javascript" src="${PATH}/js/jquery.min.js"></script>
    <script type="text/javascript" src="${PATH}/js/remodal.min.js"></script>
    <script type="text/javascript" src="${PATH}/js/jquery-1.3.2.min.js"></script>
    <script type="text/javascript" src="${PATH}/js/flowplayer-3.1.1.min.js"></script>
    <script type="text/javascript" src="${PATH}/js/jquery.fancybox-1.2.1.pack.js"></script>
    <script type="text/javascript" src="${PATH}/js/jquery.easing.1.3.js"></script>
    <script type="text/javascript" src="${PATH}/js/fancyplayer.js"></script>
    <script type="text/javascript" src="${PATH}/js/bootstrap.min.js"></script>
    <link rel="stylesheet" href="${PATH}/css/lanrenzhijia.css">
    <link rel="stylesheet" href="${PATH}/css/jquery.fancybox.css">
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

    <style>
        .bootcamp-infobox {
            margin: 50px 0 0;
        }

        .invite-friends-link {
            margin-top: 10px;
            padding-left: 8px;
        }

        .invite-friends-link input {
            margin-left: -5px;
        }

        .invite-friends-link button {
            float: left;
            margin-top: 5px;
            margin-left: -5px;
        }

        .invite-friends-link .copy-msg {
            float: left;
            margin-top: 10px;
            margin-left: 20px;
            color: #42b1ad;
        }

        p.join-vip-faq {
            margin-top: 20px;
            margin-bottom: -50px;
            font-size: 13px;
        }

        p.join-vip-faq img {
            height: 13px;
            width: 13px;
            margin-top: -2px;
        }

        a.vip-without-bean {
            font-size: 18px;
            line-height: 30px;
        }
    </style>
    <script type="text/javascript">
        var videopath = "";
        var swfplayer = videopath + "videos/flowplayer.swf";
    </script>

</head>

<body>
<jsp:include page="../comment/head.jsp"></jsp:include>

<div class="container layout layout-margin-top">

    <ol class="breadcrumb">
        <li><a href="${PATH}index.html?type=all&page=1">全部课程</a></li>

        <li class="active">
            <a href="${PATH}show.html?cid=${courseShow.get(0).zbCourseId}&count=${count}&cuname=${cuname}&tuser=${tuser.zbUsername}">
                ${cuname}
            </a>
        </li>
    </ol>

    <div class="row">
        <div class="col-md-9 layout-body">

            <div class="side-image side-image-mobile">
                <img src="${PATH}/images/1471513740139.png">
            </div>
            <div class="content course-infobox">
                <div class="clearfix course-infobox-header">
                    <h4 class="pull-left course-infobox-title">
                        <span style="color: black">${cuname}</span>
                    </h4>
                    <div class="pull-right course-infobox-follow"
                         <%--data-follow-url="/courses/1/follow"
                         data-unfollow-url="/courses/1/unfollow"--%>>
                        <span class="course-infobox-followers">${count}人学过</span>

                    </div>
                </div>
                <div class="clearfix course-infobox-body">
                    <div class="course-infobox-content">
                        <p>${cuname}</p>

                    </div>

                </div>

            </div>
            <div class="content">
                <ul class="nav nav-tabs" >

                    <li  id="courseList" class="active">
                        <a href="javascript:void(0)"   >实验列表</a>
                    </li>

                    <li id="courseComment">
                        <a href="javascript:void(0)"  >课程评论(${courseComment.size()})</a>
                    </li>
                </ul>
                <div class="tab-content">
                    <div class="tab-pane active" id="labs" style="display: block">
                        <c:forEach items="${courseShow}" var="section">
                            <c:choose>
                                <c:when test="${section.zbParentId=='0'}">
                                    <div class="lab-item ">
                                        <div class="lab-item-status">
                                            <img src="${PATH}/images/fancy_closebox.png">
                                        </div>
                                        <div class="lab-item-index">
                                            <h3>
                                                <strong>${section.zbName.substring(0,4)} ${section.zbName.substring(4)}</strong>
                                                <span class="drop-down">▼</span>
                                            </h3>
                                            <ul class="chapter-sub" style="padding-left:10px; display: block;">
                                                <c:forEach items="${courseShow}" var="sectionNext">
                                                    <c:choose>
                                                        <c:when test="${section.zbId==sectionNext.zbParentId}">
                                                            <%--测试--%>
                                                            <%--<a href="http://localhost:8080/video/demo1.mp4" class="video_link">
                                                                <li class="ellipsis video-li"><i
                                                                        class="icon-video">▶</i> ${sectionNext.zbName.substring(0,3)} ${sectionNext.zbName.substring(3)}
                                                                    (${sectionNext.zbTime})
                                                                </li>
                                                            </a>--%>
                                                            <a href="http://localhost:8080/video/${sectionNext.zbVideoUrl}" class="video_link">
                                                                <li class="ellipsis video-li"><i
                                                                        class="icon-video">▶</i> ${sectionNext.zbName.substring(0,3)} ${sectionNext.zbName.substring(3)}
                                                                    (${sectionNext.zbTime})
                                                                </li>
                                                            </a>
                                                        </c:when>
                                                        <c:otherwise>
                                                        </c:otherwise>
                                                    </c:choose>

                                                </c:forEach>
                                            </ul>
                                        </div>
                                    </div>
                                </c:when>
                                <c:otherwise>
                                </c:otherwise>
                            </c:choose>

                        </c:forEach>

                    </div>

                    <div id="comments" style="display: none">
                        <div class="comment-box">
                            <c:choose>
                                <c:when test="${username==null}">
                                    <div class="comment-form">

                                        <div class="comment-form-unlogin">
                                            请
                                            <a data-remodal-target="modal" style="cursor: pointer">登录</a>
                                            后发表评论
                                        </div>

                                    </div>
                                </c:when>
                                <c:otherwise>
                                    <div class="comment-title">最新评论
                                        <div class="pull-right lab-item-ctrl">
                                            <a class="btn btn-primary" data-remodal-target="modalComment" style="cursor: pointer">我要评论</a>
                                        </div>
                                    </div>

                                    <div class="comment-list">
                                        <c:forEach items="${courseComment}" var="comment">
                                            <div class="user-name">${comment.zbUsername} 评论道：</div>

                                            <div style="margin-top:5px;padding: 1px;border:1px solid #ccc;background-color:#eee;"></div>
                                            <div class="comment-content" style="color: black">${comment.zbContent}</div>
                                            <div class="comment-footer" style="color: black">
                                                <span>时间：<fmt:formatDate value="${comment.zbCreateTime}" pattern="yyyy-MM-dd HH:mm:ss"/></span>
                                            </div>
                                        </c:forEach>
                                    </div>
                                    <div class="pagination-container"></div>
                                </c:otherwise>
                            </c:choose>
                        </div>
                    </div>
                </div>
            </div>


        </div>
        <div class="col-md-3 layout-side">

            <div class="side-image side-image-pc">
                <img src="http://localhost:8080/upload/${course.zbPicture}">
            </div>

            <div class="sidebox mooc-teacher">
                <div class="sidebox-header mooc-header">
                    <h4 class="sidebox-title">课程教师</h4>
                </div>
                <div class="sidebox-body mooc-content">
                    <a href="javascript:void(0);">
                        <img src="http://localhost:8080/upload/${tuser.zbHeader}">
                    </a>
                    <div class="mooc-info">
                        <div class="name"><strong>${tuser.zbUsername}</strong></div>

                        <div class="courses">共发布过<strong>${sum}</strong>门课程</div>
                    </div>
                    <div class="mooc-extra-info">
                        <div class="word long-paragraph">
                            ${tuser.zbTitle}
                        </div>
                    </div>
                </div>
                <div class="sidebox-footer mooc-footer">
                    <a href="${PATH}index.html?type=${tuser.zbUsername}&page=1">查看老师的所有课程></a>
                </div>
            </div>
        </div>
    </div>
</div>


<div class="remodal" data-remodal-id="modalComment"
     data-remodal-options="hashTracking: false, closeOnOutsideClick: false" style="width: 1500px;">

            <div class="modal-header">
                <h4 class="modal-title">发布评论</h4>
            </div>
            <div class="modal-body words-ctrl">
                <form class="form-horizontal" action="/questions/" id="commentForm">
                    <input name="zbCourseId" type="hidden" value="${courseShow.get(0).zbCourseId}">
                    <div class="form-group">
                        <label class="col-md-2 control-label">标题</label>
                        <div class="col-md-10">
                            <select class="form-control" name="zbSectionId" type="select"  id="commentTitle">
                                <c:forEach items="${courseShow}" var="show">
                                    <c:if test="${show.zbParentId!='0'}">
                                        <option value="${show.zbId}">${show.zbName}</option>
                                    </c:if>
                                </c:forEach>
                            </select>
                        </div>
                    </div>
                    <div class="form-group">
                        <label class="col-md-2 control-label">描述</label>
                        <div class="col-md-10">
                            <div class="tabpanel mkeditor">
                                <ul class="nav nav-tabs" role="tablist">
                                    <li role="presentation" class="active">
                                        <a href="#mkeditor-editor" role="tab" data-toggle="tab">编辑</a>
                                    </li>
                                </ul>
                                <div class="tab-content">
                                    <div class="tab-pane active mkeditor-editor" id="mkeditor-editor" role="tabpanel">
                                        <textarea name="content" class="content"
                                                  min="0" max="20000"
                                                  placeholder="请输入内容"></textarea>
                                        <div class="help-block"></div>
                                    </div>
                                </div>
                            </div>
                            <br>
                            <button data-remodal-action="cancel" class="remodal-cancel">取消</button>
                            <button data-remodal-action="confirm" class="remodal-confirm" id="courseCommentSubmit">发布</button>
                        </div>
                    </div>

<script type="text/javascript">
    $("#courseList").click(function () {
        $("#labs").show();
        $("#comments").hide();
        $("#questions").hide();
    });
    $("#courseComment").click(function () {
        $("#comments").css('display', 'block').addClass('active');
        $("#labs").css('display', 'none').removeClass('active');
        $("#questions").css('display', 'none');

    });
    $("#courseQuestions").click(function () {
        $("#questions").show();
        $("#labs").hide();
        $("#comments").hide();
    });

    /*发布评论*/
    $("#courseCommentSubmit").click(function () {
        var prentId=$("input[name='zbCourseId']").val();
        var cid=$("#commentTitle").find("option:selected").val();
        var content=$("textarea[name='content']").val();
        var username='<%=session.getAttribute("username")%>';
       $.ajax({
           type:'post',
           url:'${PATH}comment.html',
           data:{pCourseId:prentId,cid:cid,content:content,username:username},
           dataType:'json',
           success:function (data) {
               if(data==1){
                   alert("发布成功");
                   location.reload();
               }else{
                   alert("发布失败");
               }
           }
        });
    });

</script>
</body>
</html>
