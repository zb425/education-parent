<%@ page language="java"  contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%
    /*获取工程路径*/
    String path = request.getContextPath();
    request.setAttribute("PATH", path);
%>
<html>
<head>
    <title>教师管理</title>
    <meta charset="utf-8">
    <meta content="IE=edge,chrome=1" http-equiv="X-UA-Compatible">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta name="description" content="">
    <%--<!-- 引入资源文件 -->
    <link href="${s.base}/css/remodal.css" rel="stylesheet" type="text/css">
    <link href="${s.base}/css/remodal-default-theme.css" rel="stylesheet" type="text/css">
    <link href="${PATH}/css/bootstrap.min.css" rel="stylesheet" type="text/css"/>
    <link href="${PATH}/css/style.css" rel="stylesheet" type="text/css"/>
    <script type="text/javascript" src="${PATH}/js/jquery.min.js"></script>
    <script type="text/javascript" src="${PATH}/js/jquery-1.11.3.min.js"></script>
    <script type="text/javascript" src="${PATH}/js/jquery.form.js"></script>
    <script type="text/javascript" src="${PATH}/js/bootstrap.min.js"></script>
    <script type="text/javascript" src="${PATH}/js/highcharts-4.1.min.js"></script>
    <script type="text/javascript" src="${PATH}/js/oc.min.js"></script>
    <script type="text/javascript" src="${s.base}/js/remodal.min.js"></script>
    <link rel="icon" type="image/png" href="${s.base}/images/loc.jpg" sizes="16x16">--%>

    <!-- 引入资源文件 -->
    <link href="${s.base}/css/remodal.css" rel="stylesheet" type="text/css">
    <link href="${s.base}/css/remodal-default-theme.css" rel="stylesheet" type="text/css">
    <link href="${s.base}/css/bootstrap.min.css" rel="stylesheet" type="text/css"/>
    <link href="${s.base}/css/style.css" rel="stylesheet" type="text/css"/>
    <script type="text/javascript" src="${s.base}/js/jquery-1.11.3.min.js"></script>
    <script type="text/javascript" src="${s.base}/js/jquery.form.js"></script>
    <script type="text/javascript" src="${s.base}/js/bootstrap.min.js"></script>
    <script type="text/javascript" src="${s.base}/js/highcharts-4.1.min.js"></script>
    <script type="text/javascript" src="${s.base}/js/oc.min.js"></script>
    <script type="text/javascript" src="${s.base}/js/remodal.min.js"></script>
</head>
<body>

<form id="queryPageForm" class="mt-15" action="${PATH}/course/userPageList.html?page=1" method="POST">
    <div class="block span6">
        <a class="block-heading f-14" data-toggle="collapse">教师管理</a>
        <div class="block-body collapse in">
            <p>
                <select name="status" class="search-select">
                    <option value="-1">全部</option>
                    <option value="2">可用</option>
                    <option value="0">禁用</option>
                </select>
            </p>
            <p>
                <input name="username" type="text" value="${userPage.name}" class="search-text"
                       placeholder="请输入登录名">
            </p>
            <p>
                <input type="submit" class="search-btn" value="搜索">
                <input type="button" id="addUser" class="search-btn" value="添加">
            </p>
        </div>
    </div>

    <div class="row-fluid">
        <div class="block span6">
            <div id="tablewidget" class="block-body collapse in">
                <table class="table">
                    <thead>
                    <tr>
                        <th>姓名</th>
                        <th>登录名</th>
                        <th>学历</th>
                        <th>学校</th>
                        <th>手机</th>
                        <th>状态</th>
                        <th>性别</th>
                        <th>权重</th>
                        <th>操作</th>
                    </tr>
                    </thead>
                    <tbody>
                    <c:forEach items="${userPage.rows}" var="user">
                        <tr>
                            <td>${user.zbRealname}</td>
                            <td>${user.zbUsername}</td>
                            <td>${user.zbEducation}</td>
                            <td>${user.zbCollegeName}</td>
                            <td>${user.zbMobile}</td>
                            <td>
                                <c:choose>
                                    <c:when test="${user.zbStatus=='2'}">
                                        可用
                                    </c:when>
                                    <c:when test="${user.zbStatus=='0'}">
                                        禁用
                                    </c:when>
                                    <c:otherwise>
                                        未知
                                    </c:otherwise>
                                </c:choose>
                            </td>
                            <td>
                                <c:choose>
                                    <c:when test="${user.zbGender=='0'}">
                                        女
                                    </c:when>
                                    <c:otherwise>
                                        男
                                    </c:otherwise>
                                </c:choose>
                            </td>
                            <td>${user.zbWeight}</td>
                            <td>
                                <a href="javascript:void(0)" onclick="toEdit(${user.zbId});">修改</a>
                                <a href="javascript:void(0)" onclick="toDelete(${user.zbId});">删除</a>
                            </td>
                        </tr>
                    </c:forEach>
                    </tbody>
                </table>
                <p>
                <div class="page-box clearfix">
                    <div class="page clearfix">
                        <div style="float:left;">
                            <c:choose>
                                <c:when test="${userPage.pageNow>'1'}">
                                    <a class="page-next"
                                       href="${PATH}/user/course.html?page=1&username=${userPage.name}">首 页</a>
                                    <a class="page-next"
                                       href="${PATH}/user/course.html?page=${userPage.pageNow-1}&username=${userPage.name}">上一页</a>
                                </c:when>
                                <c:otherwise>
                                    <a class="page-next" href="javascript:void(0);" title="已是首页">首 页</a>
                                    <a class="page-next" href="javascript:void(0);" title="已是第一页">上一页</a>
                                </c:otherwise>
                            </c:choose>
                            <a class="page-cur" href="javascript:void(0);">${userPage.pageNow}</a>
                            <a class="page-num" href="javascript:void(0);" onclick="queryPageClick('1');">2</a>
                            <a class="page-num" href="javascript:void(0);" onclick="queryPageClick('3');">3</a>
                            <span class="page-omit">...</span>
                            <c:choose>
                                <c:when test="${userPage.pageNow<userPage.total/20}">
                                    <a class="page-next"
                                       href="${PATH}/user/course.html?page=${userPage.pageNow+1}&username=${userPage.name}">下一页</a>
                                    <a class="page-next"
                                       href="${PATH}/user/course.html?page=${userPage.totalPage}&username=${userPage.name}">尾
                                        页</a>
                                </c:when>
                                <c:otherwise>
                                    <a class="page-next" href="javascript:void(0);" title="没有下一页">下一页</a>
                                    <a class="page-next" href="javascript:void(0);" title="已到最后一页">尾 页</a>
                                </c:otherwise>
                            </c:choose>
                        </div>
                    </div>
                </div>
                </p>
            </div>
        </div>
    </div>
</form>

<!-- 弹出层 -start -->
<div class="modal fade " id="myModal" tabindex="-1" role="dialog" aria-hidden="true">
    <div class="modal_wapper">
        <div class="modal-dialog ">
            <div class="modal-content">
                <div class="modal-header">
                    <button type="button" class="close" data-dismiss="modal" aria-label="Close">
                        <span aria-hidden="true">×</span>
                    </button>
                    <h4 class="modal-title">修改教师信息</h4>
                </div>

                <div class="modal-body">
                    <form id="myForm" role="form" id="ff" action="${PATH}/course/doMerge.html" >
                        <input type="hidden" name="zbId"/>
                        <div class="form-group">
                            <label for="name">名称</label>
                            <input type="text" class="form-control" readonly="readonly" name="zbRealname"
                                   placeholder="请输入名称">
                        </div>
                        <div class="form-group">
                            <label for="name">登录名</label>
                            <input type="text" class="form-control" readonly="readonly" name="zbUsername"
                                   placeholder="请输入名称">
                        </div>
                        <div class="form-group">
                            <label for="name">状态</label>
                            <select id="status" name="zbStatus" class="form-control" type="select">
                                <option value="2">可用</option>
                                <option value="0">禁用</option>
                            </select>
                        </div>
                    </form>
                </div>

                <div class="modal-footer">
                    <button type="button" class="btn btn-default" onclick="doSave();">保存</button>
                    <button type="button" class="btn btn-default" data-dismiss="modal">关闭</button>
                </div>
            </div>
        </div>
    </div>
</div>
<!-- 弹出层 -end -->

<%--添加弹出层--%>
<%--<div class="modal fade " id="addModal" tabindex="-1" role="dialog" aria-hidden="true">
    <div class="modal_wapper">
        <div class="modal-dialog ">
            <div class="modal-content">
                <div class="modal-header">
                    <button type="button" class="close" data-dismiss="modal" aria-label="Close">
                        <span aria-hidden="true">×</span>
                    </button>
                    <h4 class="modal-title">添加教师信息</h4>
                </div>
                <div class="block span6" id="addDiv">
                    <div class="block-body collapse in" style="padding-top:10px;">
                        <form role="form" id="userMessge" action="${PATH}/course/saveUser.html" method="post"
                              enctype="multipart/form-data">
                            <div class="form-group clearfix">
                                <label class="control-label">头像<span id="imgErrSpan" style="color:red;font-weight:normal;"></span>
                                </label>
                                <div class="col-sm-10">
                                    <input type="file" id="pictureImg" name="file" style="display: none;"
                                           onchange="photoImgChange();">
                                    <div class="ui-avatar-box">
                                        <img id="coursePicture" style="max-width: 250px;height:120px;">
                                        <a href="javascript:void(0);" onclick="doUpload();"
                                           style="text-decoration: underline;margin-top:5px;">选择图片</a>
                                    </div>
                                </div>
                            </div>
                            <div class="form-group clearfix">
                                <label class="control-label">登录用户名</label>
                                <div class="col-sm-10">
                                    <input type="text" class="form-control" name="zbRealname" id="name" placeholder="请输入用户名">
                                </div>
                            </div>
                            <div class="form-group clearfix">
                                <label class="control-label">真实姓名</label>
                                <div class="col-sm-4">
                                    <input type="text" name="zbUsername" class="form-control" placeholder="请输入姓名"/>
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
                                    <select name="zbStatus" class="form-control" type="select">
                                        <option value="2">可用</option>
                                        <option value="0">禁用</option>
                                    </select>
                                </div>
                                <label class="control-label">学历</label>
                                <div class="col-sm-4">
                                    <select name="zbEducation" class="form-control" type="select">
                                        &lt;%&ndash;大专、本科、硕士、博士、博士后&ndash;%&gt;
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
                                    <input type="text" name="zbCollegeName" class="form-control" placeholder="请输入大学名称"/>
                                </div>

                                <label class="control-label">头衔</label>
                                <div class="col-sm-4">
                                    <input type="text" name="zbTitle" class="form-control" placeholder="请输入头衔"/>
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
                                    <input type="text" name="zbWeight" class="form-control" placeholder="请输入权重"/>
                                </div>
                            </div>
                            <div class="form-group clearfix">
                                <label class="control-label">生日</label>
                                <div class="col-sm-4">
                                    <input type="text" class="form-control" name="zbBirthday" placeholder="请输入生日(yyyy-mm-dd)">
                                </div>
                            </div>
                            <div class="modal-footer">
                                <button type="button" class="btn btn-default" onclick="doAddUserSave();" value="保存">保存</button>
                                <button type="button" class="btn btn-default" data-dismiss="modal">关闭</button>
                            </div>
                        </form>
                    </div>
                </div>
            </div>
        </div>
    </div>
</div>--%>
<div class="modal fade " id="addModal" tabindex="-1" role="dialog" aria-hidden="true">
    <div class="modal_wapper">
        <div class="modal-dialog ">
            <div class="modal-content">
                <div class="modal-header">
                    <button type="button" class="close" data-dismiss="modal" aria-label="Close">
                        <span aria-hidden="true">×</span>
                    </button>
                    <h4 class="modal-title">添加教师信息</h4>
                </div>
                <div class="block span6" id="addDiv">
                    <div class="block-body collapse in" style="padding-top:10px;">
                        <form role="form" id="courseForm" action="${PATH}/course/saveUser.html" method="post"
                              enctype="multipart/form-data">
                            <div class="form-group clearfix">
                                <label class="control-label">图片 <span id="imgErrSpan"
                                                                      style="color:red;font-weight:normal;"></span>
                                </label>
                                <div class="col-sm-10">
                                    <input type="file" id="pictureImg" name="file"
                                           style="display: none;"
                                           onchange="photoImgChange();">
                                    <div class="ui-avatar-box">
                                        <img id="coursePicture" style="max-width: 250px;height:120px;">
                                        <a href="javascript:void(0);" onclick="doUpload();"
                                           style="text-decoration: underline;margin-top:5px;">选择图片</a>
                                    </div>
                                </div>
                            </div>
                            <div class="form-group clearfix">
                                <label class="control-label">登录用户名</label>
                                <div class="col-sm-10">
                                    <input type="text" class="form-control" name="zbRealname" id="name" placeholder="请输入用户名">
                                </div>
                            </div>
                            <div class="form-group clearfix">
                                <label class="control-label">真实姓名</label>
                                <div class="col-sm-4">
                                    <input type="text" name="zbUsername" class="form-control" placeholder="请输入姓名"/>
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
                                    <select name="zbStatus" class="form-control" type="select">
                                        <option value="2">可用</option>
                                        <option value="0">禁用</option>
                                    </select>
                                </div>
                                <label class="control-label">学历</label>
                                <div class="col-sm-4">
                                    <select name="zbEducation" class="form-control" type="select">
                                        <%--&lt;%&ndash;大专、本科、硕士、博士、博士后&ndash;%&gt;--%>
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
                                    <input type="text" name="zbCollegeName" class="form-control" placeholder="请输入大学名称"/>
                                </div>

                                <label class="control-label">头衔</label>
                                <div class="col-sm-4">
                                    <input type="text" name="zbTitle" class="form-control" placeholder="请输入头衔"/>
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
                                    <input type="text" name="zbWeight" class="form-control" placeholder="请输入权重"/>
                                </div>
                            </div>
                            <div class="modal-footer">
                                <input type="button" class="btn btn-default" onclick="doAddUserSave();" value="保存">
                                <button type="button" class="btn btn-default" data-dismiss="modal">关闭</button>
                            </div>
                        </form>
                    </div>

                </div>
            </div>
        </div>
    </div>
</div>

<script type="text/javascript">
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

    function toEdit(id) {
        $.ajax({
            url: '${PATH}/course/getById.html',
            type: 'POST',
            dataType: 'json',
            data: {"id": id},
            success: function (resp) {
                $("#myForm").fill(resp);
                $('#myModal').modal('show');
            }
        });
    }

    function toDelete(id) {
        $.ajax({
            url: '${PATH}/course/deleteById.html',
            type: 'post',
            dataType: 'json',
            data: {"id": id},
            success: function (data) {
                if (data == 1) {
                    alert("删除成功");
                    location.reload();
                } else {
                    alert("删除失败");
                }
            }
        });
    }

    $("#addUser").click(function () {
        $("#addModal").modal('show');
    });

    function doSave() {
        $('#myForm').ajaxSubmit({
            datatype: 'json',
            success: function (resp) {
                if (resp == 0) {
                    location.reload();
                    $('#myModal').modal('hide');
                } else {
                    Modal.tipFailure(resp.message);//失败提示
                }
            },
            error: function () {
                Modal.tipFailure('保存失败');
            }
        });
    }
    function doAddUserSave() {
        var fd=new FormData($("#courseForm")[0]);
        alert($("#courseForm").serialize());
        $.ajax({
            url: '${PATH}/course/saveUser.html',
            type: 'POST',
            data: fd,
            dataType:'json',
            async: false,
            cache: false,
            contentType: false,
            processData: false,
            success: function (data) {
                if(data==1){
                    alert("添加成功");
                    location.reload();
                    $('#addModal').modal('hide');
                }
            },
            error: function (data) {
                alert("失败");
            }
        });
    }

</script>

</body>
</html>
