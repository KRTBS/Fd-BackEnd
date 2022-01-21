/*
 Navicat Premium Data Transfer

 Source Server         : localhost_3306
 Source Server Type    : MySQL
 Source Server Version : 80026
 Source Host           : 127.0.0.1:3306
 Source Schema         : fooddelivered

 Target Server Type    : MySQL
 Target Server Version : 80026
 File Encoding         : 65001

 Date: 21/01/2022 15:03:05
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for bfintro
-- ----------------------------
DROP TABLE IF EXISTS `bfintro`;
CREATE TABLE `bfintro`  (
  `id` int(0) NOT NULL AUTO_INCREMENT,
  `imgsrc` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `title` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `content` longtext CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 2 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of bfintro
-- ----------------------------
INSERT INTO `bfintro` VALUES (1, 'http://localhost:8080/fileSave/a9072fbb-c1e1-4abc-b05d-74506044aff8.jpg', 'cnmcnmcnmcnmcnmcnms', '<p>contentcontentcontentcontentcontentcontentc</p><p>ontentcont<strike>entconte<span style=\"background-color: rgb(194, 79, 74);\">ntcontentcontentcontentcontentcontent</span></strike></p><p><span style=\"background-color: rgb(194, 79, 74);\"><strike>ontentcontentcont</strike><u>entcontentcontent<br/></u></span></p><p><u style=\"background-color: rgb(194, 79, 74);\">ontentcontentconte</u><b><u><span style=\"background-color: rgb(194, 79, 74);\">ntco</span>ntentcontent</u><br/></b></p><p><b>ontentcontentcontentcontentcontent</b><br/></p>');

-- ----------------------------
-- Table structure for carousel
-- ----------------------------
DROP TABLE IF EXISTS `carousel`;
CREATE TABLE `carousel`  (
  `id` int(0) NOT NULL AUTO_INCREMENT,
  `title` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `imgsrc` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `itemid` int(0) NOT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 14 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of carousel
-- ----------------------------
INSERT INTO `carousel` VALUES (1, 'title1', 'http://localhost:8080/fileSave/a261a9d2-bd84-4606-8409-98452be60524.jpg', 5);
INSERT INTO `carousel` VALUES (2, 'title2', 'http://localhost:8080/fileSave/cc85ed0f-c68e-44f6-8383-458b61cbf5be.jpg', 2);
INSERT INTO `carousel` VALUES (3, 'title3', 'http://localhost:8080/fileSave/ba1d66a5-fcdb-4dfe-a3fe-cc343c31cff5.jpg', 3);
INSERT INTO `carousel` VALUES (4, 'title4', 'http://localhost:8080/fileSave/6132c472-3111-4c00-8bc3-64470c4fe81b.jpg', 4);

-- ----------------------------
-- Table structure for file_list
-- ----------------------------
DROP TABLE IF EXISTS `file_list`;
CREATE TABLE `file_list`  (
  `id` int(0) NOT NULL AUTO_INCREMENT,
  `fileName` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 9 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of file_list
-- ----------------------------
INSERT INTO `file_list` VALUES (1, '306421f5-4893-475f-aa0d-d2ffb49f9a95.png');
INSERT INTO `file_list` VALUES (5, 'a261a9d2-bd84-4606-8409-98452be60524.jpg');
INSERT INTO `file_list` VALUES (6, 'cc85ed0f-c68e-44f6-8383-458b61cbf5be.jpg');
INSERT INTO `file_list` VALUES (7, 'ba1d66a5-fcdb-4dfe-a3fe-cc343c31cff5.jpg');
INSERT INTO `file_list` VALUES (8, '6132c472-3111-4c00-8bc3-64470c4fe81b.jpg');
INSERT INTO `file_list` VALUES (9, 'a9072fbb-c1e1-4abc-b05d-74506044aff8.jpg');

-- ----------------------------
-- Table structure for info
-- ----------------------------
DROP TABLE IF EXISTS `info`;
CREATE TABLE `info`  (
  `id` int(0) NOT NULL AUTO_INCREMENT,
  `title` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `imgsrc` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `time` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `content` longtext CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 7 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of info
-- ----------------------------
INSERT INTO `info` VALUES (1, 'title1', 'https://s4.ax1x.com/2021/12/27/TBUWmd.png', '2022-1-3', '2022年1月3日2022年1月3日2022年1月3日');
INSERT INTO `info` VALUES (2, 'title2', 'https://s4.ax1x.com/2021/12/27/TBUWmd.png', '2022-1-4', '2022年1月4日2022年1月4日2022年1月4日');
INSERT INTO `info` VALUES (3, 'title3', 'https://s4.ax1x.com/2021/12/27/TBUWmd.png', '2022-1-5', '2022年1月4日2022年1月4日2022年1月4日');
INSERT INTO `info` VALUES (4, 'title4', 'https://s4.ax1x.com/2021/12/27/TBUWmd.png', '2022-1-6', '2022年1月4日2022年1月4日2022年1月4日');
INSERT INTO `info` VALUES (5, 'title5', 'https://s4.ax1x.com/2021/12/27/TBUWmd.png', '2022-1-7', '<p>2022年<strike>1</strike><font face=\"Courier New\"><strike>月7</strike>日<span style=\"background-color: rgb(28, 72, 127);\">2022年1</span></font></p><p><font face=\"Courier New\">月7<font color=\"#c24f4a\">日202</font>2<i>年1月7日</i></font></p>');

-- ----------------------------
-- Table structure for product
-- ----------------------------
DROP TABLE IF EXISTS `product`;
CREATE TABLE `product`  (
  `id` int(0) NOT NULL AUTO_INCREMENT,
  `name` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `imgsrc` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `price` decimal(10, 2) NOT NULL,
  `briefinfo` longtext CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `fullinfo` longtext CHARACTER SET utf8 COLLATE utf8_general_ci NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 7 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of product
-- ----------------------------
INSERT INTO `product` VALUES (1, 'iitem1', 'https://s4.ax1x.com/2021/12/27/TBUWmd.png', 1111.00, 'no info no info no info no info', '<p><h1 id=\"ca4u5\">full info<br/>  full info </h1><b> full info <br/></b><i><b> full info <br/> ful<span style=\"background-color: rgb(194, 79, 74);\">l info </span></b><span style=\"background-color: rgb(194, 79, 74);\"><br/> full info <br/> full info </span><br/></i></p><p><i>sdahsahasdosadh</i></p>');
INSERT INTO `product` VALUES (2, 'iitem2', 'https://s4.ax1x.com/2021/12/27/TBUWmd.png', 2222.00, 'sabduabfbOBUGBDSbv545', 'ybwdjasnfndofihnncxjkncxkjvbnxcjnvlkcxnvklxz');
INSERT INTO `product` VALUES (3, 'inaisnf3', 'https://s4.ax1x.com/2021/12/27/TBUWmd.png', 333.00, 'hiubgdfiugbdsab[gsbnknccn', 'hidjio2121rhiqhionvdoibudsb4654541231sf3');
INSERT INTO `product` VALUES (4, 'isdasbd4', 'https://s4.ax1x.com/2021/12/27/TBUWmd.png', 4444.00, 'dhsihfvuisdhbgvosvfgnt', 'sgsh0idf[hgiwrogoiodsbjkkjcxnklnxc');
INSERT INTO `product` VALUES (5, 'fsdhfsdh5', 'https://s4.ax1x.com/2021/12/27/TBUWmd.png', 5555.00, 'gnisdfujgbdsi{UGBib', '9fueqWHR98H9-9ggbv9G(v2314');

-- ----------------------------
-- Table structure for product_img
-- ----------------------------
DROP TABLE IF EXISTS `product_img`;
CREATE TABLE `product_img`  (
  `id` int(0) NOT NULL AUTO_INCREMENT,
  `imgsrc` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `itemid` int(0) NOT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 14 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of product_img
-- ----------------------------
INSERT INTO `product_img` VALUES (1, 'https://s3.bmp.ovh/imgs/2022/01/fe8b3a3b13c2ed95.png', 1);
INSERT INTO `product_img` VALUES (2, 'https://s4.ax1x.com/2021/12/27/TBUWmd.png', 1);
INSERT INTO `product_img` VALUES (3, 'https://s3.bmp.ovh/imgs/2022/01/fe8b3a3b13c2ed95.png', 2);
INSERT INTO `product_img` VALUES (4, 'https://s4.ax1x.com/2021/12/27/TBUWmd.png', 2);
INSERT INTO `product_img` VALUES (5, 'https://s3.bmp.ovh/imgs/2022/01/fe8b3a3b13c2ed95.png', 3);
INSERT INTO `product_img` VALUES (6, 'https://s4.ax1x.com/2021/12/27/TBUWmd.png', 3);
INSERT INTO `product_img` VALUES (7, 'https://s3.bmp.ovh/imgs/2022/01/fe8b3a3b13c2ed95.png', 4);
INSERT INTO `product_img` VALUES (8, 'https://s4.ax1x.com/2021/12/27/TBUWmd.png', 4);
INSERT INTO `product_img` VALUES (9, 'https://s3.bmp.ovh/imgs/2022/01/fe8b3a3b13c2ed95.png', 5);
INSERT INTO `product_img` VALUES (10, 'https://s4.ax1x.com/2021/12/27/TBUWmd.png', 5);
INSERT INTO `product_img` VALUES (11, 'sadasddsaasdadsasd', 1);

-- ----------------------------
-- Table structure for product_selection
-- ----------------------------
DROP TABLE IF EXISTS `product_selection`;
CREATE TABLE `product_selection`  (
  `id` int(0) NOT NULL AUTO_INCREMENT,
  `select` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `itemid` int(0) NOT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 20 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of product_selection
-- ----------------------------
INSERT INTO `product_selection` VALUES (1, '1a1', 1);
INSERT INTO `product_selection` VALUES (2, '1a2', 1);
INSERT INTO `product_selection` VALUES (3, '1a3', 1);
INSERT INTO `product_selection` VALUES (4, '2b1', 2);
INSERT INTO `product_selection` VALUES (5, '2b2', 2);
INSERT INTO `product_selection` VALUES (6, '2b3', 2);
INSERT INTO `product_selection` VALUES (7, '3c1', 3);
INSERT INTO `product_selection` VALUES (8, '3c2', 3);
INSERT INTO `product_selection` VALUES (9, '3c3', 3);
INSERT INTO `product_selection` VALUES (10, '4d1', 4);
INSERT INTO `product_selection` VALUES (11, '4d2', 4);
INSERT INTO `product_selection` VALUES (12, '4d3', 4);
INSERT INTO `product_selection` VALUES (13, '5f1', 5);
INSERT INTO `product_selection` VALUES (14, '5f2', 5);
INSERT INTO `product_selection` VALUES (15, '5f3', 5);
INSERT INTO `product_selection` VALUES (17, 'jb', 1);

-- ----------------------------
-- Table structure for storeinfo
-- ----------------------------
DROP TABLE IF EXISTS `storeinfo`;
CREATE TABLE `storeinfo`  (
  `id` int(0) NOT NULL AUTO_INCREMENT,
  `imgsrc` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `briefinfo` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `address` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `telephone` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `businesshours` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `offdays` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `googlemapsrc` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 2 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of storeinfo
-- ----------------------------
INSERT INTO `storeinfo` VALUES (1, 'https://s4.ax1x.com/2022/01/10/7Ekkbq.png', 'xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx', 'addressaddressaddress', 'telephonetelephonetelephone', 'businesshoursbusinesshours', 'offdaysoffdaysoffdays', 'https://www.google.com/maps/embed?pb=!1m14!1m8!1m3!1d23116.66046040093!2d114.32302671984321!3d30.540484060372005!3m2!1i1024!2i768!4f13.1!3m3!1m2!1s0x342eafc7609fc5f5%3A0x589c52e877def5a!2z6buE6bmk5qW8!5e0!3m2!1szh-CN!2sus!4v1640668005852!5m2!1szh-CN!2sus');

-- ----------------------------
-- Table structure for user_list
-- ----------------------------
DROP TABLE IF EXISTS `user_list`;
CREATE TABLE `user_list`  (
  `UserID` int(0) NOT NULL AUTO_INCREMENT,
  `UserName` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `UserPassword` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `UserPhoneNumber` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `UserRole` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `Address` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `email` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  PRIMARY KEY (`UserID`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of user_list
-- ----------------------------
INSERT INTO `user_list` VALUES (1, 'Root', '123456', '12345647897', 'Admin', 'address1', 'addressaddress1@gmail.com');
INSERT INTO `user_list` VALUES (2, 'a1', '123456', '13176269188', 'User', 'address2', 'addressaddress2@gmail.com');
INSERT INTO `user_list` VALUES (3, 'a2', '123456', '17195244045', 'User', 'address3', 'addressaddress3@gmail.com');
INSERT INTO `user_list` VALUES (4, 'a3', '123456', '15974826457', 'User', 'address4', 'addressaddress4@gmail.com');
INSERT INTO `user_list` VALUES (5, 'a4', '123456', '15137053312', 'User', 'address5', 'addressaddress5@gmail.com');
INSERT INTO `user_list` VALUES (6, 'a5', '123456', '13244448888', 'User', 'address6', 'addressaddress6@gmail.com');
INSERT INTO `user_list` VALUES (7, 'b1', '123456', '15185513704', 'User', 'address7', 'addressaddress7@gmail.com');
INSERT INTO `user_list` VALUES (8, 'b2', '123456', '19926345481', 'User', 'address8', 'addressaddress8@gmail.com');
INSERT INTO `user_list` VALUES (9, 'b3', '123456', '17590332091', 'User', 'address9', 'addressaddress9@gmail.com');
INSERT INTO `user_list` VALUES (10, 'b4', '123456', '17234971192', 'User', 'address10', 'addressaddress10@gmail.com');
INSERT INTO `user_list` VALUES (11, 'b5', '123456', '17702905922', 'User', 'address11', 'addressaddress11@gmail.com');
INSERT INTO `user_list` VALUES (12, 'c1', '123456', '18713496658', 'User', 'address12', 'addressaddress12@gmail.com');
INSERT INTO `user_list` VALUES (13, 'c2', '123456', '18136172770', 'User', 'address13', 'addressaddress13@gmail.com');
INSERT INTO `user_list` VALUES (14, 'c3', '123456', '13893023401', 'User', 'address14', 'addressaddress14@gmail.com');
INSERT INTO `user_list` VALUES (15, 'c4', '123456', '13859052005', 'User', 'address15', 'addressaddress15@gmail.com');
INSERT INTO `user_list` VALUES (16, 'c5', '123456', '18778714629', 'User', 'address16', 'addressaddress16@gmail.com');
INSERT INTO `user_list` VALUES (17, 'd1', '123456', '12344984448', 'User', 'address17', 'addressaddress17@gmail.com');

SET FOREIGN_KEY_CHECKS = 1;
