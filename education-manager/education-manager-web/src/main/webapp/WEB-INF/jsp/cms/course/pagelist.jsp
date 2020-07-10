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
    <%@ page isELIgnored="false" %>
    <title>后台管理</title>

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
<form id="queryPageForm" class="mt-15" action="${PATH}/user/course.html?page=1" method="POST">
    <div class="row-fluid">
        <div class="cms-search">
            <%--<a href="${PATH}/user/course.html?page=1&name=${page.name}&sortTime=DESC&sortField=" sortField="update_time"
               class="search-sort-block">
                <span>更新时间</span>
                <c:choose>
                    <c:when test="${page.sortDirection==null}">
                        <span>▲</span>
                    </c:when>
                    <c:otherwise>
                        <span>▼</span>
                    </c:otherwise>
                </c:choose>
            </a>--%>
            <%--<a href="${PATH}/user/course.html?page=1&name=${page.name}&sortTime=&sortField=asc" sortField="weight"
               class="search-sort-block <c:if test="page.sortField && page.sortField == 'weight'">search-sort-block-cur</c:if>">
                <span>推荐权重</span>
                <c:choose>
                    <c:when test="${page.sortField==null}">
                        <span>▼</span>
                    </c:when>
                    <c:otherwise>
                        <span>▲</span>
                    </c:otherwise>
                </c:choose>
            </a>--%>
            <input type="text" name="name" value="${page.name}" class="search-text"
                   style="margin-top:5px;" placeholder="请输入课程名称">
            <input type="submit" class="search-btn" value="搜索"/>
            <input type="button" id="addCourse" class="search-btn" value="添加课程">
            <input type="button" id="addCourseNext" class="search-btn" value="添加课程章节">
            <p><font color="red">注:管理员可以删除全部，教师只能删除自己课程</font></p>
            </button>
        </div>
    </div>

    <div class="row-fluid">
        <div class="block span6">
            <div id="widget2container" class="block-body">
                <table class="table list">
                    <tbody>
                    <c:if test="${page.rows !=null}">
                    <c:forEach items="${page.rows}" var="item">
                    <tr id="tr-${item.zbId}">
                        <td style="width:600px;">
                            <p>
                                <a href="${PATH}/user/read.html?id=${item.zbId}">
                                    <c:choose>
                                        <c:when test="${item.zbPicture!=''}">
                                            <img src="${PATH}/upload/${item.zbPicture}"
                                                 style="width: 180px;height:100px;float: left;">
                                        </c:when>
                                        <c:otherwise>
                                            <img src="${PATH}/images/course.png"
                                                 style="width: 180px;height:100px;float: left;">
                                        </c:otherwise>
                                    </c:choose>
                                </a>
                                <div class="ml-15 w-350" style="float:left;">
                                    <a href="${PATH}/user/read.html?id=${item.zbId}">
                            <p class="ellipsis" title="${item.zbName}"><strong>${item.zbName}</strong></p></a>
                            <p class="ellipsis-multi h-40" title="${item.zbBrief}">${item.zbBrief}</p>
            </div>
            </p>
            </td>
            <td>
                <p>${item.zbTime}</p>
                <p style="color: red;">
                    <c:choose>
                        <c:when test="${item.zbFree=='0'}">
                            ￥${item.zbPrice}
                        </c:when>
                        <c:otherwise>
                            免费
                        </c:otherwise>
                    </c:choose>
                </p>
                <p>
                    <c:choose>
                        <c:when test="${item.zbLevel=='1'}">
                            初级
                        </c:when>
                        <c:when test="${item.zbLevel=='2'}">
                            中级
                        </c:when>
                        <c:otherwise>
                            高级
                        </c:otherwise>
                    </c:choose>
                </p>
            </td>
            <td>
                <p>${item.zbCoursetypeName} / ${item.zbSubCoursetypeName}</p>
                <p>${item.zbStudyCount}人在学</p>
                <p><fmt:formatDate value="${item.zbUpdateTime}" pattern="yyyy-MM-dd MM:dd:yy"/></p>
            </td>
            <td style="width:120px;">
                <p>推荐权重：${item.zbWeight}</p>
                <p>
                    <a href="${PATH}/user/update.html?id=${item.zbId}&page=1&name=">
                        <c:choose>
                            <c:when test="${item.zbOnsale>'0'}">
                                课程下架
                            </c:when>
                            <c:otherwise>
                                发布上架
                            </c:otherwise>
                        </c:choose>
                    </a>
                </p>
                <p>
                    <a href="${PATH}/user/delete.html?id=${item.zbId}&page=1&name=">删除</a>
                    <%--<c:choose>
                        <c:when test="${sessionScope.wegith}=='1'">
                            <a href="${PATH}/user/delete.html?id=${item.zbId}&page=1&name=">删除</a>
                        </c:when>
                        <c:when test="${item.zbUsername}=='${username}'">
                            <a href="${PATH}/user/delete.html?id=${item.zbId}&page=1&name=">删除</a>
                        </c:when>
                        <c:otherwise>
                            <a href="${PATH}/user/delete.html?id=${item.zbId}&page=1&name=" disabled="disabled">删除</a>
                        </c:otherwise>
                    </c:choose>--%>

                </p>
            </td>
            </tr>
            </c:forEach>
            </c:if>
            </tbody>
            </table>

            <p>
            <div class="page-box clearfix">
                <div class="page clearfix">
                    <div style="float:left;">
                        <c:choose>
                            <c:when test="${page.pageNow>'1'}">
                                <a class="page-next" href="${PATH}/user/course.html?page=1&name=${page.name}">首 页</a>
                                <a class="page-next"
                                   href="${PATH}/user/course.html?page=${page.pageNow-1}&name=${page.name}">上一页</a>
                            </c:when>
                            <c:otherwise>
                                <a class="page-next" href="javascript:void(0);" title="已是首页">首 页</a>
                                <a class="page-next" href="javascript:void(0);" title="已是第一页">上一页</a>
                            </c:otherwise>
                        </c:choose>
                        <a class="page-cur" href="javascript:void(0);">${page.pageNow}</a>
                        <a class="page-num" href="javascript:void(0);" onclick="queryPageClick('1');">2</a>
                        <a class="page-num" href="javascript:void(0);" onclick="queryPageClick('3');">3</a>
                        <span class="page-omit">...</span>
                        <c:choose>
                            <c:when test="${page.pageNow<page.total/5}">
                                <a class="page-next"
                                   href="${PATH}/user/course.html?page=${page.pageNow+1}&name=${page.name}">下一页</a>
                                <a class="page-next"
                                   href="${PATH}/user/course.html?page=${page.totalPage}&name=${page.name}">尾 页</a>
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

<!-- 弹出层 alert 信息 -->
<div class="modal fade " id="addModal" tabindex="-1" role="dialog" aria-hidden="true">
    <div class="modal_wapper">
        <div class="modal-dialog ">
            <div class="modal-content">
                <div class="modal-header">
                    <button type="button" class="close" data-dismiss="modal" aria-label="Close">
                        <span aria-hidden="true">×</span>
                    </button>
                    <h4 class="modal-title">添加课程</h4>
                </div>
                <div class="block span6" id="addDiv">
                    <div class="block-body collapse in" style="padding-top:10px;">
                        <form role="form" id="courseForm" action="${PATH}/user/saveMerge.html" method="post"
                              enctype="multipart/form-data">
                            <input type="hidden" id="courseId" name="id" value=""/>
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
                                <label class="control-label">名称</label>
                                <div class="col-sm-10">
                                    <input type="text" class="form-control" name="zbName" id="name" placeholder="请输入名称">
                                </div>
                            </div>
                            <div class="form-group clearfix">
                                <label class="control-label">分类</label>
                                <div class="col-sm-4">
                                    <select id="classify" name="zbCoursetype" class="form-control" type="select">
                                        <c:forEach items="${classPage}" var="cp">
                                            <option value="${cp.zbCode}">${cp.zbName}</option>
                                        </c:forEach>
                                    </select>
                                </div>
                                <label class="control-label">二级分类</label>
                                <div class="col-sm-4">
                                    <select id="subClassify" name="zbSubCoursetype" class="form-control" type="select">
                                        <c:forEach items="${classPage}" var="cp">
                                            <option parentCode="${cp.zbParentCode}"
                                                    value="${cp.zbCode}">${cp.zbName}</option>
                                        </c:forEach>
                                    </select>
                                </div>
                            </div>
                            <div class="form-group clearfix">
                                <label class="control-label">级别</label>
                                <div class="col-sm-4">
                                    <select name="zbLevel" class="form-control" type="select">
                                        <option value="1">初级</option>
                                        <option value="2">中级</option>
                                        <option value="3">高级</option>
                                    </select>
                                </div>
                                <label class="control-label">推荐权重</label>
                                <div class="col-sm-4">
                                    <input type="text" name="zbWeight" class="form-control"/>
                                </div>
                            </div>
                            <div class="form-group clearfix">
                                <label class="control-label">是否免费</label>
                                <div class="col-sm-4">
                                    <select name="zbFree" class="form-control" type="select">
                                        <option value="1">是</option>
                                        <option value="0">否</option>
                                    </select>
                                </div>
                                <label class="control-label">价格</label>
                                <div class="col-sm-4">
                                    <input type="text" name="zbPrice" class="form-control"/>
                                </div>
                            </div>
                            <div class="form-group clearfix">
                                <label class="control-label">讲师<span style="color:red;">*</span></label>
                                <div class="col-sm-4">
                                    <input type="text" class="form-control" name="zbUsername" placeholder="请输入讲师登录名">
                                </div>
                            </div>
                            <div class="form-group clearfix">
                                <label class="control-label">概述</label>
                                <div class="col-sm-10">
                                    <textarea name="zbBrief" rows="2" cols="60"></textarea>
                                </div>
                            </div>
                            <div class="modal-footer">
                                <input type="button" class="btn btn-default" onclick="saveCourse()" value="保存">
                                <button type="button" class="btn btn-default" data-dismiss="modal">关闭</button>
                            </div>
                        </form>
                    </div>

                </div>
            </div>
        </div>
    </div>
</div>


<%--添加课程章节信息--%>
<div class="modal fade " id="addModalNext" tabindex="-1" role="dialog" aria-hidden="true">
    <div class="modal_wapper">
        <div class="modal-dialog ">
            <div class="modal-content">
                <div class="modal-header">
                    <button type="button" class="close" data-dismiss="modal" aria-label="Close">
                        <span aria-hidden="true">×</span>
                    </button>
                    <h4 class="modal-title">添加课程章节</h4>
                </div>
                <div class="block span6" id="nextAdd">
                    <div class="block-body collapse in" style="padding-top:10px;">

                        <form role="form" id="courseNextForm" action="${PATH}/user/saveCourseNextMessge.html"
                              method="post"
                              enctype="multipart/form-data">

                            <label>课程分类</label>
                            <select id="classNext" name="zbCourseId" class="form-controller" type="select"
                                    style="width: 360px; height:30px; ">
                                <option value="0">--请选择课程--</option>
                                <c:forEach items="${allCourse}" var="pr">
                                    <option value="${pr.zbId}">${pr.zbName}</option>
                                </c:forEach>
                            </select>
                            <br>
                            <label>课程章节分类</label>
                            <select id="nextFarst" name="zbParentId" style="width: 180px; height: 30px;">
                                <option value="">--请选择章节--</option>
                            </select>
                            <div id="demoSectionDiv" sid="demoSectionDiv" class="form-group clearfix">
                                <label class="control-label" style="margin-left:55px;">节信息</label>
                                <div class="col-sm-7">
                                    <input type="text" class="form-control" name="zbName" placeholder="请输入节名称"
                                           style="margin-bottom:5px;">
                                    <input type="file" class="form-control" name="file" placeholder="请输入视频链接"
                                           style="margin-bottom:5px;">
                                    <input type="text" class="form-control" id="submit" name="zbTime"
                                           placeholder="请输入时长 00:00"
                                           style="margin-bottom:5px;">
                                </div>
                            </div>

                            <div class="modal-footer">
                                <input type="button" class="btn btn-default" onclick="saveCourseNext()" value="保存">
                                <button type="button" class="btn btn-default" data-dismiss="modal">关闭</button>
                            </div>
                        </form>
                    </div>

                </div>
            </div>
        </div>
    </div>
</div>

</body>
<script type="text/javascript">
    /*$(function () {
       alert(${sessionScope.wegith}=='1');
    });*/

    $("#addCourse").click(function () {
        $("#addModal").modal('show');
    });

    $("#addCourseNext").click(function () {
        $("#addModalNext").modal('show');
    });

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

    $(".form-controller").change(function () {
        var text = $("#classNext").val();
        $.ajax({
            type: "POST",
            url: "${PATH}/user/getCourseSectionID.html",
            data: {cId: text},
            dataType: "json",
            success: function (data) {
                if (data.length > 0) {
                    $("#nextFarst").empty();
                    $("#nextFarst").append("<option value=''>--请选择章节--</option>")
                    for (i = 0; i < data.length; i++) {
                        $("#nextFarst").append("<option name='courseOption' value='" + data[i].zbId + "'>" + data[i].zbName + "</option>");
                        $("#nextFarst").show();
                    }
                } else {
                    $("#nextFarst").empty();
                }
            }
        });
    });

    $("#submit").change(function (e) {
        //正则表达式验证time
        var regTime = RegExp(/^([0-5][0-9]):([0-5][0-9])$/);
        if (!regTime.test($("input[name='zbTime']").val())) {
            alert("输入正确的时间格式");
            return;
        }
        if ($("#classNext").val() == 0) {
            alert("请选择相应的课程");
            return;
        }
    });

    function saveCourseNext() {
        var fd=new FormData($("#courseNextForm")[0]);
        $.ajax({
            url: '${PATH}/user/saveCourseNextMessge.html' ,
            type: 'POST',
            data: fd,
            async: false,
            cache: false,
            contentType: false,
            processData: false,
            success: function (data) {
                if(data==1){
                    alert("添加成功");
                    location.reload();
                    $('#addModalNext').modal('hide');
                }
            },
            error: function (data) {
                alert(returndata);
            }
        });
    }


    function saveCourse() {
        var fd=new FormData($("#courseForm")[0]);
        $.ajax({
            url: '${PATH}/user/saveMerge.html' ,
            type: 'POST',
            data: fd,
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
</html>
