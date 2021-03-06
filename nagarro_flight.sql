CREATE DATABASE  IF NOT EXISTS `nagarro` /*!40100 DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci */ /*!80016 DEFAULT ENCRYPTION='N' */;
USE `nagarro`;
-- MySQL dump 10.13  Distrib 8.0.18, for Win64 (x86_64)
--
-- Host: localhost    Database: nagarro
-- ------------------------------------------------------
-- Server version	8.0.18

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!50503 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `flight`
--

DROP TABLE IF EXISTS `flight`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `flight` (
  `flightNo` varchar(255) NOT NULL,
  `arrLoc` varchar(255) DEFAULT NULL,
  `cl` varchar(255) DEFAULT NULL,
  `depLoc` varchar(255) DEFAULT NULL,
  `fare` double NOT NULL,
  `flightDurr` double NOT NULL,
  `flightTime` time DEFAULT NULL,
  `seatAvail` varchar(255) DEFAULT NULL,
  `validTill` date DEFAULT NULL,
  PRIMARY KEY (`flightNo`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `flight`
--

LOCK TABLES `flight` WRITE;
/*!40000 ALTER TABLE `flight` DISABLE KEYS */;
INSERT INTO `flight` VALUES ('6E370','BGR','EB','DEL',7500,4.48,'07:30:00','Y','2013-12-19'),('6E375','BGR','EB','DEL',8300,4.45,'13:30:00','Y','2013-12-27'),('6E377','MUB','E','DEL',5100,4.1,'05:00:00','Y','2013-12-05'),('6E378','MUB','EB','DEL',5300,4.25,'18:30:00','Y','2013-12-25'),('6E379','MUB','EB','DEL',5500,4.1,'09:30:00','Y','2013-12-12'),('6E385','BGR','EB','DEL',8100,4.5,'11:30:00','N','2013-12-31'),('6E389','MUB','E','DEL',6650,4,'12:30:00','N','2013-12-17'),('6E395','BGR','EB','DEL',9000,4.15,'06:30:00','N','2013-12-31'),('9W370','BGR','EB','DEL',8500,4.45,'14:30:00','Y','2013-12-19'),('9W375','BGR','E','DEL',8300,4.45,'13:30:00','Y','2013-12-12'),('9W377','MUB','EB','DEL',5500,4.1,'06:00:00','Y','2013-12-06'),('9W378','MUB','EB','DEL',5300,4.2,'18:30:00','Y','2013-12-17'),('9W379','MUB','E','DEL',4900,4.3,'06:30:00','N','2013-12-15'),('9W385','BGR','EB','DEL',8100,4.5,'13:30:00','Y','2013-12-27'),('9W389','MUB','E','DEL',5650,4,'08:30:00','Y','2013-12-17'),('9W395','BGR','EB','DEL',9000,4.15,'19:30:00','N','2013-12-31'),('AI270','BGR','EB','DEL',8500,4.45,'14:30:00','Y','2013-12-12'),('AI275','BGR','EB','DEL',8300,4.45,'13:30:00','N','2013-12-15'),('AI277','MUB','EB','DEL',5500,4.1,'06:00:00','Y','2013-12-05'),('AI278','MUB','E','DEL',5300,4.2,'18:30:00','Y','2013-12-17'),('AI279','MUB','E','DEL',4900,4.3,'06:30:00','Y','2013-12-10'),('AI285','BGR','EB','DEL',8100,4.5,'13:30:00','Y','2013-12-17'),('AI289','MUB','EB','DEL',5650,4,'08:30:00','Y','2013-12-10'),('AI295','BGR','EB','DEL',9000,4.15,'19:30:00','N','2013-12-25');
/*!40000 ALTER TABLE `flight` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2020-04-09 11:29:19
