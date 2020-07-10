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
    <title>讨论区内容</title>
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
<form id="queryPageForm" class="mt-15" action="${PATH}/discussion/discussionIndex.html" method="POST">
    <div class="block span6">
        <a class="block-heading f-14" data-toggle="collapse">讨论区内容</a>
        <%--<div class="block-body collapse in">
            <p>
                <input name="que" type="text" value="${discussion.typeName}" class="search-text"
                       placeholder="请输入名称">
            </p>
            <p>
                <input type="submit" class="search-btn" value="搜索">
            </p>
        </div>--%>
    </div>

    <div class="row-fluid">
        <div class="block span6">
            <div id="widget2container" class="block-body">
                <table class="table list">
                    <tbody>
                    <c:if test="${discussionRead.rows !=null}">
                        <c:forEach items="${discussionRead.rows}" var="read">
                            <tr id="tr-${read.zbId}">
                                <td style="width:600px;">
                                    <p>
                                       <img src="${PATH}/upload/${read.zbCircleImage}"
                                                 style="width: 180px;height:100px;float: left;">
                                    </p>
                                </td>
                                <td>
                                    <p>
                                            ${read.zbCircleContent}
                                    </p>
                                </td>
                                <td>
                                    <p style="color: red;">${read.zbCircleUsername}</p>
                                    <p><fmt:formatDate value="${read.zbCreateTime}" pattern="yyyy-MM-dd MM:dd:yy"/></p>
                                </td>
                                <td style="width:120px;">
                                    <p>
                                        <a href="javascript:void(0)" onclick="updateDiscussion(${read.zbId})">
                                            <c:choose>
                                                <c:when test="${read.zbCircleAuthority>'0'}">
                                                    不通过
                                                </c:when>
                                                <c:otherwise>
                                                    通过
                                                </c:otherwise>
                                            </c:choose>
                                        </a>
                                    </p>
                                    <p>
                                        <a href="javascript:void(0)" onclick="deleteDiscussion(${read.zbId})">删除</a>
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
                                <c:when test="${discussionRead.pageNow>'1'}">
                                    <a class="page-next" href="${PATH}/discussion/discussionRead.html?id=${id}">首
                                        页</a>
                                    <a class="page-next"
                                       href="${PATH}/discussion/discussionRead.html?page=${discussionRead.pageNow-1}&id=${id}">上一页</a>
                                </c:when>
                                <c:otherwise>
                                    <a class="page-next" href="javascript:void(0);" disabled="disabled">首 页</a>
                                    <a class="page-next" href="javascript:void(0);" disabled="disabled">上一页</a>
                                </c:otherwise>
                            </c:choose>
                            <a class="page-cur" href="javascript:void(0);">${discussionRead.pageNow}</a>
                            <a class="page-num" href="javascript:void(0);" onclick="queryPageClick('1');">2</a>
                            <a class="page-num" href="javascript:void(0);" onclick="queryPageClick('3');">3</a>
                            <span class="page-omit">...</span>
                            <c:choose>
                                <c:when test="${discussionRead.pageNow<discussionRead.total/5}">
                                    <a class="page-next"
                                       href="${PATH}/discussion/discussionRead.html?page=${discussionRead.pageNow+1}&id=${id}">下一页</a>
                                    <a class="page-next"
                                       href="${PATH}/discussion/discussionRead.html?page=${discussionRead.totalPage}&id=${id}">尾 页</a>
                                </c:when>
                                <c:otherwise>
                                    <a class="page-next" href="javascript:void(0);" disabled="disabled">下一页</a>
                                    <a class="page-next" href="javascript:void(0);" disabled="disabled">尾 页</a>
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

<script type="text/javascript">
    //删除
    function deleteDiscussion(id) {
        var status = this.confirm('确定删除？');
        if (!status) {
            return;
        }
        $.ajax({
            url: '${PATH}/discussion/deleteRed.html',
            type: 'POST',
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

    //权限验证、
    function updateDiscussion(id) {
        $.ajax({
            url: '${PATH}/discussion/updateRed.html',
            type: 'POST',
            dataType: 'json',
            data: {"id": id},
            success: function (resp) {
                if (resp == 1) {
                    alert("权限验证成功");
                    window.location.reload();
                }else{
                    alert("权限验证失败");
                }
            }
        });
    }

</script>
</body>
</html>
