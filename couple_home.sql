/*
Navicat MySQL Data Transfer

Source Server         : localhost
Source Server Version : 50617
Source Host           : localhost:3306
Source Database       : couple_home

Target Server Type    : MYSQL
Target Server Version : 50617
File Encoding         : 65001

Date: 2020-07-07 18:23:55
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for `cp_album`
-- ----------------------------
DROP TABLE IF EXISTS `cp_album`;
CREATE TABLE `cp_album` (
  `album_id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '相册，主键',
  `album_name` varchar(255) DEFAULT NULL COMMENT '相册名',
  `create_date` datetime NOT NULL COMMENT '创建时间',
  `update_date` datetime NOT NULL COMMENT '更新时间',
  `album_describe` varchar(255) DEFAULT NULL COMMENT '相册描述',
  `create_user` bigint(20) NOT NULL COMMENT '相册创建人',
  `status_cd` tinyint(4) NOT NULL COMMENT '相册状态',
  `relation_id` bigint(20) NOT NULL COMMENT '外键，关系表id',
  `ann_id` bigint(20) DEFAULT NULL COMMENT '外键，纪念日id',
  PRIMARY KEY (`album_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of cp_album
-- ----------------------------

-- ----------------------------
-- Table structure for `cp_anniversaries`
-- ----------------------------
DROP TABLE IF EXISTS `cp_anniversaries`;
CREATE TABLE `cp_anniversaries` (
  `ann_id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '纪念日表，主键',
  `ann_name` varchar(255) NOT NULL COMMENT '纪念日名',
  `create_date` datetime NOT NULL COMMENT '创建时间',
  `update_date` datetime NOT NULL COMMENT '更新时间',
  `status_cd` tinyint(4) NOT NULL COMMENT '纪念日状态',
  `relation_id` bigint(20) NOT NULL COMMENT '外键，关系表id',
  PRIMARY KEY (`ann_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of cp_anniversaries
-- ----------------------------

-- ----------------------------
-- Table structure for `cp_message`
-- ----------------------------
DROP TABLE IF EXISTS `cp_message`;
CREATE TABLE `cp_message` (
  `message_id` bigint(20) NOT NULL COMMENT '留言表，主键',
  `create_user` bigint(20) NOT NULL COMMENT '创建人',
  `message_detail` varchar(255) NOT NULL COMMENT '留言内容',
  `status_cd` tinyint(4) NOT NULL COMMENT '留言状态',
  `relation_id` bigint(20) NOT NULL COMMENT '外键，关系表id',
  PRIMARY KEY (`message_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of cp_message
-- ----------------------------

-- ----------------------------
-- Table structure for `cp_photo`
-- ----------------------------
DROP TABLE IF EXISTS `cp_photo`;
CREATE TABLE `cp_photo` (
  `photo_id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '照片表，主键',
  `photo_name` varchar(255) DEFAULT NULL COMMENT '照片名',
  `relation_id` bigint(20) NOT NULL COMMENT '外键，关系表id',
  `ann_id` bigint(20) DEFAULT NULL COMMENT '外键，纪念日id',
  `create_date` datetime NOT NULL COMMENT '创建时间',
  `update_date` datetime NOT NULL COMMENT '更新时间',
  `photo_describe` varchar(255) DEFAULT NULL COMMENT '照片描述',
  `album_id` bigint(20) NOT NULL COMMENT '外键，关联相册id',
  `create_user` bigint(20) NOT NULL COMMENT '照片创建人',
  `status_cd` tinyint(4) NOT NULL COMMENT '照片状态',
  PRIMARY KEY (`photo_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of cp_photo
-- ----------------------------

-- ----------------------------
-- Table structure for `cp_relation`
-- ----------------------------
DROP TABLE IF EXISTS `cp_relation`;
CREATE TABLE `cp_relation` (
  `relation_id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '关系表，主键',
  `relation_name` varchar(255) DEFAULT NULL COMMENT '关系名',
  `create_date` datetime NOT NULL COMMENT '创建时间',
  `update_date` datetime NOT NULL COMMENT '更新时间',
  `status_cd` tinyint(4) NOT NULL COMMENT '关系状态',
  `male_user_id` bigint(20) NOT NULL COMMENT '外键，关联的男用户',
  `female_user_id` bigint(20) NOT NULL COMMENT '外键，关联的女用户',
  `relation_days` bigint(20) NOT NULL COMMENT '关系天数',
  `create_user` bigint(20) NOT NULL COMMENT '创建人',
  PRIMARY KEY (`relation_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of cp_relation
-- ----------------------------

-- ----------------------------
-- Table structure for `cp_user`
-- ----------------------------
DROP TABLE IF EXISTS `cp_user`;
CREATE TABLE `cp_user` (
  `user_id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键，用户id',
  `user_name` varchar(255) DEFAULT NULL COMMENT '用户名',
  `nick_name` varchar(255) DEFAULT NULL COMMENT '昵称',
  `phone_number` varchar(255) DEFAULT NULL COMMENT '电话号码',
  `create_date` datetime NOT NULL COMMENT '创建时间',
  `update_date` datetime NOT NULL COMMENT '更新日期',
  `wx_id` varchar(255) DEFAULT NULL COMMENT '关联的微信用户id',
  `status_cd` tinyint(4) NOT NULL COMMENT '用户状态',
  `user_gender` tinyint(4) DEFAULT NULL COMMENT '用户性别',
  `user_birthday` date DEFAULT NULL COMMENT '用户生日',
  PRIMARY KEY (`user_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of cp_user
-- ----------------------------
