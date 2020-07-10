<%@ page import="java.util.Date" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<%
    /*获取工程路径*/
    String path = request.getContextPath();
    request.setAttribute("PATH", path);
%>
<!DOCTYPE html>
<head>
    <title>讨论区</title>
   <%-- <link rel="shortcut icon" href="favicon.ico">--%>
    <link rel="stylesheet" href="${PATH}/css/remodal.css">
    <link rel="stylesheet" href="${PATH}/css/remodal-default-theme.css">
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
                        <li><a class="active" href="#newest">最新</a></li>
                        /
                        <li><a href="#hot">最热</a></li>
                        /
                        <li><a href="#unanswered">未回复</a></li>
                    </div>
                </ul>
                <div class="tab-content">
                    <div role="tabpanel" class="tab-pane active">
                        <ul class="row question-items">
                            <c:forEach items="${question.rows}" var="questions">
                                <li class="question-item">
                                    <div class="col-md-10">
                                        <div class="col-sm-2 question-item-author">
                                            <div class="user-avatar ">
                                                <a class="avatar" href="javascript:void(0)" target="_blank">
                                                    <img src="http://localhost:8080/upload/${questions.zbImage}">
                                                </a>
                                            </div>
                                        </div>
                                        <div class="col-sm-10">
                                            <h4>
                                                <a class="question-item-title" href="${PATH}questionRed.html?id=${questions.zbId}" onclick="updateQuestion(${questions.zbId})">
                                                        ${questions.zbName}</a>
                                            </h4>
                                            <div class="question-item-summary">
                                                <div class="user-username ">
                                                    <a class="avatar" href="javascript:void(0)" target="_blank">
                                                            ${questions.zbUsername}
                                                    </a>
                                                </div>
                                                <span class="question-item-date">
                                                    <jsp:useBean id="gmtDate" class="java.util.Date"></jsp:useBean>
                                                    <jsp:setProperty name="gmtDate" property="time" value="${questions.zbCreateTime}"></jsp:setProperty>
                                                    <fmt:formatDate value="${gmtDate}" pattern="yyyy-MM-dd MM:dd:yy"/>
                                                </span>
                                            </div>
                                        </div>
                                    </div>
                                    <div class="col-md-2 question-item-rank">
                                        <div class="question-item-answered">
                                            <div>${questions.zbCircle}</div>
                                            <div>回复</div>
                                        </div>
                                        <div class="question-item-views">
                                            <div>${questions.zbRead}</div>
                                            <div>查看</div>
                                        </div>
                                    </div>
                                </li>
                            </c:forEach>
                        </ul>
                        <nav class="pagination-container">
                            <ul class="pagination">
                                <c:choose>
                                    <c:when test="${question.pageNow>'1'}">
                                        <li class="">
                                            <a class="page-next"
                                               href="${PATH}index.html">首
                                                页</a>
                                            <a class="page-next"
                                               href="${PATH}index.html?page=${question.pageNow-1}">上一页</a>
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
                                    <a href="javascript:void(0)">${question.pageNow}</a>
                                </li>
                                <li class="">
                                    <a href="${PATH}index.html?page=2">2</a>
                                </li>
                                <li class="">
                                    <a href="${PATH}index.html?page=3">3</a>
                                </li>
                                <span class="page-omit">...</span>
                                <c:choose>
                                    <c:when test="${question.pageNow<question.total/15}">
                                        <li class="">
                                            <a class="page-next"
                                               href="${PATH}index.html?page=${question.pageNow+1}">下一页</a>
                                            <a class="page-next"
                                               href="${PATH}index.html?page=${question.totalPage}">尾
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
            <button class="btn side-btn" id="saveDiscussion">我要发帖</button>
        </div>
    </div>
</div>

<div class="modal fade askquestion-modal" id="askquestion" tabindex="-1" role="dialog">
    <div class="modal-dialog" role=document>
        <div class="modal-content">
            <div class="modal-header">
                <button type="button" class="close" data-dismiss="modal" aria-label="Close">
                    <span aria-hidden="true">&times;</span>
                </button>
                <h4 class="modal-title">发帖</h4>
            </div>
            <div class="modal-body words-ctrl">
                <form class="form-horizontal" id="questionForm" method="post" >
                    <div class="form-group">
                        <label class="col-md-2 control-label">标题</label>
                        <div class="col-md-10">
                            <input type="text" name="title" class="form-control" placeholder="请输入标题">
                            <span class="help-block"></span>
                        </div>
                    </div>
                    <div class="form-group">
                        <label class="col-md-2 control-label">描述</label>
                        <div class="col-md-10">
                            <div class="tabpanel mkeditor">
                                <ul class="nav nav-tabs" role="tablist">
                                    <li role="presentation" class="active">
                                        <a href="#mkeditor-editor" role="tab" data-toggle="tab">编辑</a>
                                    </li>
                                </ul>
                                <div class="tab-content">
                                    <div class="tab-pane active mkeditor-editor" id="mkeditor-editor" role="tabpanel">
                                        <textarea name="content" class="content"
                                                  min="0" max="20000"
                                                  placeholder="输入描述"></textarea>
                                        <div class="help-block"></div>
                                    </div>
                                    <div class="tab-pane mkeditor-viewer markdown-body" id="mkeditor-viewer"
                                         role="tabpanel">
                                        <div></div>
                                    </div>
                                </div>
                            </div>

                        </div>
                    </div>
                </form>
                <div class="modal-footer">
                    <button type="button" class="btn btn-default" data-dismiss="modal">取消</button>
                    <button type="button" class="submit-question btn btn-primary" data-dismiss="modal" onclick="saveQuestionRed()">提交</button>
                </div>
            </div>
        </div>
    </div>
</div>

<script type="text/javascript">

    function updateQuestion(id) {
        $.ajax({
            type:'post',
            url:'${PATH}updateRed.html',
            data:{"id":id},
            dataType:'json',
            success:function (data) {
            }
        });
    }

    $("#saveDiscussion").click(function () {
        var username='<%= session.getAttribute("username")%>';
        var name=$.cookie('username');
        /*alert(username=="null");
        alert(typeof(name)=="undefined");*/
        if(username=="null"&&typeof(name)=="undefined"){
            alert("请先登录");
            return ;
        }
        $("#askquestion").modal('show');
    });
    
    
    function saveQuestionRed() {
        var title=$("input[name='title']").val();
        var username='<%=session.getAttribute("username")%>';
        var content=$("textarea[name='content']").val();
        $.ajax({
            type:'post',
            url:'${PATH}saveQuestionList.html',
            data:{"title":title,"username":username,"content":content},
            dataType:'json',
            success:function (data) {
                if(data==1){
                    alert("发帖成功");
                    location.reload();
                }else{
                    alert("发帖失败");
                }
            }
        });
    }
</script>
</body>
</html>
