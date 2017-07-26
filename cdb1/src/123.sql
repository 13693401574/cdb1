/*
SQLyog Ultimate v8.71 
MySQL - 5.5.22-log : Database - cdb
*********************************************************************
*/

/*!40101 SET NAMES utf8 */;

/*!40101 SET SQL_MODE=''*/;

/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;
CREATE DATABASE /*!32312 IF NOT EXISTS*/`cdb` /*!40100 DEFAULT CHARACTER SET utf8 */;

USE `cdb`;

/*Table structure for table `t_carport` */

DROP TABLE IF EXISTS `t_carport`;

CREATE TABLE `t_carport` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `carportNumber` varchar(50) DEFAULT NULL,
  `carportAddress` varchar(50) DEFAULT NULL,
  `fkCompanyContractId` bigint(20) DEFAULT NULL,
  `fkThreeId` bigint(20) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `t_carport` */

/*Table structure for table `t_carportapplication` */

DROP TABLE IF EXISTS `t_carportapplication`;

CREATE TABLE `t_carportapplication` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `carportEquityCode` varchar(20) DEFAULT NULL,
  `carportAddress` varchar(50) DEFAULT NULL,
  `carportAddressCode` varchar(20) DEFAULT NULL,
  `equityCopies` varchar(50) DEFAULT NULL,
  `status` varchar(20) DEFAULT NULL,
  `fkLandladyId` bigint(20) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=12 DEFAULT CHARSET=utf8;

/*Data for the table `t_carportapplication` */

insert  into `t_carportapplication`(`id`,`carportEquityCode`,`carportAddress`,`carportAddressCode`,`equityCopies`,`status`,`fkLandladyId`) values (1,'说个毛线','共和村','1006','没有','审核通过',1),(3,'mmm','红瓦寺','0033','D://files\\1.png','审核通过',1),(4,'','','','D://files\\','待审核',1),(5,'003','近水楼台','003','D://files\\2.png','待审核',1),(6,'','','','D://files\\','待审核',1),(7,'lll','mmm','003','D://files\\2.png','待审核',1),(8,'ooo','ooo','ooo','D://files\\2.png','待审核',1),(9,'kk','5555','666','D://files\\2.png','待审核',1),(10,'uuu','uuu','uuu','D://files\\2.png','待审核',1),(11,'ppp','ppp','pp','D://files\\2.png','待审核',1);

/*Table structure for table `t_carportissue` */

DROP TABLE IF EXISTS `t_carportissue`;

CREATE TABLE `t_carportissue` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `startTime` date DEFAULT NULL,
  `endTime` date DEFAULT NULL,
  `price` varchar(20) DEFAULT NULL,
  `status` varchar(20) DEFAULT NULL,
  `fkCarportApplicationId` bigint(20) DEFAULT NULL,
  `fkLandladyId` bigint(20) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=34 DEFAULT CHARSET=utf8;

/*Data for the table `t_carportissue` */

insert  into `t_carportissue`(`id`,`startTime`,`endTime`,`price`,`status`,`fkCarportApplicationId`,`fkLandladyId`) values (1,'2016-06-01','2017-06-01','500元','未出租',1,1),(2,'2016-06-01','2017-06-01','500元','未出租',1,2),(4,'2016-06-01','2017-06-01','500元','未出租',1,1),(5,'2016-07-09','2017-06-01','222','未出租',1,1),(6,'2016-06-01','2017-06-01','500元','未出租',1,1);

/*Table structure for table `t_companycontract` */

DROP TABLE IF EXISTS `t_companycontract`;

CREATE TABLE `t_companycontract` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `companyName` varchar(50) DEFAULT NULL,
  `contractNumber` varchar(50) DEFAULT NULL,
  `startTime` varchar(50) DEFAULT NULL,
  `endTime` varchar(50) DEFAULT NULL,
  `contractCopies` varbinary(50) DEFAULT NULL,
  `fkCompanyId` bigint(20) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `t_companycontract` */

/*Table structure for table `t_companyuser` */

DROP TABLE IF EXISTS `t_companyuser`;

CREATE TABLE `t_companyuser` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `logName` varchar(20) DEFAULT NULL,
  `pwd` varchar(20) DEFAULT NULL,
  `companyName` varchar(50) DEFAULT NULL,
  `floor` varchar(50) DEFAULT NULL,
  `linkMan` varchar(20) DEFAULT NULL,
  `linkPhone` varchar(11) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `t_companyuser` */

/*Table structure for table `t_deal` */

DROP TABLE IF EXISTS `t_deal`;

CREATE TABLE `t_deal` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `fkLandladyId` bigint(20) DEFAULT NULL,
  `fkRobManId` bigint(20) DEFAULT NULL,
  `status` varchar(20) DEFAULT NULL,
  `fkCarportIssueId` varchar(20) DEFAULT NULL,
  `robStatus` varchar(20) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=21 DEFAULT CHARSET=utf8;

/*Data for the table `t_deal` */

insert  into `t_deal`(`id`,`fkLandladyId`,`fkRobManId`,`status`,`fkCarportIssueId`,`robStatus`) values (19,1,1,'0','1','1');

/*Table structure for table `t_employee` */

DROP TABLE IF EXISTS `t_employee`;

CREATE TABLE `t_employee` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `employeeNumber` varchar(20) DEFAULT NULL,
  `pwd` varchar(20) DEFAULT NULL,
  `employeeName` varchar(20) DEFAULT NULL,
  `phone` varchar(11) DEFAULT NULL,
  `userManage` int(11) DEFAULT NULL,
  `carportManage` int(11) DEFAULT NULL,
  `contractsManager` int(11) DEFAULT NULL,
  `complaintManage` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `t_employee` */

/*Table structure for table `t_landlady` */

DROP TABLE IF EXISTS `t_landlady`;

CREATE TABLE `t_landlady` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `userName` varchar(20) DEFAULT NULL,
  `pwd` varchar(20) DEFAULT NULL,
  `realName` varchar(20) DEFAULT NULL,
  `address` varchar(50) DEFAULT NULL,
  `phone` varchar(11) DEFAULT NULL,
  `idCard` varchar(18) DEFAULT NULL,
  `jobDescribe` varchar(120) DEFAULT NULL,
  `email` varchar(120) DEFAULT NULL,
  `credibility` varchar(20) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8;

/*Data for the table `t_landlady` */

insert  into `t_landlady`(`id`,`userName`,`pwd`,`realName`,`address`,`phone`,`idCard`,`jobDescribe`,`email`,`credibility`) values (1,'tr','123456','asdf','红瓦寺','12345678901','511681198912030033','自由职业者，我呀呀呀呀呀呀','1261301957@qq.com','0/2'),(2,'tr','123456','asdf','搞hsdfghbjnkjh','78945632101','511681198912030033','自由职业者','1261301957@qq.com','0/0'),(3,'zh','123456','邹辉','红瓦寺','12345678901','511681198912030033','自由职业者','1261301957@qq.com','0/0');

/*Table structure for table `t_landladycomplain` */

DROP TABLE IF EXISTS `t_landladycomplain`;

CREATE TABLE `t_landladycomplain` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `complainant` varchar(20) DEFAULT NULL,
  `beComplaint` varchar(20) DEFAULT NULL,
  `complainantDate` datetime DEFAULT NULL,
  `status` varchar(20) DEFAULT NULL,
  `reasons` varchar(120) DEFAULT NULL,
  `fkDealId` bigint(20) DEFAULT NULL,
  `fkLandladyId` bigint(20) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=27 DEFAULT CHARSET=utf8;

/*Data for the table `t_landladycomplain` */

insert  into `t_landladycomplain`(`id`,`complainant`,`beComplaint`,`complainantDate`,`status`,`reasons`,`fkDealId`,`fkLandladyId`) values (26,'tr','tr','2017-07-25 21:01:09','待处理','大傻逼',19,1);

/*Table structure for table `t_log` */

DROP TABLE IF EXISTS `t_log`;

CREATE TABLE `t_log` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `logInfo` varchar(120) DEFAULT NULL,
  `logDate` varchar(20) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `t_log` */

/*Table structure for table `t_outthree` */

DROP TABLE IF EXISTS `t_outthree`;

CREATE TABLE `t_outthree` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `contractNumber` varchar(30) DEFAULT NULL,
  `companyName` varchar(50) DEFAULT NULL,
  `linkMan` varchar(20) DEFAULT NULL,
  `linkPhone` varchar(11) DEFAULT NULL,
  `adress` varchar(50) DEFAULT NULL,
  `startDate` varchar(50) DEFAULT NULL,
  `endDate` varchar(50) DEFAULT NULL,
  `contractCopies` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `t_outthree` */

/*Table structure for table `t_predeterminecarport` */

DROP TABLE IF EXISTS `t_predeterminecarport`;

CREATE TABLE `t_predeterminecarport` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `message` varchar(120) DEFAULT NULL,
  `status` varchar(20) DEFAULT NULL,
  `fkRobtenantId` bigint(20) DEFAULT NULL,
  `fkCorportIssueId` bigint(20) DEFAULT NULL,
  `fkLandladyId` bigint(20) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=9 DEFAULT CHARSET=utf8;

/*Data for the table `t_predeterminecarport` */

insert  into `t_predeterminecarport`(`id`,`message`,`status`,`fkRobtenantId`,`fkCorportIssueId`,`fkLandladyId`) values (1,'留给我','同意',1,1,1),(2,'留给我','拒绝',1,1,1),(3,'留给我','同意',1,31,1),(5,'jjjj','拒绝',1,1,1),(6,'mmmm','拒绝',1,1,1),(7,'kkkk','拒绝',1,1,1),(8,'mmm','待处理',1,2,2);

/*Table structure for table `t_robtenants` */

DROP TABLE IF EXISTS `t_robtenants`;

CREATE TABLE `t_robtenants` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `userName` varchar(20) DEFAULT NULL,
  `pwd` varchar(20) DEFAULT NULL,
  `realName` varchar(20) DEFAULT NULL,
  `address` varchar(50) DEFAULT NULL,
  `phone` varchar(11) DEFAULT NULL,
  `idCard` varchar(18) DEFAULT NULL,
  `jobDescribe` varchar(120) DEFAULT NULL,
  `email` varchar(120) DEFAULT NULL,
  `credibility` varchar(20) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8;

/*Data for the table `t_robtenants` */

insert  into `t_robtenants`(`id`,`userName`,`pwd`,`realName`,`address`,`phone`,`idCard`,`jobDescribe`,`email`,`credibility`) values (1,'tr','123456','asdf','红瓦寺','12345678901','511681198912030033','自由职业者','1261301957@qq.com','1/2'),(2,'zh','123456','周华','红瓦寺','12345678901','511681198912030033','自由职业者','1261301957@qq.com','0/0'),(3,'zh','236978','周华','共和村','13550992634','511681198912030033','自由职业者','1261301957@qq.com','0/0');

/*Table structure for table `t_robtenantscomplain` */

DROP TABLE IF EXISTS `t_robtenantscomplain`;

CREATE TABLE `t_robtenantscomplain` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `complainant` varchar(20) DEFAULT NULL,
  `beComplaint` varchar(20) DEFAULT NULL,
  `complainantDate` datetime DEFAULT NULL,
  `status` varchar(20) DEFAULT NULL,
  `reasons` varchar(120) DEFAULT NULL,
  `fkDealId` bigint(20) DEFAULT NULL,
  `fkRobManId` bigint(20) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `t_robtenantscomplain` */

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;
