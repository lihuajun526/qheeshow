<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta charset="UTF-8">
    <title>梧桐e路</title>
    <link rel="stylesheet" href="/images/animate.min.css">
    <link rel="stylesheet" href="/images/bootstrap.css">
    <link rel="stylesheet" href="/images/global_v2.0.0.css"/>
    <link rel="stylesheet" href="/images/wt_index.css"/>
    <script type="text/javascript" src="/jquery/jquery-1.11.1.js"></script>
    <script type="text/javascript" src="/js/util.js"></script>
</head>
<body>
<jsp:include page="./pub/head.jsp" flush="true"/>
<div class="g-banner">
    <div class="g-sol1">
        <ul class="g-pag">
            <li><a href="#"><img src="images/wt-icon1.png"/></a></li>
            <li><a href="#"><img src="images/wt-icon2.png"/></a></li>
            <li><a href="#"><img src="images/wt-icon2.png"/></a></li>
        </ul>
    </div>
</div>
<div class="g-tit1"><a class="on">最新活动</a><a href="/goods/list">优惠套餐</a></div>
<div class="g-cont">
    <ul class="g-one1" id="activitys"></ul>
</div>
<div class="g-mbg">
    <h1 class="g-two-t">优秀项目推荐</h1>

    <h3 class="g-two-t2">最新活动——优惠的套餐更好的为您提供服务</h3>

    <div class="g-cont">
        <ul id="bestPros" class="g-two2"></ul>
        <div class="g-more"><a href="/project/list">More</a></div>
    </div>

</div>

<div class="g-mbg2">

    <h1 class="g-two-t">优秀案例</h1>

    <h3 class="g-two-t2">最新活动——优惠的套餐更好的为您提供服务</h3>
    <ul id="bestCases" class="g-three1"></ul>
</div>
<div class="g-ban-ad1"></div>
<div class="g-mbg3">
    <h1 class="g-two-t">优秀投资人</h1>

    <h3 class="g-two-t2">平台活跃投资人，著名投资经纪人或机构</h3>

    <div class="g-conter">
        <div id="first" class="g-fivesen"></div>
        <ul id="investors" class="g-lst1"></ul>
        <div class="g-more2"><a href="/investor/list">More</a></div>
    </div>
</div>
<jsp:include page="./pub/foot.jsp" flush="true"/>
<script>
    $.get("/index/activity/latest", function (result) {
        var data = result.data;
        for (var i = 0; i < data.length; i++) {
            var activity = data[i];
            $("#activitys").append("<a href='/activity/get/" + activity.id + "'><li><span><img src='" + activity.logo + "' width='320' height='180'/></span><h1>" + activity.title + "</h1><p>" + activity.summary + "</p><div href='/activity/get/" + activity.id + "' class='icon'><img src='/images/wt-icon4.png'/></div></li></a>");
        }
    }, "json");
    $.get("/index/project/best/suggest", function (result) {
        var data = result.data;
        for (var i = 0; i < data.length; i++) {
            var project = data[i];
            $("#bestPros").append("<a href='/project/" + project.id + "'><li><span class='on1'><img src='" + project.logo + "' width='100' height='100'/></span><h1 class='on2'>" + project.title + "</h1><h3 class='on3'>" + project.demand + "</h3><span class='on4'></span><span class='on5'><div class='cont'>" + project.highlights + "</div></span></li></a>");
        }
    }, "json");
    $.get("/index/project/best/case", function (result) {
        var data = result.data;
        for (var i = 0; i < data.length; i++) {
            var project = data[i];
            $("#bestCases").append("<a href='/project/" + project.id + "'><li><div onmouseover='showCase(this)'><h1 class='on1'>" + project.title + "</h1><h3 class='on2'>" + project.demand + "</h3><span><img src='" + project.logo + "' width='100' height='100'/></span><span class='on5'>已完成融资</span></div></li></a>");
        }
    }, "json");
    function showCase(o) {
        $("#bestCases").children('div').each(function () {
            $(this).removeAttr("class");
        });
        $(o).attr("class", "g-three-ov");
    }
    function listbest() {
        $.get("/index/investor/best", function (result) {
            var data = result.data;
            for (var i = 0; i < data.length; i++) {
                var investor = data[i];
                if (i == 0) {
                    $("#first").html("<div class='g-fivesen-t'><img src='" + investor.photo + "' width='110' height='110'/></div><div class='g-fivesen-c'><div class='on1'><span class='name'>" + investor.trueName + "</span><span class='pt'>平台推荐</span></div><h2>" + investor.companyName + " | <span id='areas'></span></h2><h3><a href='#'>" + investor.summary + "</a></h3></div><div class='g-fivesen-r'><div class='on1'>感兴趣的</div><div class='on2'><span id='stages'></span><span>" + investor.singlePrice + "</span></div><ul id='indus' class='on3'></ul></div>");
                    var indus = "";
                    if (!isEmpty(investor.industryName)) {
                        indus = investor.industryName.split("#");
                        for (var i = 0; i < indus.length; i++) {
                            $("#indus").append("<li><a>" + indus[i] + "</a></li>");
                        }
                    }
                    var stages = "";
                    if (!isEmpty(investor.stageName)) {
                        stages = investor.stageName.split("#");
                        for (var i = 0; i < stages.length; i++) {
                            indus.append("<li><a>" + stages[i] + "</a></li>");
                            if (i == 0) {
                                $("#stages").append("" + stages[i] + " ");
                            } else {
                                $("#stages").append("| " + stages[i] + "");
                            }
                        }
                    }
                } else {
                    $("#investors").append("<a href='/investor/" + investor.id + "'><li><span><img src='" + investor.photo + "' width='240' height='181'/></span><h1>" + photo.trueName + "</h1><h5>" + investor.companyName + " | " + investor.companyRank + "</h5><h6><span id='area_" + investor.id + "'></span> | <span id='indus_" + investor.id + "'></span></h6></li></a>");
                    var areas = "";
                    if (!isEmpty(investor.cityName)) {
                        areas = investor.cityName.split("#");
                        $("#area_" + investor.id).html(areas[0] + " |");
                    }
                    var indus = "";
                    if (!isEmpty(investor.industryName)) {
                        indus = investor.industryName.split("#");
                        for (var i = 0; i < indus.length; i++) {
                            $("#indus_" + investor.id).append(" " + indus[i]);
                        }
                    }
                }
            }
        }, "json");
    }
    listbest();
</script>
</html>
