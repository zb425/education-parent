<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%
    /*获取工程路径*/
    String path = request.getContextPath();
    request.setAttribute("PATH", path);
%>
<html>
<head>
    <title>前台图片</title>
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
        <a class="block-heading f-14" data-toggle="collapse">轮播图管理</a>
        <div class="block-body collapse in">
            <p>
                <input type="button" id="addImages" class="search-btn" value="添加">
            </p>
        </div>
    </div>

    <div class="row-fluid">
        <div class="block span6">
            <div id="tablewidget" class="block-body collapse in">
                <table class="table">
                    <thead>
                    <tr>
                        <th>名称</th>
                        <th>图片</th>
                        <th>地址</th>
                        <th>时间</th>
                    </tr>
                    </thead>
                    <tbody>
                    <c:forEach items="${home}" var="student">
                        <tr>
                            <td>${student.zbName}</td>
                            <td><img src="${PATH}/upload/${student.zbPicture}" style="width: 180px;height:100px;float: left;"></td>
                            <td>${student.zbUrl}</td>
                            <td><fmt:formatDate value="${student.zbCreateTime}" pattern="yyyy-MM-dd MM:dd:yy"/></td>
                            <td>
                                <%--<a href="javascript:void(0)" onclick="toEditStudent(${student.zbStudentId});"></a>--%>
                                <a href="javascript:void(0)" onclick="doDeleteHomeImages(${student.zbId});">删除</a>
                            </td>
                        </tr>
                    </c:forEach>
                    </tbody>
                </table>
               <%-- <p>
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
                </p>--%>
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
                    <h4 class="modal-title">添加图片信息</h4>
                </div>
                <div class="block span6" id="addDiv">
                    <div class="block-body collapse in" style="padding-top:10px;">
                        <form role="form" id="imagesForm" method="post" action="${PATH}/course/saveUser.html"
                              enctype="multipart/form-data">
                            <div class="form-group clearfix">
                                <label class="control-label">名称</label>
                                <div class="col-sm-10">
                                    <input type="text" class="form-control" name="zbName"
                                           placeholder="请输入名称">
                                </div>
                            </div>
                            <div class="form-group clearfix">
                                <label class="control-label">地址</label>
                                <div class="col-sm-4">
                                    <input type="file" name="file"  class="form-control"
                                           placeholder="请输入地址"/>
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


<script type="text/javascript">
    $("#addImages").click(function () {
        $("#addModal").modal('show');
    });

    function doAddUserSave() {
        var fd=new FormData($("#imagesForm")[0]);
        $.ajax({
            url: '${PATH}saveHomeImages.html',
            type: 'post',
            dataType: 'json',
            data: fd,
            contentType: false,
            processData: false,
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
    
    function doDeleteHomeImages(id) {
        var status = this.confirm('确定删除？');
        if (!status) {
            return;
        }
        $.ajax({
            url: '${PATH}deleteHomeImages.html',
            type: 'post',
            dataType: 'json',
            data: {"id":id},
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
</script>
</body>
</html>
