-- phpMyAdmin SQL Dump
-- version 4.7.4
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Apr 01, 2018 at 06:05 PM
-- Server version: 10.1.26-MariaDB
-- PHP Version: 7.1.9

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `library`
--

-- --------------------------------------------------------

--
-- Table structure for table `books`
--

CREATE TABLE `books` (
  `bookid` int(11) NOT NULL,
  `bookname` text NOT NULL,
  `bookauthor` text NOT NULL,
  `bookpublication` text NOT NULL,
  `quantity` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `books`
--

INSERT INTO `books` (`bookid`, `bookname`, `bookauthor`, `bookpublication`, `quantity`) VALUES
(1, 'Operating Systems, 6th Edition', 'William Stallings', 'Pearson Education', 15),
(2, 'Procedural Elements for Computer Graphics', 'David F. Rogers', 'McGraw Hill Eucation', 20),
(3, 'Systems Programming & Operating Systems', 'D.M. Dhamdhere', 'Tata McGraw Hill', 5),
(4, 'Computer Grahpics', 'Hearn Baker', 'Pearson', 10),
(5, 'Fundamentals of Digital Circuit', 'A. Anand Kumar', 'Prentice-Hall of India', 28),
(6, 'Control Systems Engineering', '	M. Gopal, I.J Nagrath', 'New Age International Publishers', 18),
(7, 'Modern Digital and Analog Communication Systems', 'B.P. Lathi', 'Oxford University Press', 25),
(8, 'Database System Concepts', 'S. Sudarshan, Henry F. Korth, Abraham Silberschatz', 'McGraw Hill', 32),
(9, 'Prolog', 'Ivan Bratko', 'Addison-Wesley', 8),
(10, 'Computer Algorithms', 'Ellis Horrowitz, Sartaj Sahni', 'Computer Science Press', 20),
(11, 'Cryptography & Network Security', 'William Stallings', 'Prentice Hall', 12),
(12, 'Compilers', 'Alfred V. Aho, Monica S. Lam, Ravi Sethi,Jeffrey D. Ullman', 'Pearson', 30);

-- --------------------------------------------------------

--
-- Table structure for table `issue`
--

CREATE TABLE `issue` (
  `issueid` int(11) NOT NULL,
  `collegeid` varchar(8) NOT NULL,
  `bookid` int(11) NOT NULL,
  `issuedate` text NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `login`
--

CREATE TABLE `login` (
  `collegeid` varchar(8) NOT NULL,
  `password` varchar(64) NOT NULL,
  `username` text NOT NULL,
  `contact` text NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Indexes for dumped tables
--

--
-- Indexes for table `books`
--
ALTER TABLE `books`
  ADD PRIMARY KEY (`bookid`);

--
-- Indexes for table `issue`
--
ALTER TABLE `issue`
  ADD PRIMARY KEY (`issueid`),
  ADD KEY `collegeid` (`collegeid`),
  ADD KEY `bookid` (`bookid`);

--
-- Indexes for table `login`
--
ALTER TABLE `login`
  ADD PRIMARY KEY (`collegeid`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `books`
--
ALTER TABLE `books`
  MODIFY `bookid` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=13;

--
-- AUTO_INCREMENT for table `issue`
--
ALTER TABLE `issue`
  MODIFY `issueid` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=56;

--
-- Constraints for dumped tables
--

--
-- Constraints for table `issue`
--
ALTER TABLE `issue`
  ADD CONSTRAINT `issue_ibfk_1` FOREIGN KEY (`collegeid`) REFERENCES `login` (`collegeid`),
  ADD CONSTRAINT `issue_ibfk_2` FOREIGN KEY (`bookid`) REFERENCES `books` (`bookid`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
