<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%
    /*获取工程路径*/
    String path = request.getContextPath();
    String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort() + path + "/";
    request.setAttribute("PATH", path);
    request.setAttribute("basePath", basePath);
%>
<nav class="navbar navbar-default navbar-fixed-top header">
    <div class="container">
        <div class="navbar-header">
            <button type="button" class="navbar-toggle collapsed" data-toggle="collapse"
                    data-target="#header-navbar-collapse" aria-expanded="false">
                <span class="sr-only">梦的地方</span>
                <span class="icon-bar"></span>
                <span class="icon-bar"></span>
                <span class="icon-bar"></span>
            </button>
            <a class="navbar-brand" href="../index.html">
                <img src="../images/log.png">
            </a>
        </div>
        <div class="collapse navbar-collapse" id="header-navbar-collapse">
            <ul class="nav navbar-nav">
                <li class="dropdown ">
                    <a href="javascript:void(0);" class="dropdown-toggle" data-toggle="dropdown">
                        课程
                        <span class="caret"></span>
                    </a>
                    <ul class="dropdown-menu">
                        <li><a class="" href="${basePath}courses/index.action?type=all&page=1">全部课程</a></li>
                        <li><a class="" href="${basePath}courses/index.html?type=isall&page=1">即将上线</a></li>
                    </ul>
                </li>
                <li class="">
                    <a href="${basePath}questions/index.html">讨论区</a>
                </li>
                <li class=" bootcamp new-nav logo-1111">
                    <a href="${basePath}databanks/getDatabankList.html?que=all">资料区</a>
                </li>

            </ul>


            <div class="navbar-right btns" id="loginRegister">
                <c:choose>
                    <c:when test="${cookie.username.value!=null}">
                        <a class="btn btn-default navbar-btn sign-in">${cookie.username.value}</a>
                    </c:when>
                    <c:when test="${username!=null}">
                        <a class="btn btn-default navbar-btn sign-in"><%=session.getAttribute("username")%></a>
                    </c:when>
                    <c:otherwise>
                        <a data-remodal-target="modal" class="btn btn-default navbar-btn sign-in"
                           style="cursor: pointer">登录</a>
                        <a data-remodal-target="modalRegister" class="btn btn-default navbar-btn sign-up"
                           style="cursor: pointer">注册</a>
                    </c:otherwise>
                </c:choose>
                &nbsp;&nbsp;&nbsp;&nbsp;
                <a class="btn btn-default navbar-btn sign-up" id="tuichu" style="cursor: pointer">退出</a>
            </div>

            <form class="navbar-form navbar-right" action="${PATH}search.html" method="get" role="search">
                <div class="form-group">
                    <input type="text" class="form-control" name="search" autocomplete="off" placeholder="搜索 课程">
                </div>
            </form>
        </div>
    </div>
</nav>


<div class="remodal" data-remodal-id="modal" id="model"
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
                            <input type="password" name="userPassword" class="form-control" placeholder="请输入密码"
                                   style="width: 250px;">
                        </div>
                    </div>
                    <div class="form-group remember-login">
                        <input name="remember" type="checkbox" value="y"> 下次自动登录
                        <%--<a class="pull-right" href="javascript:void(0)" onclick="returnPassword()">忘记密码？</a>--%>
                        <a data-remodal-target="modalPassword" class="pull-right"
                           style="cursor: pointer">忘记密码？</a>
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


<%--忘记密码弹框--%>
<div class="remodal" data-remodal-id="modalPassword"
     data-remodal-options="hashTracking: false, closeOnOutsideClick: false" style="width: 380px;">
    <ul class="nav nav-tabs" role="tablist">
        <li role="presentation" class="active">
            <a href="#signin-form" aria-controls="signin-form" role="tab" data-toggle="tab">忘记密码</a>
        </li>
    </ul>
    <div role="tabpanel" class="tab-pane" id="signup-form">
        <form action="/register" method="post" id="studetPassword" enctype="multipart/form-data">
            <div class="form-group">
                <div class="input-group">
                    <div class="input-group-addon">
                        <i class="fa fa-lock" style="margin:0;"></i>
                    </div>
                    <input type="text" name="studentPhone" class="form-control" onchange="studentUserEmail()" id="studentPhone" placeholder="请输入原电话号码">
                </div>
            </div>
            <div class="form-group">
                <div class="input-group">
                    <div class="input-group-addon">
                        <i class="fa fa-lock" style="margin:0;"></i>
                    </div>
                    <input type="password" name="studentPassword" class="form-control" placeholder="请输入新密码">
                </div>
            </div>
        </form>
    </div>
    <br>
    <button data-remodal-action="cancel" class="remodal-cancel">取消</button>
    <button data-remodal-action="confirm" class="remodal-confirm" id="update">更换</button>
</div>




<script type="text/javascript">
    /*用户登录*/
    $("#loginUser").click(function () {
        var username = $("input[name='username']").val().trim();
        var password = $("input[name='userPassword']").val().trim();
        if (username != "" && password != "") {
            if ($("input[type='checkbox']").is(':checked')) {
                $.ajax({
                    type: 'post',
                    url: '${basePath}courses/login.html',
                    data: {username: username, password: password, remember: "y"},
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
                $.ajax({
                    type: 'post',
                    url: '${basePath}courses/login.html',
                    data: {username: username, password: password, remember: "n"},
                    dataType: 'json',
                    success: function (data) {
                        if (data == 1) {
                            var _this = $("#loginRegister");
                            _this.html('<%=session.getAttribute("username")%>');
                            alert("登录成功");
                            location.reload();
                        } else {
                            alert("登录失败");
                        }
                    }
                });
            }
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
            url: '${basePath}courses/studentRegister.html',
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

    $("#tuichu").click(function () {
        $.ajax({
            type: 'post',
            url: '${basePath}tuichuStudent.html',
            dataType: 'json',
            success: function (data) {
                if (data == 1) {
                    location.reload();
                } else {
                    alert("退出失败");
                }
            }
        });
    });

    function studentUserEmail() {
        var email = $("input[name='studentPhone']").val().trim();
        if (email=='') {
            alert("电话不能为空");
            return;
        }else{
            $.ajax({
                type: 'post',
                url: '${basePath}studentPassword.html',
                data:{"email":email},
                dataType: 'json',
                success: function (data) {
                    if (data == 1) {
                    } else {
                        alert("电话号码不存在");
                    }
                }
            });
        }
    }

    $("#update").click(function () {
        var phone = $("input[name='studentPhone']").val().trim();
        var password=$("input[name='studentPassword']").val().trim();
        if(phone==''||password==''){
            alert("电话号码或密码不能为空");
            return ;
        }else{
            $.ajax({
                type: 'post',
                url: '${basePath}updatePassword.html',
                data:{"phone":phone,"password":password},
                dataType: 'json',
                success: function (data) {
                    if (data == 1) {
                        alert("修改成功");
                    } else {
                        alert("修改错误,请确保电话号码正确");
                    }
                }
            });
        }

    });

</script>
