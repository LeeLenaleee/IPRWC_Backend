-- MySQL dump 10.15  Distrib 10.0.36-MariaDB, for debian-linux-gnu (x86_64)
--
-- Host: localhost    Database: iprwc
-- ------------------------------------------------------
-- Server version	10.0.36-MariaDB-0ubuntu0.16.04.1

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `gebruiker`
--

DROP TABLE IF EXISTS `gebruiker`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `gebruiker` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `gebruikersnaam` varchar(25) DEFAULT NULL,
  `email_adres` varchar(25) DEFAULT NULL,
  `wachtwoord` varchar(64) DEFAULT NULL,
  `rol` varchar(25) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8mb4;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `gebruiker`
--

LOCK TABLES `gebruiker` WRITE;
/*!40000 ALTER TABLE `gebruiker` DISABLE KEYS */;
INSERT INTO `gebruiker` VALUES (1,'KAAAAAAZPER','test@test.com','9F86D081884C7D659A2FEAA0C55AD015A3BF4F1B2B0B822CD15D6C15B0F00A08','ADMIN'),(2,'Meneer Nicolaas','test1@test.com','1B4F0E9851971998E732078544C96B36C3D01CEDF7CAA332359D6F1D83567014','USER');
/*!40000 ALTER TABLE `gebruiker` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `plaat`
--

DROP TABLE IF EXISTS `plaat`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `plaat` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `prijs` double(5,2) DEFAULT NULL,
  `naamAlbum` varchar(25) DEFAULT NULL,
  `producent` varchar(25) DEFAULT NULL,
  `zanger` varchar(25) DEFAULT NULL,
  `lengte` int(11) DEFAULT NULL,
  `cover` varchar(250) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=12 DEFAULT CHARSET=utf8mb4;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `plaat`
--

LOCK TABLES `plaat` WRITE;
/*!40000 ALTER TABLE `plaat` DISABLE KEYS */;
INSERT INTO `plaat` VALUES (1,30.01,'Sweetener','Atlantic Ocean','Ariana Grande',200,'https://velvetmusic.nl/img//albums/2018/06/22/GRANDE,%20ARIANA%20-%20SWEETENER.jpg'),(2,55.00,'Zoutelande','BLØF','BLØF',200,'https://static.mijnwebwinkel.nl/winkel/vinyl-on-45/image/cache/full/813d3b9f10e8331cf82b4fcc56f4386125176ca2.jpg'),(3,900.99,'Never Gonna Give You Up','Rick Astly','Rick Astly',210,'https://everythingexcelblog.files.wordpress.com/2016/09/rolled.png'),(5,90.00,'QUEEN II','QUEEN','QUEEN',500,'https://i.ebayimg.com/00/s/NTUwWDU0OQ==/z/4PoAAOSw2~NcLe1w/$_84.JPG'),(6,66.00,' JACKYL',' JACKYL',' JACKYL',600,'https://www.musiconvinyl.com/fotos/4061_foto1_product_groot.jpg'),(7,20.00,'16 HORSEPOWER','LOW ESTATE','LOW ESTATE',157,'https://www.musiconvinyl.com/fotos/832_foto1_product_groot.jpg'),(8,69.00,'THE WANNADIES','BE A GIRL','BE A GIRL',99,'https://www.musiconvinyl.com/fotos/4062_foto2_product_groot.jpg'),(9,999.00,'COLLECTED','Poco','Poco',1900,'https://www.musiconvinyl.com/fotos/4043_foto2_product_groot.jpg'),(10,80.00,'SPEAK FOR YOURSELF','IMOGEN HEAP','IMOGEN HEAP',500,'https://www.musiconvinyl.com/fotos/4001_foto2_product_groot.jpg'),(11,60.00,'PLAYS W.C. HANDY',' LOUIS ARMSTRONG',' LOUIS ARMSTRONG',250,'https://www.musiconvinyl.com/fotos/1271_foto1_product_groot.jpg');
/*!40000 ALTER TABLE `plaat` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2019-02-07  1:14:51
