<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%
    /*获取工程路径*/
    String path = request.getContextPath();
    String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort() + path + "/";
    request.setAttribute("path", basePath);
%>
<html>
<head>
    <title>后台登录</title>
    <link href="${s.base}/css/bootstrap.min.css" rel="stylesheet" type="text/css"/>
    <link href="${s.base}/css/style.css" rel="stylesheet" type="text/css"/>
    <script type="text/javascript" src="${s.base}/js/jquery-1.11.3.min.js"></script>
    <script type="text/javascript" src="${s.base}/js/jquery.form.js"></script>
    <script type="text/javascript" src="${s.base}/js/bootstrap.min.js"></script>
    <script type="text/javascript" src="${s.base}/js/highcharts-4.1.min.js"></script>
    <script type="text/javascript" src="${s.base}/js/oc.min.js"></script>
</head>
<body style="background: url('${path}/images/main-bg-2.jpg'); height:100%;width: 100%; overflow: hidden;">
<div class="f-main">
    <div class="types-block clearfix" style="text-align: center;">
        <h3 class="types-title">登录</h3>
        <form class="oc-form" id="infoForm"
              style="text-align: center;border: 1px solid #CCC;width: 600px;margin:0 auto;padding:20px;" method="post"
              action="${path}login.html">
            <li>注意：<font color="red">验证码区分大小写</font></li>
            <li><label>用户名</label>
                <input name="username" value="" type="username" class="input-text" placeholder="请输入用户名">
            </li>
            <li><label>密码</label>
                <input id="password" name="password" type="password" class="input-text" placeholder="请输入密码"
                       autocomplete="off"/>
            </li>
            <li><label>验证码</label>
                <input id="identiryCode" name="identiryCode" maxlength="6" class="input-text" type="text"
                       style="width: 150px;" placeholder="请输入验证码" onblur="changCode();"/>
                <input type="button" class="vali-base" style="width:80px;height:40px;float:left;margin-left:10px;" id="onclickTest" value="" onclick="changTest();">
            </li>
            <li class="clearfix" style="margin-top: 20px;">
                <input type="button" value="登录" id="submit" style="margin-right:20px;width:100px;">
            </li>
        </form>
    </div>
</div>

<script type="text/javascript">
    var code;
    $(function () {
        code="";
        var codeLength = 4;
        var checkCode = $("#onclickTest");
        var random = new Array(0,1,2,3,4,5,6,7,8,9,'A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R', 'S','T','U','V','W','X','Y','Z');//随机数
        for(var i = 0; i < codeLength; i++) {
            var index = Math.floor(Math.random()*36);//取得随机数的索引（0~35）
            code += random[index];
        }
        checkCode.val(code);//把code值赋给验证码
    });

    function changTest() {
        code="";
        var codeLength = 4;
        var checkCode = $("#onclickTest");
        var random = new Array(0,1,2,3,4,5,6,7,8,9,'A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R', 'S','T','U','V','W','X','Y','Z');//随机数
        for(var i = 0; i < codeLength; i++) {
            var index = Math.floor(Math.random()*36);//取得随机数的索引（0~35）
            code += random[index];
        }
        checkCode.val(code);//把code值赋给验证码
    }


    function changCode() {
        var testCode=$("#identiryCode").val();
        var randomCode=$("#onclickTest").val();
        if(testCode==null||testCode==""){
            alert("请输入验证码");
            return false;
        }
        if(testCode==randomCode){
            return true;
        }else{
            alert("验证码不正确");
            return false;
        }

        var username=$("input[name='username']").val().trim();
        var password=$("input[name='password']").val().trim();

        if(username!=null&&password!=null||username!=""&&password!=""){
            return true;
        }else{
            alert("账号和密码不正确");
            return false;
        }
    }

    $("#submit").click(function () {
        var username=$("input[name='username']").val().trim();
        var password=$("input[name='password']").val().trim();
        var testCode=$("#identiryCode").val();
        var randomCode=$("#onclickTest").val();
        if(username==null&&password==null||username==""&&password==""){
            alert("账号和密码不正确");
            return ;
        }

        if(testCode==null||testCode==""){
            alert("请输入验证码");
            return ;
        }

        if(testCode!=randomCode){
            alert("验证码不正确");
            return ;
        }

        $.ajax({
           type:'post',
           url:'${path}login.html',
           data:{"username":username,"password":password},
           datatype:'json',
           success:function (data) {
                if(data==1){
                    window.location.href="mainIndex.html";
                }else{
                    alert("账号和密码错误");
                    location.reload();
                }
           }
        });
    });

</script>
</body>

</html>
