<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%
    /*获取工程路径*/
    String path = request.getContextPath();
    request.setAttribute("PATH", path);
%>
<html>
<head>
    <title>后台管理</title>
    <meta charset="utf-8">
    <meta content="IE=edge,chrome=1" http-equiv="X-UA-Compatible">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta name="description" content="">
    <!-- 引入资源文件 -->
    <link href="${PATH}/css/bootstrap.min.css" rel="stylesheet" type="text/css"/>
    <link href="${PATH}/css/style.css" rel="stylesheet" type="text/css"/>
    <script type="text/javascript" src="${PATH}/js/jquery-1.11.3.min.js"></script>
    <script type="text/javascript" src="${PATH}/js/jquery.form.js"></script>
    <script type="text/javascript" src="${PATH}/js/bootstrap.min.js"></script>
    <script type="text/javascript" src="${PATH}/js/highcharts-4.1.min.js"></script>
    <script type="text/javascript" src="${PATH}/js/oc.min.js"></script>
    <link rel="icon" type="image/png" href="${PATH}/images/ico.png" sizes="16x16">
</head>
<body>
<div class="container-fluid">

    <div class="block span6">
        <div class="block-body collapse in">
            <!-- 课程基本信息 -->
            <table class="table list">
                <tbody>
                <tr>
                    <td style="width: 600px;">
                        <c:choose>
                            <c:when test="${course.zbPicture!=''}">
                                <img src="${course.zbPicture}" style="width: 180px;height:100px;float: left;">
                            </c:when>
                            <c:otherwise>
                                <img src="${s.base}/images/course.png" style="width: 180px;height:100px;float: left;">
                            </c:otherwise>
                        </c:choose>
                        <div class="ml-15 w-350" style="float:left;">
                            <p class="ellipsis" title="${course.zbName}"><strong>${course.zbName}</strong></p>
                            <p class="ellipsis-multi h-40" title="${course.zbBrief}">${course.zbBrief}</p>
                        </div>
                    </td>
                    <td>
                        <p>${course.zbTime}</p>
                        <p style="color: red;">
                            <c:choose>
                                <c:when test="${course.zbPrice=='1'}">
                                    免费
                                </c:when>
                                <c:otherwise>
                                    ￥${course.zbPrice}
                                </c:otherwise>
                            </c:choose>
                        </p>
                        <p>
                            <c:choose>
                                <c:when test="${course.zbLevel=='1'}">
                                    初级
                                </c:when>
                                <c:when test="${course.zbLevel=='2'}">
                                    中级
                                </c:when>
                                <c:otherwise>
                                    高级
                                </c:otherwise>
                            </c:choose>
                        </p>
                    </td>
                    <td>
                        <p>${course.zbCoursetypeName} / ${course.zbSubCoursetypeName}</p>
                        <p>${course.zbStudyCount}人在学</p>
                        <p>${course.zbUsername}</p>
                        <p><fmt:formatDate value="${course.zbUpdateTime}" pattern="yyyy-MM-dd MM:dd:yy"/></p>
                    </td>
                    <td style="width:120px;">
                        <p>推荐权重：${course.zbWeight}</p>
                    </td>
                </tr>
                </tbody>
            </table>
        </div>
    </div>

    <div class="row-fluid">
        <ul id="myTab" class="nav nav-tabs">
            <li class="active">
                <a href="#section" data-toggle="tab">章节</a>
            </li>
            <li><a href="javascript:void(0)" style="cursor: pointer" id="delete" data-toggle="tab">删除</a></li>
            <li><a href="javascript:void(0)" style="cursor: pointer" id="update" data-toggle="tab">修改</a></li>
        </ul>

        <div id="myTabContent" class="tab-content" style="padding: 10px;">
            <div class="tab-pane fade in active" id="section">
                <c:forEach items="${section}" var="scourse">
                    <div class="chapter" id="chapter-${scourse.zbId}">
                        <c:if test="${scourse.zbParentId=='0'}">
                            <h3>
                                <strong id="sectionTitle_${scourse.zbId}">${scourse.zbName}(${scourse.zbTime})</strong>
                                <a href="javascript:void(0);" class="chapter-edit" style="margin-right:20px;"
                                   onclick="doDeleteSection(${scourse.zbId})">删除</a>
                                <a href="javascript:void(0);" class="chapter-edit"
                                   onclick="toEditSection(${scourse.zbId})">修改</a>
                            </h3>
                            <select name="selectSection" id="selectSection" class="chapter-sub" style="width: 200px;height: 40px;">
                                <option value="">--请选择--</option>
                                <c:forEach items="${section}" var="sectionNext">
                                    <c:if test="${sectionNext.zbParentId==scourse.zbId}">
                                        <option value="${sectionNext.zbId}">${sectionNext.zbName}</option>
                                    </c:if>
                                </c:forEach>
                            </select>
                        </c:if>
                    </div>
                </c:forEach>
            </div>
        </div>
    </div>

</div>

<!-- 课程信息弹出层 -start -->
<div class="modal" id="myModal" tabindex="-1" role="dialog" aria-hidden="true">
    <div class="modal_wapper">
        <div class="modal-dialog w-8">
            <div class="modal-content">
                <div class="modal-header">
                    <button type="button" class="close" data-dismiss="modal" aria-label="Close">
                        <span aria-hidden="true">×</span>
                    </button>
                    <h4 class="modal-title">章节基本信息</h4>
                </div>

                <div class="modal-body">
                    <form role="form" id="courseForm" method="post" action="${PATH}courseNextUpdate.html"
                          enctype="multipart/form-data">
                        <input type="hidden" name="zbId" value=""/>
                        <div class="form-group clearfix">
                            <label class="control-label">章节名称</label>
                            <div class="col-sm-10">
                                <input type="text" class="form-control" name="zbName" placeholder="请输入名称">
                            </div>
                        </div>
                        <div class="form-group clearfix">
                            <label class="control-label">课程ID</label>
                            <div class="col-sm-4">
                                <input type="text" name="zbCourseId" id="courseId" class="form-control"/>
                            </div>
                            <label class="control-label">章节父节点ID</label>
                            <div class="col-sm-4">
                                <input type="text" name="zbParentId" id="parentId" class="form-control"/>
                            </div>
                        </div>
                        <div class="form-group clearfix">
                            <label class="control-label">时间</label>
                            <div class="col-sm-4">
                                <input type="text" name="zbTime" class="form-control"/>
                            </div>
                            <label class="control-label">是否上线</label>
                            <div class="col-sm-4">
                                <input type="text" name="zbOnsale" class="form-control">
                            </div>
                        </div>
                        <div class="form-group clearfix">
                            <label class="control-label">原来URL</label>
                            <div class="col-sm-4">
                                <input type="text" name="zbVideoUrl" id="url">
                            </div>
                            <label class="control-label">URL</label>
                            <div class="col-sm-4">
                                <input type="file" name="file" class="form-control"/>
                            </div>
                        </div>
                    </form>
                </div>
                <div class="modal-footer">
                    <button type="button" class="btn btn-primary" onclick="doSave();">保存</button>
                    <button type="button" class="btn btn-default" data-dismiss="modal">关闭</button>
                </div>
            </div>
        </div>
    </div>
</div>



<div class="modal" id="updateModal" tabindex="-1" role="dialog" aria-hidden="true">
    <div class="modal_wapper">
        <div class="modal-dialog w-8">
            <div class="modal-content">
                <div class="modal-header">
                    <button type="button" class="close" data-dismiss="modal" aria-label="Close">
                        <span aria-hidden="true">×</span>
                    </button>
                    <h4 class="modal-title">章节基本信息</h4>
                </div>

                <div class="modal-body">
                    <form role="form" id="sectionFrom" method="post" action="${PATH}courseNextUpdate.html"
                          enctype="multipart/form-data">
                        <input type="hidden" name="zbId" value=""/>
                        <div class="form-group clearfix">
                            <label class="control-label">章节名称</label>
                            <div class="col-sm-10">
                                <input type="text" class="form-control" name="zbName" placeholder="请输入名称">
                            </div>
                        </div>
                        <div class="form-group clearfix">
                            <label class="control-label">课程ID</label>
                            <div class="col-sm-4">
                                <input type="text" name="zbCourseId" id="sectionCourseId" class="form-control"/>
                            </div>
                            <label class="control-label">章节父节点ID</label>
                            <div class="col-sm-4">
                                <input type="text" name="zbParentId" id="sectionParentId" class="form-control"/>
                            </div>
                        </div>
                        <div class="form-group clearfix">
                            <label class="control-label">是否上线</label>
                            <div class="col-sm-4">
                                <input type="text" name="zbOnsale" class="form-control">
                            </div>
                        </div>
                    </form>
                </div>
                <div class="modal-footer">
                    <button type="button" class="btn btn-primary" onclick="doSaveSection();">保存</button>
                    <button type="button" class="btn btn-default" data-dismiss="modal">关闭</button>
                </div>
            </div>
        </div>
    </div>
</div>
<!-- 课程信息弹出层 -end -->

<script type="text/javascript">
    //保存
    function doSave() {
        var fd=new FormData($("#courseForm")[0]);
        $.ajax({
           type:'post',
           url:'${PATH}updateCourseNext.html',
           data:fd,
           dataType:'json',
            contentType: false,
            processData: false,
           success:function (data) {
               if(data==1){
                   alert("修改成功");
                   window.location.reload();
               }
           }
        });

    }


    $("#update").click(function () {
        var str = [];
        $("select[name='selectSection']").each(function () {
            var type = $(this).val();
            if (type != null && type != "") {
                str.push(type);
            }
        });
        if (str.length > 1) {
            alert("一次只能修改一个");
            return;
        }else if(str.length==0){
            alert("请选择一个修改");
            return;
        }
        $("#courseId").attr('disabled','disabled');
        $("#parentId").attr('disabled','disabled');
        $.ajax({
            type: 'post',
            url: '${PATH}courseNextUpdate.html',
            data: {"id": str[0]},
            dataType: 'json',
            success: function (data) {
                $("#courseForm").fill(data);
                $("#myModal").modal('show');
            }
        });
    });


    $("#delete").click(function () {

        var str = [];
        $("select[name='selectSection']").each(function () {
            var type = $(this).val();
            if (type != null && type != "") {
                str.push(type);
            }
        });
        if(str.length==0){
            alert("请选择一个或多个删除");
            return;
        }
        $.ajax({
            type: 'post',
            url: '${PATH}courseNextDelete.html',
            data: {data:str},
            dataType: 'json',
            cache: false,
            traditional: true,
            success: function (data) {
                if(data==1){
                    alert("删除成功");
                    window.location.reload();
                }else{
                    alert("删除失败");
                    window.location.reload();
                }
            }
        });
    });


    function doDeleteSection(id) {
        var status = this.confirm('确定删除？');
        if (!status) {
            return;
        }
        $.ajax({
            type: 'POST',
            url: '${PATH}deleteCourse.html',
            dataType: 'json',
            data: {"id": id},
            success: function (resp) {
                if (resp == 1) {
                    alert("删除成功");
                    window.location.reload();
                }else{
                    alert("删除失败");
                }
            }
        });
    }

    function toEditSection(id) {
        $("#sectionCourseId").attr('disabled','disabled');
        $("#sectionParentId").attr('disabled','disabled');
        $.ajax({
            type: 'post',
            url: '${PATH}courseNextUpdate.html',
            data: {"id": id},
            dataType: 'json',
            success: function (data) {
                $("#sectionFrom").fill(data);
                $("#updateModal").modal('show');
            }
        });
    }

    function doSaveSection() {
        $.ajax({
            type:'post',
            url:'${PATH}updateSection.html',
            data:$("#sectionFrom").formSerialize(),
            dataType:'json',
            success:function (data) {
                if(data==1){
                    alert("修改成功");
                    window.location.reload();
                }
            }
        });

    }
</script>
</body>
</html>

