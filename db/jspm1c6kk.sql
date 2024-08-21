-- MySQL dump 10.13  Distrib 5.7.31, for Linux (x86_64)
--
-- Host: localhost    Database: jspm1c6kk
-- ------------------------------------------------------
-- Server version	5.7.31

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `banshuiyewu`
--

DROP TABLE IF EXISTS `banshuiyewu`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `banshuiyewu` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `zhanghao` varchar(200) DEFAULT NULL COMMENT '账号',
  `xingming` varchar(200) DEFAULT NULL COMMENT '姓名',
  `jiaonafeiyong` int(11) DEFAULT NULL COMMENT '缴纳费用',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=1614589651077 DEFAULT CHARSET=utf8 COMMENT='办税业务';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `banshuiyewu`
--

LOCK TABLES `banshuiyewu` WRITE;
/*!40000 ALTER TABLE `banshuiyewu` DISABLE KEYS */;
INSERT INTO `banshuiyewu` VALUES (21,'2021-03-01 08:53:37','账号1','姓名1',0),(22,'2021-03-01 08:53:37','账号2','姓名2',0),(23,'2021-03-01 08:53:37','账号3','姓名3',0),(24,'2021-03-01 08:53:37','账号4','姓名4',0),(25,'2021-03-01 08:53:37','账号5','姓名5',0),(26,'2021-03-01 08:53:37','账号6','姓名6',0),(1614589651076,'2021-03-01 09:07:30','11','11',10);
/*!40000 ALTER TABLE `banshuiyewu` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `baobiao`
--

DROP TABLE IF EXISTS `baobiao`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `baobiao` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `zhanghao` varchar(200) DEFAULT NULL COMMENT '账号',
  `baobiaomingcheng` varchar(200) DEFAULT NULL COMMENT '报表名称',
  `neirong` longtext COMMENT '内容',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=67 DEFAULT CHARSET=utf8 COMMENT='报表';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `baobiao`
--

LOCK TABLES `baobiao` WRITE;
/*!40000 ALTER TABLE `baobiao` DISABLE KEYS */;
INSERT INTO `baobiao` VALUES (61,'2021-03-01 08:53:37','账号1','报表名称1','内容1'),(62,'2021-03-01 08:53:37','账号2','报表名称2','内容2'),(63,'2021-03-01 08:53:37','账号3','报表名称3','内容3'),(64,'2021-03-01 08:53:37','账号4','报表名称4','内容4'),(65,'2021-03-01 08:53:37','账号5','报表名称5','内容5'),(66,'2021-03-01 08:53:37','账号6','报表名称6','内容6');
/*!40000 ALTER TABLE `baobiao` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `config`
--

DROP TABLE IF EXISTS `config`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `config` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `name` varchar(100) NOT NULL COMMENT '配置参数名称',
  `value` varchar(100) DEFAULT NULL COMMENT '配置参数值',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=utf8 COMMENT='配置文件';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `config`
--

LOCK TABLES `config` WRITE;
/*!40000 ALTER TABLE `config` DISABLE KEYS */;
INSERT INTO `config` VALUES (1,'picture1','http://localhost:8080/jspm1c6kk/upload/picture1.jpg'),(2,'picture2','http://localhost:8080/jspm1c6kk/upload/picture2.jpg'),(3,'picture3','http://localhost:8080/jspm1c6kk/upload/picture3.jpg'),(6,'homepage',NULL);
/*!40000 ALTER TABLE `config` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `jiaonashuifei`
--

DROP TABLE IF EXISTS `jiaonashuifei`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `jiaonashuifei` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `zhanghao` varchar(200) NOT NULL COMMENT '账号',
  `xingming` varchar(200) NOT NULL COMMENT '姓名',
  `jiaonafeiyong` int(11) NOT NULL COMMENT '缴纳费用',
  `xiangqing` varchar(200) DEFAULT NULL COMMENT '详情',
  `sfsh` varchar(200) DEFAULT '否' COMMENT '是否审核',
  `shhf` longtext COMMENT '审核回复',
  `ispay` varchar(200) DEFAULT '未支付' COMMENT '是否支付',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=1614589763047 DEFAULT CHARSET=utf8 COMMENT='缴纳税费';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `jiaonashuifei`
--

LOCK TABLES `jiaonashuifei` WRITE;
/*!40000 ALTER TABLE `jiaonashuifei` DISABLE KEYS */;
INSERT INTO `jiaonashuifei` VALUES (31,'2021-03-01 08:53:37','账号1','姓名1',1,'详情1','是','','未支付'),(32,'2021-03-01 08:53:37','账号2','姓名2',2,'详情2','是','','未支付'),(33,'2021-03-01 08:53:37','账号3','姓名3',3,'详情3','是','','未支付'),(34,'2021-03-01 08:53:37','账号4','姓名4',4,'详情4','是','','未支付'),(35,'2021-03-01 08:53:37','账号5','姓名5',5,'详情5','是','','未支付'),(36,'2021-03-01 08:53:37','账号6','姓名6',6,'详情6','是','','未支付'),(1614589763046,'2021-03-01 09:09:22','11','11',10,'','是','','已支付');
/*!40000 ALTER TABLE `jiaonashuifei` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `nashuiren`
--

DROP TABLE IF EXISTS `nashuiren`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `nashuiren` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `zhanghao` varchar(200) NOT NULL COMMENT '账号',
  `mima` varchar(200) NOT NULL COMMENT '密码',
  `xingming` varchar(200) DEFAULT NULL COMMENT '姓名',
  `xingbie` varchar(200) DEFAULT NULL COMMENT '性别',
  `shouji` varchar(200) DEFAULT NULL COMMENT '手机',
  `youxiang` varchar(200) DEFAULT NULL COMMENT '邮箱',
  `shenfenzheng` varchar(200) DEFAULT NULL COMMENT '身份证',
  `chushengnianyue` date DEFAULT NULL COMMENT '出生年月',
  `zhaopian` varchar(200) DEFAULT NULL COMMENT '照片',
  `xiangxidizhi` longtext COMMENT '详细地址',
  PRIMARY KEY (`id`),
  UNIQUE KEY `zhanghao` (`zhanghao`)
) ENGINE=InnoDB AUTO_INCREMENT=1614589550582 DEFAULT CHARSET=utf8 COMMENT='纳税人';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `nashuiren`
--

LOCK TABLES `nashuiren` WRITE;
/*!40000 ALTER TABLE `nashuiren` DISABLE KEYS */;
INSERT INTO `nashuiren` VALUES (11,'2021-03-01 08:53:37','纳税人1','123456','姓名1','男','13823888881','773890001@qq.com','440300199101010001','2021-03-01','http://localhost:8080/jspm1c6kk/upload/nashuiren_zhaopian1.jpg','详细地址1'),(12,'2021-03-01 08:53:37','纳税人2','123456','姓名2','男','13823888882','773890002@qq.com','440300199202020002','2021-03-01','http://localhost:8080/jspm1c6kk/upload/nashuiren_zhaopian2.jpg','详细地址2'),(13,'2021-03-01 08:53:37','纳税人3','123456','姓名3','男','13823888883','773890003@qq.com','440300199303030003','2021-03-01','http://localhost:8080/jspm1c6kk/upload/nashuiren_zhaopian3.jpg','详细地址3'),(14,'2021-03-01 08:53:37','纳税人4','123456','姓名4','男','13823888884','773890004@qq.com','440300199404040004','2021-03-01','http://localhost:8080/jspm1c6kk/upload/nashuiren_zhaopian4.jpg','详细地址4'),(15,'2021-03-01 08:53:37','纳税人5','123456','姓名5','男','13823888885','773890005@qq.com','440300199505050005','2021-03-01','http://localhost:8080/jspm1c6kk/upload/nashuiren_zhaopian5.jpg','详细地址5'),(16,'2021-03-01 08:53:37','纳税人6','123456','姓名6','男','13823888886','773890006@qq.com','440300199606060006','2021-03-01','http://localhost:8080/jspm1c6kk/upload/nashuiren_zhaopian6.jpg','详细地址6'),(1614589550581,'2021-03-01 09:05:50','11','11','11','男','13800138200','','','2021-03-09','http://localhost:8080/jspm1c6kk/upload/1614589545260.jpg','111');
/*!40000 ALTER TABLE `nashuiren` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `nashuishenqing`
--

DROP TABLE IF EXISTS `nashuishenqing`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `nashuishenqing` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `zhanghao` varchar(200) DEFAULT NULL COMMENT '账号',
  `xingming` varchar(200) DEFAULT NULL COMMENT '姓名',
  `gongzi` int(11) DEFAULT NULL COMMENT '工资',
  `shuilv` varchar(200) DEFAULT NULL COMMENT '税率',
  `jiaonafeiyong` varchar(200) DEFAULT NULL COMMENT '缴纳费用',
  `beizhu` varchar(200) DEFAULT NULL COMMENT '备注',
  `sfsh` varchar(200) DEFAULT '否' COMMENT '是否审核',
  `shhf` longtext COMMENT '审核回复',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=1614589743489 DEFAULT CHARSET=utf8 COMMENT='纳税申请';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `nashuishenqing`
--

LOCK TABLES `nashuishenqing` WRITE;
/*!40000 ALTER TABLE `nashuishenqing` DISABLE KEYS */;
INSERT INTO `nashuishenqing` VALUES (41,'2021-03-01 08:53:37','账号1','姓名1',1,'税率1','缴纳费用1','备注1','是',''),(42,'2021-03-01 08:53:37','账号2','姓名2',2,'税率2','缴纳费用2','备注2','是',''),(43,'2021-03-01 08:53:37','账号3','姓名3',3,'税率3','缴纳费用3','备注3','是',''),(44,'2021-03-01 08:53:37','账号4','姓名4',4,'税率4','缴纳费用4','备注4','是',''),(45,'2021-03-01 08:53:37','账号5','姓名5',5,'税率5','缴纳费用5','备注5','是',''),(46,'2021-03-01 08:53:37','账号6','姓名6',6,'税率6','缴纳费用6','备注6','是',''),(1614589743488,'2021-03-01 09:09:02','11','11',1000,'0.01','10','','是','');
/*!40000 ALTER TABLE `nashuishenqing` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `qianshuiqingkuang`
--

DROP TABLE IF EXISTS `qianshuiqingkuang`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `qianshuiqingkuang` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `zhanghao` varchar(200) DEFAULT NULL COMMENT '账号',
  `xingming` varchar(200) DEFAULT NULL COMMENT '姓名',
  `qianshuijine` int(11) DEFAULT NULL COMMENT '欠税金额',
  `beizhu` varchar(200) DEFAULT NULL COMMENT '备注',
  `ispay` varchar(200) DEFAULT '未支付' COMMENT '是否支付',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=1614589567242 DEFAULT CHARSET=utf8 COMMENT='欠税情况';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `qianshuiqingkuang`
--

LOCK TABLES `qianshuiqingkuang` WRITE;
/*!40000 ALTER TABLE `qianshuiqingkuang` DISABLE KEYS */;
INSERT INTO `qianshuiqingkuang` VALUES (51,'2021-03-01 08:53:37','账号1','姓名1',1,'备注1','未支付'),(52,'2021-03-01 08:53:37','账号2','姓名2',2,'备注2','未支付'),(53,'2021-03-01 08:53:37','账号3','姓名3',3,'备注3','未支付'),(54,'2021-03-01 08:53:37','账号4','姓名4',4,'备注4','未支付'),(55,'2021-03-01 08:53:37','账号5','姓名5',5,'备注5','未支付'),(56,'2021-03-01 08:53:37','账号6','姓名6',6,'备注6','未支付'),(1614589567241,'2021-03-01 09:06:06','11','11',1000,'11','已支付');
/*!40000 ALTER TABLE `qianshuiqingkuang` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `token`
--

DROP TABLE IF EXISTS `token`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `token` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `userid` bigint(20) NOT NULL COMMENT '用户id',
  `username` varchar(100) NOT NULL COMMENT '用户名',
  `tablename` varchar(100) DEFAULT NULL COMMENT '表名',
  `role` varchar(100) DEFAULT NULL COMMENT '角色',
  `token` varchar(200) NOT NULL COMMENT '密码',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '新增时间',
  `expiratedtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '过期时间',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8 COMMENT='token表';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `token`
--

LOCK TABLES `token` WRITE;
/*!40000 ALTER TABLE `token` DISABLE KEYS */;
INSERT INTO `token` VALUES (1,1,'abo','users','管理员','yw8un22e78cx8p0r0jgdvouhrsxt8zab','2021-03-01 08:55:52','2021-03-01 10:07:18'),(2,1614588967442,'11','nashuiren','纳税人','gntclbg6507nyyhbe7phkm756nygpvl1','2021-03-01 08:56:12','2021-03-01 09:59:41'),(3,1614589550581,'11','nashuiren','纳税人','bc9hllgxi5eddnif0o68iz5x2lwo9fxj','2021-03-01 09:06:53','2021-03-01 10:08:04');
/*!40000 ALTER TABLE `token` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `users`
--

DROP TABLE IF EXISTS `users`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `users` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `username` varchar(100) NOT NULL COMMENT '用户名',
  `password` varchar(100) NOT NULL COMMENT '密码',
  `role` varchar(100) DEFAULT '管理员' COMMENT '角色',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '新增时间',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8 COMMENT='用户表';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `users`
--

LOCK TABLES `users` WRITE;
/*!40000 ALTER TABLE `users` DISABLE KEYS */;
INSERT INTO `users` VALUES (1,'abo','abo','管理员','2021-03-01 08:53:37');
/*!40000 ALTER TABLE `users` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2021-03-17 15:34:09
