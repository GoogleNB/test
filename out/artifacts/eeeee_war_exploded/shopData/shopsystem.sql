/*
 Navicat Premium Data Transfer

 Source Server         : localhost
 Source Server Type    : MySQL
 Source Server Version : 80028
 Source Host           : localhost:3306
 Source Schema         : shopsystem

 Target Server Type    : MySQL
 Target Server Version : 80028
 File Encoding         : 65001

 Date: 03/03/2022 20:26:23
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for admin
-- ----------------------------
DROP TABLE IF EXISTS `admin`;
CREATE TABLE `admin`  (
  `a_name` varchar(30) CHARACTER SET utf8 COLLATE utf8_unicode_ci NOT NULL,
  `a_pass` varchar(30) CHARACTER SET utf8 COLLATE utf8_unicode_ci NOT NULL,
  `a_header` varchar(30) CHARACTER SET utf8 COLLATE utf8_unicode_ci NOT NULL,
  `a_phone` char(15) CHARACTER SET utf8 COLLATE utf8_unicode_ci NOT NULL,
  `a_email` varchar(40) CHARACTER SET utf8 COLLATE utf8_unicode_ci NOT NULL,
  PRIMARY KEY (`a_name`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_unicode_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of admin
-- ----------------------------
INSERT INTO `admin` VALUES ('jiaran', '123456', '111', '110', 'jiaran@163.com');
INSERT INTO `admin` VALUES ('liuzc518', 'liuzc518', 'imagesfaceImage25.gif', '8208290', 'liuzc518@163.com');
INSERT INTO `admin` VALUES ('tangzy', 'nihao', 'imagesfaceImage25.gif', '123232', 'tangzy111@sohu.com');
INSERT INTO `admin` VALUES ('嘉然', '123456', '000', '110', 'YYDS');

-- ----------------------------
-- Table structure for customer
-- ----------------------------
DROP TABLE IF EXISTS `customer`;
CREATE TABLE `customer`  (
  `c_name` varchar(30) CHARACTER SET utf8 COLLATE utf8_unicode_ci NOT NULL,
  `c_pass` varchar(30) CHARACTER SET utf8 COLLATE utf8_unicode_ci NOT NULL,
  `c_header` varchar(30) CHARACTER SET utf8 COLLATE utf8_unicode_ci NOT NULL,
  `c_phone` char(15) CHARACTER SET utf8 COLLATE utf8_unicode_ci NOT NULL,
  `c_question` varchar(30) CHARACTER SET utf8 COLLATE utf8_unicode_ci NOT NULL,
  `c_answer` varchar(30) CHARACTER SET utf8 COLLATE utf8_unicode_ci NOT NULL,
  `c_address` varchar(50) CHARACTER SET utf8 COLLATE utf8_unicode_ci NULL DEFAULT NULL,
  `c_email` varchar(50) CHARACTER SET utf8 COLLATE utf8_unicode_ci NOT NULL,
  PRIMARY KEY (`c_name`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_unicode_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of customer
-- ----------------------------
INSERT INTO `customer` VALUES ('ebuytest', 'ebuytest', '..imagesfaceImage1.gif', '07338208290', '你最喜欢的人是?', '刘津', '湖南株洲', 'ebuy@163.com');
INSERT INTO `customer` VALUES ('jiaran', '123456', '..imagesfaceImage1.gif', '17568182434', '你最喜欢的人是?', '111', '111', 'jiansshang@qq.com');
INSERT INTO `customer` VALUES ('liujin0414', '990414', '..imagesfaceImage23.gif', '07336188290', '你最喜欢的人是?', '老爸', '湖南株洲', 'liujin@163.com');
INSERT INTO `customer` VALUES ('liuzc518', 'liuzc518', '..imagesfaceImage1.gif', '8208290', '你最喜欢的人是?', '刘津', '湖南株洲', 'liuzc518@163.com');
INSERT INTO `customer` VALUES ('null', '', '..imagesfaceImage1.gif', '', '', '', '', '');
INSERT INTO `customer` VALUES ('tangzy', 'nihao', '..imagesfaceImage37.gif', '8888888', '你最喜欢的人是?', '爸爸', '湖南株洲', 'tangzy@sohu.com');
INSERT INTO `customer` VALUES ('wuhaibo', 'wuhaibo', '..imagesfaceImage26.gif', '13246579845', '你最喜欢的一部电影是?', '真实的谎言', '湖南湘潭', 'wu2bo@sina.com');

-- ----------------------------
-- Table structure for idea
-- ----------------------------
DROP TABLE IF EXISTS `idea`;
CREATE TABLE `idea`  (
  `id` char(10) CHARACTER SET utf8 COLLATE utf8_unicode_ci NOT NULL,
  `c_name` varchar(30) CHARACTER SET utf8 COLLATE utf8_unicode_ci NOT NULL,
  `c_header` varchar(30) CHARACTER SET utf8 COLLATE utf8_unicode_ci NOT NULL,
  `new_message` varchar(1000) CHARACTER SET utf8 COLLATE utf8_unicode_ci NOT NULL,
  `re_message` varchar(1000) CHARACTER SET utf8 COLLATE utf8_unicode_ci NULL DEFAULT NULL,
  `new_time` char(15) CHARACTER SET utf8 COLLATE utf8_unicode_ci NOT NULL,
  `re_time` char(15) CHARACTER SET utf8 COLLATE utf8_unicode_ci NULL DEFAULT NULL
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_unicode_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of idea
-- ----------------------------
INSERT INTO `idea` VALUES ('447', 'tangzy', '..imagesfaceImage5.gif', '海尔商品很好', '感谢支持', '7:14 3-28-2008', '7:43 3-28-2008');
INSERT INTO `idea` VALUES ('326', 'tangzy', '..imagesfaceImage37.gif', '快来买啊', '好啊', '7:40 3-28-2008', '7:43 3-28-2008');
INSERT INTO `idea` VALUES ('644', 'liuzc', '..imagesfaceImage19.gif', '服务很好', '谢谢!', '10:15 3-27-2008', '7:43 3-28-2008');

-- ----------------------------
-- Table structure for main_type
-- ----------------------------
DROP TABLE IF EXISTS `main_type`;
CREATE TABLE `main_type`  (
  `t_id` char(10) CHARACTER SET utf8 COLLATE utf8_unicode_ci NOT NULL,
  `t_type` varchar(30) CHARACTER SET utf8 COLLATE utf8_unicode_ci NOT NULL,
  PRIMARY KEY (`t_type`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_unicode_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of main_type
-- ----------------------------
INSERT INTO `main_type` VALUES ('368', '厨卫系列');
INSERT INTO `main_type` VALUES ('341', '洗衣机系列');
INSERT INTO `main_type` VALUES ('290', '电脑专区');
INSERT INTO `main_type` VALUES ('187', '电视机系列');
INSERT INTO `main_type` VALUES ('292', '神');

-- ----------------------------
-- Table structure for notice
-- ----------------------------
DROP TABLE IF EXISTS `notice`;
CREATE TABLE `notice`  (
  `n_id` char(10) CHARACTER SET utf8 COLLATE utf8_unicode_ci NOT NULL,
  `n_message` char(255) CHARACTER SET utf8 COLLATE utf8_unicode_ci NOT NULL,
  `n_admin` char(30) CHARACTER SET utf8 COLLATE utf8_unicode_ci NOT NULL,
  `n_header` varchar(50) CHARACTER SET utf8 COLLATE utf8_unicode_ci NOT NULL,
  `n_time` char(10) CHARACTER SET utf8 COLLATE utf8_unicode_ci NOT NULL
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_unicode_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of notice
-- ----------------------------
INSERT INTO `notice` VALUES ('884', '圣诞团队活动,优惠多多...', 'tangzy', 'imagesfaceImage28.gif', '12-16-2008');
INSERT INTO `notice` VALUES ('489', '各种家电超低价销售!!!', 'tangzy', 'imagesfaceImage28.gif', '3-17-2008');
INSERT INTO `notice` VALUES ('181', '迎新年,数码产品特惠!~', 'tangzy', 'imagesfaceImage28.gif', '8-17-2008');
INSERT INTO `notice` VALUES ('086', '海信液晶电视重拳出击！~呵呵...', 'tangzy', 'imagesfaceImage28.gif', '6-19-2008');
INSERT INTO `notice` VALUES ('528', '祝各位会员牛年大吉,牛气冲天!', 'tangzy', 'imagesfaceImage28.gif', '1-17-2009');

-- ----------------------------
-- Table structure for orderdetails
-- ----------------------------
DROP TABLE IF EXISTS `orderdetails`;
CREATE TABLE `orderdetails`  (
  `order_id` char(10) CHARACTER SET utf8 COLLATE utf8_unicode_ci NOT NULL,
  `p_id` char(10) CHARACTER SET utf8 COLLATE utf8_unicode_ci NOT NULL,
  `p_price` float NOT NULL,
  `p_number` int NOT NULL,
  INDEX `fk_id`(`order_id` ASC) USING BTREE,
  CONSTRAINT `fk_id` FOREIGN KEY (`order_id`) REFERENCES `orders` (`order_id`) ON DELETE RESTRICT ON UPDATE RESTRICT
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_unicode_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of orderdetails
-- ----------------------------
INSERT INTO `orderdetails` VALUES ('0117483494', 'xy0002', 4928, 1);
INSERT INTO `orderdetails` VALUES ('0117483494', 'xy0003', 2390, 1);
INSERT INTO `orderdetails` VALUES ('0117483494', 'xy0004', 1985, 1);
INSERT INTO `orderdetails` VALUES ('0117483494', 'xy0005', 3058, 1);
INSERT INTO `orderdetails` VALUES ('0117483494', 'xy0006', 1142, 1);
INSERT INTO `orderdetails` VALUES ('9996374742', 'Bp0001', 5998, 2);
INSERT INTO `orderdetails` VALUES ('9996374742', 'xy0010', 5478, 1);
INSERT INTO `orderdetails` VALUES ('9996374742', 'tv0014', 1890, 1);
INSERT INTO `orderdetails` VALUES ('7083902532', 'cp0001', 7000, 10);
INSERT INTO `orderdetails` VALUES ('7350963892', 'tv0013', 4899, 1);
INSERT INTO `orderdetails` VALUES ('7350963892', 'cw0018', 2728, 2);
INSERT INTO `orderdetails` VALUES ('7350963892', 'xy0002', 4928, 1);

-- ----------------------------
-- Table structure for orders
-- ----------------------------
DROP TABLE IF EXISTS `orders`;
CREATE TABLE `orders`  (
  `order_id` char(10) CHARACTER SET utf8 COLLATE utf8_unicode_ci NOT NULL,
  `order_payment` varchar(100) CHARACTER SET utf8 COLLATE utf8_unicode_ci NOT NULL,
  `order_address` varchar(200) CHARACTER SET utf8 COLLATE utf8_unicode_ci NOT NULL,
  `order_email` varchar(50) CHARACTER SET utf8 COLLATE utf8_unicode_ci NOT NULL,
  `order_user` varchar(30) CHARACTER SET utf8 COLLATE utf8_unicode_ci NOT NULL,
  `order_time` varchar(30) CHARACTER SET utf8 COLLATE utf8_unicode_ci NOT NULL,
  `order_sum` float NOT NULL,
  PRIMARY KEY (`order_id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_unicode_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of orders
-- ----------------------------
INSERT INTO `orders` VALUES ('0117483494', '银行付款', '湖南株洲', 'tangzy@sohu.com', 'tangzy', '3-20-2005', 13503);
INSERT INTO `orders` VALUES ('7083902532', '在线支付', '湖南株洲', 'tangzy@.com', 'tangzy', '3-28-2005', 70000);
INSERT INTO `orders` VALUES ('7350963892', '银行支付', '湖南铁道职业技术学院信息工程系', 'liuzc518@163.com', 'liujin0414', '1-20-2009', 15283);
INSERT INTO `orders` VALUES ('9996374742', '银行支付', '湖南株洲', 'ebuy@163.com', 'ebuytest', '1-20-2009', 19364);

-- ----------------------------
-- Table structure for payment
-- ----------------------------
DROP TABLE IF EXISTS `payment`;
CREATE TABLE `payment`  (
  `pay_id` char(10) CHARACTER SET utf8 COLLATE utf8_unicode_ci NOT NULL,
  `pay_payment` varchar(50) CHARACTER SET utf8 COLLATE utf8_unicode_ci NOT NULL,
  `pay_msg` varchar(500) CHARACTER SET utf8 COLLATE utf8_unicode_ci NULL DEFAULT NULL
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_unicode_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of payment
-- ----------------------------
INSERT INTO `payment` VALUES ('439', '银行支付', '请记住帐号：1324659831221656');
INSERT INTO `payment` VALUES ('091', '在线支付', 'www.easybuyonline.com\r\n');

-- ----------------------------
-- Table structure for product
-- ----------------------------
DROP TABLE IF EXISTS `product`;
CREATE TABLE `product`  (
  `p_type` varchar(30) CHARACTER SET utf8 COLLATE utf8_unicode_ci NOT NULL,
  `p_id` char(10) CHARACTER SET utf8 COLLATE utf8_unicode_ci NOT NULL,
  `p_name` varchar(40) CHARACTER SET utf8 COLLATE utf8_unicode_ci NOT NULL,
  `p_price` float NOT NULL,
  `p_quantity` int NOT NULL,
  `p_image` varchar(100) CHARACTER SET utf8 COLLATE utf8_unicode_ci NOT NULL,
  `p_description` varchar(2000) CHARACTER SET utf8 COLLATE utf8_unicode_ci NOT NULL,
  `p_time` varchar(20) CHARACTER SET utf8 COLLATE utf8_unicode_ci NULL DEFAULT NULL,
  PRIMARY KEY (`p_id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_unicode_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of product
-- ----------------------------
INSERT INTO `product` VALUES ('电脑专区', 'Bp0001', '海尔A62-T20', 5998, 8, 'imagescomputer1.jpg', '暂无说明', '3-27-2007');
INSERT INTO `product` VALUES ('电脑专区', 'cp0002', '海尔A60-430', 4998, 4, 'imagescomputer2.jpg', '极速润清 简约至爱\r\n14.1英寸润清宽屏,惊艳亮丽画质\r\n超强核心,动力提升\r\n分置式音响,影院级震撼\r\n下沉式转轴设计\r\n无卡钩自动合屏,简约时尚\r\n楔形上盖设计,开合自如\r\n下沉式转轴设计\r\n一体化触控板,贴心美观 ', '3-18-2005');
INSERT INTO `product` VALUES ('电脑专区', 'cp0003', '海尔W36-T56', 12998, 17, 'imagescomputer3.jpg', '防静电铝镁合金外壳，轻至1.68kg\r\n极速千兆网卡\r\n经典13.3英寸润清宽屏\r\n超级独立显卡Go7400\r\n优秀的风道设计，散热效率更高\r\n内置高清摄像头\r\n触控板一体式设计\r\n无线网卡快捷键设计\r\n经典商务银黑色，古朴而典雅 ', '3-18-2005');
INSERT INTO `product` VALUES ('电脑专区', 'cp0004', '海尔8010-G001 ', 7499, 20, 'imagescomputer4.jpg', '性能稳定，简单易用：75000小时无故障运行，直流变频散热技术，一键快速恢复给您解决一切后顾之忧；\r\n领先配置，全面无忧：海尔独有的速启技术、纳税筹划平台、无忧上网功能给您提供一种全面无忧的工作空间；\r\n环保健康，节能降噪：润眼、负离子健康科技、全封闭面板设计、人体工学超薄键盘为您打造健康的工作平台。\r\n海尔天龙系列商用机，让学校、机关单位和中小企业快速驶上信息化高速公路。\r\n通过整合优化的、国际化的供应商，采用成熟的、可靠的零部件，打造出性能如装甲车一样稳定、可靠的天龙系列商用机。\r\n海尔天龙系列商用机的“忙闲分段供电系统”，电脑在不用的情况下直接转化为节能状态，既不影响正常学习、办公使用，又帮用户节省每一分钱!\r\n海尔电脑独有的“快速恢复”功能，快速、便捷又安全，操作简便，不需要专业人员，轻松一键，恢复数据。\r\n海尔天龙系列商用机提供专业的财税筹划解决方案，六大功能为中小企业的合理纳税保驾护航，这也是学校、机关单位财务工作和财税筹划教学的一个强有力的武器。 ', '3-18-2005');
INSERT INTO `product` VALUES ('电脑专区', 'cp0005', '华硕A8HS32M-DR', 7599, 20, 'imagescomputer5.jpg', '暂无说明', '3-17-2005');
INSERT INTO `product` VALUES ('电脑专区', 'cp0006', '神舟新瑞S300D', 3029, 20, 'imagescomputer6.jpg', '  新一代节能、环保电脑上市，采用笔记本的移动处理器，通过超频技术将处理器性能得到更大的提升，而且最低功耗仅25W，静音、降噪，配15.4寸宽屏液晶仅2999元，震撼上市！', '3-17-2005');
INSERT INTO `product` VALUES ('电脑专区', 'cp0007', '海尔H3000-G002 ', 7899, 20, 'imagescomputer7.jpg', '人性化设计：静音设计，让您拥有安静的工作环境；多功能设计，多媒体、上网、游戏、工作等，从视觉和听觉上获得更佳的享受；人性化设计的前置高速USB2.0和音效接口，方便易用前置常用接口，让你无需为外设转接而烦恼，让你的生活与工作更轻松、更灵活、更方便；单键记忆恢复功能，系统崩溃无烦恼，让系统运行更稳定、数据更安全。', '3-17-2005');
INSERT INTO `product` VALUES ('电脑专区', 'cp0008', '海尔W12-T225', 8998, 20, 'imagescomputer8.jpg', '产品分类：笔记本电脑\r\n产品型号：W12-T22512080BaW\r\n屏幕大小：12.1寸宽屏液晶\r\nCPU类型：酷睿双核T2250\r\n硬盘容量：80G ', '3-17-2005');
INSERT INTO `product` VALUES ('电脑专区', 'cp0009', '海尔W36-T22', 8598, 20, 'imagescomputer9.jpg', '产品分类：笔记本电脑\r\n产品型号：W36-T22512080BaWG\r\n屏幕大小：13.3寸宽屏\r\nCPU类型：酷睿双核T2250\r\n硬盘容量：80G ', '3-18-2005');
INSERT INTO `product` VALUES ('电脑专区', 'cp0010', '海尔H32笔记本电脑', 7298, 20, 'imagescomputer10.jpg', '润清独显,极速魅力\r\n极速双核动力,整体性能提高68%（较上代平台）\r\n独立显卡X300\r\n高清200万像素摄像头\r\n不凡配色，时尚造型\r\n造型独特的立体声音响\r\n低噪低功耗硬盘，贴心保护数据安全\r\n动感触控板，独立方向键\r\n超大散热空间加智能线性风扇 ', '3-16-2005');
INSERT INTO `product` VALUES ('电脑专区', 'cp0011', '海尔W18笔记本电脑 ', 6798, 20, 'imagescomputer11.jpg', '12.1英寸润清宽屏 惊艳亮丽画质\r\n双核强动力 系统整体性能跃升68％\r\n隐藏式转轴设计,开合自如\r\n易读指示灯设计，主要部件运行状态一目了然\r\n易拉式网卡插口，使用方便\r\n金属质感触控板，采用防磨损设计\r\n内置一体式四合一读卡器，防尘美观\r\n特设无线网络开关，一键切换 ', '3-16-2005');
INSERT INTO `product` VALUES ('电脑专区', 'cp0012', '海尔H8台式电脑', 29999, 20, 'imagescomputer12.jpg', 'CPU类型：英特尔 QX6700 四核处理器\r\n硬盘容量：250\r\n内存：2G ', '3-16-2005');
INSERT INTO `product` VALUES ('电脑专区', 'cp0013', '海尔H30笔记本电脑', 5998, 20, 'imagescomputer13.jpg', '奔腾芯+独显\r\n经典游戏机型\r\nATI超极独立显卡\r\n高清200万像素摄像头\r\nMTBF4万小时认证测试\r\n大键程键盘，长期使用不疲劳\r\n磨砂耐磨表面，不怕硬物划伤\r\n易用性触控板，操控得心应手\r\n专业铰链式转轴，阻尼设计工艺 ', '3-16-2005');
INSERT INTO `product` VALUES ('电脑专区', 'cp0014', 'EC笔记本电脑', 5999, 20, 'imagescomputer14.jpg', '可选颜色：银灰色\r\nCPU:AMD 3100+\r\n内存:256M DDRII\r\n硬盘:80G\r\n屏幕:15.4寸炫丽屏', '3-16-2005');
INSERT INTO `product` VALUES ('电脑专区', 'cp0015', '长城计算机', 49999, 20, 'imagescomputer15.jpg', 'CPU 英特尔&reg;奔腾&reg;D处理器820（双核2.8 GHz、90纳米、2*1 MB二级高速缓存、800 MHz前端系统总线、LGA775封装、EM64T、硬件防病毒）\r\n\r\n内存条 512MDDRII\r\n硬盘 SATA 80G-7200转\r\n光驱 DVD\r\n显示卡 集成PCIE Xpress200显卡可扩展PCI－E16X显卡\r\n声卡 集成\r\n网卡 10-100M网卡\r\n显示器 17\"液晶\r\n\r\n键盘 超薄键盘\r\n鼠标 光电鼠标\r\n软件 长城媒体中心/长城救护中心/杀毒软件', '3-16-2005');
INSERT INTO `product` VALUES ('电脑专区', 'cp0016', '海尔速启锋V6010', 9999, 20, 'imagescomputer16.jpg', '产品型号：速启锋V6010\r\nCPU类型：Pentium D 820\r\n硬盘容量：80G\r\n内存：1 G ', '3-16-2005');
INSERT INTO `product` VALUES ('电脑专区', 'cp0017', '海尔旅行者8260M ', 6799, 20, 'imagescomputer17.jpg', '可选颜色：实物\r\nHT-17606 海尔17寸液晶显示器\r\n\r\nCPU      英特尔&reg;奔腾&reg;D处理器820(处理器速度2.8GHz、64位,双核CPU)\r\n内存      512M DDR2 533内存\r\n硬盘      80G (7200转)硬盘\r\n软驱      --\r\n光驱      DVD\r\n显卡      FX5200 128M显卡\r\n多媒体      集成网卡、声卡\r\n通信网络      --\r\n操作系统      WI XP(H)\r\n显示器      海尔17寸液晶显示器\r\n其它      超薄多媒体键盘/光电鼠 ', '3-16-2005');
INSERT INTO `product` VALUES ('厨卫系列', 'cw0001', '海尔 KCD-X11', 599, 19, 'imagesother1.jpg', '厨房专用热水器\r\n\r\n防电墙技术，确保不安全用电环境下的洗浴安全\r\n\r\n精确温控器，达到设定温度自动断电\r\n\r\n卫生级别塑料内胆，防腐耐用，干净卫生\r\n\r\n可以安装在水槽下，节省空间\r\n\r\n防电墙技术，专门针对中国普遍存在的接地不可靠、装修接错线等环境漏电问题设计的防电墙技术，杜绝正、逆向漏电\r\n\r\n高效英格莱不锈钢加热管，快速加热\r\n\r\n卫生级别塑料内胆，防腐耐用，干净卫生\r\n\r\n上出水设计，可安装在橱柜内或水槽下，不占有效空间\r\n\r\n方形弧线外观，美观大方\r\n\r\n超温保护，内胆超压保护', '3-18-2005');
INSERT INTO `product` VALUES ('厨卫系列', 'cw0002', '美的FY08PB-A（GZ）', 908, 17, 'imagesother4.jpg', '暂无说明', '3-18-2005');
INSERT INTO `product` VALUES ('厨卫系列', 'cw0003', '海尔JSQ16-RTC', 2519, 19, 'imagesother3.jpg', '产品分类：燃气热水器\r\n产品型号：JSQ16-RTC(遥控)(12T)\r\n排烟方式：强排式\r\n额定输入功率(W)：42\r\n热水产率(L/min)：8 ', '3-18-2005');
INSERT INTO `product` VALUES ('厨卫系列', 'cw0004', '美的FY08PB-A', 908, 20, 'imagesother4.jpg', '产品分类：果蔬消毒净化机\r\n产品型号：FY08PB-A（GZ）\r\n清洗容量：8升\r\n外型尺寸：420x350x320MM\r\n功 率：100W ', '3-18-2005');
INSERT INTO `product` VALUES ('厨卫系列', 'cw0005', 'CXW-180-20', 1108, 20, 'imagesother5.jpg', '产品分类：抽油烟机\r\n产品型号：CXW-180-20(风尚A）\r\n产品类型：电子式\r\n噪音dB(A)：小于100Pa\r\n排风量：15—19 立方米/min ', '3-18-2005');
INSERT INTO `product` VALUES ('厨卫系列', 'cw0006', '海尔FCD-HM60CI', 1930, 20, 'imagesother6.jpg', '产品型号：FCD-HM60CI（E）\r\n加热方式：电热水器\r\n最大容积（L）：60\r\n最大加热功率（w）：1500 ', '3-18-2005');
INSERT INTO `product` VALUES ('厨卫系列', 'cw0007', '海尔MI-2270MG', 456, 20, 'imagesother7.jpg', '产品型号：MI-2270MG(VC)\r\n输出功率（w）：700\r\n容积（L）：21\r\n加热类型：光波', '3-18-2005');
INSERT INTO `product` VALUES ('厨卫系列', 'cw0009', '爱德SCD15电饭煲', 145, 9, 'imagesother12.jpg', '产品型号：SCD15电子瓦锅\r\n内胆材质：紫砂\r\n最大容积（L）：1.5\r\n最大功率（w）：150 ', '3-18-2005');
INSERT INTO `product` VALUES ('厨卫系列', 'cw0010', '爱德SC电热水煲', 118, 19, 'imagesother13.jpg', '产品型号：SC135B\r\n材质：食品级塑料\r\n容量：1.0\r\n功率：1350 ', '3-18-2005');
INSERT INTO `product` VALUES ('厨卫系列', 'cw0011', '爱德LD豆浆机', 220, 20, 'imagesother14.jpg', '可选颜色：黄色\r\n全自动煮豆浆，具有保温功能\r\n可免泡豆（一杯干豆100克）', '3-16-2005');
INSERT INTO `product` VALUES ('厨卫系列', 'cw0012', '爱德ZZ18A榨汁机', 135, 19, 'imagesother15.jpg', '产品型号：ZZ18A\r\n最大功率（w） ：220\r\n容量：750ml\r\n材质：金属滤网', '3-16-2005');
INSERT INTO `product` VALUES ('厨卫系列', 'cw0013', '电烤箱', 240, 20, 'imagesother16.jpg', '可选颜色：银灰色\r\n可调式温控器，温度可自由调节\r\n60分钟内自由调节时间长短\r\n带烧烤盘，烧烤架\r\n烧烤，烘培功能\r\n耐热玻璃门\r\n容易清洗\r\n可拆卸式清洁盘\r\n加热方式独特，可选择上管加热、下管加热、上下管同时', '3-16-2005');
INSERT INTO `product` VALUES ('厨卫系列', 'cw0014', '电压力锅', 440, 20, 'imagesother17.jpg', '智能型电气锅(全塑盖不锈钢) ●容量5L,功率900W\r\n●10重安全保护装置，使用更放心\r\n●煮、煲、炖、焖，烹饪功能更齐全\r\n●磨砂不锈钢外壳，时尚大方\r\n●电脑型按键菜单烹饪功能，更直观，方便，高档\r\n●超厚黑晶不粘内胆，导热更好，清洗方便\r\n●自动加压保压，无需人工干预\r\n●工作过程不冒热气，热效率极高，非常省电\r\n●24小时预约定时功能，使用更省心\r\n●具有防烫功能', '3-16-2005');
INSERT INTO `product` VALUES ('厨卫系列', 'cw0015', '万和ZLD46-5消毒柜', 699, 20, 'imagesother18.jpg', '★先进的数码控制，充分发挥数字控制更快速、更精确的优势，消毒更彻底。\r\n\r\n★大屏幕VFD动态显示屏，工作状态清清楚楚。\r\n\r\n★强力臭氧与高效紫外线二种杀菌方式，消毒效果达国标星级要求。\r\n\r\n★PTC循环热风烘干，保证消毒室内处于干燥无菌状态。\r\n\r\n★高密度聚氨脂整体发泡，行业独有，保温效果好，节能省电。\r\n\r\n★全不锈钢内胆及层架，永保消毒室的纯净品质。\r\n\r\n★具有过热、超载、风机故障等多重安全保护装置，使用无忧。\r\n\r\n产品参数：\r\n    系列名称：数码屏显系列消毒柜', '3-16-2005');
INSERT INTO `product` VALUES ('厨卫系列', 'cw0016', '电火锅', 139, 19, 'imagesother19.jpg', '可选颜色：银灰色\r\nA120T3\r\n豪华电热不粘火锅\r\n\r\n容量:2.5L,功率1300W\r\n分体式底部发热,热效率更高\r\n体积小,容量大\r\n无级调温模式\r\n装有超温保护装置,安全可靠\r\n造型美观新颖,高雅大方\r\n分体结构,清洗方便\r\n', '3-16-2005');
INSERT INTO `product` VALUES ('厨卫系列', 'cw0017', '万和超薄电热水器', 1520, 20, 'imagesother20.jpg', '产品参数：\r\n    系列名称：H型超薄系列\r\n    产品型号：DSZF50-H\r\n    外型尺寸（mm）：855*376*260\r\n    额定功率(W)：1500\r\n    容积(L)：50\r\n    水温调节范围：30℃-75℃', '3-16-2005');
INSERT INTO `product` VALUES ('厨卫系列', 'cw0018', '海尔XQG52', 2728, 3, 'imageswashing19.jpg', '极限设计 减薄不减量\r\n自选挡功能：不同洗涤情况，可以设置不同洗涤档位，通过优化洗涤程序，缩短洗衣时间，减少用水量\r\n40公分超薄，5.2公斤大容量。极限超薄设计，符合家居简约格调，为你的居所节省更多写意空间，整体嵌入设计为生活省出更多空间\r\n各种面料智能洗涤,强大功能软件优化各项洗涤参数，全面料洗涤程序, 为现代家庭提供更多选择 ', '3-21-2005');
INSERT INTO `product` VALUES ('电视机系列', 'tv0001', '创维TFT32L16SW', 5999, 20, 'imagesTV1.jpg', '可选颜色：浅绿色\r\n六基色图像处理技术\r\nV12数字引擎\r\nBlue wave无线蓝波\r\n超稳USB流媒体技术\r\n画中画、双视窗\r\n高亮度600cd/m2\r\n超高动态对比度3000:1\r\n超快响应时间6ms\r\n超宽可视角度178°\r\n物理分辨率1366x768\r\n超高支持分辨率1920x1200\r\nHDMI高清晰多媒体端口 ', '3-18-2005');
INSERT INTO `product` VALUES ('电视机系列', 'tv0006', 'LG42LC2RR', 13500, 20, 'imagesTV6.jpg', '暂无说明', '3-17-2005');
INSERT INTO `product` VALUES ('电视机系列', 'tv0007', 'LG50PC1R', 21900, 20, 'imagesTV7.jpg', '产品分类：等离子\r\n产品型号：50PC1R\r\n显示器尺寸：50英寸\r\n屏幕比例：16:9\r\n扫描方式：逐行', '3-17-2005');
INSERT INTO `product` VALUES ('电视机系列', 'tv0008', '夏新LC-37M1', 8999, 20, 'imagesTV8.jpg', '产品分类：液晶\r\n产品型号：LC-37M1\r\n显示器尺寸：37寸\r\n屏幕比例：16:9\r\n分辨率：1366*768 ', '3-17-2005');
INSERT INTO `product` VALUES ('电视机系列', 'tv0009', 'LC-47V1P', 19999, 20, 'imagesTV9.jpg', '产品分类：液晶\r\n产品型号：V系列 LC-47V1P\r\n显示器尺寸：47寸\r\n屏幕比例：16:9\r\n分辨率：1920*1080 ', '3-17-2005');
INSERT INTO `product` VALUES ('电视机系列', 'tv0010', 'LC-46W1液晶', 13999, 20, 'imagesTV10.jpg', '可选颜色：黑色\r\n功能\r\n\r\n1. BT院线功能\r\n2. 双核芯高清影像技术\r\n3. 数码相框\r\n4. 低音锤高保真音响系统\r\n5. 游戏模式\r\n6. 2HDMI\r\n7. 2USB\r\n8. 闭画听音\r\n9. 静像功能\r\n10. 无风扇设计\r\n11. 升级接口', '3-16-2005');
INSERT INTO `product` VALUES ('电视机系列', 'tv0011', 'LC-27K1液晶', 4499, 20, 'imagesTV11.jpg', '可选颜色：黑色\r\n功能\r\n\r\n1. 双核芯高清影像技术\r\n2. 低音锤高保真音响系统\r\n3. HDMI 数字高清一线通\r\n4. 闭画听音\r\n5. 童锁\r\n6. 无风扇设计\r\n7. 升级接口\r\n ', '3-16-2005');
INSERT INTO `product` VALUES ('电视机系列', 'tv0012', '海尔21FV纯平', 999, 20, 'imagesTV12.jpg', '海尔数字护眼电视 超强接收 超级节能\r\n数字全程护眼\r\n数字清晰显像\r\n健康节能环保\r\n数字拉幕，护眼护屏更健康\r\n数字换台，自然过渡不晃眼\r\n数字接收，数字搜台更清晰\r\n数字节能，超级节能更省电\r\n', '3-16-2005');
INSERT INTO `product` VALUES ('电视机系列', 'tv0013', '海尔D32FA纯平', 4899, 10, 'imagesTV13.jpg', '海尔流媒体电视 3A 高清1200P\r\n海尔流媒体电视 3A 高清1200P\r\n数字3A优化，高清画面看得见\r\nV5.1声道剧场音效\r\n3A高清1200P,405兆高速采样率\r\n3A滤光与3A均衡器\r\n逐点晶晰扫描  ', '3-19-2005');
INSERT INTO `product` VALUES ('电视机系列', 'tv0014', '熊猫29HD纯平', 1890, 17, 'imagesTV14.jpg', '可选颜色：魅影黑 冰乳白\r\n魅影黑、冰乳白罩光经典时尚外观\r\n支持高清1080P/1080i/720P/576P/480P\r\n60P、75i、75P多种扫描模式\r\nPC显示：VGA/SVGA/XGA\r\nD M T数字微显技术，622万像素完美呈现\r\n数字运动补偿及黑电平延伸技术\r\n3：2/2：2 PULL DOW电影再现\r\n彩色和亮度瞬间改善电路、动态降噪功能\r\n图像静止、慢放动态存储技术\r\n定格、黑屏两种换台模式\r\n个人、标准、亮丽、柔和四种图像模式\r\n剧场、音乐、新闻、个人四种音效模式\r\nDVD分量输入，YPbPr/YCbCr兼容\r\nS端子输入、AV输入、AV输出\r\n8大核心技术、8大超值功能\r\n童锁、无信号屏保、益智游戏 ', '3-19-2005');
INSERT INTO `product` VALUES ('电视机系列', 'tv0015', '熊猫29HD88T纯平', 1790, 19, 'imagesTV15.jpg', '可选颜色：魅影黑 冰乳白\r\n魅影黑、冰乳白罩光经典时尚外观\r\nDMT数字微显技术\r\n支持1080i/50、1080i/60高清显示\r\n16Bit微处理器\r\n锐像（VM）鲜锐画质倍增技术\r\n“天韵”环绕音响系统\r\n2组YPbPr/YcbCr输入\r\n童锁、益智游戏、日历查询', '3-19-2005');
INSERT INTO `product` VALUES ('电视机系列', 'tv0414', '长虹888', 6600, 60, 'images	vcc.gif', '最新上市', '2-8-2009');
INSERT INTO `product` VALUES ('电视机系列', 'tv0518', '海信V56', 5600, 30, 'images	vb.gif', '热销商品,性价比高', '2-7-2009');
INSERT INTO `product` VALUES ('洗衣机系列', 'xy0002', '海尔XQG52全自动', 4928, 15, 'imageswashing2.jpg', '高清触摸液晶屏 智控全程\r\n1-5KG衣量自选功能:不同重量衣物选择不同水位洗衣.用水用电控制更加精确。5.2公斤洗衣大容量，减少磨损，舒展衣物，许多以前无法洗的大件衣物，现在也能一次洗完\r\n超大高清液晶屏，洗涤状态动感显示，随时知道洗涤状态。够酷够眩\r\n40公分超薄，5.2公斤大容量。极限超薄设计，符合家居简约格调，为你的居所节省更多写意空间，整体嵌入设计为生活省出更多空间\r\n', '3-19-2005');
INSERT INTO `product` VALUES ('洗衣机系列', 'xy0003', '海尔双动力', 2390, 19, 'imageswashing3.jpg', '海尔双动力 一刻钟就洗好\r\n洗得净、漂得净\r\n低磨损、无缠绕\r\n省水、省电 ', '3-19-2005');
INSERT INTO `product` VALUES ('洗衣机系列', 'xy0004', '海尔X小神童', 1985, 19, 'imageswashing4.jpg', '海尔手搓式洗衣机 洗得净又磨损低\r\n透明视窗，洗涤过程一目了然\r\n不怕水，防生锈\r\n如同手搓衣物，带来手洗效果\r\n手搓式技术，波轮与内桶反向旋转，产生的水流形状就如同手搓衣物\r\n盆型大波轮专利结构，大波轮对水的带动力更强，同时凹进的盆型，减少衣物和波轮直接接触，降低了磨损率\r\n智能控制技术：满足多种衣物洗涤要求，能自动感知衣料及衣物重量，智能编程，自动为您要洗的衣物选择洗衣时间、用水量及用电量等\r\n“桶干燥”功能，内桶高速旋转时产生的风来干燥内外桶，防止滋生霉菌\r\n“自编程”洗衣机，用户可根据需要自行设定漂、脱次数，浸泡、洗涤、脱水时间 ', '3-19-2005');
INSERT INTO `product` VALUES ('洗衣机系列', 'xy0005', '海尔XQS60-78保健型', 3058, 18, 'imageswashing5.jpg', '海尔保健双动力 消毒洗衣 干净彻底\r\n洗得净、漂得净\r\n低磨损、无缠绕\r\n省水、省电 ', '3-19-2005');
INSERT INTO `product` VALUES ('洗衣机系列', 'xy0006', '海尔X小小神童', 1142, 8, 'imageswashing6.jpg', '内衣外衣分开洗 小件衣物及时洗\r\n透明上盖，洗涤过程一目了然\r\n不怕水，永不生锈\r\n如同手搓衣物，带来手洗效果\r\n手搓式技术，波轮与内桶反向旋转，产生的水流形状就如同手搓衣物\r\n进口材料，经久耐用\r\n两遍洗程序，全面瓦解污渍，提高洗净度\r\n特设羊毛洗程序，可以洗涤毛制品或内衣\r\n音乐提醒功能，增加洗衣乐趣\r\n ', '3-19-2005');
INSERT INTO `product` VALUES ('洗衣机系列', 'xy0007', '海尔XQB50', 1086, 20, 'imageswashing8.jpg', '进口材料 经济耐用\r\n性价比高，经济实惠\r\n不怕水，防生锈\r\n十分钟速洗，节水节能\r\n智能控制技术：满足多种衣物洗涤要求，能自动感知衣料及衣物重量，智能编程，自动为您要洗的衣物选择洗衣时间、用水量及用电量等\r\n数码管显示，显示剩余时间和预约时间\r\n排水电机静音设计，全过程享受安静\r\n十分钟速洗是指少量轻污衣物可以在十分钟内完成洗涤、漂洗、脱水全过程，最大限度的加快洗衣速度，提高效率\r\n预约功能，方便实用 ', '3-19-2005');
INSERT INTO `product` VALUES ('洗衣机系列', 'xy0009', '海尔XQB50-18', 1725, 10, 'imageswashing9.jpg', '海尔手搓式洗衣机 洗得净又磨损低\r\n透明上盖，洗涤过程一目了然\r\n不怕水，防生锈\r\n如同手搓衣物，带来手洗效果\r\n手搓式技术，波轮与内桶反向旋转，产生的水流形状就如同手搓衣物\r\n盆型大波轮专利结构，大波轮对水的带动力更强，同时凹进的盆型，减少衣物和波轮直接接触，降低了磨损率\r\n智能控制，可根据衣物的重量及质量自动选择一种合适的程序\r\n“自编程”洗衣机，用户可根据需要自行设定漂、脱次数，浸泡、洗涤、脱水时间\r\n预约功能，方便实用 ', '3-19-2005');
INSERT INTO `product` VALUES ('洗衣机系列', 'xy0010', '海尔XQSB55', 5478, 11, 'imageswashing10.jpg', '暂无说明', '3-21-2005');

-- ----------------------------
-- Table structure for sub_type
-- ----------------------------
DROP TABLE IF EXISTS `sub_type`;
CREATE TABLE `sub_type`  (
  `s_id` char(10) CHARACTER SET utf8 COLLATE utf8_unicode_ci NOT NULL,
  `s_supertype` char(10) CHARACTER SET utf8 COLLATE utf8_unicode_ci NOT NULL,
  `s_name` varchar(30) CHARACTER SET utf8 COLLATE utf8_unicode_ci NOT NULL,
  PRIMARY KEY (`s_id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_unicode_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of sub_type
-- ----------------------------
INSERT INTO `sub_type` VALUES ('1', '187', '海尔');
INSERT INTO `sub_type` VALUES ('2', '187', '松下');
INSERT INTO `sub_type` VALUES ('3', '187', '长虹');
INSERT INTO `sub_type` VALUES ('4', '187', '康佳');
INSERT INTO `sub_type` VALUES ('5', '187', '海信');
INSERT INTO `sub_type` VALUES ('6', '368', '好太太');
INSERT INTO `sub_type` VALUES ('7', '368', '爱妻');
INSERT INTO `sub_type` VALUES ('8', '368', '欧派');
INSERT INTO `sub_type` VALUES ('9', '368', '海尔');

SET FOREIGN_KEY_CHECKS = 1;
