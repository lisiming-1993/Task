<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<header>
    <div class="container  hidden-xs">
        <div class="row header-top">
            <p class="col-xs-12 col-sm-6 col-md-6 col-lg-6">客服电话:010-594-78634</p>
            <div class="col-xs-12 col-sm-6 col-md-6 col-lg-6 text-right">
                <div>
                    <a href="#" target="_blank"> <img alt=""  src="${pageContext.request.contextPath}/static/imges/54537.png"></a>
                    <a href="#" target="_blank"><img alt=""  src="${pageContext.request.contextPath}/static/imges/45678678.png"></a>
                    <a href="#" target="_blank"> <img alt=""  src="${pageContext.request.contextPath}/static/imges/54375483543.png"></a>
                    <a href="/task9_Web/logging" >登录</a>
                    <a href="/task9_Web/registration" >注册</a>
                </div>
            </div>
        </div>
    </div>
    <nav class="navbar navbar-default">
        <div class="container">
            <div class="navbar-header">
                <a href="#" class="navbar-brand">
                    <img src="${pageContext.request.contextPath}/static/imges/logo.png" alt="Brand" class="img-responsive">
                </a>
                <button data-target="#open-nav" data-toggle="collapse" class="navbar-toggle btn-primary collapsed" aria-expanded="false">
                    <span class="icon-bar"></span>
                    <span class="icon-bar"></span>
                    <span class="icon-bar"></span>
                </button>
            </div>
            <div id="open-nav" class="navbar-collapse collapse" aria-expanded="false" style="height: 1px;">
                <ul class="nav navbar-nav navbar-right text-center list-inline">
                    <li><a href="/task9_Web/firstPage">首页</a></li>
                    <li><a href="u/secondPage">职业</a></li>
                    <li><a href="">推荐</a></li>
                    <li><a href="">关于</a></li>
                    <li><a href="">欢迎你${sessionScope.get("name")}</a></li>
                </ul>
            </div>
        </div>
    </nav>
</header>