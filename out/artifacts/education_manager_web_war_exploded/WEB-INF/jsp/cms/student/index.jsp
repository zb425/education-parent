<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%
    /*获取工程路径*/
    String path = request.getContextPath();
    request.setAttribute("PATH", path);
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <title>学生管理</title>
    <!-- 引入资源文件 -->
    <link href="${s.base}/css/remodal.css" rel="stylesheet" type="text/css">
    <link href="${s.base}/css/remodal-default-theme.css" rel="stylesheet" type="text/css">
    <link href="${PATH}/css/bootstrap.min.css" rel="stylesheet" type="text/css"/>
    <link href="${PATH}/css/style.css" rel="stylesheet" type="text/css"/>
    <script type="text/javascript" src="${PATH}/js/jquery-1.11.3.min.js"></script>
    <script type="text/javascript" src="${PATH}/js/jquery.form.js"></script>
    <script type="text/javascript" src="${PATH}/js/bootstrap.min.js"></script>
    <script type="text/javascript" src="${PATH}/js/highcharts-4.1.min.js"></script>
    <script type="text/javascript" src="${PATH}/js/oc.min.js"></script>
    <script type="text/javascript" src="${s.base}/js/remodal.min.js"></script>
</head>
<body>
<form id="queryPageForm" class="mt-15" action="${PATH}index.html?page=1" method="POST">
    <div class="block span6">
        <a class="block-heading f-14" data-toggle="collapse">学生管理</a>
        <div class="block-body collapse in">
            <p>
                <input name="Sname" type="text" value="${studentList.name}" class="search-text"
                       placeholder="请输入姓名">
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
                        <th>邮箱</th>
                        <th>电话</th>
                        <th>密码</th>

                    </tr>
                    </thead>
                    <tbody>
                    <c:forEach items="${studentList.rows}" var="student">
                        <tr>
                            <td>${student.zbUsername}</td>
                            <td>${student.zbStudentEmail}</td>
                            <td>${student.zbStudentPhone}</td>
                            <td>${student.zbPassword}</td>
                            <td>
                                <a href="javascript:void(0)" onclick="toEditStudent(${student.zbStudentId});">修改</a>
                                <a href="javascript:void(0)" onclick="doDeleteStudent(${student.zbStudentId});">删除</a>
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
                                <c:when test="${studentList.pageNow>'1'}">
                                    <a class="page-next"
                                       href="${PATH}index.html?page=1&Sname=${studentList.name}">首 页</a>
                                    <a class="page-next"
                                       href="${PATH}index.html?page=${studentList.pageNow-1}&Sname=${studentList.name}">上一页</a>
                                </c:when>
                                <c:otherwise>
                                    <a class="page-next" href="javascript:void(0);" title="已是首页">首 页</a>
                                    <a class="page-next" href="javascript:void(0);" title="已是第一页">上一页</a>
                                </c:otherwise>
                            </c:choose>
                            <a class="page-cur" href="javascript:void(0);">${studentList.pageNow}</a>
                            <a class="page-num" href="javascript:void(0);" onclick="queryPageClick('1');">2</a>
                            <a class="page-num" href="javascript:void(0);" onclick="queryPageClick('3');">3</a>
                            <span class="page-omit">...</span>
                            <c:choose>
                                <c:when test="${studentList.pageNow<studentList.total/15}">
                                    <a class="page-next"
                                       href="${PATH}index.html?page=${studentList.pageNow+1}&Sname=${studentList.name}">下一页</a>
                                    <a class="page-next"
                                       href="${PATH}index.html?page=${studentList.totalPage}&Sname=${studentList.name}">尾
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

<div class="modal fade " id="addModal" tabindex="-1" role="dialog" aria-hidden="true">
    <div class="modal_wapper">
        <div class="modal-dialog ">
            <div class="modal-content">
                <div class="modal-header">
                    <button type="button" class="close" data-dismiss="modal" aria-label="Close">
                        <span aria-hidden="true">×</span>
                    </button>
                    <h4 class="modal-title">添加学生信息</h4>
                </div>
                <div class="block span6" id="addDiv">
                    <div class="block-body collapse in" style="padding-top:10px;">
                        <form role="form" id="userInfomation" method="post" action="${PATH}/course/saveUser.html"
                              enctype="multipart/form-data">
                            <input type="hidden" name="zbStudentId"/>
                            <div class="form-group clearfix">
                                <label class="control-label">用户名</label>
                                <div class="col-sm-10">
                                    <input type="text" class="form-control" name="zbUsername"
                                           placeholder="请输入用户名">
                                </div>
                            </div>
                            <div class="form-group clearfix">
                                <label class="control-label">邮箱</label>
                                <div class="col-sm-4">
                                    <input type="text" name="zbStudentEmail" id="emailStudent" class="form-control"
                                           placeholder="请输入邮箱"/>
                                </div>
                            </div>
                            <div class="form-group clearfix">
                                <label class="control-label">电话号码</label>
                                <div class="col-sm-4">
                                    <input type="text" name="zbStudentPhone" id="phone" class="form-control"
                                           placeholder="请输入电话号码"/>
                                </div>

                            </div>
                            <div class="form-group clearfix">
                                <label class="control-label">密码</label>
                                <div class="col-sm-4">
                                    <input type="password" name="zbPassword" class="form-control" placeholder="请输入密码"/>
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



<div class="modal fade " id="updateModal" tabindex="-1" role="dialog" aria-hidden="true">
    <div class="modal_wapper">
        <div class="modal-dialog ">
            <div class="modal-content">
                <div class="modal-header">
                    <button type="button" class="close" data-dismiss="modal" aria-label="Close">
                        <span aria-hidden="true">×</span>
                    </button>
                    <h4 class="modal-title">修改学生信息</h4>
                </div>
                <div class="block span6">
                    <div class="block-body collapse in" style="padding-top:10px;">
                        <form role="form" id="updateStudent" method="post" action="${PATH}/course/saveUser.html"
                              enctype="multipart/form-data">
                            <input type="hidden" name="zbStudentId"/>
                            <div class="form-group clearfix">
                                <label class="control-label">用户名</label>
                                <div class="col-sm-10">
                                    <input type="text" class="form-control" name="zbUsername" id="name"
                                           placeholder="请输入用户名">
                                </div>
                            </div>
                            <div class="form-group clearfix">
                                <label class="control-label">邮箱</label>
                                <div class="col-sm-4">
                                    <input type="email" name="zbStudentEmail" class="form-control" id="email"
                                           placeholder="请输入邮箱"/>
                                </div>
                            </div>
                            <div class="form-group clearfix">
                                <label class="control-label">电话号码</label>
                                <div class="col-sm-4">
                                    <input type="text" name="zbStudentPhone" class="form-control"
                                           placeholder="请输入电话号码"/>
                                </div>

                            </div>
                            <div class="form-group clearfix">
                                <label class="control-label">密码</label>
                                <div class="col-sm-4">
                                    <input type="password" name="zbPassword" class="form-control" placeholder="请输入密码"/>
                                </div>

                            </div>
                        </form>
                    </div>
                </div>
                <div class="modal-footer">
                    <button type="button" class="btn btn-default" onclick="doUpdateStudentSave();">保存</button>
                    <button type="button" class="btn btn-default" data-dismiss="modal">关闭</button>
                </div>
            </div>
        </div>
    </div>
</div>


<script type="text/javascript">

    $("#addUser").click(function () {
        $("#addModal").modal('show');
    });

    $("#emailStudent").change(function () {
        var email=$("input[name='zbStudentEmail']").val().trim();
        var strEmail=RegExp(/^[a-zA-Z0-9_-]+@[a-zA-Z0-9_-]+(\.[a-zA-Z0-9_-]+)+$/);
        if(!strEmail.test(email)){
            alert("请输入正确的邮箱格式");
            return;
        }
    });

    $("#phone").change(function () {
        var phone=$("input[name='zbStudentPhone']").val().trim();
        var strPhone=RegExp(/^1(3|4|5|7|8)\d{9}$/);
        if(!strPhone.test(phone)){
            alert("请输入正确的手机号码");
            return;
        }
    });

    function doAddUserSave() {
        var username=$("input[name='zbUsername']").val().trim();
        var email=$("input[name='zbStudentEmail']").val().trim();
        var phone=$("input[name='zbStudentPhone']").val().trim();
        var password=$("input[name='zbPassword']").val().trim();
        var strEmail=RegExp(/^[a-zA-Z0-9_-]+@[a-zA-Z0-9_-]+(\.[a-zA-Z0-9_-]+)+$/);
        var strPhone=RegExp(/^1(3|4|5|7|8)\d{9}$/);
        if(username==""||password==""||phone==""||password==""){
            alert("不能为空");
            return;
        }
        if(!strEmail.test(email)){
            alert("请输入正确的邮箱格式");
            return;
        }
        if(!strPhone.test(phone)){
            alert("请输入正确的手机号码");
            return;
        }

        $.ajax({
            url: '${PATH}saveStudent.html',
            type: 'post',
            dataType: 'json',
            data: $("#userInfomation").formSerialize(),
            success: function (data) {
                if (data == 1) {
                    alert("添加成功");
                    location.reload();
                    $('#addModal').modal('hide');
                } else {
                    alert("添加失败");
                }
            }
        });
    }

    function doDeleteStudent(id) {
        var status = this.confirm('确定删除？');
        if (!status) {
            return;
        }
        $.ajax({
            url: '${PATH}/student/deleteStudent.html',
            type: 'POST',
            dataType: 'json',
            data: {"id": id},
            success: function (resp) {
                if (resp == 1) {
                    alert("删除成功");
                    window.location.reload();
                }
            }
        });
    }

    function toEditStudent(id) {
        $('#email').attr('disabled', 'disabled');
        $('#name').attr('disabled', 'disabled');
        $.ajax({
            url: '${PATH}/student/getStudentID.html',
            type: 'POST',
            dataType: 'json',
            data: {"id": id},
            success: function (resp) {
                $("#updateStudent").fill(resp);
                $("#updateModal").modal('show');
            }
        });
    }

    function doUpdateStudentSave() {
        $.ajax({
            url: '${PATH}updateStudent.html',
            type: 'post',
            dataType: 'json',
            data: $("#updateStudent").formSerialize(),
            success: function (data) {
                if (data == 1) {
                    alert("修改成功");
                    location.reload();
                    $('#updateModal').modal('hide');
                } else {
                    alert("修改失败");
                }
            }
        });
    }
</script>
</body>
</html>
