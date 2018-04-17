/*
Navicat MySQL Data Transfer

Source Server         : localhost_3306
Source Server Version : 50554
Source Host           : localhost:3306
Source Database       : hibernate_32

Target Server Type    : MYSQL
Target Server Version : 50554
File Encoding         : 65001

Date: 2018-04-15 13:02:56
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for base_dict
-- ----------------------------
DROP TABLE IF EXISTS `base_dict`;
CREATE TABLE `base_dict` (
  `dict_id` varchar(32) NOT NULL COMMENT '数据字典id(主键)',
  `dict_type_code` varchar(10) NOT NULL COMMENT '数据字典类别代码',
  `dict_type_name` varchar(64) NOT NULL COMMENT '数据字典类别名称',
  `dict_item_name` varchar(64) NOT NULL COMMENT '数据字典项目名称',
  `dict_item_code` varchar(10) DEFAULT NULL COMMENT '数据字典项目(可为空)',
  `dict_sort` int(10) DEFAULT NULL COMMENT '排序字段',
  `dict_enable` char(1) NOT NULL COMMENT '1:使用 0:停用',
  `dict_memo` varchar(64) DEFAULT NULL COMMENT '备注',
  PRIMARY KEY (`dict_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of base_dict
-- ----------------------------
INSERT INTO `base_dict` VALUES ('1', '001', '客户行业', '教育培训 ', null, '1', '1', null);
INSERT INTO `base_dict` VALUES ('10', '003', '公司性质', '民企', null, '3', '1', null);
INSERT INTO `base_dict` VALUES ('12', '004', '年营业额', '1-10万', null, '1', '1', null);
INSERT INTO `base_dict` VALUES ('13', '004', '年营业额', '10-20万', null, '2', '1', null);
INSERT INTO `base_dict` VALUES ('14', '004', '年营业额', '20-50万', null, '3', '1', null);
INSERT INTO `base_dict` VALUES ('15', '004', '年营业额', '50-100万', null, '4', '1', null);
INSERT INTO `base_dict` VALUES ('16', '004', '年营业额', '100-500万', null, '5', '1', null);
INSERT INTO `base_dict` VALUES ('17', '004', '年营业额', '500-1000万', null, '6', '1', null);
INSERT INTO `base_dict` VALUES ('18', '005', '客户状态', '基础客户', null, '1', '1', null);
INSERT INTO `base_dict` VALUES ('19', '005', '客户状态', '潜在客户', null, '2', '1', null);
INSERT INTO `base_dict` VALUES ('2', '001', '客户行业', '电子商务', null, '2', '1', null);
INSERT INTO `base_dict` VALUES ('20', '005', '客户状态', '成功客户', null, '3', '1', null);
INSERT INTO `base_dict` VALUES ('21', '005', '客户状态', '无效客户', null, '4', '1', null);
INSERT INTO `base_dict` VALUES ('22', '006', '客户级别', '普通客户', null, '1', '1', null);
INSERT INTO `base_dict` VALUES ('23', '006', '客户级别', 'VIP客户', null, '2', '1', null);
INSERT INTO `base_dict` VALUES ('24', '007', '商机状态', '意向客户', null, '1', '1', null);
INSERT INTO `base_dict` VALUES ('25', '007', '商机状态', '初步沟通', null, '2', '1', null);
INSERT INTO `base_dict` VALUES ('26', '007', '商机状态', '深度沟通', null, '3', '1', null);
INSERT INTO `base_dict` VALUES ('27', '007', '商机状态', '签订合同', null, '4', '1', null);
INSERT INTO `base_dict` VALUES ('3', '001', '客户行业', '对外贸易', null, '3', '1', null);
INSERT INTO `base_dict` VALUES ('30', '008', '商机类型', '新业务', null, '1', '1', null);
INSERT INTO `base_dict` VALUES ('31', '008', '商机类型', '现有业务', null, '2', '1', null);
INSERT INTO `base_dict` VALUES ('32', '009', '商机来源', '电话营销', null, '1', '1', null);
INSERT INTO `base_dict` VALUES ('33', '009', '商机来源', '网络营销', null, '2', '1', null);
INSERT INTO `base_dict` VALUES ('34', '009', '商机来源', '推广活动', null, '3', '1', null);
INSERT INTO `base_dict` VALUES ('4', '001', '客户行业', '酒店旅游', null, '4', '1', null);
INSERT INTO `base_dict` VALUES ('5', '001', '客户行业', '房地产', null, '5', '1', null);
INSERT INTO `base_dict` VALUES ('6', '002', '客户信息来源', '电话营销', null, '1', '1', null);
INSERT INTO `base_dict` VALUES ('7', '002', '客户信息来源', '网络营销', null, '2', '1', null);
INSERT INTO `base_dict` VALUES ('8', '003', '公司性质', '合资', null, '1', '1', null);
INSERT INTO `base_dict` VALUES ('9', '003', '公司性质', '国企', null, '2', '1', null);

-- ----------------------------
-- Table structure for cst_customer
-- ----------------------------
DROP TABLE IF EXISTS `cst_customer`;
CREATE TABLE `cst_customer` (
  `cust_id` bigint(32) NOT NULL AUTO_INCREMENT COMMENT '客户编号(主键)',
  `cust_name` varchar(32) NOT NULL COMMENT '客户名称(公司名称)',
  `cust_user_id` bigint(32) DEFAULT NULL COMMENT '负责人id',
  `cust_create_id` bigint(32) DEFAULT NULL COMMENT '创建人id',
  `cust_source` varchar(32) DEFAULT NULL COMMENT '客户信息来源',
  `cust_industry` varchar(32) DEFAULT NULL COMMENT '客户所属行业',
  `cust_level` varchar(32) DEFAULT NULL COMMENT '客户级别',
  `cust_linkman` varchar(64) DEFAULT NULL COMMENT '联系人',
  `cust_phone` varchar(64) DEFAULT NULL COMMENT '固定电话',
  `cust_mobile` varchar(16) DEFAULT NULL COMMENT '移动电话',
  PRIMARY KEY (`cust_id`)
) ENGINE=InnoDB AUTO_INCREMENT=37 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of cst_customer
-- ----------------------------
INSERT INTO `cst_customer` VALUES ('1', '黑马程序员', null, null, null, null, null, null, null, null);
INSERT INTO `cst_customer` VALUES ('2', '啊啊啊', null, null, '1', null, '22', '1', '1', '1');
INSERT INTO `cst_customer` VALUES ('3', '程序员', null, null, '1', null, '1', '1', '1', '1');
INSERT INTO `cst_customer` VALUES ('4', '盘名声', null, null, null, null, null, null, null, null);
INSERT INTO `cst_customer` VALUES ('5', '111', null, null, '11', null, '1', '11', '1', '1');
INSERT INTO `cst_customer` VALUES ('6', '', null, null, '', null, '', '', '', '');
INSERT INTO `cst_customer` VALUES ('7', '', null, null, '', null, '', '', '', '');
INSERT INTO `cst_customer` VALUES ('8', '', null, null, '', null, '', '', '', '');
INSERT INTO `cst_customer` VALUES ('9', 'aaa', null, null, '2', null, 'a2', '2', '3', '3');
INSERT INTO `cst_customer` VALUES ('22', '4', null, null, '5454', null, '', '45', '4', '');
INSERT INTO `cst_customer` VALUES ('23', '', null, null, '', null, '', '', '', '');
INSERT INTO `cst_customer` VALUES ('24', '', null, null, '', null, '', '', '', '');
INSERT INTO `cst_customer` VALUES ('25', '54454', null, null, '45', null, '', '', '', '');
INSERT INTO `cst_customer` VALUES ('26', '', null, null, '', null, '', '', '', '');
INSERT INTO `cst_customer` VALUES ('27', '', null, null, '', null, '', '', '', '');
INSERT INTO `cst_customer` VALUES ('28', '', null, null, '', null, '', '', '', '');
INSERT INTO `cst_customer` VALUES ('29', '', null, null, '', null, '', '', '', '');
INSERT INTO `cst_customer` VALUES ('30', '', null, null, '', null, '', '', '', '');
INSERT INTO `cst_customer` VALUES ('31', '', null, null, '', null, '', '', '', '');
INSERT INTO `cst_customer` VALUES ('32', '', null, null, '', null, '', '', '', '');
INSERT INTO `cst_customer` VALUES ('33', '', null, null, '', null, '', '', '', '');
INSERT INTO `cst_customer` VALUES ('34', '', null, null, '', null, '', '', '', '');
INSERT INTO `cst_customer` VALUES ('35', '', null, null, '', null, '', '', '', '');
INSERT INTO `cst_customer` VALUES ('36', '', null, null, '', null, '', '', '', '');

-- ----------------------------
-- Table structure for cst_customer_detail
-- ----------------------------
DROP TABLE IF EXISTS `cst_customer_detail`;
CREATE TABLE `cst_customer_detail` (
  `cust_id` bigint(32) NOT NULL,
  `cust_region` varchar(64) DEFAULT NULL COMMENT '客户地区',
  `cust_zip` varchar(16) DEFAULT NULL COMMENT '客户邮政编码',
  `cust_address` varchar(128) DEFAULT NULL COMMENT '客户联系地址',
  `cust_fax` varchar(64) DEFAULT NULL COMMENT '客户传真',
  `cust_website` varchar(128) DEFAULT NULL COMMENT '客户网址',
  `cust_licence` varchar(64) DEFAULT NULL COMMENT '客户营业执照注册号',
  `cust_corporation` varchar(64) DEFAULT NULL COMMENT '企业法人',
  `cust_capital` bigint(16) DEFAULT NULL COMMENT '客户注册资金',
  `cust_bank` varchar(512) DEFAULT NULL COMMENT '开户银行及账号',
  `cust_pic` varchar(64) DEFAULT NULL COMMENT '客户资质图片',
  `cust_memo` longtext COMMENT '客户简介',
  PRIMARY KEY (`cust_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of cst_customer_detail
-- ----------------------------
INSERT INTO `cst_customer_detail` VALUES ('19', null, null, null, null, null, null, null, null, null, null, null);
INSERT INTO `cst_customer_detail` VALUES ('27', null, null, '郑', null, null, null, null, null, null, null, null);
INSERT INTO `cst_customer_detail` VALUES ('28', null, '', '北', null, null, null, null, null, null, null, null);
INSERT INTO `cst_customer_detail` VALUES ('47', null, null, '郑州', null, null, null, null, null, null, null, null);
INSERT INTO `cst_customer_detail` VALUES ('48', null, null, '郑州', null, null, null, null, null, null, null, null);
INSERT INTO `cst_customer_detail` VALUES ('50', null, null, '郑州', null, null, null, null, null, null, null, null);
INSERT INTO `cst_customer_detail` VALUES ('51', null, null, '郑州', null, null, null, null, null, null, null, null);
INSERT INTO `cst_customer_detail` VALUES ('53', null, null, '郑州', null, null, null, null, null, null, null, null);
INSERT INTO `cst_customer_detail` VALUES ('55', null, null, '郑州', null, null, null, null, null, null, null, null);
INSERT INTO `cst_customer_detail` VALUES ('56', null, null, '郑州', null, null, null, null, null, null, null, null);
INSERT INTO `cst_customer_detail` VALUES ('58', null, null, '郑州', null, null, null, null, null, null, null, null);
INSERT INTO `cst_customer_detail` VALUES ('59', null, null, '郑州', null, null, null, null, null, null, null, null);
INSERT INTO `cst_customer_detail` VALUES ('60', null, null, '郑州', null, null, null, null, null, null, null, null);
INSERT INTO `cst_customer_detail` VALUES ('68', null, null, '郑州', null, null, null, null, null, null, null, null);
INSERT INTO `cst_customer_detail` VALUES ('69', null, null, '郑州', null, null, null, null, null, null, null, null);
INSERT INTO `cst_customer_detail` VALUES ('70', null, null, '郑州', null, null, null, null, null, null, null, null);
INSERT INTO `cst_customer_detail` VALUES ('72', null, null, '郑州', null, null, null, null, null, null, null, null);
INSERT INTO `cst_customer_detail` VALUES ('73', null, null, '郑州', null, null, null, null, null, null, null, null);
INSERT INTO `cst_customer_detail` VALUES ('74', null, null, '郑州', null, null, null, null, null, null, null, null);
INSERT INTO `cst_customer_detail` VALUES ('75', null, null, '郑州', null, null, null, null, null, null, null, null);
INSERT INTO `cst_customer_detail` VALUES ('76', null, null, '郑州', null, null, null, null, null, null, null, null);
INSERT INTO `cst_customer_detail` VALUES ('77', null, null, '郑州', null, null, null, null, null, null, null, null);
INSERT INTO `cst_customer_detail` VALUES ('78', null, null, '郑州', null, null, null, null, null, null, null, null);
INSERT INTO `cst_customer_detail` VALUES ('79', null, null, '郑州', null, null, null, null, null, null, null, null);
INSERT INTO `cst_customer_detail` VALUES ('82', null, null, '郑州', null, null, null, null, null, null, null, null);
INSERT INTO `cst_customer_detail` VALUES ('83', null, null, '郑州', null, null, null, null, null, null, null, null);
INSERT INTO `cst_customer_detail` VALUES ('84', null, null, '郑州', null, null, null, null, null, null, null, null);
INSERT INTO `cst_customer_detail` VALUES ('93', null, null, '北京昌平区', null, null, null, null, null, null, null, null);

-- ----------------------------
-- Table structure for cst_linkman
-- ----------------------------
DROP TABLE IF EXISTS `cst_linkman`;
CREATE TABLE `cst_linkman` (
  `lkm_id` bigint(32) NOT NULL AUTO_INCREMENT COMMENT '联系人编号(主键)',
  `lkm_name` varchar(16) DEFAULT NULL COMMENT '联系人姓名',
  `lkm_cust_id` bigint(32) NOT NULL COMMENT '客户id',
  `lkm_gender` char(1) DEFAULT NULL COMMENT '联系人性别',
  `lkm_phone` varchar(16) DEFAULT NULL COMMENT '联系人办公电话',
  `lkm_mobile` varchar(16) DEFAULT NULL COMMENT '联系人手机',
  `lkm_email` varchar(64) DEFAULT NULL COMMENT '联系人邮箱',
  `lkm_qq` varchar(16) DEFAULT NULL COMMENT '联系人qq',
  `lkm_position` varchar(16) DEFAULT NULL COMMENT '联系人职位',
  `lkm_memo` varchar(512) DEFAULT NULL COMMENT '联系人备注',
  PRIMARY KEY (`lkm_id`),
  KEY `FK_cst_linkman_lkm_cust_id` (`lkm_cust_id`),
  CONSTRAINT `FK_cst_linkman_lkm_cust_id` FOREIGN KEY (`lkm_cust_id`) REFERENCES `cst_customer` (`cust_id`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of cst_linkman
-- ----------------------------

-- ----------------------------
-- Table structure for sale_visit
-- ----------------------------
DROP TABLE IF EXISTS `sale_visit`;
CREATE TABLE `sale_visit` (
  `visit_id` varchar(32) NOT NULL,
  `visit_cust_id` bigint(32) DEFAULT NULL COMMENT '客户id',
  `visit_user_id` bigint(32) DEFAULT NULL COMMENT '负责人id',
  `visit_time` date DEFAULT NULL COMMENT '拜访时间',
  `visit_interviewee` varchar(32) DEFAULT NULL COMMENT '被拜访人',
  `visit_addr` varchar(128) DEFAULT NULL COMMENT '拜访地点',
  `visit_detail` varchar(256) DEFAULT NULL COMMENT '拜访详情',
  `visit_nexttime` date DEFAULT NULL COMMENT '下次拜访时间',
  PRIMARY KEY (`visit_id`),
  KEY `FK_sale_visit_cust_id` (`visit_cust_id`),
  KEY `FK_sale_visit_user_id` (`visit_user_id`),
  CONSTRAINT `FK_sale_visit_cust_id` FOREIGN KEY (`visit_cust_id`) REFERENCES `cst_customer` (`cust_id`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `FK_sale_visit_user_id` FOREIGN KEY (`visit_user_id`) REFERENCES `sys_user` (`user_id`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of sale_visit
-- ----------------------------

-- ----------------------------
-- Table structure for sys_role
-- ----------------------------
DROP TABLE IF EXISTS `sys_role`;
CREATE TABLE `sys_role` (
  `role_id` bigint(32) NOT NULL AUTO_INCREMENT,
  `role_name` varchar(32) NOT NULL COMMENT '角色名称',
  `role_memo` varchar(128) DEFAULT NULL COMMENT '备注',
  PRIMARY KEY (`role_id`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of sys_role
-- ----------------------------
INSERT INTO `sys_role` VALUES ('1', '员工', null);
INSERT INTO `sys_role` VALUES ('2', '部门经理', null);
INSERT INTO `sys_role` VALUES ('3', '部门经理', null);
INSERT INTO `sys_role` VALUES ('4', '部门经理', null);
INSERT INTO `sys_role` VALUES ('5', '员工', null);

-- ----------------------------
-- Table structure for sys_user
-- ----------------------------
DROP TABLE IF EXISTS `sys_user`;
CREATE TABLE `sys_user` (
  `user_id` bigint(32) NOT NULL AUTO_INCREMENT COMMENT '用户id',
  `user_code` varchar(32) NOT NULL COMMENT '用户账号',
  `user_name` varchar(64) NOT NULL COMMENT '用户名称',
  `user_password` varchar(32) NOT NULL COMMENT '用户密码',
  `user_state` char(1) NOT NULL COMMENT '1:正常,0:暂停',
  PRIMARY KEY (`user_id`)
) ENGINE=InnoDB AUTO_INCREMENT=9 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of sys_user
-- ----------------------------
INSERT INTO `sys_user` VALUES ('5', 'm0003', '小军', '123', '1');
INSERT INTO `sys_user` VALUES ('6', 'm0001', '小红', '123', '1');
INSERT INTO `sys_user` VALUES ('7', 'm0001', '小明', '123', '1');
INSERT INTO `sys_user` VALUES ('8', 'm0001', '小红', '123', '1');

-- ----------------------------
-- Table structure for sys_user_role
-- ----------------------------
DROP TABLE IF EXISTS `sys_user_role`;
CREATE TABLE `sys_user_role` (
  `role_id` bigint(32) NOT NULL COMMENT '角色id',
  `user_id` bigint(32) NOT NULL COMMENT '用户id',
  PRIMARY KEY (`role_id`,`user_id`),
  KEY `FK_user_role_user_id` (`user_id`),
  CONSTRAINT `FK_user_role_role_id` FOREIGN KEY (`role_id`) REFERENCES `sys_role` (`role_id`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `FK_user_role_user_id` FOREIGN KEY (`user_id`) REFERENCES `sys_user` (`user_id`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of sys_user_role
-- ----------------------------
