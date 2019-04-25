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

<!-- 加入移动布局 -->
<meta name="viewport"
	content="width=device-width, initial-scale=1.0,maximum-scale=1.0, user-scalable=no" />
<!-- 加入移动布局 -->

<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>请使用【极速模式】打开后台</title>

<style>
</style>

</head>
<body>

<div id="layer-photos-demo" class="layer-photos-demo">
      <img style="width: 50px;"  layer-pid="" src="/static/images/base/树叶logo.png"  >
      <img  style="width: 50px;" layer-pid="" src="/static/images/base/avatar.png"  >
      <img  style="width: 50px;" layer-pid="" src="http://tp.ruzhou.tv/static/images/activity/20180520/20180520095726.jpg"  >
</div>


	<script>
		layui.use([ 'laydate', 'laypage', 'layer', 'table', 'carousel',
				'upload', 'element' ], function() {
			var laydate = layui.laydate //日期
			, laypage = layui.laypage //分页
			,layer = layui.layer //弹层
			, table = layui.table //表格
			, carousel = layui.carousel //轮播
			, upload = layui.upload //上传
			, element = layui.element; //元素操作
			
			
			//调用示例
			layer.photos({
			  photos: '#layer-photos-demo'
			  ,anim: 5 //0-6的选择，指定弹出图片动画类型，默认随机（请注意，3.0之前的版本用shift参数）
			}); 
			
			
		});
	</script>
</body>
</html>