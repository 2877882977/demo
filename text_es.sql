/*
Navicat MySQL Data Transfer

Source Server         : yier
Source Server Version : 50736
Source Host           : localhost:3306
Source Database       : text_es

Target Server Type    : MYSQL
Target Server Version : 50736
File Encoding         : 65001

Date: 2024-11-01 16:10:36
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for es
-- ----------------------------
DROP TABLE IF EXISTS `es`;
CREATE TABLE `es` (
  `id` int(11) NOT NULL,
  `pno` varchar(255) DEFAULT NULL,
  `title` varchar(255) DEFAULT NULL,
  `type` varchar(255) DEFAULT NULL,
  `abstr` text,
  `ap` varchar(255) DEFAULT NULL,
  `apno` varchar(255) DEFAULT NULL,
  `no` varchar(255) DEFAULT NULL,
  `apdate` datetime DEFAULT NULL,
  `aupno` varchar(255) DEFAULT NULL,
  `aupdate` datetime DEFAULT NULL,
  `address` varchar(255) DEFAULT NULL,
  `deAddress` varchar(255) DEFAULT NULL,
  `claim` text,
  `inventor` varchar(255) DEFAULT NULL,
  `ipc` varchar(512) DEFAULT NULL,
  `ipc1` varchar(255) DEFAULT NULL,
  `agency` varchar(255) DEFAULT NULL,
  `priority` varchar(255) DEFAULT NULL,
  `agent` varchar(255) DEFAULT NULL,
  `ctno` varchar(255) DEFAULT NULL,
  `laws` text,
  `scope` text,
  `comb` varchar(255) DEFAULT NULL,
  `state` varchar(255) DEFAULT NULL,
  `fee` varchar(255) DEFAULT NULL,
  `law_status` varchar(255) DEFAULT NULL,
  `law_name` varchar(255) DEFAULT NULL,
  `law_date` datetime DEFAULT NULL,
  `case_status` varchar(255) DEFAULT NULL,
  `c_time` datetime DEFAULT NULL,
  `u_time` datetime DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
