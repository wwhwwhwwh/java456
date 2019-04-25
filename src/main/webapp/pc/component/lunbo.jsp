<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>


<!-- 轮播 -->
	<div class="model" style="background-color: white;">
		<div class="content">
			<div style="width: 100%; padding: 10px 0px 10px 0px; overflow: hidden;">
				
				<div style="overflow: hidden; float: left;width: 50%; height: 400px; background-color: #cddc3945;">
					
					<c:if test="${lunboList[0].type==1}">
						<a style="display: block;" href="${lunboList[0].url}" title="${lunboList[0].title}">
							<img alt="${lunboList[0].title}" src="${lunboList[0].image_url}" />
						</a>
					</c:if>
					
					<c:if test="${lunboList[0].type==2}">
						<a target="_blank" style="display: block;" href="${lunboList[0].url}" title="${lunboList[0].title}">
							<img alt="${lunboList[0].title}" src="${lunboList[0].image_url}" />
						</a>
					</c:if>
					
				</div>
				
				
				<div style="overflow: hidden; float: left;width: 50%; height: 400px; background-color: #4caf5066;">
					
					<div style="overflow: hidden;height: 200px; background-color: #cddc397a;">
						<c:if test="${lunboList[1].type==1}">
							<a style="display: block;" href="${lunboList[1].url}" title="${lunboList[1].title}">
								<img alt="${lunboList[1].title}" src="${lunboList[1].image_url}" />
							</a>
						</c:if>
						<c:if test="${lunboList[1].type==2}">
							<a target="_blank" style="display: block;" href="${lunboList[1].url}" title="${lunboList[1].title}">
								<img alt="${lunboList[1].title}" src="${lunboList[1].image_url}" />
							</a>
						</c:if>
					</div>
					
					<div style="overflow: hidden;height: 200px; background-color: #4caf5066;">
						<div style="overflow: hidden;width: 50%; height:100%; float: left; background-color: #673ab77d;">
							<c:if test="${lunboList[2].type==1}">
								<a style="display: block;" href="${lunboList[2].url}" title="${lunboList[2].title}">
									<img alt="${lunboList[2].title}" src="${lunboList[2].image_url}" />
								</a>
							</c:if>
							<c:if test="${lunboList[2].type==2}">
								<a target="_blank" style="display: block;" href="${lunboList[2].url}" title="${lunboList[2].title}">
									<img alt="${lunboList[2].title}" src="${lunboList[2].image_url}" />
								</a>
							</c:if>
						</div>
						
						<div style="overflow: hidden;width: 50%; height:100%; float: left;">
							<c:if test="${lunboList[3].type==1}">
								<a style="display: block;" href="${lunboList[3].url}" title="${lunboList[3].title}">
									<img alt="${lunboList[3].title}" src="${lunboList[3].image_url}" />
								</a>
							</c:if>
							<c:if test="${lunboList[3].type==2}">
								<a target="_blank" style="display: block;" href="${lunboList[3].url}" title="${lunboList[3].title}">
									<img alt="${lunboList[3].title}" src="${lunboList[3].image_url}" />
								</a>
							</c:if>
						</div>
						
						
					</div>
				</div>
			</div>
			<!--content 内部   清除浮动 -->
			<div style=" clear:both;"></div>
		</div>
	</div>
	<!-- 轮播 -->
	
	
