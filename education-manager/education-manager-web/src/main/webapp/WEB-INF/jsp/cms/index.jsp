<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%
    /*获取工程路径*/
    String path = request.getContextPath();
    String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort() + path + "/";
%>
<html>
<head>
    <title>后台管理</title>
    <meta charset="utf-8">
    <meta content="IE=edge,chrome=1" http-equiv="X-UA-Compatible">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta name="description" content="">
    <meta http-equiv="Content-Type" content="multipart/form-data; charset=utf-8"/>
    <!-- 引入资源文件 -->
    <%--<jsp:include page="../common/res.jsp"></jsp:include>--%>
    <link href="${s.base}/css/bootstrap.min.css" rel="stylesheet" type="text/css"/>
    <link href="${s.base}/css/style.css" rel="stylesheet" type="text/css"/>
    <script type="text/javascript" src="${s.base}/js/jquery-1.11.3.min.js"></script>
    <script type="text/javascript" src="${s.base}/js/jquery.form.js"></script>
    <script type="text/javascript" src="${s.base}/js/bootstrap.min.js"></script>
    <script type="text/javascript" src="${s.base}/js/highcharts-4.1.min.js"></script>
    <script type="text/javascript" src="${s.base}/js/oc.min.js"></script>
    <link rel="icon" type="image/png" href="${s.base}/images/loc.jpg" sizes="16x16">
</head>

<body class="">
<div class="navbar">
    <div class="navbar-inner">
        <a href="${s.base}" class="cms-logo" title="高校在线自学平台"></a>
        <span class="brand">高校自学平台管理</span>
        <span class="brand" style="float: right;margin-right: 50px;color:#FFF;">
            ${username}
        </span>
    </div>
</div>
<div class="sidebar-nav">
    <a href="#dashboard-menu" class="nav-header" data-toggle="collapse">
        <span style="font-weight: bold;font-size: 16px;">管理区</span>
    </a>
    <ul id="dashboard-menu" class="nav nav-list collapse in">
        <li id="main">
            <a href="javascript:void(0)" onclick="menuClick(0,'<%=basePath%>user/main.html')">主 页</a>
        </li>
        <li id="course">
            <a href="javascript:void(0)" onclick="menuClick(1,'<%=basePath%>user/course.html')">课程管理</a>
        </li>
        <li>
            <a href="javascript:void(0)" onclick="menuClick(2,'<%=basePath%>comment/index.html')">评论管理</a>
        </li>
        <li>
            <a href="javascript:void(0)" onclick="menuClick(3,'<%=basePath%>classify/index.html')">课程分类管理</a>
        </li>

        <li>
            <a href="javascript:void(0)" onclick="menuClick(4,'<%=basePath%>course/userPageList.html')">教师管理</a>
        </li>
        <li>
            <a href="javascript:void(0)" onclick="menuClick(5,'<%=basePath%>student/index.html')">学生管理</a>
        </li>
        <li>
            <a href="javascript:void(0)" onclick="menuClick(6,'<%=basePath%>homeimages/main.html')">轮播图管理</a>
        </li>
        <li>
            <a href="javascript:void(0)" onclick="menuClick(7,'<%=basePath%>discussion/discussionIndex.html')">讨论区管理</a>
        </li>
        <li>
            <a href="javascript:void(0)" onclick="menuClick(8,'<%=basePath%>databank/databankIndex.html')">资料管理</a>
        </li>
    </ul>

    <a href="#accounts-menu" class="nav-header" data-toggle="collapse">
        <span style="font-weight: bold;font-size: 16px;">个人账号</span>
    </a>
    <ul id="accounts-menu" class="nav nav-list collapse in">
        <li><a href="javascript:void(0)" onclick="updateUser()">修改个人信息</a></li>
        <li><a href="javascript:void(0)" onclick="outUser()">退出</a></li>
    </ul>

  <%--  <jsp:include page="../common/footer.jsp"></jsp:include>--%>
</div>

<div class="content">
    <div class="container-fluid">
        <iframe frameborder="no" border="0" scrolling="no" name="frm_right" width="100%" height="890px" id="frm_right"
                src="<%=basePath%>user/main.html"></iframe>
    </div>
</div>


<div class="modal fade " id="updateModal" tabindex="-1" role="dialog" aria-hidden="true">
    <div class="modal_wapper">
        <div class="modal-dialog ">
            <div class="modal-content">
                <div class="modal-header">
                    <button type="button" class="close" data-dismiss="modal" aria-label="Close">
                        <span aria-hidden="true">×</span>
                    </button>
                    <h4 class="modal-title">修改个人信息</h4>
                </div>
                <div class="block span6" id="addDiv">
                    <div class="block-body collapse in" style="padding-top:10px;">
                        <form role="form" id="userInfomation" method="post" action="${PATH}saveUser.html"
                              enctype="multipart/form-data">
                            <input type="hidden" name="zbId">
                            <div class="form-group clearfix">
                                <label class="control-label">头像<span id="imgErrSpan"
                                                                     style="color:red;font-weight:normal;"></span>
                                </label>
                                <div class="col-sm-10">
                                    <input type="file" id="pictureImg" name="file" style="display: none;"
                                           onchange="photoImgChange();">
                                    <div class="ui-avatar-box">
                                        <img id="coursePicture" style="max-width: 250px;height:120px;" name="zbHeader">
                                        <a href="javascript:void(0);" onclick="doUpload();"
                                           style="text-decoration: underline;margin-top:5px;">选择图片</a>
                                    </div>
                                </div>
                            </div>
                            <div class="form-group clearfix">
                                <label class="control-label">登录用户名</label>
                                <div class="col-sm-10">
                                    <input type="text" class="form-control" name="zbRealname" id="name"
                                           placeholder="请输入用户名">
                                </div>
                            </div>
                            <div class="form-group clearfix">
                                <label class="control-label">真实姓名</label>
                                <div class="col-sm-4">
                                    <input type="text" name="zbUsername" class="form-control" id="username"
                                           placeholder="请输入姓名"/>
                                </div>
                                <label class="control-label">密码</label>
                                <div class="col-sm-4">
                                    <input type="password" name="zbPassword" class="form-control" placeholder="请输入密码"/>
                                </div>
                            </div>
                            <div class="form-group clearfix">
                                <label class="control-label">性别</label>
                                <div class="col-sm-4">
                                    <select name="zbGender" class="form-control" type="select">
                                        <option value="1">--男--</option>
                                        <option value="0">--女--</option>
                                    </select>
                                </div>
                                <label class="control-label">手机号码</label>
                                <div class="col-sm-4">
                                    <input type="text" name="zbMobile" class="form-control" placeholder="请输入手机号码"/>
                                </div>
                            </div>
                            <div class="form-group clearfix">
                                <label class="control-label">状态</label>
                                <div class="col-sm-4">
                                    <select name="zbStatus" class="form-control" id="status" type="select">
                                        <option value="2">可用</option>
                                        <option value="0">禁用</option>
                                    </select>
                                </div>
                                <label class="control-label">学历</label>
                                <div class="col-sm-4">
                                    <select name="zbEducation" class="form-control" id="education" type="select">
                                        <option value="大专">大专</option>
                                        <option value="本科">本科</option>
                                        <option value="硕士">硕士</option>
                                        <option value="博士">博士</option>
                                        <option value="博士后">博士后</option>
                                    </select>
                                </div>
                            </div>
                            <div class="form-group clearfix">
                                <label class="control-label">大学名称</label>
                                <div class="col-sm-4">
                                    <input type="text" name="zbCollegeName" class="form-control" id="college"
                                           placeholder="请输入大学名称"/>
                                </div>

                                <label class="control-label">头衔</label>
                                <div class="col-sm-4">
                                    <input type="text" name="zbTitle" class="form-control" id="title"
                                           placeholder="请输入所在省份"/>
                                </div>
                            </div>
                            <div class="form-group clearfix">
                                <label class="control-label">所在省份</label>
                                <div class="col-sm-4">
                                    <input type="text" name="zbProvince" class="form-control" placeholder="请输入所在省份"/>
                                </div>
                                <label class="control-label">所在城市</label>
                                <div class="col-sm-4">
                                    <input type="text" name="zbCity" class="form-control" placeholder="请输入所在城市"/>
                                </div>
                            </div>
                            <div class="form-group clearfix">
                                <label class="control-label">所在地区</label>
                                <div class="col-sm-4">
                                    <input type="text" name="zbDistrict" class="form-control" placeholder="请输入所在地区"/>
                                </div>
                                <label class="control-label">权重</label>
                                <div class="col-sm-4">
                                    <input type="text" name="zbWeight" class="form-control" id="weight"
                                           placeholder="请输入权重"/>
                                </div>
                            </div>
                        </form>
                    </div>
                </div>
                <div class="modal-footer">
                    <button type="button" class="btn btn-default" onclick="doAddUserSave();">保存</button>
                    <button type="button" class="btn btn-default" data-dismiss="modal">关闭</button>
                </div>
            </div>
        </div>
    </div>
</div>

</body>
<script type="text/javascript">
    function menuClick(obj, url) {
        var test = '${wegith}';
        if (obj == 0) {
            $("#frm_right").attr("src", url);
        }
        if (obj == 1) {
            $("#frm_right").attr("src", url + "?page=1&name=");
        }
        if (obj == 2) {
            $("#frm_right").attr("src", url + "?page=1&name=");
        }
        if (obj == 3) {
            $("#frm_right").attr("src", url);
        }
        if (obj == 4) {
            if (test == '1') {
                $("#frm_right").attr("src", url + "?page=1&username=&status=-1");
            } else {
                alert("不好意思你没有权利操作!");
            }
        }
        if (obj == 5) {
            if (test == '1') {
                $("#frm_right").attr("src", url + "?page=1&Sname=");
            } else {
                alert("不好意思你没有权利操作!");
            }
        }
        if (obj == 6) {
            $("#frm_right").attr("src", url);
        }
        if(obj==7){
            $("#frm_right").attr("src", url+"?que=");
        }
        if(obj==8){
            $("#frm_right").attr("src", url+"?que=");
        }
    }

    //选择图片
    function doUpload() {
        $('#pictureImg').click();
    }

    //选择图片
    function photoImgChange() {
        var img = $('#pictureImg').val();
        if (oc.photoValid(img)) {
            oc.previewUploadImg('pictureImg', 'coursePicture');
            $('#coursePicture').show();
            $('#imgErrSpan').html('');
            return;
        } else {
            $('#imgErrSpan').html('&nbsp;请选择png,jpeg,jpg格式图片');
            $('#coursePicture').val('');
        }
    }

    function outUser() {
        var status = this.confirm('确定退出？');
        if (!status) {
            return;
        }
        $.ajax({
            url: '${PATH}loginOut.html',
            type: 'POST',
            success: function (resp) {
                if (resp == 1) {
                    window.location.href = "index.html";
                }
            }
        });
    }

    function updateUser() {
        var username = '${username}';
        $('#name').attr('disabled', 'disabled');
        $('#username').attr('disabled', 'disabled');
        $('#status').attr('disabled', 'disabled');
        $('#education').attr('disabled', 'disabled');
        $('#college').attr('disabled', 'disabled');
        $('#title').attr('disabled', 'disabled');
        $('#weight').attr('disabled', 'disabled');
        $.ajax({
            type: 'post',
            url: '${PATH}getUserToUsername.html',
            data: {"username": username},
            dataType: 'json',
            success: function (data) {
                $("#userInfomation").fill(data);
                $("#updateModal").modal('show');
            }
        });
    }

    function doAddUserSave() {
        var formData = new FormData($("#userInfomation")[0]);
        $.ajax({
            url: '${PATH}saveUser.html',
            type: 'post',
            dataType: 'json',
            data: formData,
            processData: false,
            contentType: false,
            success: function (data) {
                if (data == 1) {
                    //window.location.href="login.html";
                    alert("修改成功");
                    $('#updateModal').modal('hide');
                } else {
                    alert("修改失败");
                }
            }
        });
    }
</script>
</html>
