<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<%
    /*获取工程路径*/
    String path = request.getContextPath();
    request.setAttribute("PATH", path);
%>
<html>
<head>
    <title>资料区</title>
    <%--<link rel="shortcut icon" href="favicon.ico">--%>
    <link rel="stylesheet" href="${PATH}/css/remodal.css">
    <link rel="stylesheet" href="${PATH}/css/remodal-default-theme.css">
    <%--<link rel="stylesheet" href="${PATH}/css/font-awesome.min.css">--%>
    <link rel="stylesheet" href="${PATH}/css/monokai-sublime.min.css">
    <link rel="stylesheet" href="${PATH}/css/bootstrap.min.css">
    <link rel="stylesheet" href="${PATH}/css/katex.min.css">
    <link rel="stylesheet" href="${PATH}/css/video-js.min.css">
    <script type="text/javascript" src="${PATH}/js/jquery.min.js"></script>
    <script type="text/javascript" src="${PATH}/js/remodal.min.js"></script>
    <script type="text/javascript" src="${PATH}/js/jquery.cookie.js"></script>
    <script type="text/javascript" src="${PATH}/js/bootstrap.min.js"></script>
    <link rel="stylesheet" href="${PATH}/css/styles.css?=2016121272249">
    <style>

        /* modal 模态框*/
        #invite-user .modal-body {
            overflow: hidden;
        }

        #invite-user .modal-body .form-label {
            margin-bottom: 16px;
            font-size: 14px;
        }

        #invite-user .modal-body .form-invite {
            width: 80%;
            padding: 6px 12px;
            background-color: #eeeeee;
            border: 1px solid #cccccc;
            border-radius: 5px;
            float: left;
            margin-right: 10px;
        }

        #invite-user .modal-body .msg-modal-style {
            background-color: #7dd383;
            margin-top: 10px;
            padding: 6px 0;
            text-align: center;
            width: 100%;
        }

        #invite-user .modal-body .modal-flash {
            position: absolute;
            top: 53px;
            right: 74px;
            z-index: 999;
        }

        /* end modal */

        .en-footer {
            padding: 30px;
            text-align: center;
            font-size: 14px;
        }
    </style>
</head>
<body>
<jsp:include page="../comment/head.jsp"></jsp:include>
<div class="container layout layout-margin-top">
    <div class="row">
        <div class="col-md-9 layout-body">
            <div class="content">
                <ul class="nav nav-tabs question-types" role="tablist">
                    <li role="presentation" class="active">
                        <a href="#all" aria-controls="all" role="tab" toggle="tab">全部</a>
                    </li>
                    <div class="question-sort">
                        <a class="active" href="${PATH}getDatabankList.html?que=new">最新</a></li>
                        /
                        <a href="${PATH}getDatabankList.html?que=cou">下载量</a></li>
                    </div>
                </ul>
                <div class="tab-content">
                    <div role="tabpanel" class="tab-pane active">
                        <ul class="row question-items">
                            <c:forEach items="${databank.rows}" var="databanks">
                                <li class="question-item">
                                    <div class="col-md-10">
                                        <div class="col-sm-10">
                                            <h4>
                                                    <%--onclick="downloadDatabank(${databanks.zbId})"--%>
                                                <%--${PATH}downloadDatabank.html?name=${databanks.zbDatabankUrl}--%>
                                                <a class="question-item-title" href="${PATH}downloadDatabank.html?name=${databanks.zbDatabankUrl}&id=${databanks.zbId}" >
                                                        ${databanks.zbDatabankName}</a>
                                               <%-- <button class="question-item-title" onclick="downloadDatabank(${databanks.zbId},${databanks.zbDatabankUrl})">${databanks.zbDatabankName}</button>--%>
                                            </h4>
                                            <div class="question-item-summary">
                                                <div class="user-username ">
                                                    <a class="avatar" href="javascript:void(0)">
                                                            ${databanks.zbDatabankUsername}
                                                    </a>
                                                </div>
                                                <span class="question-item-date">
                                                    <jsp:useBean id="gmtDate" class="java.util.Date"></jsp:useBean>
                                                    <jsp:setProperty name="gmtDate" property="time" value="${databanks.zbCreateTime}"></jsp:setProperty>
                                                    <fmt:formatDate value="${gmtDate}" pattern="yyyy-MM-dd MM:dd:yy"/>
                                                </span>
                                            </div>
                                        </div>
                                    </div>
                                    <div class="col-md-2 question-item-rank">
                                        <div class="question-item-answered">
                                            <div>${databanks.zbDatabankCount}</div>
                                            <div>下载量</div>
                                        </div>
                                        <div class="question-item-views">
                                            <div> <a class="question-item-title" href="${PATH}downloadDatabank.html?name=${databanks.zbDatabankUrl}&id=${databanks.zbId}">
                                                    下载</a>
                                                <%--<button class="question-item-title" onclick="downloadDatabank(${databanks.zbId},${databanks.zbDatabankUrl})"> 下载</button>--%>
                                            </div>
                                        </div>
                                    </div>
                                </li>
                            </c:forEach>
                        </ul>
                        <nav class="pagination-container">
                            <ul class="pagination">
                                <c:choose>
                                    <c:when test="${databank.pageNow>'1'}">
                                        <li class="">
                                            <a class="page-next"
                                               href="${PATH}getDatabankList.html?que=${databank.typeName}">首
                                                页</a>
                                            <a class="page-next"
                                               href="${PATH}getDatabankList.html?que=${databank.typeName}&page=${databank.pageNow-1}">上一页</a>
                                        </li>
                                    </c:when>
                                    <c:otherwise>
                                        <li class="disabled">
                                            <a class="page-next" href="javascript:void(0);" title="已是首页">首 页</a>
                                            <a class="page-next" href="javascript:void(0);" title="已是第一页">上一页</a>
                                        </li>
                                    </c:otherwise>
                                </c:choose>
                                <li class="active">
                                    <a href="javascript:void(0)">${databank.pageNow}</a>
                                </li>
                                <li class="">
                                    <a href="${PATH}getDatabankList.html?que=${databank.typeName}&page=2">2</a>
                                </li>
                                <li class="">
                                    <a href="${PATH}getDatabankList.html?que=${databank.typeName}&page=3">3</a>
                                </li>
                                <span class="page-omit">...</span>
                                <c:choose>
                                    <c:when test="${databank.pageNow<databank.total/15}">
                                        <li class="">
                                            <a class="page-next"
                                               href="${PATH}getDatabankList.html?que=${databank.typeName}&page=${databank.pageNow+1}">下一页</a>
                                            <a class="page-next"
                                               href="${PATH}getDatabankList.html?que=${databank.typeName}&page=${databank.totalPage}">尾
                                                页</a>
                                        </li>
                                    </c:when>
                                    <c:otherwise>
                                        <li class="disabled">
                                            <a class="page-next" href="javascript:void(0);" title="没有下一页">下一页</a>
                                            <a class="page-next" href="javascript:void(0);" title="已到最后一页">尾 页</a>
                                        </li>
                                    </c:otherwise>
                                </c:choose>
                            </ul>
                        </nav>
                    </div>
                </div>
            </div>

        </div>
        <div class="col-md-3 layout-side">
            <div class="sidebox-header">
                <p class="sidebox-title" style="color:#000;"><font size="4px;">最近路径</font></p>
            </div>
            <div class="sidebox-body course-content side-list-body">
                <a href="javascript:void(0)"><img style="width:25px;height:25px" src="${PATH}/images/DVP-46.png">java开发</a>
                <a href="javascript:void(0)"><img style="width:25px;height:25px" src="${PATH}/images/DVP-47.png">php开发</a>
                <a href="javascript:void(0)"><img style="width:25px;height:25px" src="${PATH}/images/DVP-48.png"> C++开发</a>
                <a href="javascript:void(0)"><img style="width:25px;height:25px" src="${PATH}/images/DVP-49.png">aspx.net开发</a>
                <a href="javascript:void(0)"><img style="width:25px;height:25px" src="${PATH}/images/DVP-50.png"> Linux系统开发</a>
            </div>
        </div>

        <div class="col-md-3 layout-side">
            <div class="sidebox-header">
                <p class="sidebox-title" style="color:#000;"><font size="4px;">最火下载</font></p>
            </div>
            <div class="sidebox-body side-list-body">
                <c:forEach items="${databankCount}" var="count">
                    <a href="${PATH}downloadDatabank.html?name=${count.zbDatabankUrl}&id=${count.zbId}" >${count.zbDatabankName}</a>
                </c:forEach>
            </div>

        </div>

        <div class="col-md-3 layout-side">
            <div class="sidebox-header">
                <p class="sidebox-title" style="color:#000;"><font size="4px;">最新上传</font></p>
            </div>
            <div class="sidebox-body side-list-body">
                <c:forEach items="${databankTime}" var="time">
                    <a href="${PATH}downloadDatabank.html?name=${time.zbDatabankUrl}&id=${time.zbId}" >${time.zbDatabankName}</a>
                </c:forEach>
            </div>
        </div>

    </div>
</div>


<script type="text/javascript">

</script>
</body>
</html>
