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

 Date: 13/05/2022 12:48:35
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
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of bfintro
-- ----------------------------
INSERT INTO `bfintro` VALUES (1, 'http://localhost:8080/fileSave/a9072fbb-c1e1-4abc-b05d-74506044aff8.jpg', 'INFO', '<p>contentcontentcontentcontentcontentcontentc</p><p>ontentcont<strike>entconte<span style=\"background-color: rgb(194, 79, 74);\">ntcontentcontentcontentcontentcontent</span></strike></p><p><span style=\"background-color: rgb(194, 79, 74);\"><strike>ontentcontentcont</strike><u>entcontentcontent<br/></u></span></p><p><u style=\"background-color: rgb(194, 79, 74);\">ontentcontentconte</u><b><u><span style=\"background-color: rgb(194, 79, 74);\">ntco</span>ntentcontent</u><br/></b></p><p><b>ontentcontentcontentcontentcontent</b><br/></p>');

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
) ENGINE = InnoDB AUTO_INCREMENT = 13 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

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
) ENGINE = InnoDB AUTO_INCREMENT = 17 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of file_list
-- ----------------------------
INSERT INTO `file_list` VALUES (1, '306421f5-4893-475f-aa0d-d2ffb49f9a95.png');
INSERT INTO `file_list` VALUES (5, 'a261a9d2-bd84-4606-8409-98452be60524.jpg');
INSERT INTO `file_list` VALUES (6, 'cc85ed0f-c68e-44f6-8383-458b61cbf5be.jpg');
INSERT INTO `file_list` VALUES (7, 'ba1d66a5-fcdb-4dfe-a3fe-cc343c31cff5.jpg');
INSERT INTO `file_list` VALUES (8, '6132c472-3111-4c00-8bc3-64470c4fe81b.jpg');
INSERT INTO `file_list` VALUES (9, 'a9072fbb-c1e1-4abc-b05d-74506044aff8.jpg');
INSERT INTO `file_list` VALUES (10, 'b2777ff1-1ff2-466f-a6fa-b12d5151cef9.jpg');
INSERT INTO `file_list` VALUES (11, 'f3ac0be9-fa82-49aa-87f8-32e876067fe5.webp');
INSERT INTO `file_list` VALUES (12, 'f2096efe-2f92-4955-b269-c1c4a4c4c5d2.webp');
INSERT INTO `file_list` VALUES (13, '5de26a22-99e8-456f-bc60-99c6ec20ab18.webp');
INSERT INTO `file_list` VALUES (14, '747cbe3a-c95c-4409-b17c-5fed249538f2.jpg');
INSERT INTO `file_list` VALUES (15, '3418fcb4-e9fe-4681-9e59-4ef7c13659a7.jpg');
INSERT INTO `file_list` VALUES (16, '383f72a9-1eed-45fd-9256-9aff6ff3a56d.jpg');
INSERT INTO `file_list` VALUES (17, '16206708-db00-424a-aaf2-51f8bbbf353f.webp');

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
) ENGINE = InnoDB AUTO_INCREMENT = 6 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of info
-- ----------------------------
INSERT INTO `info` VALUES (1, 'title1', 'http://localhost:8080/fileSave/383f72a9-1eed-45fd-9256-9aff6ff3a56d.jpg', '2022-1-3', '<p>2022年1月3日2022年1月3日2022年1月3日</p>');
INSERT INTO `info` VALUES (2, 'title2', 'http://localhost:8080/fileSave/383f72a9-1eed-45fd-9256-9aff6ff3a56d.jpg', '2022-1-4', '<p>2022年1月4日2022年1月4日2022年1月4日</p>');
INSERT INTO `info` VALUES (3, 'title3', 'http://localhost:8080/fileSave/383f72a9-1eed-45fd-9256-9aff6ff3a56d.jpg', '2022-1-5', '<p>2022年1月4日2022年1月4日2022年1月4日</p>');
INSERT INTO `info` VALUES (4, 'title4', 'http://localhost:8080/fileSave/383f72a9-1eed-45fd-9256-9aff6ff3a56d.jpg', '2022-1-6', '<p>2022年1月4日2022年1月4日2022年1月4日</p>');
INSERT INTO `info` VALUES (5, 'title5', 'http://localhost:8080/fileSave/383f72a9-1eed-45fd-9256-9aff6ff3a56d.jpg', '2022-1-7', '<p>2022年<strike>1</strike><font face=\"Courier New\"><strike>月7</strike>日<span style=\"background-color: rgb(28, 72, 127);\">2022年1</span></font></p><p><font face=\"Courier New\">月7<font color=\"#c24f4a\">日202</font>2<i>年1月7日</i></font></p>');

-- ----------------------------
-- Table structure for order_form
-- ----------------------------
DROP TABLE IF EXISTS `order_form`;
CREATE TABLE `order_form`  (
  `id` int(0) NOT NULL AUTO_INCREMENT,
  `orderID` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `userID` int(0) NOT NULL,
  `orderForm` longtext CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `tradingStatus` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL DEFAULT '',
  `time` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 13 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of order_form
-- ----------------------------
INSERT INTO `order_form` VALUES (3, '590fea8a492e4cf59486528f98d4eca8', 1, '[{\"itemID\":2,\"itemName\":\"iitem2\",\"itemPrice\":2222.0,\"itemSelection\":\"2b1\",\"itemNum\":1,\"subtotal\":2222.0},{\"itemID\":3,\"itemName\":\"inaisnf3\",\"itemPrice\":333.0,\"itemSelection\":\"3c1\",\"itemNum\":1,\"subtotal\":333.0},{\"itemID\":5,\"itemName\":\"fsdhfsdh5\",\"itemPrice\":5555.0,\"itemSelection\":\"5f2\",\"itemNum\":1,\"subtotal\":5555.0}]', 'DONE', '2022-04-13 15:25:14');
INSERT INTO `order_form` VALUES (4, 'ef9d0e3c7f2749178824ff24dc88ec56', 1, '[{\"itemID\":3,\"itemName\":\"inaisnf3\",\"itemPrice\":333.0,\"itemSelection\":\"3c3\",\"itemNum\":1,\"subtotal\":333.0}]', 'DONE', '2022-04-13 16:00:36');
INSERT INTO `order_form` VALUES (5, '0538494a49264c94b2bafd8f9a0a6800', 1, '[{\"itemID\":5,\"itemName\":\"fsdhfsdh5\",\"itemPrice\":5555.0,\"itemSelection\":\"5f3\",\"itemNum\":4,\"subtotal\":22220.0}]', 'UNDONE', '2022-04-13 16:01:27');
INSERT INTO `order_form` VALUES (6, '29a96201e0a44f4baf1a5a829a38f44d', 1, '[{\"itemID\":5,\"itemName\":\"fsdhfsdh5\",\"itemPrice\":5555.0,\"itemSelection\":\"5f3\",\"itemNum\":4,\"subtotal\":22220.0}]', 'UNDONE', '2022-04-13 16:02:16');
INSERT INTO `order_form` VALUES (7, 'a47e4b2c3de14a4a94c58805a37308ac', 1, '[{\"itemID\":2,\"itemName\":\"product 02\",\"itemPrice\":2222.0,\"itemSelection\":\"2b1\",\"itemNum\":1,\"subtotal\":2222.0},{\"itemID\":2,\"itemName\":\"product 02\",\"itemPrice\":2222.0,\"itemSelection\":\"2b1\",\"itemNum\":1,\"subtotal\":2222.0},{\"itemID\":2,\"itemName\":\"product 02\",\"itemPrice\":2222.0,\"itemSelection\":\"2b1\",\"itemNum\":1,\"subtotal\":2222.0},{\"itemID\":2,\"itemName\":\"product 02\",\"itemPrice\":2222.0,\"itemSelection\":\"2b1\",\"itemNum\":1,\"subtotal\":2222.0}]', 'UNDONE', '2022-04-15 20:38:32');
INSERT INTO `order_form` VALUES (8, '7a2266796b944c74ae33e4b40b8202a2', 2, '[{\"itemID\":2,\"itemName\":\"product 02\",\"itemPrice\":2222.0,\"itemSelection\":\"2b1\",\"itemNum\":1,\"subtotal\":2222.0},{\"itemID\":2,\"itemName\":\"product 02\",\"itemPrice\":2222.0,\"itemSelection\":\"2b1\",\"itemNum\":1,\"subtotal\":2222.0},{\"itemID\":2,\"itemName\":\"product 02\",\"itemPrice\":2222.0,\"itemSelection\":\"2b1\",\"itemNum\":1,\"subtotal\":2222.0},{\"itemID\":2,\"itemName\":\"product 02\",\"itemPrice\":2222.0,\"itemSelection\":\"2b1\",\"itemNum\":1,\"subtotal\":2222.0}]', 'DONE', '2022-04-16 12:47:16');
INSERT INTO `order_form` VALUES (9, '5aa3813244a54658b285e4e97ca07440', 2, '[{\"itemID\":2,\"itemName\":\"product 02\",\"itemPrice\":2222.0,\"itemSelection\":\"2b1\",\"itemNum\":1,\"subtotal\":2222.0},{\"itemID\":2,\"itemName\":\"product 02\",\"itemPrice\":2222.0,\"itemSelection\":\"2b1\",\"itemNum\":1,\"subtotal\":2222.0},{\"itemID\":2,\"itemName\":\"product 02\",\"itemPrice\":2222.0,\"itemSelection\":\"2b1\",\"itemNum\":1,\"subtotal\":2222.0},{\"itemID\":2,\"itemName\":\"product 02\",\"itemPrice\":2222.0,\"itemSelection\":\"2b1\",\"itemNum\":1,\"subtotal\":2222.0}]', 'UNDONE', '2022-04-16 12:48:04');
INSERT INTO `order_form` VALUES (10, 'ddb28941cd954c45adfba40f48304851', 2, '[{\"itemID\":2,\"itemName\":\"product 02\",\"itemPrice\":2222.0,\"itemSelection\":\"2b1\",\"itemNum\":1,\"subtotal\":2222.0},{\"itemID\":2,\"itemName\":\"product 02\",\"itemPrice\":2222.0,\"itemSelection\":\"2b1\",\"itemNum\":1,\"subtotal\":2222.0},{\"itemID\":2,\"itemName\":\"product 02\",\"itemPrice\":2222.0,\"itemSelection\":\"2b1\",\"itemNum\":1,\"subtotal\":2222.0},{\"itemID\":2,\"itemName\":\"product 02\",\"itemPrice\":2222.0,\"itemSelection\":\"2b1\",\"itemNum\":1,\"subtotal\":2222.0}]', 'UNDONE', '2022-04-16 12:49:02');
INSERT INTO `order_form` VALUES (11, '1569d4f59e2d4583888011ad16268f11', 2, '[{\"itemID\":2,\"itemName\":\"product 02\",\"itemPrice\":2222.0,\"itemSelection\":\"2b1\",\"itemNum\":1,\"subtotal\":2222.0},{\"itemID\":2,\"itemName\":\"product 02\",\"itemPrice\":2222.0,\"itemSelection\":\"2b1\",\"itemNum\":1,\"subtotal\":2222.0},{\"itemID\":2,\"itemName\":\"product 02\",\"itemPrice\":2222.0,\"itemSelection\":\"2b1\",\"itemNum\":1,\"subtotal\":2222.0},{\"itemID\":2,\"itemName\":\"product 02\",\"itemPrice\":2222.0,\"itemSelection\":\"2b1\",\"itemNum\":1,\"subtotal\":2222.0}]', 'UNDONE', '2022-04-16 12:49:41');
INSERT INTO `order_form` VALUES (12, '39e3282848724096abdc1747828c4e83', 2, '[{\"itemID\":2,\"itemName\":\"product 02\",\"itemPrice\":2222.0,\"itemSelection\":\"2b1\",\"itemNum\":1,\"subtotal\":2222.0},{\"itemID\":2,\"itemName\":\"product 02\",\"itemPrice\":2222.0,\"itemSelection\":\"2b1\",\"itemNum\":1,\"subtotal\":2222.0},{\"itemID\":2,\"itemName\":\"product 02\",\"itemPrice\":2222.0,\"itemSelection\":\"2b1\",\"itemNum\":1,\"subtotal\":2222.0},{\"itemID\":2,\"itemName\":\"product 02\",\"itemPrice\":2222.0,\"itemSelection\":\"2b1\",\"itemNum\":1,\"subtotal\":2222.0}]', 'UNDONE', '2022-04-16 12:51:49');
INSERT INTO `order_form` VALUES (13, '9c3deb9d5d7a4579aa7f92606177df75', 1, '[{\"itemID\":2,\"itemName\":\"product 02\",\"itemPrice\":2222.0,\"itemSelection\":\"2b1\",\"itemNum\":1,\"subtotal\":2222.0},{\"itemID\":3,\"itemName\":\"product 03\",\"itemPrice\":3333.0,\"itemSelection\":\"3c1\",\"itemNum\":1,\"subtotal\":3333.0}]', 'UNDONE', '2022-05-12 14:08:11');

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
) ENGINE = InnoDB AUTO_INCREMENT = 6 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of product
-- ----------------------------
INSERT INTO `product` VALUES (1, 'product 01', 'http://localhost:8080/fileSave/b2777ff1-1ff2-466f-a6fa-b12d5151cef9.jpg', 1111.00, '简要介绍简要介绍简要介绍简要介绍', '<h1>product 01 information</h1><h1>product<span style=\"background-color: rgb(139, 170, 74);\"> 01 information</span></h1><h1><span style=\"background-color: rgb(139, 170, 74);\">product 01 information</span></h1><h1><span style=\"background-color: rgb(139, 170, 74);\">product 01 informationproduct 0</span>1 information</h1><h1>product 01 information</h1><h1>product 01 information</h1><h1>product 01 information</h1><h1>product 01 information</h1>');
INSERT INTO `product` VALUES (2, 'product 02', 'http://localhost:8080/fileSave/f2096efe-2f92-4955-b269-c1c4a4c4c5d2.webp', 2222.00, '简要介绍简要介绍简要介绍简要介绍', '<h1>prod<strike>uct 02 informationproduct 02 informationproduct 02 information<span style=\"background-color: rgb(123, 91, 161);\">product 02 information</span></strike></h1><h1><span style=\"background-color: rgb(123, 91, 161);\"><strike>product 02 in</strike>formation</span></h1><h1><span style=\"background-color: rgb(123, 91, 161);\">product 02 information</span></h1><h1>product 02 information</h1><h1>product 02 information</h1><h1>product 02 information</h1><h1>product 02 information</h1>');
INSERT INTO `product` VALUES (3, 'product 03', 'http://localhost:8080/fileSave/5de26a22-99e8-456f-bc60-99c6ec20ab18.webp', 3333.00, '简要介绍简要介绍简要介绍简要介绍', '<h1>product 03 information</h1><h1>product 03<strike> information</strike></h1><p><strike><br/></strike></p><h1><strike>product 03 informationproduct 03 information</strike></h1><h1><strike>product 03 information</strike></h1><h1>product 03 information</h1><h1>product 03 information</h1><h1>product 03 information</h1><h1>product 03 information</h1>');
INSERT INTO `product` VALUES (4, 'product 04', 'http://localhost:8080/fileSave/747cbe3a-c95c-4409-b17c-5fed249538f2.jpg', 4444.00, '简要介绍简要介绍简要介绍简要介绍', '<h1>prod<u>uct 04 information</u></h1><h1><u>product</u> 04<strike> information</strike></h1><h1><strike>product 04 information</strike></h1><h1><strike>product 04 informatio</strike>n</h1><h1>product 04 information</h1><h1>product 04 information</h1><h1>product 04 information</h1>');
INSERT INTO `product` VALUES (5, 'product 05', 'http://localhost:8080/fileSave/3418fcb4-e9fe-4681-9e59-4ef7c13659a7.jpg', 5555.00, '简要介绍简要介绍简要介绍', '<h1>product 05 information</h1><h1>product 05 information<br/></h1><h1>product 0<b>5 information<br/></b></h1><p><i><b>product 05 information<br/></b></i></p><p><i><b>product 05 information</b><br/></i></p><p><i>p<span style=\"background-color: rgb(194, 79, 74);\">roduct 05 information</span></i><span style=\"background-color: rgb(194, 79, 74);\"><br/></span></p><p><span style=\"background-color: rgb(194, 79, 74);\">product 05 information<br/></span></p><p><span style=\"background-color: rgb(194, 79, 74);\">product 05 information</span><br/></p><p>product 05 information<br/></p>');

-- ----------------------------
-- Table structure for product_img
-- ----------------------------
DROP TABLE IF EXISTS `product_img`;
CREATE TABLE `product_img`  (
  `id` int(0) NOT NULL AUTO_INCREMENT,
  `imgsrc` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `itemid` int(0) NOT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 24 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of product_img
-- ----------------------------
INSERT INTO `product_img` VALUES (14, 'http://localhost:8080/fileSave/b2777ff1-1ff2-466f-a6fa-b12d5151cef9.jpg', 1);
INSERT INTO `product_img` VALUES (15, 'http://localhost:8080/fileSave/b2777ff1-1ff2-466f-a6fa-b12d5151cef9.jpg', 1);
INSERT INTO `product_img` VALUES (16, 'http://localhost:8080/fileSave/f2096efe-2f92-4955-b269-c1c4a4c4c5d2.webp', 2);
INSERT INTO `product_img` VALUES (17, 'http://localhost:8080/fileSave/f2096efe-2f92-4955-b269-c1c4a4c4c5d2.webp', 2);
INSERT INTO `product_img` VALUES (18, 'http://localhost:8080/fileSave/5de26a22-99e8-456f-bc60-99c6ec20ab18.webp', 3);
INSERT INTO `product_img` VALUES (19, 'http://localhost:8080/fileSave/5de26a22-99e8-456f-bc60-99c6ec20ab18.webp', 3);
INSERT INTO `product_img` VALUES (20, 'http://localhost:8080/fileSave/747cbe3a-c95c-4409-b17c-5fed249538f2.jpg', 4);
INSERT INTO `product_img` VALUES (21, 'http://localhost:8080/fileSave/747cbe3a-c95c-4409-b17c-5fed249538f2.jpg', 4);
INSERT INTO `product_img` VALUES (22, 'http://localhost:8080/fileSave/3418fcb4-e9fe-4681-9e59-4ef7c13659a7.jpg', 5);
INSERT INTO `product_img` VALUES (23, 'http://localhost:8080/fileSave/3418fcb4-e9fe-4681-9e59-4ef7c13659a7.jpg', 5);

-- ----------------------------
-- Table structure for product_selection
-- ----------------------------
DROP TABLE IF EXISTS `product_selection`;
CREATE TABLE `product_selection`  (
  `id` int(0) NOT NULL AUTO_INCREMENT,
  `select` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `itemid` int(0) NOT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 19 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

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
  `googlemapsrc` longtext CHARACTER SET utf8 COLLATE utf8_general_ci NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of storeinfo
-- ----------------------------
INSERT INTO `storeinfo` VALUES (1, 'http://localhost:8080/fileSave/16206708-db00-424a-aaf2-51f8bbbf353f.webp', 'xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx', 'addressaddressaddress', 'telephonetelephonetelephone', 'businesshoursbusinesshours', 'offdaysoffdaysoffdays', 'https%3A//www.google.com/maps/embed%3Fpb=!1m18!1m12!1m3!1d14325.397028330883!2d-80.3324507!3d26.1527527!2m3!1f0!2f0!3f0!3m2!1i1024!2i768!4f13.1!3m3!1m2!1s0x88d908feeaeded1f%253A0x29c1bf6101ce3a42!2sSawgrass%2520Mills!5e0!3m2!1szh-CN!2shk!4v1650026975312!5m2!1szh-CN!2shk');

-- ----------------------------
-- Table structure for user_list
-- ----------------------------
DROP TABLE IF EXISTS `user_list`;
CREATE TABLE `user_list`  (
  `userID` int(0) NOT NULL AUTO_INCREMENT,
  `userName` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `userPassword` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `userPhoneNumber` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `userRole` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `address` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `email` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  PRIMARY KEY (`userID`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of user_list
-- ----------------------------
INSERT INTO `user_list` VALUES (1, 'Root', '123456aa', '12345647897', 'Admin', 'address111111222', 'addressaddress1@gmail.com');
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
INSERT INTO `user_list` VALUES (18, 'bsbhab', '123456aa', '13364541234', 'User', 'saiudgsaiugiasu', '123456@qq.com');
INSERT INTO `user_list` VALUES (19, 'xiasbhou', '123456aa', '13212341234', 'User', 'dnfsfbsdpfbsaisfda', 'bsiasb@qq.com');

SET FOREIGN_KEY_CHECKS = 1;
