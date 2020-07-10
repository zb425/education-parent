<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%
    String path = request.getContextPath();
    request.setAttribute("PATH", path);
%>
<html>
<head>
    <title>评论管理</title>
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
    <link rel="icon" type="image/png" href="${s.base}/images/loc.jpg" sizes="16x16">
</head>
<body>
<form id="queryPageForm" class="mt-15" action="${PATH}index.html?page=1" method="POST">
    <div class="block span6">
        <a class="block-heading f-14" data-toggle="collapse">评论管理</a>
        <div class="block-body collapse in">
            <p>
                <input name="name" type="text" value="${commentList.name}" class="search-text"
                       placeholder="请输入登录名">
            </p>
            <p>
                <input type="submit" class="search-btn" value="搜索">
                <input type="button" id="revome" class="search-btn" value="批量删除">
            </p>
        </div>
    </div>

    <div class="row-fluid">
        <div class="block span6">
            <div id="tablewidget" class="block-body collapse in">
                <table class="table">
                    <thead>

                    <tr>
                        <th><input type="checkbox" id="box">用户名</th>
                        <th>课程ID</th>
                        <th>章节ID</th>
                        <th>内容</th>
                        <th>评论时间</th>
                    </tr>
                    </thead>
                    <tbody>
                    <c:forEach items="${commentList.rows}" var="comment">

                        <tr>
                            <td><input type="checkbox" name="inlineCheckbox" id="inlineCheckbox" value="${comment.zbId}"> ${comment.zbUsername}</td>
                            <td>${comment.zbCourseId}</td>
                            <td>${comment.zbSectionId}</td>
                            <td>${comment.zbContent}</td>
                            <td><fmt:formatDate value="${comment.zbCreateTime}" pattern="yyyy-MM-dd MM:dd:yy"/></td>
                            <td>
                                <a href="javascript:void(0)" onclick="toDelete(${comment.zbId});">删除</a>
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
                                <c:when test="${commentList.pageNow>'1'}">
                                    <a class="page-next"
                                       href="${PATH}index.html?page=1&name=${commentList.name}">首 页</a>
                                    <a class="page-next"
                                       href="${PATH}index.html?page=${commentList.pageNow-1}&name=${commentList.name}">上一页</a>
                                </c:when>
                                <c:otherwise>
                                    <a class="page-next" href="javascript:void(0);" title="已是首页">首 页</a>
                                    <a class="page-next" href="javascript:void(0);" title="已是第一页">上一页</a>
                                </c:otherwise>
                            </c:choose>
                            <a class="page-cur" href="javascript:void(0);">${commentList.pageNow}</a>
                            <a class="page-num" href="${PATH}index.html?page=2&name=${commentList.name}">2</a>
                            <a class="page-num" href="${PATH}index.html?page=3&name=${commentList.name}">3</a>
                            <span class="page-omit">...</span>
                            <c:choose>
                                <c:when test="${commentList.pageNow<commentList.total/15}">
                                    <a class="page-next"
                                       href="${PATH}index.html?page=${commentList.pageNow+1}&name=${commentList.name}">下一页</a>
                                    <a class="page-next"
                                       href="${PATH}index.html?page=${commentList.totalPage}&name=${commentList.name}">尾
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


<script type="text/javascript">
    <%--实现全选和不选--%>
    $("#box").bind("click",function () {
        $("input[name='inlineCheckbox']").prop("checked",this.checked);
    });


    /*批量删除*/
    $("#revome").click(function () {
        var test='${wegith}';
        if(test=='1'){
            var checkLength=$("input[name='inlineCheckbox']:checked").length;
            if(checkLength==0){
                alert("请选择一个或者多个删除?");
                return ;
            }
            if(confirm("确定要删除所选项目？")){
                var checkedList = new Array();
                $("input[name='inlineCheckbox']:checked").each(function() {
                    checkedList.push($(this).val());
                });
            }
            $.ajax({
                type: "POST",
                url: "${PATH}deleteComment.html",
                data: {'delComment':checkedList.toString()},
                success: function(result) {
                    if(result==1){
                        $("[name ='inlineCheckbox']:checkbox").attr("checked", false);
                        window.location.reload();
                    }else{
                        alert("删除失败!");
                    }
                }
            });
        }else{
            alert("不好意思你没有权利操作!");
        }
    });

/*根据id删除*/
    function toDelete(id) {
        var test='${wegith}';
        if(test=='1'){
            $.ajax({
                type: "POST",
                url: "${PATH}deleteComment.html",
                data: {'delComment':id.toString()},
                success: function(result) {
                    if(result==1){
                        alert("删除成功");
                        //$("[name ='inlineCheckbox']:checkbox").attr("checked", false);
                        window.location.reload();
                    }else{
                        alert("删除失败!");
                    }
                }
            });
        }else{
            alert("不好意思你没有权利操作!");
        }

    }

</script>
</body>
</html>
