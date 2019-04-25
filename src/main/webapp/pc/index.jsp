<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>

<!-- JSTL -->
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<!-- JSTL -->

${config.headStr}

${config.layuiStr}

<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>${config.index_page_title}</title>
<meta name="keywords" content="${config.index_page_keywords }" />
<meta name="description" content="${config.index_page_description}"/>

<!--添加 公共css -->
<link rel="stylesheet"	href="/static/css/pc/base.css?version=${config.banben}">
<!--添加 公共css -->

<!-- 首页 js加载-->
<script src="${pageContext.request.contextPath}/static/js/pc/pc_index.js?version=${config.banben}"></script>
<!-- 首页 js加载-->


<script type="text/javascript">
</script>
</head>
<body>

<div class="wrap">
	
	<!-- 加载导航 -->
	<jsp:include page="/pc/component/daohang.jsp"/>
	<!-- 加载导航   -->
	
	<!-- 加载轮播 -->
	<jsp:include page="/pc/component/lunbo.jsp"/>
	<!-- 加载轮播 -->
	
	<!-- 基础模块 -->
	<jsp:include page="/pc/component/base_module.jsp"/>
	<!-- 基础模块 -->
	
	<!-- 临时模块 -->
	<jsp:include page="/pc/component/temp.jsp"/>
	<!-- 临时模块 -->
	
	<!-- 加载底部 模块 -->
	<jsp:include page="/pc/component/food.jsp"/>
	<!-- 加载底部 模块 -->
	
	
</div>


</body>
<script>
layui.use([ 'laydate', 'laypage', 'layer', 'table', 'carousel',
			'upload', 'element' ], function() {
		var laydate = layui.laydate //日期
		, laypage = layui.laypage //分页
		layer = layui.layer //弹层
		, table = layui.table //表格
		, carousel = layui.carousel //轮播
		, upload = layui.upload //上传
		, element = layui.element; //元素操作
});
</script>
</html>