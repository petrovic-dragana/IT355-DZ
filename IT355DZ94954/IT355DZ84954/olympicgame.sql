-- phpMyAdmin SQL Dump
-- version 5.2.0
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: May 17, 2024 at 04:53 PM
-- Server version: 10.4.27-MariaDB
-- PHP Version: 8.1.12

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `olympicgame`
--

-- --------------------------------------------------------

--
-- Table structure for table `city`
--

CREATE TABLE `city` (
  `id` int(11) NOT NULL,
  `cityName` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `city`
--

INSERT INTO `city` (`id`, `cityName`) VALUES
(1, 'Tokyo'),
(2, 'Beijing'),
(3, 'Paris');

-- --------------------------------------------------------

--
-- Table structure for table `event`
--

CREATE TABLE `event` (
  `id` int(11) NOT NULL,
  `sportId` int(11) DEFAULT NULL,
  `eventName` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- --------------------------------------------------------

--
-- Table structure for table `games`
--

CREATE TABLE `games` (
  `id` int(11) NOT NULL,
  `gamesYear` int(11) DEFAULT NULL,
  `gamesName` varchar(255) DEFAULT NULL,
  `season` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `games`
--

INSERT INTO `games` (`id`, `gamesYear`, `gamesName`, `season`) VALUES
(1, 2020, 'Summer Olympics', 'Summer'),
(2, 2022, 'Winter Olympics', 'Winter');

-- --------------------------------------------------------

--
-- Table structure for table `games_city`
--

CREATE TABLE `games_city` (
  `id` int(11) NOT NULL,
  `gamesId` int(11) DEFAULT NULL,
  `cityId` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- --------------------------------------------------------

--
-- Table structure for table `medal`
--

CREATE TABLE `medal` (
  `id` int(11) NOT NULL,
  `medalName` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `medal`
--

INSERT INTO `medal` (`id`, `medalName`) VALUES
(1, 'Gold'),
(2, 'Silver'),
(3, 'Bronze');

-- --------------------------------------------------------

--
-- Table structure for table `noc_region`
--

CREATE TABLE `noc_region` (
  `id` int(11) NOT NULL,
  `noc` varchar(10) DEFAULT NULL,
  `regionName` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `noc_region`
--

INSERT INTO `noc_region` (`id`, `noc`, `regionName`) VALUES
(1, 'USA', 'United States of America'),
(2, 'CAN', 'Canada'),
(3, 'AUS', 'Australia');

-- --------------------------------------------------------

--
-- Table structure for table `person`
--

CREATE TABLE `person` (
  `id` int(11) NOT NULL,
  `fullName` varchar(255) DEFAULT NULL,
  `gender` varchar(10) DEFAULT NULL,
  `height` int(11) DEFAULT NULL,
  `weight` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `person`
--

INSERT INTO `person` (`id`, `fullName`, `gender`, `height`, `weight`) VALUES
(1, 'John Doe', 'Male', 180, 75),
(2, 'Jane Smith', 'Female', 165, 60),
(3, 'Michael Johnson', 'Male', 185, 80);

-- --------------------------------------------------------

--
-- Table structure for table `sport`
--

CREATE TABLE `sport` (
  `id` int(11) NOT NULL,
  `sportName` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `sport`
--

INSERT INTO `sport` (`id`, `sportName`) VALUES
(1, 'Athletics'),
(2, 'Swimming'),
(3, 'Gymnastics');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `city`
--
ALTER TABLE `city`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `event`
--
ALTER TABLE `event`
  ADD PRIMARY KEY (`id`),
  ADD KEY `sportId` (`sportId`);

--
-- Indexes for table `games`
--
ALTER TABLE `games`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `games_city`
--
ALTER TABLE `games_city`
  ADD PRIMARY KEY (`id`),
  ADD KEY `gamesId` (`gamesId`),
  ADD KEY `cityId` (`cityId`);

--
-- Indexes for table `medal`
--
ALTER TABLE `medal`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `noc_region`
--
ALTER TABLE `noc_region`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `person`
--
ALTER TABLE `person`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `sport`
--
ALTER TABLE `sport`
  ADD PRIMARY KEY (`id`);

--
-- Constraints for dumped tables
--

--
-- Constraints for table `event`
--
ALTER TABLE `event`
  ADD CONSTRAINT `event_ibfk_1` FOREIGN KEY (`sportId`) REFERENCES `sport` (`id`);

--
-- Constraints for table `games_city`
--
ALTER TABLE `games_city`
  ADD CONSTRAINT `games_city_ibfk_1` FOREIGN KEY (`gamesId`) REFERENCES `games` (`id`),
  ADD CONSTRAINT `games_city_ibfk_2` FOREIGN KEY (`cityId`) REFERENCES `city` (`id`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
