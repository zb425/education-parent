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
    <title>后台管理</title>
    <meta charset="utf-8">
    <meta content="IE=edge,chrome=1" http-equiv="X-UA-Compatible">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta name="description" content="">
    <!-- 引入资源文件 -->
    <link href="${s.base}/css/bootstrap.min.css" rel="stylesheet" type="text/css"/>
    <link href="${s.base}/css/style.css" rel="stylesheet" type="text/css"/>
    <script type="text/javascript" src="${s.base}/js/jquery-1.11.3.min.js"></script>
    <script type="text/javascript" src="${s.base}/js/jquery.form.js"></script>
    <script type="text/javascript" src="${s.base}/js/bootstrap.min.js"></script>
    <script type="text/javascript" src="${s.base}/js/highcharts-4.1.min.js"></script>
    <script type="text/javascript" src="${s.base}/js/oc.min.js"></script>
</head>

<body>

<input type="button" class="search-btn mt-10" style="margin-left: 15px;" onclick="toEdit();" value=" 添加分类"/>

<div class="container-fluid pt-10">

    <div class="panel panel-5">
        <a class="block-heading f-14" data-toggle="collapse">一级分类</a>
        <div class="block-body collapse in">
            <table class="table">
                <thead>
                <tr>
                    <th>名称</th>
                    <th>编码</th>
                    <th>操作</th>
                </tr>
                </thead>
                <tbody>
                <c:forEach items="${courseType}" var="course">
                    <c:if test="${course.zbParentCode=='0'}">
                        <tr class="tr-bg-gray" code="${course.zbCode}">
                            <td>${course.zbName}</td>
                            <td>${course.zbCode}</td>
                            <td>
                                <a class="link-a" id="toEdit" href="javascript:void(0)"
                                   onclick="toEdit(${course.zbId})">修改</a>
                                <a class="link-a" href="javascript:void(0)" onclick="doDelete(${course.zbId})">删除</a>
                            </td>
                        </tr>
                    </c:if>
                </c:forEach>
                </tbody>
            </table>
        </div>
    </div>

    <div class="panel panel-5">
        <a class="block-heading f-14" data-toggle="collapse">二级分类</a>
        <div class="block-body collapse in">
            <table id="subClassifysTable" class="table">
                <thead>
                <tr name="th">
                    <th>名称</th>
                    <th>编码</th>
                    <th>一级分类编码</th>
                    <th>操作</th>
                </tr>
                </thead>
                <tbody>
                <c:forEach items="${courseType}" var="subCourse">
                    <c:if test="${subCourse.zbParentCode!='0'}">
                        <tr code="${item.code}" parentCode="${subCourse.zbParentCode}">
                            <td>${subCourse.zbName}</td>
                            <td>${subCourse.zbCode}</td>
                            <td>${subCourse.zbParentCode}</td>
                            <td>
                                <a class="link-a" href="javascript:void(0)" onclick="toEdit(${subCourse.zbId})">修改</a>
                                <a class="link-a" href="javascript:void(0)" onclick="doDelete(${subCourse.zbId})">删除</a>
                            </td>
                        </tr>
                    </c:if>
                </c:forEach>
                </tbody>
            </table>
        </div>
    </div>
</div>


<!-- 弹出层 -start -->
<div class="modal" id="myModal" tabindex="-1" role="dialog" aria-hidden="true">
    <div class="modal_wapper">
        <div class="modal-dialog w-8">
            <div class="modal-content">
                <div class="modal-header">
                    <button type="button" class="close" data-dismiss="modal" aria-label="Close">
                        <span aria-hidden="true">×</span>
                    </button>
                    <h4 class="modal-title">课程分类</h4>
                </div>

                <div class="modal-body">
                    <form role="form" id="myForm" method="post" action="${s.base}/classify/saveCourseType.html">
                        <input type="hidden" name="zbId" value=""/>
                        <div class="form-group">
                            <label for="name">一级分类</label>
                            <select name="zbParentCode" class="form-control" type="select">
                                <option value="0">总分类</option>
                                <c:forEach items="${courseType}" var="courseType">
                                    <c:if test="${courseType.zbParentCode=='0'}">
                                        <option value="${courseType.zbCode}">${courseType.zbName}</option>
                                    </c:if>
                                </c:forEach>
                            </select>
                        </div>
                        <div class="form-group">
                            <label for="name">名称</label>
                            <input type="text" class="form-control" name="zbName" id="name" placeholder="请输入名称">
                        </div>
                        <div class="form-group">
                            <label for="name">编码</label>
                            <input type="text" class="form-control" name="zbCode" id="code" placeholder="请输入编码">
                        </div>
                    </form>
                    <!-- tip提示-start -->
                    <div id="_ocAlertTip" class="alert alert-success f-16" style="display: none;"></div>
                    <!-- tip提示-end -->
                </div>

                <div class="modal-footer">
                    <button type="button" class="btn btn-primary" onclick="doSave();">保存</button>
                    <button type="button" class="btn btn-default" data-dismiss="modal">关闭</button>
                </div>
            </div>
        </div>
    </div>
</div>
<!-- 弹出层 -end -->

<!-- 弹出层 alert 信息 -->
<div class="modal" id="_ocDialogModal" tabindex="-1" aria-hidden="true">
    <div class="modal_wapper small">
        <div class="modal-dialog w-4">
            <div class="modal-content">
                <div class="modal-header">
                    <div class="modal-title f-16">修改分类</div>
                </div>
                <div class="modal-body">
                    <form id="courseForm" role="form" method="post" id="ff" action="${PATH}/classify/saveCourse.html">
                        <input type="hidden" name="zbId"/>
                        <div class="form-group">
                            <label for="name">名称</label>
                            <input type="text" class="form-control" name="zbName"
                                   placeholder="请输入名称">
                        </div>
                        <div class="form-group">
                            <label for="name">编码</label>
                            <input type="text" class="form-control" readonly="readonly" name="zbCode"
                                   placeholder="请输入编码">
                        </div>
                        <div class="form-group">
                            <label for="name">排序</label>
                            <input type="text" class="form-control" name="zbSort"
                                   placeholder="请输入排序">
                        </div>
                    </form>
                </div>
                <div class="modal-footer">
                    <button type="button" class="btn btn-default" onclick="doAddCourseTypeSave();">保存</button>
                    <button type="button" class="btn btn-default" data-dismiss="modal">关闭</button>
                </div>
            </div>
        </div>
    </div>
</div>
<!-- 弹出层 alert 信息 -->

<script type="text/javascript">
    $(function () {
        //一级分类点击，过滤二级分类
        $('.tr-bg-gray').click(function () {
            var code = $(this).attr('code');
            $('#subClassifysTable').find('tr').each(function (i, item) {
                if ($(item).attr('parentCode') == code) {
                    $(item).show();
                } else {
                    if ($(item).attr('name') != 'th') {
                        $(item).hide();
                    }
                }
            });
        });

    });

    //添加 & 编辑
    function toEdit(id) {
        if (id == undefined) {
            Modal.show('myModal');
            $('#code').removeAttr('disabled');
        } else {
            $('#code').attr('disabled', 'disabled');
            $.ajax({
                url: '${PATH}/classify/getById.html',
                type: 'POST',
                dataType: 'json',
                data: {"id": id},
                success: function (resp) {
                    $("#courseForm").fill(resp);
                    $("#_ocDialogModal").modal('show');
                }
            });
        }

    }

    //保存
    function doSave() {
        $('#myForm').ajaxSubmit({
            type: 'post',
            datatype: 'json',
            success: function (resp) {
                if (resp == 1) {
                    alert("添加成功")
                    $('#myModal').modal('hide');
                    window.location.reload();//刷新
                } else {
                    Modal.tipFailure(resp.message);//失败提示
                }
            },
            error: function () {
                Modal.tipFailure('保存失败');
            }
        });
    }

    //删除
    function doDelete(id) {
        var status = this.confirm('确定删除？');
        if (!status) {
            return;
        }
        $.ajax({
            url: '${PATH}/classify/deleteLogic.html',
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

    function doAddCourseTypeSave() {
        $("#courseForm").ajaxSubmit({
            dataType: 'json',
            success: function (resp) {
                if (resp == 1) {
                    location.reload();
                    $('#_ocDialogModal').modal('hide');
                } else {
                    Modal.tipFailure(resp.message);//失败提示
                }
            },
            error: function () {
                Modal.tipFailure('保存失败');
            }
        });
    }

</script>

</body>
</html>
