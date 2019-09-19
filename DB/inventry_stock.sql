-- MySQL dump 10.13  Distrib 8.0.16, for Win64 (x86_64)
--
-- Host: localhost    Database: inventry
-- ------------------------------------------------------
-- Server version	5.5.62

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
 SET NAMES utf8 ;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `stock`
--

DROP TABLE IF EXISTS `stock`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `stock` (
  `stockid` varchar(30) NOT NULL,
  `ItemName` varchar(30) DEFAULT NULL,
  `Price` decimal(9,2) DEFAULT NULL,
  `QuantityAvail` int(11) DEFAULT NULL,
  PRIMARY KEY (`stockid`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `stock`
--

LOCK TABLES `stock` WRITE;
/*!40000 ALTER TABLE `stock` DISABLE KEYS */;
INSERT INTO `stock` VALUES ('S001','Mobile',10000.00,5),('S002','Laptop',39000.00,20),('S003','Samsung Tab',25060.00,1),('S004','Computer',55000.00,50),('S005','Computer',55000.00,50),('S006','Computer',55000.00,38),('S007','Computer',55000.00,50),('S008','Computer',55000.00,50),('S009','Computer',55000.00,50),('S010','Computer',55000.00,50),('S011','Computer',55000.00,50),('S012','Computer',55000.00,50),('S013','Computer',55000.00,50),('S014','Computer',55000.00,50),('S015','Computer',55000.00,50),('S016','Computer',55000.00,50),('S017','Computer',55000.00,50),('S018','Computer',55000.00,50),('S019','Computer',55000.00,50),('S020','Computer',55000.00,50),('S021','Computer',55000.00,50),('S022','Computer',55000.00,50),('S023','Computer',55000.00,50),('S024','Computer',55000.00,50),('S025','Computer',55000.00,50),('S026','Computer',55000.00,50),('S027','Computer',55000.00,50),('S028','Computer',55000.00,50),('S029','Computer',55000.00,50),('S030','Computer',55000.00,50),('S031','Computer',55000.00,50);
/*!40000 ALTER TABLE `stock` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2019-08-12  9:15:33
