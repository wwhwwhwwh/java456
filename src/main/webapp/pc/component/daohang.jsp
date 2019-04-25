<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>

	<!-- 导航 -->
	<div class="model" style="background-color: #393D49;">
		<div class="content">
				<div id="logo" na="logo" style="float: left; height: 60px; overflow: hidden;">
						<a id="logo" na="logo" style="display: block;" href="/index.html">
							<img id="logo" na="logo" title="${config.index_page_title}" src="${config.logo}" />
						</a>
				</div>
				
				${config.nav_str}
				
				<!-- <div style=" float:left;">
					<ul class="layui-nav">
						<li class="layui-nav-item">
							<a href="/index.html"><img src="/static/images/base/default_head_img.jpg"class="layui-nav-img" />首页</a>
						</li>
						
						<li class="layui-nav-item" lay-unselect="">
							<a	href="/a/down/list"><img src="/static/images/base/default_head_img.jpg"class="layui-nav-img">软件下载</a>
						</li>
						
						<li class="layui-nav-item">
							<a href="/a/down/list"><img src="/static/images/base/default_head_img.jpg"class="layui-nav-img">工具下载</a>
						</li>
						
					</ul>
				</div>
				
				<div style="float:right;">
					<ul class="layui-nav">
						<li class="layui-nav-item" lay-unselect="">
							
							<a	href="javascript:;"><img src="/static/images/base/default_head_img.jpg"class="layui-nav-img">解决方案</a>
							<dl class="layui-nav-child">
									<dd>
										<a href="#">解决方案菜单1</a>
									</dd>
									<dd>
										<a href="#">解决方案菜单2</a>
									</dd>
							</dl>
						</li>
					</ul>
				</div> -->
				
				<!--content 内部   清除浮动 -->
				<div style=" clear:both;"></div>
		</div>
	</div>
	<!-- 导航 -->
	

