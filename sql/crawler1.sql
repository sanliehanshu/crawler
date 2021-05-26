/*
 Navicat Premium Data Transfer

 Source Server         : mysql
 Source Server Type    : MySQL
 Source Server Version : 50726
 Source Host           : localhost:3306
 Source Schema         : crawler1

 Target Server Type    : MySQL
 Target Server Version : 50726
 File Encoding         : 65001

 Date: 26/05/2021 22:28:16
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for rain_0
-- ----------------------------
DROP TABLE IF EXISTS `rain_0`;
CREATE TABLE `rain_0` (
  `id` bigint(20) NOT NULL,
  `name` varchar(255) DEFAULT NULL,
  `flows` int(10) DEFAULT NULL,
  `create_time` datetime DEFAULT NULL,
  `update_time` datetime DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 ROW_FORMAT=DYNAMIC;

-- ----------------------------
-- Records of rain_0
-- ----------------------------
BEGIN;
INSERT INTO `rain_0` VALUES (1, '1', 1000, NULL, NULL);
INSERT INTO `rain_0` VALUES (7, '7', 7000, NULL, NULL);
COMMIT;

-- ----------------------------
-- Table structure for rain_1
-- ----------------------------
DROP TABLE IF EXISTS `rain_1`;
CREATE TABLE `rain_1` (
  `id` bigint(20) NOT NULL,
  `name` varchar(255) DEFAULT NULL,
  `flows` int(10) DEFAULT NULL,
  `create_time` datetime DEFAULT NULL,
  `update_time` datetime DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 ROW_FORMAT=DYNAMIC;

-- ----------------------------
-- Records of rain_1
-- ----------------------------
BEGIN;
INSERT INTO `rain_1` VALUES (2, '2', 2000, NULL, NULL);
INSERT INTO `rain_1` VALUES (8, '8', 8000, NULL, NULL);
COMMIT;

-- ----------------------------
-- Table structure for rain_2
-- ----------------------------
DROP TABLE IF EXISTS `rain_2`;
CREATE TABLE `rain_2` (
  `id` bigint(20) NOT NULL,
  `name` varchar(255) DEFAULT NULL,
  `flows` int(10) DEFAULT NULL,
  `create_time` datetime DEFAULT NULL,
  `update_time` datetime DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 ROW_FORMAT=DYNAMIC;

-- ----------------------------
-- Records of rain_2
-- ----------------------------
BEGIN;
INSERT INTO `rain_2` VALUES (3, '3', 2000, NULL, NULL);
INSERT INTO `rain_2` VALUES (9, '9', 9000, NULL, NULL);
COMMIT;

-- ----------------------------
-- Table structure for rain_3
-- ----------------------------
DROP TABLE IF EXISTS `rain_3`;
CREATE TABLE `rain_3` (
  `id` bigint(20) NOT NULL,
  `name` varchar(255) DEFAULT NULL,
  `flows` int(10) DEFAULT NULL,
  `create_time` datetime DEFAULT NULL,
  `update_time` datetime DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 ROW_FORMAT=DYNAMIC;

-- ----------------------------
-- Records of rain_3
-- ----------------------------
BEGIN;
INSERT INTO `rain_3` VALUES (4, '4', 4000, NULL, NULL);
INSERT INTO `rain_3` VALUES (10, '10', 10000, NULL, NULL);
COMMIT;

-- ----------------------------
-- Table structure for rain_4
-- ----------------------------
DROP TABLE IF EXISTS `rain_4`;
CREATE TABLE `rain_4` (
  `id` bigint(20) NOT NULL,
  `name` varchar(255) DEFAULT NULL,
  `flows` int(10) DEFAULT NULL,
  `create_time` datetime DEFAULT NULL,
  `update_time` datetime DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 ROW_FORMAT=DYNAMIC;

-- ----------------------------
-- Records of rain_4
-- ----------------------------
BEGIN;
INSERT INTO `rain_4` VALUES (5, '5', 5000, NULL, NULL);
INSERT INTO `rain_4` VALUES (11, '11', 11, NULL, NULL);
COMMIT;

-- ----------------------------
-- Table structure for rain_5
-- ----------------------------
DROP TABLE IF EXISTS `rain_5`;
CREATE TABLE `rain_5` (
  `id` bigint(20) NOT NULL,
  `name` varchar(255) DEFAULT NULL,
  `flows` int(10) DEFAULT NULL,
  `create_time` datetime DEFAULT NULL,
  `update_time` datetime DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 ROW_FORMAT=DYNAMIC;

-- ----------------------------
-- Records of rain_5
-- ----------------------------
BEGIN;
INSERT INTO `rain_5` VALUES (6, '6', 6000, NULL, NULL);
INSERT INTO `rain_5` VALUES (12, '12', 12, NULL, NULL);
COMMIT;

SET FOREIGN_KEY_CHECKS = 1;
