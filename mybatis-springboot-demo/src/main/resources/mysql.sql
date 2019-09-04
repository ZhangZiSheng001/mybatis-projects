CREATE TABLE `mybatis_menu` (
  `menu_id` VARCHAR(255) COLLATE utf8_bin NOT NULL,
  `gmt_create` DATETIME DEFAULT NULL,
  `gmt_modified` DATETIME DEFAULT NULL,
  `menu_name` VARCHAR(255) COLLATE utf8_bin NOT NULL,
  `menu_order` INT(11) DEFAULT NULL,
  `menu_url` VARCHAR(255) COLLATE utf8_bin DEFAULT NULL,
  `menu_parent_id` VARCHAR(255) COLLATE utf8_bin DEFAULT NULL,
  PRIMARY KEY `pk_menu_id`(`menu_id`),
  UNIQUE KEY `uk_menu_name` (`menu_name`)
) ENGINE=INNODB DEFAULT CHARSET=utf8 COLLATE=utf8_bin

CREATE TABLE `mybatis_role` (
  `role_id` BIGINT(20) NOT NULL AUTO_INCREMENT,
  `gmt_create` DATETIME DEFAULT NULL,
  `gmt_modified` DATETIME DEFAULT NULL,
  `role_name` VARCHAR(255) COLLATE utf8_bin NOT NULL,
  PRIMARY KEY `pk_role_id`(`role_id`),
  UNIQUE KEY `uk_role_name` (`role_name`)
) ENGINE=INNODB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8 COLLATE=utf8_bin

CREATE TABLE `mybatis_user` (
  `user_id` BIGINT(20) NOT NULL AUTO_INCREMENT,
  `user_age` INT(11) DEFAULT NULL,
  `gmt_create` DATETIME DEFAULT NULL,
  `gmt_modified` DATETIME DEFAULT NULL,
  `user_name` VARCHAR(255) COLLATE utf8_bin NOT NULL,
  `user_role_id` BIGINT(20) DEFAULT NULL,
  PRIMARY KEY `pk_user_id`(`user_id`),
  UNIQUE KEY `uk_user_name` (`user_name`)
) ENGINE=INNODB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8 COLLATE=utf8_bin

CREATE TABLE `mybatis_role_menu` (
  `role_id` BIGINT(20) NOT NULL,
  `menu_id` VARCHAR(255) COLLATE utf8_bin NOT NULL,
  PRIMARY KEY `pk_role_menu_id`(`role_id`,`menu_id`)
) ENGINE=INNODB DEFAULT CHARSET=utf8 COLLATE=utf8_bin