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
-- Table structure for table `accounts`
--

DROP TABLE IF EXISTS `accounts`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `accounts` (
  `AccountNo` int(11) NOT NULL,
  `FirstName` varchar(30) DEFAULT NULL,
  `LastName` varchar(30) DEFAULT NULL,
  `City` varchar(30) DEFAULT NULL,
  `State` varchar(30) DEFAULT NULL,
  `Amount` int(11) DEFAULT NULL,
  `CheqFacil` varchar(10) DEFAULT NULL,
  `AccountType` varchar(20) DEFAULT NULL,
  `Status` varchar(10) DEFAULT 'active',
  `DateOfOpen` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
  PRIMARY KEY (`AccountNo`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `accounts`
--

LOCK TABLES `accounts` WRITE;
/*!40000 ALTER TABLE `accounts` DISABLE KEYS */;
INSERT INTO `accounts` VALUES (1,'yash','Mendiratta','Chennai','TN',860000,'Yes','Saving','active','2019-08-08 05:44:44'),(2,'Amit','Kumar','New Delhi','Delhi',288895,'No','Current','Inactive','2019-08-08 05:48:01'),(3,'Bindu','Sree','Bangalore','KA',88222,'Yes','Savings','active','2019-08-09 06:22:34'),(4,'Bindu','Sree','Bangalore','KA',88222,'Yes','Savings','Inactive','2019-08-09 06:22:39'),(5,'Bindu','Sree','Bangalore','KA',88222,'Yes','Savings','active','2019-08-09 06:26:27'),(6,'Bindu','Sree','Bangalore','KA',88222,'Yes','Savings','active','2019-08-09 06:26:41'),(7,'Bindu','Sree','Bangalore','KA',88222,'Yes','Savings','active','2019-08-09 06:29:15'),(8,'Bindu','Sree','Bangalore','KA',88222,'Yes','Savings','active','2019-08-09 06:29:19'),(9,'Bindu','Sree','Bangalore','KA',88222,'Yes','Savings','active','2019-08-09 06:51:57'),(10,'Bindu','Sree','Bangalore','KA',88222,'Yes','Savings','active','2019-08-09 06:52:22'),(11,'Bindu','Sree','Bangalore','KA',88222,'Yes','Savings','active','2019-08-09 06:52:34'),(12,'Bindu','Sree','Bangalore','KA',88222,'Yes','Savings','active','2019-08-09 06:53:35'),(13,'Bindu','Sree','Bangalore','KA',88222,'Yes','Savings','active','2019-08-09 06:53:42'),(14,'Bindu','Sree','Bangalore','KA',88222,'Yes','Savings','active','2019-08-09 06:56:46'),(15,'Bindu','Sree','Bangalore','KA',88222,'Yes','Savings','active','2019-08-09 07:04:10'),(16,'Bindu','Sree','Bangalore','KA',88222,'Yes','Savings','active','2019-08-09 07:04:20'),(17,'Bindu','Sree','Bangalore','KA',88222,'Yes','Savings','active','2019-08-09 07:06:42'),(18,'Bindu','Sree','Bangalore','KA',88222,'Yes','Savings','active','2019-08-09 07:06:58'),(19,'Bindu','Sree','Bangalore','KA',88222,'Yes','Savings','active','2019-08-09 07:10:02'),(20,'Bindu','Sree','Bangalore','KA',79222,'Yes','Savings','active','2019-08-09 07:10:12'),(21,'Bindu','Sree','Bangalore','KA',88222,'Yes','Savings','active','2019-08-09 07:10:46'),(22,'Bindu','Sree','Bangalore','KA',88222,'Yes','Savings','active','2019-08-09 07:10:54'),(23,'Bindu','Sree','Bangalore','KA',88222,'Yes','Savings','active','2019-08-09 07:12:22'),(24,'Bindu','Sree','Bangalore','KA',88222,'Yes','Savings','active','2019-08-09 07:12:42'),(25,'Bindu','Sree','Bangalore','KA',88222,'Yes','Savings','active','2019-08-09 07:12:45'),(26,'Bindu','Sree','Bangalore','KA',92222,'Yes','Savings','Inactive','2019-08-09 07:14:08'),(27,'Bindu','Sree','Bangalore','KA',88222,'Yes','Savings','active','2019-08-09 07:16:20'),(28,'Bindu','Sree','Bangalore','KA',88222,'Yes','Savings','active','2019-08-09 07:16:26'),(29,'Bindu','Sree','Bangalore','KA',88222,'Yes','Savings','active','2019-08-09 07:17:24'),(30,'Bindu','Sree','Bangalore','KA',88222,'Yes','Savings','active','2019-08-09 07:23:38'),(31,'Bindu','Sree','Bangalore','KA',88222,'Yes','Savings','active','2019-08-09 07:23:47'),(32,'Bindu','Sree','Bangalore','KA',88222,'Yes','Savings','active','2019-08-09 07:24:19'),(33,'Bindu','Sree','Bangalore','KA',88222,'Yes','Savings','active','2019-08-09 07:24:25'),(34,'Bindu','Sree','Bangalore','KA',88222,'Yes','Savings','active','2019-08-09 07:25:19'),(35,'Bindu','Sree','Bangalore','KA',88222,'Yes','Savings','active','2019-08-09 07:25:39'),(36,'Bindu','Sree','Bangalore','KA',88222,'Yes','Savings','active','2019-08-09 07:26:38'),(37,'Bindu','Sree','Bangalore','KA',88222,'Yes','Savings','active','2019-08-09 07:26:44'),(38,'Bindu','Sree','Bangalore','KA',88222,'Yes','Savings','active','2019-08-09 07:27:07'),(39,'Bindu','Sree','Bangalore','KA',88222,'Yes','Savings','active','2019-08-09 07:27:26'),(40,'Bindu','Sree','Bangalore','KA',88222,'Yes','Savings','active','2019-08-09 07:28:32'),(41,'Bindu','Sree','Bangalore','KA',88222,'Yes','Savings','active','2019-08-09 07:28:38'),(42,'Bindu','Sree','Bangalore','KA',88222,'Yes','Savings','active','2019-08-09 08:01:02'),(43,'Bindu','Sree','Bangalore','KA',88222,'Yes','Savings','active','2019-08-09 08:05:35'),(44,'Bindu','Sree','Bangalore','KA',88222,'Yes','Savings','active','2019-08-09 08:07:45'),(45,'Bindu','Sree','Bangalore','KA',88222,'Yes','Savings','active','2019-08-09 08:07:51'),(46,'Bindu','Sree','Bangalore','KA',88222,'Yes','Savings','active','2019-08-09 08:09:17'),(47,'Bindu','Sree','Bangalore','KA',88222,'Yes','Savings','active','2019-08-09 08:13:13'),(48,'Bindu','Sree','Bangalore','KA',88222,'Yes','Savings','active','2019-08-09 08:32:43'),(49,'Bindu','Sree','Bangalore','KA',88222,'Yes','Savings','active','2019-08-09 08:32:47'),(50,'Bindu','Sree','Bangalore','KA',88222,'Yes','Savings','active','2019-08-09 08:33:08'),(51,'Bindu','Sree','Bangalore','KA',88222,'Yes','Savings','active','2019-08-09 08:34:14'),(52,'Bindu','Sree','Bangalore','KA',88222,'Yes','Savings','active','2019-08-09 08:34:19'),(53,'Bindu','Sree','Bangalore','KA',88222,'Yes','Savings','active','2019-08-09 08:39:04'),(54,'Bindu','Sree','Bangalore','KA',88222,'Yes','Savings','active','2019-08-09 08:39:12'),(55,'Bindu','Sree','Bangalore','KA',88222,'Yes','Savings','active','2019-08-09 08:39:29'),(56,'Bindu','Sree','Bangalore','KA',88222,'Yes','Savings','active','2019-08-09 08:44:11'),(57,'Bindu','Sree','Bangalore','KA',88222,'Yes','Savings','active','2019-08-09 08:44:17'),(58,'Bindu','Sree','Bangalore','KA',88222,'Yes','Savings','active','2019-08-09 08:45:38'),(59,'Bindu','Sree','Bangalore','KA',88222,'Yes','Savings','active','2019-08-09 08:51:46'),(60,'Bindu','Sree','Bangalore','KA',88222,'Yes','Savings','active','2019-08-09 08:51:57'),(61,'Bindu','Sree','Bangalore','KA',88222,'Yes','Savings','active','2019-08-09 08:52:02'),(62,'Bindu','Sree','Bangalore','KA',88222,'Yes','Savings','active','2019-08-09 08:56:16'),(63,'Bindu','Sree','Bangalore','KA',88222,'Yes','Savings','active','2019-08-09 08:56:21'),(64,'Bindu','Sree','Bangalore','KA',88222,'Yes','Savings','active','2019-08-09 08:57:11'),(65,'Bindu','Sree','Bangalore','KA',88222,'Yes','Savings','active','2019-08-09 08:57:15'),(66,'Bindu','Sree','Bangalore','KA',88222,'Yes','Savings','active','2019-08-09 09:11:28'),(67,'Bindu','Sree','Bangalore','KA',88222,'Yes','Savings','active','2019-08-09 09:11:31');
/*!40000 ALTER TABLE `accounts` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2019-08-12  9:15:43
