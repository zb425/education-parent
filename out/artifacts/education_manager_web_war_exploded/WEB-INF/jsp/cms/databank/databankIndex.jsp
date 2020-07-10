<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%
    /*获取工程路径*/
    String path = request.getContextPath();
    request.setAttribute("PATH", path);
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <title>资料库管理</title>
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
<form id="queryPageForm" class="mt-15" action="${PATH}databankIndex.html" method="POST">
    <div class="block span6">
        <a class="block-heading f-14" data-toggle="collapse">资料管理</a>
        <div class="block-body collapse in">
            <p>
                <input name="que" type="text" value="${databank.typeName}" class="search-text"
                       placeholder="请输入资料名称">
            </p>
            <p>
                <input type="submit" class="search-btn" value="搜索">
                <input type="button" id="addDatabank" class="search-btn" value="添加">
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
                        <th>用户名</th>
                        <th>URL地址</th>
                        <th>下载数量</th>
                        <th>是否通过</th>
                        <th>上传时间</th>
                    </tr>
                    </thead>
                    <tbody>
                    <c:forEach items="${databank.rows}" var="databank">
                        <tr>
                            <td>${databank.zbDatabankName}</td>
                            <td>${databank.zbDatabankUsername}</td>
                            <td>${databank.zbDatabankUrl}</td>
                            <td>${databank.zbDatabankCount}</td>
                            <td>
                                <c:choose>
                                    <c:when test="${databank.zbDatabankAuthority=='1'}">
                                        通过
                                    </c:when>
                                    <c:otherwise>
                                        不通过
                                    </c:otherwise>
                                </c:choose>
                            </td>
                            <td><fmt:formatDate value="${databank.zbCreateTime}" pattern="yyyy-MM-dd MM:dd:yy"/></td>
                            <td>
                                <a href="javascript:void(0)" onclick="toEditDatabank(${databank.zbId});">修改权限</a>
                                <a href="javascript:void(0)" onclick="doDeleteDatabank(${databank.zbId},'${databank.zbDatabankUrl}');">删除</a>
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
                                <c:when test="${databank.pageNow>'1'}">
                                    <a class="page-next"
                                       href="${PATH}databankIndex.html?que=${databank.typeName}">首 页</a>
                                    <a class="page-next"
                                       href="${PATH}databankIndex.html?page=${databank.pageNow-1}&que=${databank.typeName}">上一页</a>
                                </c:when>
                                <c:otherwise>
                                    <a class="page-next" href="javascript:void(0);" title="已是首页">首 页</a>
                                    <a class="page-next" href="javascript:void(0);" title="已是第一页">上一页</a>
                                </c:otherwise>
                            </c:choose>
                            <a class="page-cur" href="javascript:void(0);">${databank.pageNow}</a>
                            <a class="page-num" href="javascript:void(0);" onclick="queryPageClick('1');">2</a>
                            <a class="page-num" href="javascript:void(0);" onclick="queryPageClick('3');">3</a>
                            <span class="page-omit">...</span>
                            <c:choose>
                                <c:when test="${databank.pageNow<databank.total/15}">
                                    <a class="page-next"
                                       href="${PATH}databankIndex.html?page=${databank.pageNow+1}&que=${databank.typeName}">下一页</a>
                                    <a class="page-next"
                                       href="${PATH}databankIndex.html?page=${databank.totalPage}&que=${databank.typeName}">尾
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
                    <h4 class="modal-title">上传资料</h4>
                </div>
                <div class="block span6" id="addDiv">
                    <div class="block-body collapse in" style="padding-top:10px;">
                        <form role="form" id="databankInfomation" method="post" action="${PATH}databankIndex.html"
                              enctype="multipart/form-data">
                            <input type="hidden" name="zbStudentId"/>
                            <div class="form-group clearfix">
                                <label class="control-label">用户名</label>
                                <div class="col-sm-10">
                                    <input type="text" class="form-control" readonly="readonly"  name="name"
                                           placeholder="请输入用户名" value="<%=session.getAttribute("username")%>">
                                </div>
                            </div>
                            <div class="form-group clearfix">
                                <label class="control-label">资料名称</label>
                                <div class="col-sm-4">
                                    <input type="text" name="zbDatabankName" id="emailStudent" class="form-control"
                                           placeholder="请输入资料名称"/>
                                </div>
                            </div>
                            <div class="form-group clearfix">
                                <label class="control-label">URL地址</label>
                                <div class="col-sm-4">
                                    <input type="file" name="file"  class="form-control"
                                           placeholder="请输入URL地址"/>
                                </div>
                            </div>
                        </form>
                    </div>
                </div>
                <div class="modal-footer">
                    <button type="button" class="btn btn-default" onclick="doAddDatabankSave();">保存</button>
                    <button type="button" class="btn btn-default" data-dismiss="modal">关闭</button>
                </div>
            </div>
        </div>
    </div>
</div>

<script type="text/javascript">
    $("#addDatabank").click(function () {
        $("#addModal").modal('show');
    });

    function doAddDatabankSave() {
        var fd=new FormData($("#databankInfomation")[0]);
        $.ajax({
            url: '${PATH}/databank/saveDatabank.html' ,
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
                alert(returndata);
            }
        });
    }
    
    function toEditDatabank(id) {
        $.ajax({
            url: '${PATH}updateDatabank.html',
            type: 'post',
            dataType: 'json',
            data: {id:id},
            success: function (data) {
                if (data == 1) {
                    alert("修改成功");
                    location.reload();
                } else {
                    alert("修改失败");
                }
            }
        });
    }

    function doDeleteDatabank(id,name) {
        $.ajax({
            url: '${PATH}deleteDatabank.html',
            type: 'post',
            dataType: 'json',
            data: {id:id,name:name},
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
