<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<div class="navbar">
    <div class="navbar-inner">
    		<a href="${s.base}"  class="cms-logo"  title="网校在线学习平台"></a>
            <span class="brand" >网校运营管理</span>
            
            <@shiro.user>
            <span class="brand" style="float: right;margin-right: 50px;color:#FFF;">
            <@shiro.principal property="username"/>
            </span>
	       </@shiro.user>
    </div>
</div>


