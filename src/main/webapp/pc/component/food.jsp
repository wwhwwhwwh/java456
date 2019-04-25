<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<!-- 底部 内容 模块 -->
	<div class="model" style="background-color: #0c0d0e;">
		<div class="content">
			<div style="padding: 20px 0px 20px 0px;">
				${config.food_info}
				<!-- 【友情链接】开始  -->
				<fieldset class="layui-elem-field">
					<legend style="color: #795548">友情连接</legend>
					<div class="layui-field-box">
						<div class="link_list">
							
							<c:forEach var="link" items="${linkList}" varStatus="status">
								<a target="_blank" href="${link.url }">${link.name }</a>
							</c:forEach>
							
						</div>
					</div>
				</fieldset>
				<!-- 【友情链接】结束 -->
				
				<!-- 备案号 -->
				<div style="overflow: hidden;">
					${config.beian_}
				</div>
				<!-- 备案号 -->
			</div>
			
		</div>
	</div>
	<!-- 底部 内容 模块 -->
