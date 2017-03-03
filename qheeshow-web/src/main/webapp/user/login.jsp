<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>梧桐E路--登录</title>
    <link rel="stylesheet" href="/images/animate.min.css">
    <link rel="stylesheet" href="/images/bootstrap.css">
    <link rel="stylesheet" href="/images/global_v2.0.0.css"/>
    <link rel="stylesheet" href="/images/wt_index.css"/>
    <script type="text/javascript" src="/jquery/jquery-1.11.1.js"></script>
</head>
<body>
<jsp:include page="../pub/head.jsp" flush="true"/>
<div class="g-lgin">
    <form id="loginForm">
        <div class="g-lgin-m">
            <ul class="g-lgin-t">
                <li class="on1"><a>登录</a></li>
                <li class="on2"><a href="./regist.jsp" style="text-decoration:none">注册</a></li>
            </ul>
            <div class="g-lgin-cnt">
                <ul class="g-lgin-lst">
                    <li><input id="mobile" name="mobile" class="g-lgin-ipt" placeholder="请输入手机号"/></li>
                    <li><input id="password" name="password" class="g-lgin-ipt" placeholder="请输入密码"/></li>
                </ul>
                <ul class="g-lgin-lst2">
                    <li class="on1"><input name="remind" type="checkbox" value="1"><span>记住密码</span></li>
                    <li class="on2"><a href="#">找回密码</a></li>
                </ul>
                <div class="g-pw-btnw"><input type="button" value="登  录" class="g-lgin-btn"></div>
            </div>
        </div>
    </form>
</div>
<jsp:include page="../pub/foot.jsp" flush="true"/>
</body>
<script type="text/javascript">
    function login() {
        if (!validate())
            return;
        $.ajax({
            type: 'POST',
            dataType: 'json',
            url: '/user/login',
            data: $('#loginForm').serialize(),
            success: function (result) {
                if (!result.data) {
                    alert(result.message);
                    return;
                }
                window.location.href = "/index";
            }
        });
    }
    function validate() {
        var mobile = $("#mobile").val();
        var password = $("#password").val();
        if (!mobile.length) {
            alert("用户名不能为空");
            return false;
        }
        if (!password.length)
            return false;
        return true;
    }
</script>
</html>
