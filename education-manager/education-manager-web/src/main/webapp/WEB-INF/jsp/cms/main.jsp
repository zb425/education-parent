<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<html lang="en">
<head>
    <title>Title</title>
    <jsp:include page="../common/res.jsp"></jsp:include>
</head>
<body><%--
<div class="row-fluid">
    <div class="alert alert-info">
        <button type="button" class="close" data-dismiss="alert">×</button>
        <strong>最新消息提示:</strong> 今日需要完成 在线网校 项目的上传!
    </div>
</div>--%>

<div class="row-fluid">
    <div class="block span6">
        <a href="#tablewidget" class="block-heading" data-toggle="collapse">用户注册增长</a>
        <div id="report-1" style="width:100%;height:400px;"></div>

    </div>
</div>
<script type="text/javascript">
    /*var categories =  ['03-19', '03-20', '03-21', '03-22', '03-23', '03-24','03-25', '03-26', '03-27', '03-28'];*/
    var categories =  ${categories};
    /*var data = [100, 200, 300, 145, 182, 215, 252, 265, 280, 300];*/
    var data = [10, 20, 30, 15, 12, 25, 22, 25, 20, 0];
    $(function () {
        $('#report-1').highcharts({
            title: {
                text: '用户注册增长人数(10天)',
                x: -20 //center
            },
            subtitle: {
                text: '',
                x: -20
            },
            credits: {
                enabled: false
            },
            xAxis: {
                categories:categories //分类
            },
            yAxis: {
                title: {
                    text: '注册人数'
                },
                plotLines: [{
                    value: 0,
                    width: 1,
                    color: '#0089D2'
                }]
            },
            tooltip: {
                valueSuffix: '人'
            },
            legend: {
                layout: 'vertical',
                align: 'center',
                verticalAlign: 'middle',
                borderWidth: 0
            },
            series: [{
                name: '注册人数',
                data: data //数据
            }]
        });
    });
</script>
</body>
</html>