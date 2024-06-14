/*
 Navicat Premium Dump SQL

 Source Server         : 127.0.0.1
 Source Server Type    : MySQL
 Source Server Version : 80037 (8.0.37)
 Source Host           : localhost:3306
 Source Schema         : db_qlsv

 Target Server Type    : MySQL
 Target Server Version : 80037 (8.0.37)
 File Encoding         : 65001

 Date: 09/06/2024 11:29:18
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for giang_vien
-- ----------------------------
DROP TABLE IF EXISTS `giang_vien`;
CREATE TABLE `giang_vien`  (
  `ma_giang_vien` int NOT NULL AUTO_INCREMENT,
  `ho_ten` varchar(255) CHARACTER SET utf8mb3 COLLATE utf8mb3_general_ci NULL DEFAULT NULL,
  `ngay_sinh` date NULL DEFAULT NULL,
  `gioi_tinh` bit(1) NULL DEFAULT NULL,
  `so_dien_thoai` varchar(20) CHARACTER SET utf8mb3 COLLATE utf8mb3_general_ci NULL DEFAULT NULL,
  `dia_chi` varchar(255) CHARACTER SET utf8mb3 COLLATE utf8mb3_general_ci NULL DEFAULT NULL,
  `tinh_trang` bit(1) NULL DEFAULT NULL,
  PRIMARY KEY (`ma_giang_vien` DESC) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 1 CHARACTER SET = utf8mb3 COLLATE = utf8mb3_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of giang_vien
-- ----------------------------

-- ----------------------------
-- Table structure for khoa_hoc
-- ----------------------------
DROP TABLE IF EXISTS `khoa_hoc`;
CREATE TABLE `khoa_hoc`  (
  `ma_khoa_hoc` int NOT NULL AUTO_INCREMENT,
  `ten_khoa_hoc` varchar(255) CHARACTER SET utf8mb3 COLLATE utf8mb3_general_ci NULL DEFAULT NULL,
  `mo_ta` mediumtext CHARACTER SET utf8mb3 COLLATE utf8mb3_general_ci NULL,
  `ngay_bat_dau` date NULL DEFAULT NULL,
  `ngay_ket_thuc` date NULL DEFAULT NULL,
  `tinh_trang` bit(1) NULL DEFAULT NULL,
  PRIMARY KEY (`ma_khoa_hoc` DESC) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 1 CHARACTER SET = utf8mb3 COLLATE = utf8mb3_general_ci ROW_FORMAT = DYNAMIC;

-- ----------------------------
-- Records of khoa_hoc
-- ----------------------------

-- ----------------------------
-- Table structure for lop_hoc
-- ----------------------------
DROP TABLE IF EXISTS `lop_hoc`;
CREATE TABLE `lop_hoc`  (
  `ma_lop_hoc` int NOT NULL AUTO_INCREMENT,
  `ma_khoa_hoc` int NULL DEFAULT NULL,
  `ma_sinh_vien` int NULL DEFAULT NULL,
  `ngay_dang_ky` date NULL DEFAULT NULL,
  `tinh_trang` bit(1) NULL DEFAULT NULL,
  PRIMARY KEY (`ma_lop_hoc` DESC) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 1 CHARACTER SET = utf8mb3 COLLATE = utf8mb3_general_ci ROW_FORMAT = DYNAMIC;

-- ----------------------------
-- Records of lop_hoc
-- ----------------------------

-- ----------------------------
-- Table structure for sinh_vien
-- ----------------------------
DROP TABLE IF EXISTS `sinh_vien`;
CREATE TABLE `sinh_vien`  (
  `ma_sinh_vien` int NOT NULL AUTO_INCREMENT,
  `ho_ten` varchar(255) CHARACTER SET utf8mb3 COLLATE utf8mb3_general_ci NULL DEFAULT NULL,
  `ngay_sinh` date NULL DEFAULT NULL,
  `gioi_tinh` bit(1) NULL DEFAULT NULL,
  `so_dien_thoai` varchar(20) CHARACTER SET utf8mb3 COLLATE utf8mb3_general_ci NULL DEFAULT NULL,
  `dia_chi` varchar(255) CHARACTER SET utf8mb3 COLLATE utf8mb3_general_ci NULL DEFAULT NULL,
  `tinh_trang` bit(1) NULL DEFAULT NULL,
  PRIMARY KEY (`ma_sinh_vien` DESC) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 22010141 CHARACTER SET = utf8mb3 COLLATE = utf8mb3_general_ci ROW_FORMAT = DYNAMIC;

-- ----------------------------
-- Records of sinh_vien
-- ----------------------------
INSERT INTO `sinh_vien` VALUES (22010140, 'Nhi', '2024-06-02', b'0', '1111', '', b'1');
INSERT INTO `sinh_vien` VALUES (22010139, 'Tran Duc Long', '2004-09-04', b'1', NULL, NULL, b'1');
INSERT INTO `sinh_vien` VALUES (36, '2222', '2024-06-03', b'0', '222', '', b'0');
INSERT INTO `sinh_vien` VALUES (35, '1', '2024-06-02', b'1', '1', '1', b'1');

-- ----------------------------
-- Table structure for tai_khoan
-- ----------------------------
DROP TABLE IF EXISTS `tai_khoan`;
CREATE TABLE `tai_khoan`  (
  `ma_tai_khoan` int NOT NULL AUTO_INCREMENT,
  `ten_dang_nhap` varchar(255) CHARACTER SET utf8mb3 COLLATE utf8mb3_general_ci NULL DEFAULT NULL,
  `mat_khau` varchar(255) CHARACTER SET utf8mb3 COLLATE utf8mb3_general_ci NULL DEFAULT NULL,
  `tinh_trang` bit(1) NULL DEFAULT NULL,
  PRIMARY KEY (`ma_tai_khoan` DESC) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 5 CHARACTER SET = utf8mb3 COLLATE = utf8mb3_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of tai_khoan
-- ----------------------------
INSERT INTO `tai_khoan` VALUES (4, '.', '.', b'1');
INSERT INTO `tai_khoan` VALUES (3, 'admin', 'admin', b'0');
INSERT INTO `tai_khoan` VALUES (2, 'long', '040904', b'1');
INSERT INTO `tai_khoan` VALUES (1, 'nhi', '041104', b'1');

SET FOREIGN_KEY_CHECKS = 1;
