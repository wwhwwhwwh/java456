<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>

	<div class="model" style="background-color: #ece9e9;">
		<div class="content">
			<div style="padding: 17px 0px 10px 0px; overflow: hidden;">
				
				<c:forEach var="baseModule" items="${baseModuleList}" varStatus="status">
					<div  class="base_module" blogFenLeiId="${baseModule.id}">
						<div class="m-tab">
							<div class="m-tab-title">
								<h3>${baseModule.name}</h3>
								<div class="m-tab-title-act">
									<a href="/a/blog/fenlei/get?id=${baseModule.id}"><i></i>更多</a>
								</div>
							</div>
							<div class="m-tab-content">
								<ul>
									<!-- <li><i></i><span>04-28</span><a href="#" title="最佳中野拍档 原来中单洛和她是绝配">通知通告-标题1####</a></li>
									<li><i></i><span>04-28</span><a href="#" title="最佳中野拍档 原来中单洛和她是绝配">通知通告-标题1####</a></li>
									<li><i></i><span>04-28</span><a href="#" title="最佳中野拍档 原来中单洛和她是绝配">通知通告-标题1####</a></li>
									<li><i></i><span>04-28</span><a href="#" title="最佳中野拍档 原来中单洛和她是绝配">通知通告-标题1####</a></li>
									<li><i></i><span>04-28</span><a href="#" title="最佳中野拍档 原来中单洛和她是绝配">通知通告-标题1####</a></li>
									<li><i></i><span>04-28</span><a href="#" title="最佳中野拍档 原来中单洛和她是绝配">通知通告-标题1####</a></li>
									<li><i></i><span>04-28</span><a href="#" title="最佳中野拍档 原来中单洛和她是绝配">通知通告-标题1####</a></li>
									<li><i></i><span>04-28</span><a href="#" title="最佳中野拍档 原来中单洛和她是绝配">通知通告-标题1####</a></li>
									<li><i></i><span>04-28</span><a href="#" title="最佳中野拍档 原来中单洛和她是绝配">通知通告-标题1####</a></li>
									<li><i></i><span>04-28</span><a href="#" title="最佳中野拍档 原来中单洛和她是绝配">通知通告-标题1####</a></li> -->
								</ul>
							</div>
						</div>
					</div>
				</c:forEach>
				
			</div>
			
			<!--content 内部   清除浮动 -->
			<div style=" clear:both;"></div>
		</div>
	</div>
	
	
	