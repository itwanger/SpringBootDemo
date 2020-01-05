/*
Navicat MySQL Data Transfer

Source Database       : springbootdemo

Target Server Type    : MYSQL
Target Server Version : 50537
File Encoding         : 65001

Date: 2020-01-05 10:46:20
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for mysql_datasource
-- ----------------------------
DROP TABLE IF EXISTS `mysql_datasource`;
CREATE TABLE `mysql_datasource` (
  `id` varchar(64) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of mysql_datasource
-- ----------------------------
