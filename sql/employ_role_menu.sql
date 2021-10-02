

DROP TABLE IF EXISTS `demo_department`;

CREATE TABLE `demo_department` (
  `id` varchar(64) NOT NULL COMMENT '部门id',
  `no` varchar(32) NOT NULL COMMENT '部门编码',
  `parent_id` varchar(64) NOT NULL DEFAULT '0' COMMENT '上级部门id',
  `name` varchar(64) NOT NULL COMMENT '部门名称',
  `type` varchar(32) DEFAULT '''department''' COMMENT '部门类型 department部门，group小组',
  `deleted` bit(1) NOT NULL DEFAULT b'0' COMMENT '记录是否删除',
  `gmt_create` datetime NOT NULL COMMENT '记录创建时间',
  `gmt_modified` datetime NOT NULL COMMENT '记录更新时间',
  PRIMARY KEY (`id`),
  UNIQUE KEY `idx_demo_department_no` (`no`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;


insert  into `demo_department`(`id`,`no`,`parent_id`,`name`,`type`,`deleted`,`gmt_create`,`gmt_modified`) values ('2ebe0d166cd911ea802000fffc35d9fa','202003230008','0','技术部','department','\0','2020-03-23 15:37:29','2020-03-23 15:37:29'),('2ebe0d556cd911ea802000fffc35d9fa','202003230010','65684a126cd811ea802000fffc35d9fa','质控一室','group','\0','2020-03-23 15:34:17','2020-03-23 15:34:17'),('2ebe0d557cd911ea802000fffc35d9fa','202003230011','65684a126cd811ea802000fffc35d9fa','质控二室','group','\0','2020-03-23 15:34:17','2020-03-23 15:34:17'),('47c840106cd811ea802000fffc35d9fa','202003230001','0','总裁办','department','\0','2020-03-23 15:31:01','2020-03-23 15:31:01'),('48c5003b6cd911ea802000fffc35d9fa','202003230009','0','标管部','department','\0','2020-03-23 15:38:13','2020-03-23 15:38:13'),('65684a126cd811ea802000fffc35d9fa','202003230002','0','质控部','department','\0','2020-03-23 15:31:51','2020-03-23 15:31:51'),('7ba4c91a6cd811ea802000fffc35d9fa','202003230003','0','生产部','department','\0','2020-03-23 15:32:28','2020-03-23 15:32:28'),('8808ea8e6cd811ea802000fffc35d9fa','202003230004','0','财务部','department','\0','2020-03-23 15:32:49','2020-03-23 15:32:49'),('94e2d2e56cd811ea802000fffc35d9fa','202003230005','0','人力部','department','\0','2020-03-23 15:33:11','2020-03-23 15:33:11'),('a3a3d1d26cd811ea802000fffc35d9fa','202003230006','0','营销部','department','\0','2020-03-23 15:33:36','2020-03-23 15:33:36'),('bc8a342c6cd811ea802000fffc35d9fa','202003230007','0','采购部','department','\0','2020-03-23 15:34:17','2020-03-23 15:34:17');


DROP TABLE IF EXISTS `demo_employee`;

CREATE TABLE `demo_employee` (
  `id` varchar(64) NOT NULL COMMENT '员工id',
  `name` varchar(32) CHARACTER SET utf8 COLLATE utf8_bin NOT NULL COMMENT '员工姓名',
  `gender` bit(1) DEFAULT b'1' COMMENT '员工性别 0表示女，1表示男',
  `no` varchar(32) NOT NULL COMMENT '员工工号',
  `password` varchar(64) NOT NULL DEFAULT '123456' COMMENT '员工密码',
  `phone` varchar(11) NOT NULL COMMENT '员工手机电话',
  `address` varchar(256) DEFAULT '' COMMENT '员工住址',
  `status` tinyint(2) NOT NULL DEFAULT '1' COMMENT '员工状态 0为禁用,1为启用,2为冻结',
  `deleted` bit(1) NOT NULL DEFAULT b'0' COMMENT '记录是否已删除',
  `department_id` varchar(64) NOT NULL COMMENT '员工所属部门id',
  `gmt_create` datetime DEFAULT NULL COMMENT '记录创建时间',
  `gmt_modified` datetime DEFAULT NULL COMMENT '记录更新时间',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;


insert  into `demo_employee`(`id`,`name`,`gender`,`no`,`password`,`phone`,`address`,`status`,`deleted`,`department_id`,`gmt_create`,`gmt_modified`) values ('2e18f6560b25473480af987141eccd02','zzs005','','zzs005','admin','18826****41','广东',1,'\0','94e2d2e56cd811ea802000fffc35d9fa','2020-03-28 00:00:00','2020-03-28 00:00:00'),('cc6b08506cdb11ea802000fffc35d9fa','zzs001','','zzs001','666666','18826****41','北京',1,'\0','65684a126cd811ea802000fffc35d9fa','2019-09-04 21:48:28','2020-03-25 10:44:51'),('cc6b08506cdb11ea802000fffc35d9fb','zzs002','','zzs002','123456','18826****41','广东',1,'\0','65684a126cd811ea802000fffc35d9fa','2019-08-01 21:49:43','2019-09-02 21:49:49'),('cc6b08506cdb11ea802000fffc35d9fc','zzs003','','zzs003','123456','18826****41','广东',1,'\0','65684a126cd811ea802000fffc35d9fa','2019-09-04 21:48:54','2019-09-01 21:48:57'),('cc6b08506cdb11ea802000fffc35d9fd','zzs004','','zzs004','123456','18826****41','广东',1,'\0','65684a126cd811ea802000fffc35d9fa','2019-09-04 21:49:16','2019-08-21 21:49:19'),('cc6b08506cdb11ea802000fffc35d9fe','zzf001','\0','zzf001','123456','18826****41','北京',1,'\0','65684a126cd811ea802000fffc35d9fa','2019-09-04 21:54:49','2019-09-04 21:54:51'),('cc6b08506cdb11ea802000fffc35d9ff','zzf002','\0','zzf002','123456','18826****41','北京',1,'\0','65684a126cd811ea802000fffc35d9fa','2019-09-03 01:56:58','2019-09-03 01:57:03'),('cc6b08506cdb11ea802000fffc35d9fg','zzf003','\0','zzf003','123456','18826****41','北京',1,'\0','65684a126cd811ea802000fffc35d9fa','2019-09-03 21:55:09','2019-08-08 21:55:12'),('cc6b08506cdb11ea802000fffc35d9fh','zzf004','\0','zzf004','123456','18826****41','北京',1,'\0','65684a126cd811ea802000fffc35d9fa','2019-09-05 01:57:50','2019-09-01 01:57:47');


DROP TABLE IF EXISTS `demo_employee_role`;

CREATE TABLE `demo_employee_role` (
  `id` varchar(64) NOT NULL COMMENT '主键',
  `employee_id` varchar(64) NOT NULL COMMENT '用户id',
  `role_id` varchar(64) NOT NULL COMMENT '角色id',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;


insert  into `demo_employee_role`(`id`,`employee_id`,`role_id`) values ('15ead6ed6cdf11ea802000fffc35d9fa','cc6b08506cdb11ea802000fffc35d9fa','157c06ca6cda11ea802000fffc35d9fa'),('2646b5be6cdf11ea802000fffc35d9fa','cc6b08506cdb11ea802000fffc35d9fb','2814c6866cda11ea802000fffc35d9fa'),('334f480a6cdf11ea802000fffc35d9fa','cc6b08506cdb11ea802000fffc35d9fd','ec94d93f6cda11ea802000fffc35d9fa'),('378c4a9d6cdf11ea802000fffc35d9fa','cc6b08506cdb11ea802000fffc35d9fe','ec94d93f6cda11ea802000fffc35d9fa'),('3af617816cdf11ea802000fffc35d9fa','cc6b08506cdb11ea802000fffc35d9ff','ec94d93f6cda11ea802000fffc35d9fa'),('3ed7f3956cdf11ea802000fffc35d9fa','cc6b08506cdb11ea802000fffc35d9fg','ec94d93f6cda11ea802000fffc35d9fa'),('425f04d06cdf11ea802000fffc35d9fa','cc6b08506cdb11ea802000fffc35d9fh','ec94d93f6cda11ea802000fffc35d9fa'),('4c3bcdde6cdf11ea802000fffc35d9fa','cc6b08506cdb11ea802000fffc35d9fc','e2d437e46cda11ea802000fffc35d9fa'),('6583ab626cdf11ea802000fffc35d9fa','cc6b08506cdb11ea802000fffc35d9fe','ec94d93f6cda11ea802000fffc35d9fb');


DROP TABLE IF EXISTS `demo_menu`;

CREATE TABLE `demo_menu` (
  `id` varchar(64) CHARACTER SET utf8 COLLATE utf8_bin NOT NULL COMMENT '菜单id',
  `parent_id` varchar(64) CHARACTER SET utf8 COLLATE utf8_bin DEFAULT '0' COMMENT '父菜单id',
  `name` varchar(64) CHARACTER SET utf8 COLLATE utf8_bin NOT NULL COMMENT '菜单名',
  `order` tinyint(3) unsigned NOT NULL DEFAULT '0' COMMENT '菜单先后',
  `url` varchar(256) CHARACTER SET utf8 COLLATE utf8_bin DEFAULT NULL COMMENT '菜单url',
  `is_parent` bit(1) NOT NULL DEFAULT b'0' COMMENT '是否父菜单',
  `deleted` bit(1) NOT NULL DEFAULT b'0' COMMENT '记录是否已删除',
  `gmt_create` datetime DEFAULT NULL COMMENT '记录创建时间',
  `gmt_modified` datetime DEFAULT NULL COMMENT '记录更新时间',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;


insert  into `demo_menu`(`id`,`parent_id`,`name`,`order`,`url`,`is_parent`,`deleted`,`gmt_create`,`gmt_modified`) values ('5963f1fc6cdc11ea802000fffc35d9fa','0','检测数据',0,'/test','','\0','2020-03-23 16:00:09','2020-03-23 16:00:09'),('75cba2b36cdc11ea802000fffc35d9fa','5963f1fc6cdc11ea802000fffc35d9fa','查看检测数据',3,'/test/find','\0','\0','2020-03-23 16:00:57','2020-03-23 16:00:57'),('7d11363e6cdc11ea802000fffc35d9fa','5963f1fc6cdc11ea802000fffc35d9fa','新增检测数据',1,'/test/add','\0','\0','2020-03-23 16:01:09','2020-03-23 16:01:09'),('828f922d6cdb11ea802000fffc35d9fa','0','质量问题跟踪',0,'/quality','','\0','2020-03-23 15:54:09','2020-03-23 15:54:09'),('859566e26cdc11ea802000fffc35d9fa','5963f1fc6cdc11ea802000fffc35d9fa','修改检测数据',4,'/test/update','\0','\0','2020-03-23 16:01:23','2020-03-23 16:01:23'),('91e7ac616cdc11ea802000fffc35d9fa','5963f1fc6cdc11ea802000fffc35d9fa','删除检测数据',2,'/test/delete','\0','\0','2020-03-23 16:01:44','2020-03-23 16:01:44'),('9aadff0f6cdb11ea802000fffc35d9fa','828f922d6cdb11ea802000fffc35d9fa','查看质量问题',3,'/quality/find','\0','\0','2020-03-23 15:54:49','2020-03-23 15:54:49'),('b45542c76cdb11ea802000fffc35d9fa','828f922d6cdb11ea802000fffc35d9fa','删除质量问题',2,'/quality/delete','\0','\0','2020-03-23 15:55:32','2020-03-23 15:55:32'),('bfa9c3196cdb11ea802000fffc35d9fa','828f922d6cdb11ea802000fffc35d9fa','修改质量问题',4,'/quality/update','\0','\0','2020-03-23 15:55:51','2020-03-23 15:55:51'),('cc6b08506cdb11ea802000fffc35d9fa','828f922d6cdb11ea802000fffc35d9fa','新增质量问题',1,'/quality/add','\0','\0','2020-03-23 15:56:12','2020-03-23 15:56:12');


DROP TABLE IF EXISTS `demo_role`;

CREATE TABLE `demo_role` (
  `id` varchar(64) CHARACTER SET utf8 COLLATE utf8_bin NOT NULL COMMENT '角色id',
  `name` varchar(64) CHARACTER SET utf8 COLLATE utf8_bin NOT NULL COMMENT '角色名称',
  `is_general` bit(1) NOT NULL DEFAULT b'0' COMMENT '是否通用',
  `deleted` bit(1) NOT NULL DEFAULT b'0' COMMENT '记录是否已删除',
  `gmt_create` datetime NOT NULL COMMENT '记录创建时间',
  `gmt_modified` datetime NOT NULL COMMENT '记录更新时间',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;


insert  into `demo_role`(`id`,`name`,`is_general`,`deleted`,`gmt_create`,`gmt_modified`) values ('157c06ca6cda11ea802000fffc35d9fa','质控部部长','\0','\0','2020-03-23 15:43:56','2020-03-23 15:43:56'),('2814c6866cda11ea802000fffc35d9fa','质控部副部长','\0','\0','2020-03-23 15:44:27','2020-03-23 15:44:27'),('e2d437e46cda11ea802000fffc35d9fa','质控部室主任','\0','\0','2020-03-23 15:49:41','2020-03-23 15:49:41'),('ec94d93f6cda11ea802000fffc35d9fa','质控专员','\0','\0','2020-03-23 15:49:57','2020-03-23 15:49:57'),('ec94d93f6cda11ea802000fffc35d9fb','系统管理员','\0','\0','2020-03-23 15:49:57','2020-03-23 15:49:57');


DROP TABLE IF EXISTS `demo_role_menu`;

CREATE TABLE `demo_role_menu` (
  `id` varchar(64) NOT NULL COMMENT '主键',
  `role_id` varchar(64) NOT NULL COMMENT '角色id',
  `menu_id` varchar(64) CHARACTER SET utf8 COLLATE utf8_bin NOT NULL COMMENT '菜单id',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;


insert  into `demo_role_menu`(`id`,`role_id`,`menu_id`) values ('0b22a2336cdd11ea802000fffc35d9fa','2814c6866cda11ea802000fffc35d9fa','75cba2b36cdc11ea802000fffc35d9fa'),('0ed988486cdd11ea802000fffc35d9fa','2814c6866cda11ea802000fffc35d9fa','7d11363e6cdc11ea802000fffc35d9fa'),('1361720f6cdd11ea802000fffc35d9fa','2814c6866cda11ea802000fffc35d9fa','859566e26cdc11ea802000fffc35d9fa'),('18327d296cdd11ea802000fffc35d9fa','2814c6866cda11ea802000fffc35d9fa','9aadff0f6cdb11ea802000fffc35d9fa'),('1f509dc36cdd11ea802000fffc35d9fa','2814c6866cda11ea802000fffc35d9fa','bfa9c3196cdb11ea802000fffc35d9fa'),('23b184426cdd11ea802000fffc35d9fa','2814c6866cda11ea802000fffc35d9fa','cc6b08506cdb11ea802000fffc35d9fa'),('4da3efce6ce011ea802000fffc35d9fa','2814c6866cda11ea802000fffc35d9fa','91e7ac616cdc11ea802000fffc35d9fa'),('523698306ce011ea802000fffc35d9fa','2814c6866cda11ea802000fffc35d9fa','b45542c76cdb11ea802000fffc35d9fa'),('5ebf98046ce011ea802000fffc35d9fa','e2d437e46cda11ea802000fffc35d9fa','75cba2b36cdc11ea802000fffc35d9fa'),('61ef2d9c6ce011ea802000fffc35d9fa','e2d437e46cda11ea802000fffc35d9fa','7d11363e6cdc11ea802000fffc35d9fa'),('6646d7e86ce011ea802000fffc35d9fa','e2d437e46cda11ea802000fffc35d9fa','859566e26cdc11ea802000fffc35d9fa'),('69d925d36ce011ea802000fffc35d9fa','e2d437e46cda11ea802000fffc35d9fa','9aadff0f6cdb11ea802000fffc35d9fa'),('6e450c5d6ce011ea802000fffc35d9fa','e2d437e46cda11ea802000fffc35d9fa','bfa9c3196cdb11ea802000fffc35d9fa'),('776c94e86ce011ea802000fffc35d9fa','e2d437e46cda11ea802000fffc35d9fa','cc6b08506cdb11ea802000fffc35d9fa'),('83a6a8bb6ce011ea802000fffc35d9fa','ec94d93f6cda11ea802000fffc35d9fa','75cba2b36cdc11ea802000fffc35d9fa'),('86e868786ce011ea802000fffc35d9fa','ec94d93f6cda11ea802000fffc35d9fa','9aadff0f6cdb11ea802000fffc35d9fa'),('8cebe28b6cde11ea802000fffc35d9fa','ec94d93f6cda11ea802000fffc35d9fb','75cba2b36cdc11ea802000fffc35d9fa'),('9034fb266cde11ea802000fffc35d9fa','ec94d93f6cda11ea802000fffc35d9fb','7d11363e6cdc11ea802000fffc35d9fa'),('93e58ab36cde11ea802000fffc35d9fa','ec94d93f6cda11ea802000fffc35d9fb','859566e26cdc11ea802000fffc35d9fa'),('971540166cde11ea802000fffc35d9fa','ec94d93f6cda11ea802000fffc35d9fb','91e7ac616cdc11ea802000fffc35d9fa'),('9a744b806cde11ea802000fffc35d9fa','ec94d93f6cda11ea802000fffc35d9fb','9aadff0f6cdb11ea802000fffc35d9fa'),('9d8283c26cde11ea802000fffc35d9fa','ec94d93f6cda11ea802000fffc35d9fb','b45542c76cdb11ea802000fffc35d9fa'),('a0899beb6cde11ea802000fffc35d9fa','ec94d93f6cda11ea802000fffc35d9fb','bfa9c3196cdb11ea802000fffc35d9fa'),('a4888cba6cde11ea802000fffc35d9fa','ec94d93f6cda11ea802000fffc35d9fb','cc6b08506cdb11ea802000fffc35d9fa'),('e22953326cdc11ea802000fffc35d9fa','157c06ca6cda11ea802000fffc35d9fa','75cba2b36cdc11ea802000fffc35d9fa'),('e60014f36cdc11ea802000fffc35d9fa','157c06ca6cda11ea802000fffc35d9fa','7d11363e6cdc11ea802000fffc35d9fa'),('ea2f999b6cdc11ea802000fffc35d9fa','157c06ca6cda11ea802000fffc35d9fa','859566e26cdc11ea802000fffc35d9fa'),('ee8b8a646cdc11ea802000fffc35d9fa','157c06ca6cda11ea802000fffc35d9fa','91e7ac616cdc11ea802000fffc35d9fa'),('f25d7d986cdc11ea802000fffc35d9fa','157c06ca6cda11ea802000fffc35d9fa','9aadff0f6cdb11ea802000fffc35d9fa'),('f66730796cdc11ea802000fffc35d9fa','157c06ca6cda11ea802000fffc35d9fa','b45542c76cdb11ea802000fffc35d9fa'),('fa57481f6cdc11ea802000fffc35d9fa','157c06ca6cda11ea802000fffc35d9fa','bfa9c3196cdb11ea802000fffc35d9fa'),('fe5c999e6cdc11ea802000fffc35d9fa','157c06ca6cda11ea802000fffc35d9fa','cc6b08506cdb11ea802000fffc35d9fa');

