<%@ page import="java.util.Date" %>
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
    <title>讨论区内容</title>
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
    <ol class="breadcrumb">
        <li><a href="javascript:void(0)">讨论区</a></li>
        <li class="active">
            <a href="${PATH}questionRed.html?id=${id}">
                ${discussion.zbName}
            </a>
        </li>
    </ol>
    <div class="row">
        <div class="col-md-9 layout-body">
            <div class="content question-detail">
                <div class="question-headline">
                    <span class="question-title"> ${discussion.zbName}</span>
                    <span class="question-figure">${discussion.zbCircle} 回复</span><span
                        class="question-figure">${discussion.zbRead} 查看</span>
                </div>
                <div class="question-author">
                    <div class="user-avatar ">
                        <a class="avatar" href="javascript:void(0)" target="_blank">
                            <img src="http://localhost:8080/upload/${discussion.zbImage}">
                        </a>
                    </div>
                    <div class="user-username ">
                        <a class="username" href="javascript:void(0)" target="_blank">${discussion.zbUsername}</a>
                    </div>
                    <span>
                        <fmt:formatDate value="${discussion.zbCreateTime}" pattern="yyyy-MM-dd MM:dd:yy"/>
                    </span>
                    <a href="#sign-modal" data-toggle="modal" data-sign="signin"
                       class="btn btn-primary collectBtn">收藏</a>
                </div>
                <div class="question-content markdown-body">
                    <p>${discussion.zbContent}</p>
                    <div class="labreport-detail-like">
                    <span class="btn btn-default btn-weiboshare">
                        <i class="fa fa-share-alt"></i>
                    </span>
                    </div>
                </div>
                <div class="question-answers">
                    <p class="ptilte">全部回复</p>
                    <hr/>
                    <c:forEach items="${questionRed.rows}" var="red">
                        <div class="answer-item">
                            <div class="answer-head">
                                <div class="user-avatar ">
                                    <a class="avatar" href="javascript:void(0)" target="_blank">
                                        <img src="http://localhost:8080/upload/${red.zbCircleImage}">
                                    </a>
                                </div>
                            </div>
                            <div class="answer-detail">
                    <span class="comment-reply">
                    <div class="user-username ">
                        <a class="username" href="javascript:void(0)" target="_blank">${red.zbCircleUsername}</a>
                    </div>
                    </span>
                                <div class="answer-content markdown-body">
                                    <textarea>${red.zbCircleContent}</textarea>
                                </div>
                                <div>
                                    <span class="create-time">
                                        <jsp:useBean id="redDate" class="java.util.Date"></jsp:useBean>
                                        <jsp:setProperty name="redDate" property="time" value="${red.zbCreateTime}"></jsp:setProperty>
                                        <fmt:formatDate value="${redDate}" pattern="yyyy-MM-dd MM:dd:yy"/>
                                    </span>
                                    <hr/>
                                </div>
                            </div>
                        </div>
                    </c:forEach>
                </div>
                <nav class="pagination-container">
                    <ul class="pagination">
                        <c:choose>
                            <c:when test="${questionRed.pageNow>'1'}">
                                <li class="">
                                    <a class="page-next" href="${PATH}questionRed.html?id=${id}">首
                                        页</a>
                                    <a class="page-next"
                                       href="${PATH}questionRed.html?id=${id}&page=${questionRed.pageNow-1}">上一页</a>
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
                            <a href="javascript:void(0)">${questionRed.pageNow}</a>
                        </li>
                        <li class="">
                            <a href="${PATH}questionRed.html?id=${id}&page=2">2</a>
                        </li>
                        <li class="">
                            <a href="${PATH}questionRed.html?id=${id}&page=3">3</a>
                        </li>
                        <span class="page-omit">...</span>
                        <c:choose>
                            <c:when test="${questionRed.pageNow<questionRed.total/15}">
                                <li class="">
                                    <a class="page-next"
                                       href="${PATH}questionRed.html?id=${id}&page=${questionRed.pageNow+1}">下一页</a>
                                    <a class="page-next"
                                       href="${PATH}questionRed.html?id=${id}&page=${questionRed.totalPage}">尾
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
        <div class="col-md-3 layout-side">
            <button class="btn side-btn" id="questionClick">我要回帖</button>
            <div class="side-image">
                <a href="/vip" target="_blank">
                    <img src="https://static.shiyanlou.com/img/banner-vip.png">
                </a>
            </div>
            <div class="sidebox side-list related-question">
                <div class="sidebox-header">
                    <h4 class="sidebox-title">相关帖子</h4>
                </div>
                <div class="sidebox-body side-list-body">
                </div>
            </div>

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
                <h4 class="modal-title">回帖</h4>
            </div>
            <div class="modal-body words-ctrl">
                <form class="form-horizontal" id="questionForm" method="post" >
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


<div class="modal fade" id="delete-question-modal" role="dialog">
    <div class="modal-dialog" role="document">
        <div class="modal-content">
            <div class="modal-header">
                <h4 class="modal-title">确定删除</h4>
            </div>
            <div class="modal-body">
                <p>删除后不可恢复</p>
            </div>
            <div class="modal-footer">
                <button type="button" class="btn btn-default" data-dismiss="modal">取消</button>
                <button type="button" class="btn btn-primary btn-confirm" data-dismiss="modal">确定</button>
            </div>
        </div>
    </div>
</div>


<script type="text/javascript">
    $("#questionClick").click(function () {
        var username='<%= session.getAttribute("username")%>';
        var name=$.cookie('username');
        if(username=="null"&&typeof(name)=="undefined"){
            alert("请先登录");
            return ;
        }
        $("#askquestion").modal('show');
    });

    function saveQuestionRed() {
        var id=${id};
        var username='<%=session.getAttribute("username")%>';
        var content=$("textarea[name='content']").val();
        $.ajax({
            type:'post',
            url:'${PATH}saveQuestions.html',
            data:{"id":id,"username":username,"content":content},
            dataType:'json',
            success:function (data) {
                if(data==1){
                   alert("回帖成功");
                    location.reload();
                }else{
                    alert("回帖失败");
                }
            }
        });
    }
</script>
</body>
</html>
