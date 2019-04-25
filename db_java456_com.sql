/*
Navicat MySQL Data Transfer

Source Server         : 47.96.103.90_3306
Source Server Version : 50644
Source Host           : 47.96.103.90:3306
Source Database       : db_java456_com

Target Server Type    : MYSQL
Target Server Version : 50644
File Encoding         : 65001

Date: 2019-04-25 18:06:03
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for `t_blog`
-- ----------------------------
DROP TABLE IF EXISTS `t_blog`;
CREATE TABLE `t_blog` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `title` varchar(200) DEFAULT NULL,
  `content` longtext,
  `contentNoTag` text,
  `summary` varchar(500) DEFAULT NULL,
  `thumbnail_image` varchar(100) DEFAULT NULL,
  `keywords` varchar(200) DEFAULT NULL,
  `description_` varchar(500) DEFAULT NULL,
  `clickHit` int(11) DEFAULT NULL,
  `replyHit` int(11) DEFAULT NULL,
  `display_mode` int(3) DEFAULT NULL,
  `url` varchar(100) DEFAULT NULL,
  `createUserId` int(11) DEFAULT NULL,
  `blogFenLeiId` int(11) DEFAULT NULL,
  `isUse` int(3) DEFAULT NULL,
  `createDateTime` datetime DEFAULT NULL,
  `updateDateTime` datetime DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=8 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of t_blog
-- ----------------------------
INSERT INTO `t_blog` VALUES ('3', 'java开发11111111111', '<p>11111111111</p><p><br/></p><p>、</p><pre class=\"brush:as3;toolbar:false\">.blog_title&nbsp;{\n	text-align:&nbsp;center;\n	color:&nbsp;#00a786;\n	font-size:&nbsp;28px;\n	height:&nbsp;1.1em;\n	line-height:&nbsp;1.1em;\n	padding-top:&nbsp;40px;\n	margin-bottom:&nbsp;12px;\n	font-weight:&nbsp;400;\n}</pre><p><img src=\"http://img.baidu.com/hi/jx2/j_0026.gif\"/></p><p><br/></p><p>.<img src=\"/static/ueditor_upload/userImages/20180711/1531322100327004548.png\" title=\"1531322100327004548.png\" alt=\"image.png\"/></p><p><br/></p><p><br/></p><p><img src=\"http://img.baidu.com/hi/jx2/j_0012.gif\"/></p><p><br/></p><p><img src=\"/static/ueditor_upload/userImages/20180711/1531322290795009482.png\" title=\"1531322290795009482.png\" alt=\"image.png\"/></p><p><br/></p><p><br/></p>', '11111111111、.blog_title {	text-align: center;	color: #00a786;	font-size: 28px;	height: 1.1em;	line-height: 1.1em;	padding-top: 40px;	margin-bottom: 12px;	font-weight: 400;}.', '11111111111、.blog_title {	text-align: center;	color: #00a786;	font-size: 28px;	height: 1.1em;	line-height: 1.1em;	padding-top: 40px;	margin-bottom: 12px;	f', '/static/upload_image/blog/2018-07-09/2018-07-09-05-23-04-322.jpg', '11111111', '111111111', '44', '0', '3', 'http://bpqb7v.natappfree.cc/a/blog/get?id=3', '3', '1', '1', '2018-07-09 15:35:50', '2018-07-13 09:37:52');
INSERT INTO `t_blog` VALUES ('4', 'php开发111', '<p>33333332323434</p>', '33333332323434', '33333332323434', null, '333', '33333', '6', '0', '0', 'http://bpqb7v.natappfree.cc/a/blog/get?id=4', '3', '2', '1', '2018-07-09 16:50:23', '2018-07-12 08:47:11');
INSERT INTO `t_blog` VALUES ('5', 'java开发2', '<p>333</p>', '333', '333', null, '333', '3', '3', '0', '0', 'http://bpqb7v.natappfree.cc/a/blog/get?id=5', '3', '1', '1', '2018-07-09 16:50:25', '2018-07-12 08:47:11');
INSERT INTO `t_blog` VALUES ('6', 'java开发3', '<p>33</p>', '33', '33', null, '33', '33', '3', '0', '0', 'http://bpqb7v.natappfree.cc/a/blog/get?id=6', '3', '1', '1', '2018-07-09 16:52:22', '2018-07-12 08:47:11');
INSERT INTO `t_blog` VALUES ('7', '新闻 要闻', '<p>12</p>', '12', '12', null, '12', '12', '1', '0', '0', 'http://bpqb7v.natappfree.cc/a/blog/get?id=7', '3', '3', '1', '2018-07-11 18:20:56', '2018-07-12 08:47:12');

-- ----------------------------
-- Table structure for `t_blog_fenlei`
-- ----------------------------
DROP TABLE IF EXISTS `t_blog_fenlei`;
CREATE TABLE `t_blog_fenlei` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(100) DEFAULT NULL,
  `isUse` int(5) DEFAULT NULL,
  `orderNo` int(11) DEFAULT NULL,
  `pos` int(5) DEFAULT NULL,
  `createDateTime` datetime DEFAULT NULL,
  `updateDateTime` datetime DEFAULT NULL,
  `remark` varchar(200) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of t_blog_fenlei
-- ----------------------------
INSERT INTO `t_blog_fenlei` VALUES ('1', 'java开发', '1', '1', '1', '2018-07-01 18:04:16', '2018-07-11 16:59:44', '');
INSERT INTO `t_blog_fenlei` VALUES ('2', 'php开发', '1', '2', '1', '2018-07-09 15:35:22', '2018-07-11 17:00:02', '');
INSERT INTO `t_blog_fenlei` VALUES ('3', '最新教程', '1', '3', '1', '2018-07-11 17:28:36', '2018-07-11 17:28:36', '');
INSERT INTO `t_blog_fenlei` VALUES ('4', '其它分类', '1', '999', '9999', '2018-07-13 09:07:36', '2018-07-13 09:45:36', '');
INSERT INTO `t_blog_fenlei` VALUES ('5', '个人心情', '1', '3', '1', '2018-07-14 10:04:19', '2018-07-14 10:04:24', '');

-- ----------------------------
-- Table structure for `t_config`
-- ----------------------------
DROP TABLE IF EXISTS `t_config`;
CREATE TABLE `t_config` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `web_name` varchar(50) DEFAULT NULL,
  `station_name` varchar(50) DEFAULT NULL,
  `web_site` varchar(100) DEFAULT NULL,
  `headStr` text,
  `layuiStr` text,
  `tongjiStr` text,
  `houtai_logo` varchar(100) DEFAULT NULL,
  `gzh` varchar(100) DEFAULT NULL,
  `geren_erweima` varchar(100) DEFAULT NULL,
  `logo` varchar(100) DEFAULT NULL,
  `index_page_title` varchar(100) DEFAULT NULL,
  `index_page_keywords` varchar(500) DEFAULT NULL,
  `index_page_description` varchar(500) DEFAULT NULL,
  `beian_` varchar(500) DEFAULT NULL,
  `banben` int(11) DEFAULT NULL,
  `food_info` text,
  `nav_str` text,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of t_config
-- ----------------------------
INSERT INTO `t_config` VALUES ('1', 'java教程 java视频 ', '蚂蚁科技', 'http://bpqb7v.natappfree.cc', '<!-- 强制  高速模式 渲染网页    -->\n<meta NAME=”renderer” content=”webkit”>\n<!-- 强制  高速模式 渲染网页    -->\n\n<link href=\"/static/favicon.ico\" rel=\"shortcut icon\" />\n\n<!--添加  jq  支持加载-->\n<script	src=\"/static/easy-ui/jquery.min.js\"></script>\n<!--添加  jq  支持加载-->\n', '<!--添加 layui  支持加载-->\n<link rel=\"stylesheet\"	href=\"/static/layui-v2.2.5/layui/css/layui.css\">\n<script	src=\"/static/layui-v2.2.5/layui/layui.js\"></script>\n<!--添加 layui  支持加载-->', '<!--百度统计  -->\n<script>\nvar _hmt = _hmt || [];\n(function() {\n  var hm = document.createElement(\"script\");\n  hm.src = \"https://hm.baidu.com/hm.js?5b5ef03278b5cedc5da6ef5521d8bc27\";\n  var s = document.getElementsByTagName(\"script\")[0]; \n  s.parentNode.insertBefore(hm, s);\n})();\n</script>\n<!--百度统计  -->\n', '/static/upload_image/config/houtai_logo.jpg', '/static/upload_image/config/gzh.jpg', '/static/upload_image/config/geren_erweima.jpg', '/static/upload_image/config/logo.jpg', '首页 标题', '首页 关键词', '首页 描述 摘要', '<div style=\"display: inline-block; width: 200px; float: right;\">\n<a style=\"color: white;\" target=\"_blank\"	href=\"http://www.miitbeian.gov.cn\">豫ICP备xxxx123456号</a>\n</div>', '12', '<div class=\"food_info\">\n					<div class=\"food_info_item\" style=\"width: 150px;\">\n						<h3>业务范围</h3>\n						<a href=\"#\">业务范围1</a> \n						<a href=\"#\">业务范围12</a> \n						<a href=\"#\">业务范围13</a>\n					</div>\n					\n					<div class=\"food_info_item\">\n						<h3>关于我们</h3>\n						<a href=\"#\">会员条款</a> \n						<a href=\"#\">加入 我们</a> \n						<a href=\"#\">关于汝州党建</a>\n					</div>\n					<div class=\"food_info_item\">\n						<h3>关注我们</h3>\n						<a href=\"#\">新浪微博</a> \n						<a href=\"#\">联系我们</a>\n					</div>\n					<div class=\"food_info_item\">\n						<h3>公众号</h3>\n						<div class=\"pic_div\">\n							<img alt=\"关注我们\" src=\"/static/upload_image/config/gzh.jpg\" />\n						</div>\n					</div>\n					<div class=\"food_info_item\">\n						<h3>个人微信</h3>\n						<div class=\"pic_div\">\n							<img alt=\"关注我们\" src=\"/static/upload_image/config/geren_erweima.jpg\" />\n						</div>\n					</div>\n				</div>', '<div style=\" float:left;\">\n					<ul class=\"layui-nav\">\n						<li class=\"layui-nav-item\">\n							<a href=\"/index.html\"><img src=\"/static/images/base/default_head_img.jpg\"class=\"layui-nav-img\" />首页</a>\n						</li>\n						\n						<li class=\"layui-nav-item\" lay-unselect=\"\">\n							<a	href=\"/a/down/list\"><img src=\"/static/images/base/default_head_img.jpg\"class=\"layui-nav-img\">软件下载</a>\n						</li>\n						\n						<li class=\"layui-nav-item\">\n							<a href=\"/a/down/list\"><img src=\"/static/images/base/default_head_img.jpg\"class=\"layui-nav-img\">工具下载</a>\n						</li>\n						\n					</ul>\n				</div>\n				\n				<div style=\"float:right;\">\n					<ul class=\"layui-nav\">\n						<li class=\"layui-nav-item\" lay-unselect=\"\">\n							\n							<a	href=\"javascript:;\"><img src=\"/static/images/base/default_head_img.jpg\"class=\"layui-nav-img\">解决方案</a>\n							<dl class=\"layui-nav-child\">\n									<dd>\n										<a href=\"#\">解决方案菜单1</a>\n									</dd>\n									<dd>\n										<a href=\"#\">解决方案菜单2</a>\n									</dd>\n							</dl>\n						</li>\n					</ul>\n				</div> ');

-- ----------------------------
-- Table structure for `t_down`
-- ----------------------------
DROP TABLE IF EXISTS `t_down`;
CREATE TABLE `t_down` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `title` varchar(200) DEFAULT NULL,
  `keywords` varchar(200) DEFAULT NULL,
  `description` varchar(500) DEFAULT NULL,
  `content` longtext,
  `contentNoTag` text,
  `summary` varchar(500) DEFAULT NULL,
  `thumbnail_image` varchar(200) DEFAULT NULL,
  `createUserId` int(11) DEFAULT NULL,
  `downFenLeiId` int(11) DEFAULT NULL,
  `clickHit` int(11) DEFAULT NULL,
  `replyHit` int(11) DEFAULT NULL,
  `isUse` int(4) DEFAULT NULL,
  `display_mode` int(4) DEFAULT NULL,
  `url` varchar(100) DEFAULT NULL,
  `createDateTime` datetime DEFAULT NULL,
  `updateDateTime` datetime DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of t_down
-- ----------------------------
INSERT INTO `t_down` VALUES ('1', '43214', '432', '432', '<p>4324</p>', '4324', '4324', '/static/upload_image/down/2018-07-13/2018-07-13-08-55-57-925.jpg', '3', '1', '31', '0', '1', '0', null, '2018-07-09 17:29:03', '2018-07-13 08:55:59');
INSERT INTO `t_down` VALUES ('2', 'eclipse mar 【64位】', 'eclipse mar 【64位】', 'eclipse mar 【64位】', '<p>eclipse mar 【64位】</p><p>eclipse mar 【64位】eclipse mar 【64位】</p>', 'eclipse mar 【64位】eclipse mar 【64位】eclipse mar 【64位】', 'eclipse mar 【64位】eclipse mar 【64位】eclipse mar 【64位】', '/static/upload_image/down/2018-07-13/2018-07-13-09-00-25-979.jpg', '3', '1', '1', '0', '1', '0', 'http://bpqb7v.natappfree.cc/a/down/get?id=2', '2018-07-13 08:59:07', '2018-07-13 09:00:27');

-- ----------------------------
-- Table structure for `t_down_fenlei`
-- ----------------------------
DROP TABLE IF EXISTS `t_down_fenlei`;
CREATE TABLE `t_down_fenlei` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(100) DEFAULT NULL,
  `isUse` int(2) DEFAULT NULL,
  `orderNo` int(11) DEFAULT NULL,
  `createDateTime` datetime DEFAULT NULL,
  `updateDateTime` datetime DEFAULT NULL,
  `remark` varchar(200) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of t_down_fenlei
-- ----------------------------
INSERT INTO `t_down_fenlei` VALUES ('1', 'java相关软件', '1', '1', '2018-03-24 15:23:25', '2018-07-01 08:30:14', '12222');
INSERT INTO `t_down_fenlei` VALUES ('2', '其它软件', '1', '2', '2018-03-24 15:30:41', '2018-07-01 08:27:49', '12');

-- ----------------------------
-- Table structure for `t_link`
-- ----------------------------
DROP TABLE IF EXISTS `t_link`;
CREATE TABLE `t_link` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(100) DEFAULT NULL,
  `url` varchar(300) DEFAULT NULL,
  `isUse` int(11) DEFAULT NULL,
  `orderNo` int(11) DEFAULT NULL,
  `createDateTime` datetime DEFAULT NULL,
  `updateDateTime` datetime DEFAULT NULL,
  `remark` varchar(200) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of t_link
-- ----------------------------
INSERT INTO `t_link` VALUES ('2', '简单海报，名片制作', 'https://www.fotor.com.cn/app.htm22', '1', '1', '2018-02-10 12:03:30', '2018-07-13 10:58:27', '55');
INSERT INTO `t_link` VALUES ('3', '淘宝网', 'https://www.taobao.com/', '1', '2', '2018-07-13 10:58:20', '2018-07-13 10:58:28', '');

-- ----------------------------
-- Table structure for `t_lun_bo`
-- ----------------------------
DROP TABLE IF EXISTS `t_lun_bo`;
CREATE TABLE `t_lun_bo` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `title` varchar(100) DEFAULT NULL,
  `url` varchar(500) DEFAULT NULL,
  `image_url` varchar(100) DEFAULT NULL,
  `isUse` int(5) DEFAULT NULL,
  `type` int(5) DEFAULT NULL,
  `orderNo` int(11) DEFAULT NULL,
  `createUserId` int(11) DEFAULT NULL,
  `createDateTime` datetime DEFAULT NULL,
  `updateDateTime` datetime DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=utf8mb4;

-- ----------------------------
-- Records of t_lun_bo
-- ----------------------------
INSERT INTO `t_lun_bo` VALUES ('1', '111111', '52', '/static/upload_image/lunbo/2018-07-13-10-11-37-321.jpg', '1', '2', '1', '3', '2018-02-21 11:34:34', '2018-07-13 10:11:38');
INSERT INTO `t_lun_bo` VALUES ('2', '22222222', '', '/static/upload_image/lunbo/2018-07-11-11-16-45-508.jpg', '1', '1', '2', '3', '2018-02-21 11:35:03', '2018-07-11 11:16:46');
INSERT INTO `t_lun_bo` VALUES ('3', '33333333', '', '/static/upload_image/lunbo/2018-07-11-11-16-51-563.jpg', '1', '1', '3', '3', '2018-02-21 11:35:07', '2018-07-11 11:16:52');
INSERT INTO `t_lun_bo` VALUES ('4', '44444444', '', '/static/upload_image/lunbo/2018-07-11-11-16-56-634.jpg', '1', '1', '4', '3', '2018-02-21 11:38:11', '2018-07-11 11:16:57');
INSERT INTO `t_lun_bo` VALUES ('6', '12', '12', null, '0', '1', '1', '3', '2018-07-10 09:17:57', '2019-04-25 17:46:48');

-- ----------------------------
-- Table structure for `t_memo`
-- ----------------------------
DROP TABLE IF EXISTS `t_memo`;
CREATE TABLE `t_memo` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `title` varchar(200) DEFAULT NULL,
  `content` varchar(2000) DEFAULT NULL,
  `memoFenLeiId` int(11) DEFAULT NULL,
  `orderNo` int(11) DEFAULT NULL,
  `createUserId` int(11) DEFAULT NULL,
  `createDateTime` datetime DEFAULT NULL,
  `updateDateTime` datetime DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of t_memo
-- ----------------------------
INSERT INTO `t_memo` VALUES ('1', '11111', '233333', '1', '1', '3', '2018-07-02 11:48:54', '2018-07-02 15:48:31');
INSERT INTO `t_memo` VALUES ('2', '李豪勋 帐单', '2018-2-13 借呗15000\n2018-3-5  还2597 还\n2018-4-5  还2597 还\n2018-5-5  还2597 还\n2018-6-5  还2597 还\n2018-7-5  还2597  还\n2018-8-5  还2597   \n\n2018-4-29  借3000\n\n2018-7-11借呗 2万   【每月还3470】\n2018-8-5    还3470\n2018-9-5    还3470\n2018-10-5  还3470\n2018-11-5  还3470\n2018-12-5  还3470\n2019-1-5    还3470\n', '5', '1', '3', '2018-07-11 09:17:51', '2018-07-12 18:27:52');
INSERT INTO `t_memo` VALUES ('3', '焦小飞 帐单', '借信用卡 10000\n\n2018-02-26    借呗  15000\n4-5 2617元   未还\n5-5 2617元   未还\n6-5 2617元   未还\n7-5 2617元   未还\n8-5 2617元   未还\n9-5 2617元\n\n4月5号    借呗代还2617  代还费用 26元\n4月25号  信用卡代还费用  100元\n\n5月5号     还我960元\n5月5号     借呗代还5234  代还费用 52元\n5月24号   还我200元\n5月25号   代还信用卡  代还费用100\n\n6月5号    代还借呗  代还费用78元\n6月25号  代还信用卡  费用100\n\n7月5号  代还借呗   代还费用100元\n7月5号  还我200\n\n7月9号  借我 1200元\n\n', '5', '5', '3', '2018-07-11 09:18:56', '2018-07-12 18:30:54');
INSERT INTO `t_memo` VALUES ('4', '搜到  提现 密码', '帐号是qq号\n\n提现密码\n111999aa!', '1', '2', '3', '2018-07-11 09:22:32', '2018-07-11 09:22:32');

-- ----------------------------
-- Table structure for `t_memo_fenlei`
-- ----------------------------
DROP TABLE IF EXISTS `t_memo_fenlei`;
CREATE TABLE `t_memo_fenlei` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(100) DEFAULT NULL,
  `isUse` int(3) DEFAULT NULL,
  `orderNo` int(11) DEFAULT NULL,
  `createDateTime` datetime DEFAULT NULL,
  `updateDateTime` datetime DEFAULT NULL,
  `remark` varchar(200) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of t_memo_fenlei
-- ----------------------------
INSERT INTO `t_memo_fenlei` VALUES ('1', '帐号', '1', '9', '2018-07-01 18:22:41', '2018-07-11 09:16:12', '');
INSERT INTO `t_memo_fenlei` VALUES ('2', '信用卡', '1', '1', '2018-07-02 11:49:40', '2018-07-02 15:54:54', '');
INSERT INTO `t_memo_fenlei` VALUES ('3', '公众号', '1', '17', '2018-07-02 15:53:19', '2018-07-11 09:16:14', '');
INSERT INTO `t_memo_fenlei` VALUES ('4', '日记类', '1', '26', '2018-07-02 15:53:48', '2018-07-11 09:16:17', '');
INSERT INTO `t_memo_fenlei` VALUES ('5', '帐单', '1', '5', '2018-07-11 09:16:39', '2018-07-11 09:16:39', '');

-- ----------------------------
-- Table structure for `t_tree`
-- ----------------------------
DROP TABLE IF EXISTS `t_tree`;
CREATE TABLE `t_tree` (
  `id` int(11) DEFAULT NULL,
  `text` varchar(46) DEFAULT NULL,
  `father` int(11) DEFAULT NULL,
  `url` varchar(500) DEFAULT NULL,
  `state` varchar(46) DEFAULT NULL,
  `iconCls` varchar(46) DEFAULT NULL,
  `permissions` varchar(100) DEFAULT NULL,
  `dd_id` varchar(46) DEFAULT NULL,
  `type` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of t_tree
-- ----------------------------
INSERT INTO `t_tree` VALUES ('99', '权限设置', '-1', null, 'close', null, null, null, '0');
INSERT INTO `t_tree` VALUES ('6', '辅助功能', '-1', null, 'close', null, null, null, '0');
INSERT INTO `t_tree` VALUES ('61005', '轮播图片管理', '6', '/houtai/lunbo/manage', 'opend', '&#xe630;', null, 'lunbo', '0');
INSERT INTO `t_tree` VALUES ('991005', '删除退款权限', '99', null, 'opend', '&#xe756;', 'refund:del', null, '0');
INSERT INTO `t_tree` VALUES ('131020', '文章管理', '13', '/houtai/blog/manage', 'opend', '&#xe735;', null, 'blog', '0');
INSERT INTO `t_tree` VALUES ('131007', '文章分类', '13', '/houtai/blog/fenlei/manage', 'opend', '&#xe612;', null, 'blog_fenlei', '0');
INSERT INTO `t_tree` VALUES ('61010', '用户管理', '6', '/houtai/user/manage', 'opend', '&#xe63c;', null, 'clientType', '0');
INSERT INTO `t_tree` VALUES ('61001', '二维码生成', '6', '/houtai/qrcode/manage', 'opend', '&#xe756;', null, 'qrcode', '0');
INSERT INTO `t_tree` VALUES ('13', '文章', '-1', null, 'close', null, null, null, '0');
INSERT INTO `t_tree` VALUES ('61002', '网站配置管理', '6', '/houtai/config/manage', 'opend', '&#xe612;', null, 'config', '0');
INSERT INTO `t_tree` VALUES ('61015', '友情链接', '6', '/houtai/link/manage', 'opend', '&#xe612;', null, 'link', '0');
INSERT INTO `t_tree` VALUES ('16', '软件下载', '-1', null, 'close', null, null, null, '0');
INSERT INTO `t_tree` VALUES ('161001', '软件分类', '16', '/houtai/down/fenlei/manage', 'opend', '&#xe735;', null, 'down_fenlei', '0');
INSERT INTO `t_tree` VALUES ('161005', '软件下载', '16', '/houtai/down/manage', 'opend', '&#xe735;', null, 'down', '0');
INSERT INTO `t_tree` VALUES ('19', '备忘录模块', '-1', null, null, null, null, null, '0');
INSERT INTO `t_tree` VALUES ('191001', '备忘录分类', '19', '/houtai/memo/fenlei/manage', 'opend', '&#xe735;', null, 'memo_fenlei', '0');
INSERT INTO `t_tree` VALUES ('191002', '备忘录', '19', '/houtai/memo/manage', 'opend', '&#xe735;', null, 'memo', '0');

-- ----------------------------
-- Table structure for `t_user`
-- ----------------------------
DROP TABLE IF EXISTS `t_user`;
CREATE TABLE `t_user` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(46) DEFAULT NULL,
  `password` varchar(46) DEFAULT NULL,
  `createDateTime` datetime DEFAULT NULL,
  `menuIds` varchar(1000) DEFAULT NULL,
  `remark` varchar(100) DEFAULT NULL,
  `trueName` varchar(46) DEFAULT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `weiyi` (`name`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of t_user
-- ----------------------------
INSERT INTO `t_user` VALUES ('3', '1', '0680d00353f3555fe7c01f11ed89bf8b', '2017-05-10 11:25:32', '6,61001,61002,61005,61010,61015,13,131007,131020,16,161001,161005,19,191001,191002,991005', '111', '陈豪');
INSERT INTO `t_user` VALUES ('5', '321', '0680d00353f3555fe7c01f11ed89bf8b', '2018-02-05 15:13:31', '6,61002,61005,61010', '123', '321');
