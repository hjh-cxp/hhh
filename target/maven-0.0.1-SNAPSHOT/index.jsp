<%@ page language="java" import="java.util.*" pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%
    String path = request.getContextPath();
    String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort() + path + "/";
%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
    <base href="<%=basePath%>">

    <title>My JSP 'MyJsp.jsp' starting page</title>

    <meta http-equiv="pragma" content="no-cache">
    <meta http-equiv="cache-control" content="no-cache">
    <meta http-equiv="expires" content="0">
    <meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
    <meta http-equiv="description" content="This is my page">
    <script src="<%=basePath %>/js/jquery-3.1.1.min.js"></script>
    <script src="<%=basePath %>/js/bootstrap3/js/bootstrap.min.js"></script>
    <script src="<%=basePath %>/js/bootstrap-treeview/bootstrap-treeview.min.js"></script>

    <script src="<%=basePath %>/js/bootStrap-addTabs/bootstrap.addtabs.js"></script>


    <link rel="stylesheet" type="text/css" href="js/bootstrap3/css/bootstrap.min.css"/>
    <link rel="stylesheet" href="<%=basePath %>/js/bootStrap-addTabs/bootstrap.addtabs.css">
    <link rel="stylesheet" href="<%=basePath %>/js/bootstrap-treeview/bootstrap-treeview.min.css">


    <script src="<%=basePath %>/js/bootstrap-table/bootstrap-table.js"></script>
    <script src="<%=basePath %>/js/bootstrap-table/locale/bootstrap-table-zh-CN.js"></script>
    <link rel="stylesheet" href="<%=basePath %>/js/bootstrap-table/bootstrap-table.css">


    <script src="<%=basePath %>/js/bootstrap-bootbox/bootbox.js"></script>

    <script src="<%=basePath %>/js/bootstrap-datetimepicker/js/bootstrap-datetimepicker.js"></script>
    <script src="<%=basePath %>/js/bootstrap-datetimepicker/js/locales/bootstrap-datetimepicker.zh-CN.js"></script>
    <link rel="stylesheet" href="<%=basePath %>/js/bootstrap-datetimepicker/css/bootstrap-datetimepicker.css">



    <style type="text/css">
        .row {

            padding-bottom: 15px

        }

    </style>
</head>
<body>
<div class="container-fluid">
    <nav class="navbar navbar-default">
        <div class="container-fluid">
            <div class="navbar-header">
                <a class="navbar-brand" href="#">
                    <p>当前登录学生：<select id="stuname" class="form-control"></select></p>
                    <h1>金科教育精品课程管理</h1>
                </a>
            </div>
        </div>
    </nav>


    <div class="row">
        <div class="col-md-2">
            <div id="myTree"></div>
        </div>
        <div class="col-md-10">

            <div id="myTabs">
                <!-- 新选项卡 -->
                <ul class="nav nav-tabs" id="tablist">
                    <li role="presentation" class="active">
                        <a href="#home" role="tab" data-toggle="tab">欢迎</a>
                    </li>
                </ul>

                <!-- 选项卡下内容 -->
                <div class="tab-content">
                    <div role="tabpanel" class="tab-pane active" id="home">

                        <div class="jumbotron">
                            <h1>1904A</h1>
                            <p>一组个人主页</p>
                            <p><a class="btn btn-primary btn-lg" href="#" role="button">Learn more</a></p>
                        </div>

                    </div>
                </div>
            </div>

        </div>
    </div>
</div>

<!-- <table id="userTable"></table> -->
</body>
<script type="text/javascript">


    $(function () {

        queryStudent();
        initTreeView();

    })

    queryStudent = function(){
        $.post('<%=request.getContextPath()%>/sub/queryStudent.do',{},function(data){
            var str = "<option value='-1'>请选择</option>";
            for (var i=0;i<data.length;i++) {
                str += "<option value='"+data[i].studentid+"'>"+data[i].studentname+"</option>";
            }
            $("#stuname").html(str);
        }).
    }

    initTreeView = function () {
    
        $.ajax({

            url: "<%=basePath %>/sub/initTreeView.do",
            success: function (data) {

                $('#myTree').treeview({
                    data: data,
                    icon: "glyphicon glyphicon-stop",
                    color: "#000000",
                    backColor: "#FFFFFF",
                    //selectable:true,
                    onNodeSelected: function (event, node) {


                        $.addtabs.add({
                            id: node.id,
                            title: node.text,
                            url: "<%=basePath %>" + node.url
                        });


                    }
                })

            }

        })


    }


</script>
</html>