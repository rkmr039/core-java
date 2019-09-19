-- MySQL dump 10.13  Distrib 8.0.16, for Win64 (x86_64)
--
-- Host: localhost    Database: bank
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
-- Table structure for table `trans`
--

DROP TABLE IF EXISTS `trans`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `trans` (
  `AccountNo` int(11) DEFAULT NULL,
  `TransAmount` decimal(9,2) DEFAULT NULL,
  `TransDate` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `TransType` varchar(10) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `trans`
--

LOCK TABLES `trans` WRITE;
/*!40000 ALTER TABLE `trans` DISABLE KEYS */;
INSERT INTO `trans` VALUES (1,60000.00,'2019-08-08 07:21:34','C'),(1,10000.00,'2019-08-08 07:22:11','C'),(1,330000.00,'2019-08-08 08:54:57','C'),(1,50000.00,'2019-08-08 08:55:57','D'),(2,10000.00,'2019-08-09 07:23:38','C'),(26,1000.00,'2019-08-09 07:23:39','C'),(2,10000.00,'2019-08-09 07:23:47','C'),(26,1000.00,'2019-08-09 07:23:47','C'),(2,10000.00,'2019-08-09 07:24:19','C'),(26,1000.00,'2019-08-09 07:24:19','C'),(2,10000.00,'2019-08-09 07:24:25','C'),(26,1000.00,'2019-08-09 07:24:25','C'),(2,10000.00,'2019-08-09 07:25:19','C'),(2,1000.00,'2019-08-09 07:25:19','C'),(2,10000.00,'2019-08-09 07:25:39','C'),(2,1000.00,'2019-08-09 07:25:39','C'),(2,10000.00,'2019-08-09 07:26:38','C'),(2,1000.00,'2019-08-09 07:26:38','C'),(2,10000.00,'2019-08-09 07:26:44','C'),(2,1000.00,'2019-08-09 07:26:44','C'),(1,10000.00,'2019-08-09 07:28:32','C'),(1,10000.00,'2019-08-09 07:28:38','C'),(1,10000.00,'2019-08-09 08:01:02','C'),(1,10000.00,'2019-08-09 08:05:36','C'),(1,10000.00,'2019-08-09 08:07:45','C'),(1,10000.00,'2019-08-09 08:07:51','C'),(1,10000.00,'2019-08-09 08:09:17','C'),(1,10000.00,'2019-08-09 08:13:13','C'),(1,10000.00,'2019-08-09 08:32:43','C'),(1,10000.00,'2019-08-09 08:32:47','C'),(1,10000.00,'2019-08-09 08:33:08','C'),(1,10000.00,'2019-08-09 08:34:15','C'),(1,10000.00,'2019-08-09 08:34:19','C'),(1,10000.00,'2019-08-09 08:39:04','C'),(1,10000.00,'2019-08-09 08:39:12','C'),(1,10000.00,'2019-08-09 08:39:29','C'),(1,10000.00,'2019-08-09 08:44:11','C'),(1,10000.00,'2019-08-09 08:44:17','C'),(1,10000.00,'2019-08-09 08:45:38','C'),(20,1000.00,'2019-08-09 08:45:38','D'),(1,10000.00,'2019-08-09 08:51:46','C'),(1,10000.00,'2019-08-09 08:51:57','C'),(20,1000.00,'2019-08-09 08:51:57','D'),(1,10000.00,'2019-08-09 08:52:02','C'),(20,1000.00,'2019-08-09 08:52:02','D'),(1,10000.00,'2019-08-09 08:56:16','C'),(20,1000.00,'2019-08-09 08:56:16','D'),(1,10000.00,'2019-08-09 08:56:21','C'),(20,1000.00,'2019-08-09 08:56:21','D'),(1,10000.00,'2019-08-09 08:57:11','C'),(20,1000.00,'2019-08-09 08:57:11','D'),(1,10000.00,'2019-08-09 08:57:15','C'),(20,1000.00,'2019-08-09 08:57:15','D'),(1,10000.00,'2019-08-09 09:11:28','C'),(20,1000.00,'2019-08-09 09:11:28','D'),(1,10000.00,'2019-08-09 09:11:31','C'),(20,1000.00,'2019-08-09 09:11:31','D');
/*!40000 ALTER TABLE `trans` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2019-08-12  9:15:42
