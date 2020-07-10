<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%
    /*获取工程路径*/
    String path = request.getContextPath();
    //String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
    request.setAttribute("PATH", path);
%>
<!DOCTYPE html>
<html lang="zh-CN">
<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <title>搜索页面</title>
    <%--<link rel="shortcut icon" href="favicon.ico">--%>
    <link rel="stylesheet" href="${PATH}/css/remodal.css">
    <link rel="stylesheet" href="${PATH}/css/remodal-default-theme.css">
    <link rel="stylesheet" href="${PATH}/css/font-awesome.min.css">
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
            src: url("../fonts/FZLTCXHJW.TTF");
        }*/

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
                            <a target="_blank" href="/vip"><img src="../img/vip-icon.png"></a>
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
                    <li class="active"><a href="javascript:void(0)">${query}</a></li>
                </ul>
                <div class="clearfix"></div>
                <div class="courses-sort">
                    <a href="/courses/?course_type=all&amp;tag=all&amp;fee=all&amp;order=latest">最新</a>
                    /
                    <a href="/courses/?course_type=all&amp;tag=all&amp;fee=all&amp;order=hotest">最热</a>
                </div>
                <div class="search-result"></div>
                <div class="row">

                    <c:forEach items="${courseType}" var="course">
                        <div class="col-md-4 col-sm-6  course">
                            <a class="course-box"
                               href="${PATH}show.html?cid=${course.zb_id}&count=${course.zb_study_count}&tuser=${course.zb_username}&cuname=${course.zb_name}">
                                <div class="sign-box">

                                    <i class="fa fa-star-o course-follow pull-right"
                                       data-follow-url="/courses/63/follow"
                                       data-unfollow-url="/courses/63/unfollow" style="display:none"></i>
                                </div>
                                <div class="course-img">
                                    <img alt="新手指南" src="https://dn-simplecloud.shiyanlou.com/ncn63.jpg">
                                </div>

                                <div class="course-body">
                                    <span class="course-title" data-toggle="tooltip" data-placement="bottom"
                                          title="新手指南">${course.zb_name}</span>
                                </div>
                                <div class="course-footer">
                                    <span class="course-per-num pull-left">
                                        <i class="fa fa-users"></i>
                                        ${course.zb_study_count}
                                    </span>
                                    <span class="course-money pull-right">${course.zb_free}会员</span>
                                </div>
                            </a>
                        </div>
                    </c:forEach>

                </div>

                <nav class="pagination-container">
                    <ul class="pagination">

                        <c:choose>
                            <c:when test="${page>'1'}">
                                <li class="">
                                    <a class="page-next" href="${PATH}search.html?search=${query}">首
                                        页</a>
                                    <a class="page-next"
                                       href="${PATH}search.html?search=${query}&page=${page-1}">上一页</a>
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
                            <a href="${PATH}search.html?search=${query}">${page}</a>
                        </li>
                        <li class="">
                            <a href="${PATH}search.html?search=${query}?page=2">2</a>
                        </li>
                        <li class="">
                            <a href="${PATH}search.html?search=${query}?page=3">3</a>
                        </li>
                        <span class="page-omit">...</span>
                        <c:choose>
                            <c:when test="${page<totalPages}">
                                <li class="">
                                    <a class="page-next"
                                       href="${PATH}search.html?search=${query}&page=${page+1}">下一页</a>
                                    <a class="page-next"
                                       href="${PATH}search.html?search=${query}&page=${totalPages}">尾
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
                                    <img class="circle" src="../img/logo-grey.png">
                                </a>

                            </div>
                        </div>
                        <div class="media-body">
                            <span class="media-heading username">欢迎来到高校自学平台</span>
                            <p class="vip-remain">只有不学的，没有学不会的</p>
                        </div>
                    </div>
                    <div class="row userinfo-data">
                        <hr>
                        <div class="btn-group-lr">
                            <a href="#sign-modal" type="button" class="btn btn-success col-md-5 col-xs-6 login-btn"
                               data-toggle="modal" data-sign="signin">登录</a>
                            <a href="#sign-modal" type="button"
                               class="btn btn-success col-md-5 col-xs-6 col-md-offset-1 register-btn"
                               data-toggle="modal" data-sign="signup">注册</a>
                        </div>

                    </div>
                </div>
            </div>

            <div class="sidebox">
                <div class="sidebox-header">
                    <h4 class="sidebox-title">最热路径</h4>
                </div>
                <div class="sidebox-body course-content side-list-body">
                    <a href="/paths/python"><img style="width:25px;height:25px" src="../img/1471513769430.png"> Python
                        研发工程师</a>
                    <a href="/paths/bigdata"><img style="width:25px;height:25px" src="../img/1471513926288.png"> 大数据工程师</a>
                    <a href="/paths/cpp"><img style="width:25px;height:25px" src="../img/1471513793360.png"> C++
                        研发工程师</a>
                    <a href="/paths/security"><img style="width:25px;height:25px" src="../img/1471513867033.png">
                        信息安全工程师</a>
                    <a href="/paths/linuxsys"><img style="width:25px;height:25px" src="../img/1471514004752.png"> Linux
                        运维工程师</a>
                </div>

            </div>

        </div>
    </div>
</div>

<div class="remodal" data-remodal-id="modal"
     data-remodal-options="hashTracking: false, closeOnOutsideClick: false" style="width: 380px;">
    <div class="modal-body">
        <ul class="nav nav-tabs" role="tablist">
            <li role="presentation" class="active">
                <a href="#signin-form" aria-controls="signin-form" role="tab" data-toggle="tab">登录</a>
            </li>
            <li role="presentation">
                <a data-remodal-target="modalRegister" style="cursor: pointer">注册</a>
            </li>
        </ul>
        <div class="tab-content">
            <div role="tabpanel" class="tab-pane active" id="signin-form">
                <form action="/login" method="post">
                    <div class="form-group">
                        <div class="input-group">
                            <div class="input-group-addon">
                                <i class="fa fa-envelope" style="margin:0;"></i>
                            </div>
                            <input type="email" name="username" class="form-control" placeholder="请输入用户名"
                                   style="width: 246px;">
                        </div>
                    </div>
                    <div class="form-group">
                        <div class="input-group">
                            <div class="input-group-addon">
                                <i class="fa fa-lock" style="margin:0;"></i>
                            </div>
                            <input type="password" name="password" class="form-control" placeholder="请输入密码"
                                   style="width: 250px;">
                        </div>
                    </div>
                    <div class="form-group remember-login">
                        <input name="remember" type="checkbox" value="y"> 下次自动登录
                        <a class="pull-right" href="../reset_password/index.html">忘记密码？</a>
                    </div>
                </form>
            </div>
            <br>
            <button data-remodal-action="cancel" class="remodal-cancel">取消</button>
            <button data-remodal-action="confirm" class="remodal-confirm" id="loginUser">登录</button>

            <div class="remodal" data-remodal-id="modalRegister"
                 data-remodal-options="hashTracking: false, closeOnOutsideClick: false" style="width: 380px;">
                <ul class="nav nav-tabs" role="tablist">
                    <li role="presentation" class="active">
                        <a href="#signin-form" aria-controls="signin-form" role="tab" data-toggle="tab">用户注册</a>
                    </li>
                </ul>
                <div role="tabpanel" class="tab-pane" id="signup-form">
                    <form action="/register" method="post" id="studentFormUser" enctype="multipart/form-data">
                        <div class="form-group">
                            <div class="input-group">
                                <div class="input-group-addon">
                                    <i class="fa fa-envelope" style="margin:0;"></i>
                                </div>
                                <input type="text" name="zbStudentEmail" class="form-control" id="email"
                                       placeholder="请输入邮箱">
                            </div>
                        </div>
                        <div class="form-group">
                            <div class="input-group">
                                <div class="input-group-addon">
                                    <i class="fa fa-lock" style="margin:0;"></i>
                                </div>
                                <input type="text" name="zbStudentPhone" class="form-control" placeholder="请输入电话号码">
                            </div>
                        </div>
                        <div class="form-group">
                            <div class="input-group">
                                <div class="input-group-addon">
                                    <i class="fa fa-lock" style="margin:0;"></i>
                                </div>
                                <input type="password" name="zbPassword" class="form-control" placeholder="请输入密码">
                            </div>
                        </div>
                    </form>
                </div>
                <br>
                <button data-remodal-action="cancel" class="remodal-cancel">取消</button>
                <button data-remodal-action="confirm" class="remodal-confirm" id="register">注册</button>
            </div>

        </div>
    </div>
</div>

<div class="modal fade" id="flash-message" tabindex="-1" role="dialog">
    <div class="modal-dialog" rolw="document">
    </div>
</div>


<jsp:include page="../comment/footer.jsp"></jsp:include>
<script type="text/javascript">
    /*用户登录*/
    $("#loginUser").click(function () {
        var username = $("input[name='username']").val().trim();
        var password = $("input[name='password']").val().trim();
        if (username != "" && password != "") {
            $.ajax({
                type: 'post',
                url: '${PATH}login.html',
                data: {username: username, password: password},
                dataType: 'json',
                success: function (data) {
                    if (data == 1) {
                        var _this = $("#loginRegister");
                        _this.html('<%=session.getAttribute("username")%>');
                        ;
                        alert("登录成功");
                        location.reload();
                    } else {
                        alert("登录失败");
                    }
                }
            });
        } else {
            alert("用户名和密码不能为空!");
            return;
        }
    });

    $("#email").change(function () {
        var temp = RegExp(/^[a-zA-Z0-9_-]+@[a-zA-Z0-9_-]+(\.[a-zA-Z0-9_-]+)+$/);
        var email = $("input[name='zbStudentEmail']").val();
        if (!temp.test(email)) {
            $("#email").val("邮箱格式不正确");
            return;
        }
    });

    /*用户注册*/
    $("#register").click(function () {
        var email = $("input[name='zbStudentEmail']").val();
        var phone = $("input[name='zbStudentPhone']").val();
        var password = $("input[name='zbPassword']").val();
        if (email.trim() == '' || phone.trim() == '' || password.trim() == '') {
            alert("不能为空");
        }
        $.ajax({
            type: 'post',
            url: '${PATH}studentRegister.html',
            data: {zbStudentEmail: email, zbStudentPhone: phone, zbPassword: password},
            dataType: 'json',
            success: function (data) {
                if (data == 1) {
                    alert("注册成功");
                    location.reload();
                } else {
                    alert("注册失败");
                }
            }
        });
    });
</script>
</body>
</html>
