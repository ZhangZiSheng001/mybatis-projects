/*
SQLyog Enterprise v12.09 (64 bit)
MySQL - 5.5.27 : Database - mybatis
*********************************************************************
*/

/*!40101 SET NAMES utf8 */;

/*!40101 SET SQL_MODE=''*/;

/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

USE `mybatis`;

/*Table structure for table `mybatis_menu` */

DROP TABLE IF EXISTS `mybatis_menu`;

CREATE TABLE `mybatis_menu` (
  `menu_id` varchar(255) COLLATE utf8_bin NOT NULL,
  `gmt_create` datetime DEFAULT NULL,
  `gmt_modified` datetime DEFAULT NULL,
  `menu_name` varchar(255) COLLATE utf8_bin NOT NULL,
  `menu_order` int(11) DEFAULT NULL,
  `menu_url` varchar(255) COLLATE utf8_bin DEFAULT NULL,
  `menu_parent_id` varchar(255) COLLATE utf8_bin DEFAULT NULL,
  PRIMARY KEY (`menu_id`),
  UNIQUE KEY `uk_menu_name` (`menu_name`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

/*Data for the table `mybatis_menu` */

insert  into `mybatis_menu`(`menu_id`,`gmt_create`,`gmt_modified`,`menu_name`,`menu_order`,`menu_url`,`menu_parent_id`) values ('005904abce6711e3498d026659304345','2019-09-01 00:27:19','2019-09-01 00:27:16','采购管理',1,'http://','005904abce6711e98ee4026659304345'),('005904abce6711e3898d026659304345','2019-09-03 01:31:39','2019-01-01 01:31:32','采购订单查询',0,'http://','005904abce6711e3498d026659304345'),('005904abce6711e9898d023659304345','2019-09-04 01:34:41','2019-09-04 01:34:41','采购订单申请',1,'http://','005904abce6711e3498d026659304345'),('005904abce6711e9898d026659303345','2019-09-04 00:22:19','2019-09-04 00:22:19','销售管理',0,'http://','005904abce6711e98ee4026659304345'),('005904abce6711e9898d026659304325','2019-09-04 01:35:26','2019-09-04 01:35:26','采购订单确认',4,'http://','005904abce6711e3498d026659304345'),('005904abce6711e9898d026659304341','2019-09-04 01:37:11','2019-09-04 01:37:11','销售订单出库',0,'http://','005904abce6711e9898d026659333345'),('005904abce6711e9898d026659304345','2019-09-01 00:25:47','2019-09-04 00:25:44','销售订单审核',3,'http://','005904abce6711e9898d026659303345'),('005904abce6711e9898d02665930434a','2019-09-04 01:34:57','2019-09-04 01:34:57','采购订单提交',2,'http://','005904abce6711e3498d026659304345'),('005904abce6711e9898d02665930434e','2019-09-04 01:35:18','2019-09-04 01:35:18','采购订单审核',3,'http://','005904abce6711e3498d026659304345'),('005904abce6711e9898d026659304366','2019-09-01 00:23:52','2019-09-01 00:23:55','销售订单申请',1,'http://','005904abce6711e9898d026659303345'),('005904abce6711e9898d026659333345','2019-09-04 01:35:47','2019-09-04 01:35:47','库存管理',2,'http://','005904abce6711e98ee4026659304345'),('005904abce6711e9898d026659345366','2019-09-03 00:24:39','2019-09-03 00:24:41','销售订单提交',2,'http://','005904abce6711e9898d026659303345'),('005904abce6711e9898d045659304345','2019-09-03 00:26:14','2019-09-01 00:26:16','销售订单确认',4,'http://','005904abce6711e9898d026659303345'),('005904abce6711e98ee4026659304345','2019-09-04 00:06:05','2019-09-04 00:06:05','系统菜单',0,NULL,NULL),('005904ebce6711e9898d026659304345','2019-09-04 01:37:24','2019-09-04 01:37:24','采购订单入库',1,'http://','005904abce6711e9898d026659333345'),('bc2ccd15ce6411e9898d026659304358','2019-09-04 00:22:43','2019-09-05 00:23:06','销售订单查询',0,'http://','005904abce6711e9898d026659303345');

/*Table structure for table `mybatis_role` */

DROP TABLE IF EXISTS `mybatis_role`;

CREATE TABLE `mybatis_role` (
  `role_id` bigint(20) NOT NULL AUTO_INCREMENT,
  `gmt_create` datetime DEFAULT NULL,
  `gmt_modified` datetime DEFAULT NULL,
  `role_name` varchar(255) COLLATE utf8_bin NOT NULL,
  PRIMARY KEY (`role_id`),
  UNIQUE KEY `uk_role_name` (`role_name`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

/*Data for the table `mybatis_role` */

insert  into `mybatis_role`(`role_id`,`gmt_create`,`gmt_modified`,`role_name`) values (1,'2019-09-02 22:28:27','2019-09-03 23:42:49','销售经理'),(2,'2019-09-02 22:28:57','2019-09-02 22:29:00','销售员'),(3,'2019-09-03 23:42:35','2019-09-03 23:42:35','采购经理'),(4,'2019-08-06 01:55:34','2019-09-03 01:55:31','采购员');

/*Table structure for table `mybatis_role_menu` */

DROP TABLE IF EXISTS `mybatis_role_menu`;

CREATE TABLE `mybatis_role_menu` (
  `role_id` bigint(20) NOT NULL,
  `menu_id` varchar(255) COLLATE utf8_bin NOT NULL,
  PRIMARY KEY (`role_id`,`menu_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

/*Data for the table `mybatis_role_menu` */

insert  into `mybatis_role_menu`(`role_id`,`menu_id`) values (1,'005904abce6711e9898d026659304345'),(1,'005904abce6711e9898d026659304366'),(1,'005904abce6711e9898d026659345366'),(1,'005904abce6711e9898d045659304345'),(1,'bc2ccd15ce6411e9898d026659304358'),(2,'005904abce6711e9898d026659304366'),(2,'005904abce6711e9898d026659345366'),(2,'005904abce6711e9898d045659304345'),(2,'bc2ccd15ce6411e9898d026659304358'),(3,'005904abce6711e3898d026659304345'),(3,'005904abce6711e9898d023659304345'),(3,'005904abce6711e9898d026659304325'),(3,'005904abce6711e9898d02665930434a'),(3,'005904abce6711e9898d02665930434e'),(4,'005904abce6711e3898d026659304345'),(4,'005904abce6711e9898d023659304345'),(4,'005904abce6711e9898d026659304325'),(4,'005904abce6711e9898d02665930434a');

/*Table structure for table `mybatis_user` */

DROP TABLE IF EXISTS `mybatis_user`;

CREATE TABLE `mybatis_user` (
  `user_id` bigint(20) NOT NULL AUTO_INCREMENT,
  `user_age` int(11) DEFAULT NULL,
  `gmt_create` datetime DEFAULT NULL,
  `gmt_modified` datetime DEFAULT NULL,
  `user_name` varchar(255) COLLATE utf8_bin NOT NULL,
  `user_role_id` bigint(20) DEFAULT NULL,
  PRIMARY KEY (`user_id`),
  UNIQUE KEY `uk_user_name` (`user_name`)
) ENGINE=InnoDB AUTO_INCREMENT=9 DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

/*Data for the table `mybatis_user` */

insert  into `mybatis_user`(`user_id`,`user_age`,`gmt_create`,`gmt_modified`,`user_name`,`user_role_id`) values (1,19,'2019-09-04 21:48:28','2019-09-04 21:48:32','zzs001',1),(2,18,'2019-09-04 21:48:54','2019-09-01 21:48:57','zzs003',1),(3,20,'2019-09-04 21:49:16','2019-08-21 21:49:19','zzs004',1),(4,25,'2019-08-01 21:49:43','2019-09-02 21:49:49','zzs002',3),(5,26,'2019-09-04 21:54:49','2019-09-04 21:54:51','zzf001',2),(6,15,'2019-09-03 21:55:09','2019-08-08 21:55:12','zzf003',2),(7,23,'2019-09-03 01:56:58','2019-09-03 01:57:03','zzf002',3),(8,23,'2019-09-05 01:57:50','2019-09-01 01:57:47','zzf004',4);

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;
