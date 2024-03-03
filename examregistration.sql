-- phpMyAdmin SQL Dump
-- version 5.1.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Jan 08, 2023 at 05:13 PM
-- Server version: 10.4.20-MariaDB
-- PHP Version: 8.0.9

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `examregistration`
--

-- --------------------------------------------------------

--
-- Table structure for table `addressdetails`
--

CREATE TABLE `addressdetails` (
  `doorstreet` varchar(500) NOT NULL,
  `city` varchar(500) NOT NULL,
  `district` varchar(100) NOT NULL,
  `pincode` varchar(20) NOT NULL,
  `centerpref1` varchar(100) NOT NULL,
  `centerpref2` varchar(100) NOT NULL,
  `centerpref3` varchar(100) NOT NULL,
  `username` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `addressdetails`
--

INSERT INTO `addressdetails` (`doorstreet`, `city`, `district`, `pincode`, `centerpref1`, `centerpref2`, `centerpref3`, `username`) VALUES
('2/150 B, Gurunathan Kovil Street, Emaneswaram', 'Paramakudi', 'Ramanathapuram', '623701', 'Bangalore', 'Trichy', 'Chennai', '19cs010'),
('1/287, Gurunathan Kovil Street, Emaneswaram', 'Paramakudi', 'Ramanathapuram', '623701', 'Madurai', 'Ramanathapuram', 'Chennai', '19cs101'),
('2/57 Gurunathan Kovil Street, Emaneswaram, Paramakudi', 'Ramanthapuram', 'Ramanthapuram', '623701', 'Bangalore', 'Ramanathapuram', 'Madurai', '19cs0001'),
('2/157', 'ramanathapuram', 'ramanathapuram', '623701', 'Bangalore', 'Chennai', 'Trichy', '19cs00100'),
('2/187, Gurunathan Kovil Street, Emaneswaram, Pmk', 'Ramnad', 'Ramanthapuram', '623701', 'Bangalore', 'Trichy', 'Chennai', '19cs010');

-- --------------------------------------------------------

--
-- Table structure for table `login`
--

CREATE TABLE `login` (
  `userValue` varchar(500) NOT NULL DEFAULT current_timestamp(),
  `time` varchar(30) NOT NULL DEFAULT current_timestamp()
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `login`
--

INSERT INTO `login` (`userValue`, `time`) VALUES
('19cs010', '26/07/2022 23:08:36'),
('19cs010', '26/07/2022 23:23:32'),
('19cs101', '08/01/2023 18:35:41'),
('19cs0001', '08/01/2023 18:42:20'),
('19cs00100', '08/01/2023 18:46:12'),
('19cs00100', '08/01/2023 18:48:56'),
('19cs010', '08/01/2023 19:15:30'),
('19cs010', '08/01/2023 19:23:25'),
('19cs010', '08/01/2023 19:26:15');

-- --------------------------------------------------------

--
-- Table structure for table `personaldetails`
--

CREATE TABLE `personaldetails` (
  `name` varchar(500) NOT NULL,
  `faname` varchar(500) NOT NULL,
  `moname` varchar(500) NOT NULL,
  `email` varchar(255) NOT NULL,
  `aadhar` varchar(20) NOT NULL,
  `dob` varchar(20) NOT NULL,
  `mobile` varchar(20) NOT NULL,
  `gender` varchar(10) NOT NULL,
  `nationality` varchar(15) NOT NULL,
  `qualification` varchar(30) NOT NULL,
  `yearofqualified` varchar(10) NOT NULL,
  `whetheremployed` varchar(20) NOT NULL,
  `currentinsitution` varchar(500) NOT NULL,
  `username` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `personaldetails`
--

INSERT INTO `personaldetails` (`name`, `faname`, `moname`, `email`, `aadhar`, `dob`, `mobile`, `gender`, `nationality`, `qualification`, `yearofqualified`, `whetheremployed`, `currentinsitution`, `username`) VALUES
('ARUNPRADEEP VN', 'NAGARAJAN VR', 'JOTHEESWARI VN', 'arunpradeepvn@gmail.com', '322715578019', '2002-06-29', '6369140376', 'MALE', 'INDIAN', '12th', '2019', 'No', 'SYED AMMAL ENGINEERING COLLEGE, RAMANATHAPURAM', '19cs010'),
('ARUNPRADEEP', 'NAGARAJAN', 'JOTHEESWARI', 'arunpradeeparun@gmail.com', '322718895486', '2002-06-27', '6369140376', 'MALE', 'INDIAN', '12th', '2019', 'No', 'SYED AMMAL ENGINEERING COLLGE', '19cs101'),
('SIVADHARSHINI', 'KUMARAN', 'KAVITHA', 'siva@gmail.com', '215486471245', '2002-06-29', '7402274211', 'FEMALE', 'INDIAN', '12th', '2020', 'No', 'SYED AMMAL ENGINEERING COLLEGE', '19cs0001'),
('SOUMIYA', 'GANESAN', 'JEEVITHA', 'soumi@gmail.com', '322715578457', '2023-01-18', '6369140376', 'FEMALE', 'INDIAN', '12th', '2019', 'No', 'SYED AMMAL ENGINEERING COLLEGE', '19cs00100'),
('ARUNPADEEP VN', 'NAGARAJAN VR', 'JOTHI', 'arunpradeepvn@gmail.com', '322715578458', '2023-01-23', '7402274211', 'MALE', 'INDIAN', '12th', '2019', 'No', 'SYED AMMAL ENGINEERING COLLEGE', '19cs010');

-- --------------------------------------------------------

--
-- Table structure for table `users`
--

CREATE TABLE `users` (
  `fname` varchar(200) NOT NULL DEFAULT current_timestamp(),
  `lname` varchar(100) NOT NULL DEFAULT current_timestamp(),
  `email` varchar(255) NOT NULL DEFAULT current_timestamp(),
  `mobile` varchar(20) NOT NULL DEFAULT current_timestamp(),
  `passcode` varchar(50) NOT NULL DEFAULT current_timestamp(),
  `username` varchar(50) NOT NULL DEFAULT current_timestamp()
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `users`
--

INSERT INTO `users` (`fname`, `lname`, `email`, `mobile`, `passcode`, `username`) VALUES
('ARUNPRADEEP', 'VN', 'arunpradeepvn@gmail.com', '6369140376', '-1196729604', '19cs010');
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
