/*
 Navicat MySQL Data Transfer

 Source Server         : 我的腾讯云
 Source Server Type    : MySQL
 Source Server Version : 50647
 Source Host           : 111.229.197.210:3306
 Source Schema         : kjb-pro

 Target Server Type    : MySQL
 Target Server Version : 50647
 File Encoding         : 65001

 Date: 12/10/2020 12:52:37
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for requirement
-- ----------------------------
DROP TABLE IF EXISTS `requirement`;
CREATE TABLE `requirement`  (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '逻辑主键',
  `short_desc` varchar(10) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL,
  `detail` varchar(300) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL,
  `onlineTime` char(1) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '1-1天、2-3天、3-1周、4-2周、5-4周、6-8周、7-不急',
  `img` varchar(128) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL,
  `dept` char(1) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT '0' COMMENT '1-市场、2-客服、3-培训、4-财务、5-行政、6其他',
  `puter` varchar(8) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL,
  `connectType` char(1) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT '0',
  `connectTypeValue` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL,
  `cTime` datetime(0) NULL DEFAULT CURRENT_TIMESTAMP(0),
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 76 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci ROW_FORMAT = Compact;

SET FOREIGN_KEY_CHECKS = 1;
