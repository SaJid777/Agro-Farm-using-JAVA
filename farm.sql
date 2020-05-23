-- phpMyAdmin SQL Dump
-- version 4.8.5
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: May 02, 2019 at 01:14 AM
-- Server version: 10.1.38-MariaDB
-- PHP Version: 7.3.3

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `farm`
--

-- --------------------------------------------------------

--
-- Table structure for table `employee`
--

CREATE TABLE `employee` (
  `Eid` varchar(10) NOT NULL,
  `FullName` varchar(20) NOT NULL,
  `Address` varchar(20) NOT NULL,
  `Phone` varchar(20) NOT NULL,
  `Position` varchar(20) NOT NULL,
  `Salary` varchar(10) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `employee`
--

INSERT INTO `employee` (`Eid`, `FullName`, `Address`, `Phone`, `Position`, `Salary`) VALUES
('123', 'abid', 'kuril', '0186969696', 'farmer', '10000'),
('17001', 'Rahim Ahmed', 'Bashundhara', '01819271374', 'Farmer', '10000'),
('17002', 'Md.Salah', 'Badda', '01716327634', 'Driver', '7000'),
('17003', 'Messi Rahman', 'Kuril', '01619271374', 'Porter', '5000');

-- --------------------------------------------------------

--
-- Table structure for table `fertilizer`
--

CREATE TABLE `fertilizer` (
  `Frid` varchar(5) NOT NULL,
  `FrName` varchar(20) NOT NULL,
  `Rate` varchar(10) NOT NULL,
  `Quantity` varchar(5) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `fertilizer`
--

INSERT INTO `fertilizer` (`Frid`, `FrName`, `Rate`, `Quantity`) VALUES
('1', 'Nitrogen', '100', '10'),
('2', 'phosphorus', '120', '5'),
('3', 'Potassium', '110', '4'),
('4', 'Eurea', '130', '10');

-- --------------------------------------------------------

--
-- Table structure for table `food`
--

CREATE TABLE `food` (
  `Fid` varchar(5) NOT NULL,
  `Fname` varchar(20) NOT NULL,
  `Quantity` varchar(10) NOT NULL,
  `Type` varchar(10) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `food`
--

INSERT INTO `food` (`Fid`, `Fname`, `Quantity`, `Type`) VALUES
('1', 'Rice', '50', 'Crops'),
('2', 'Potato', '30', 'Vegetable'),
('3', 'Mango', '40', 'Fruit'),
('4', 'Apple', '10', 'Fruit'),
('5', 'Orrange', '10kg', 'Fruit');

-- --------------------------------------------------------

--
-- Table structure for table `foodtype`
--

CREATE TABLE `foodtype` (
  `FTid` int(5) NOT NULL,
  `FTname` varchar(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `foodtype`
--

INSERT INTO `foodtype` (`FTid`, `FTname`) VALUES
(1, 'Vegetable'),
(2, 'Crop'),
(3, 'Fruit');

-- --------------------------------------------------------

--
-- Table structure for table `pesticide`
--

CREATE TABLE `pesticide` (
  `Pid` varchar(5) NOT NULL,
  `Pname` varchar(20) NOT NULL,
  `Ptype` varchar(10) NOT NULL,
  `Description` varchar(50) NOT NULL,
  `Quantity` varchar(10) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `pesticide`
--

INSERT INTO `pesticide` (`Pid`, `Pname`, `Ptype`, `Description`, `Quantity`) VALUES
('1', 'Herbicide', 'Liquid', 'destroy plants bearing diseases', '10L'),
('3', 'Rodenticide', 'Gass', 'eliminate rat and mice populations', '1KG'),
('4', 'Fungicide', 'Solid', 'Prevent the growth of fungi on plants', '4L'),
('werw', 'fdsf', 'sdfs', '', 'sdfsd');

-- --------------------------------------------------------

--
-- Table structure for table `presticidetype`
--

CREATE TABLE `presticidetype` (
  `PTid` int(5) NOT NULL,
  `PTname` varchar(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `presticidetype`
--

INSERT INTO `presticidetype` (`PTid`, `PTname`) VALUES
(1, 'Liquid'),
(2, 'Gas'),
(3, 'Solid');

-- --------------------------------------------------------

--
-- Table structure for table `seed`
--

CREATE TABLE `seed` (
  `Sid` varchar(5) NOT NULL,
  `Sname` varchar(20) NOT NULL,
  `Type` varchar(10) NOT NULL,
  `Rate` varchar(10) NOT NULL,
  `Quantity` varchar(10) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `seed`
--

INSERT INTO `seed` (`Sid`, `Sname`, `Type`, `Rate`, `Quantity`) VALUES
('1', 'Rice', 'Crops', '300', '50'),
('2', 'Potato', 'Vegetable', '100', '30'),
('3', 'Mango', 'Fruit', '90', '40'),
('4', 'Guava', 'Fruit', '60', '10');

-- --------------------------------------------------------

--
-- Table structure for table `transaction`
--

CREATE TABLE `transaction` (
  `TRid` varchar(5) NOT NULL,
  `TRname` varchar(20) NOT NULL,
  `Description` varchar(20) NOT NULL,
  `Price` varchar(10) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `transaction`
--

INSERT INTO `transaction` (`TRid`, `TRname`, `Description`, `Price`) VALUES
('1', 'salary', 'debit', '25000'),
('2', 'seeds', 'debit', '10000'),
('3', 'crops', 'credit', '60000'),
('4', 'Fertilizer', 'debit', '10000');

-- --------------------------------------------------------

--
-- Table structure for table `treatment`
--

CREATE TABLE `treatment` (
  `Tid` varchar(10) NOT NULL,
  `Tname` varchar(10) NOT NULL,
  `Symptom` varchar(50) NOT NULL,
  `Pname` varchar(10) NOT NULL,
  `Frname` varchar(10) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `treatment`
--

INSERT INTO `treatment` (`Tid`, `Tname`, `Symptom`, `Pname`, `Frname`) VALUES
('1', 'Blight', 'twigs and branches infected by fungus', 'Fungicide', 'Urea'),
('2', 'Black knot', 'dying leaves', 'Phenyl', 'Nitrogen');

-- --------------------------------------------------------

--
-- Table structure for table `user`
--

CREATE TABLE `user` (
  `Uid` varchar(5) NOT NULL,
  `Uname` varchar(30) NOT NULL,
  `Phone` varchar(20) NOT NULL,
  `Email` varchar(20) NOT NULL,
  `Address` varchar(20) NOT NULL,
  `Password` varchar(10) NOT NULL,
  `Position` varchar(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `user`
--

INSERT INTO `user` (`Uid`, `Uname`, `Phone`, `Email`, `Address`, `Password`, `Position`) VALUES
('00001', 's', '01869302597', 'gamersajid777@gmail.', 'Kuril', 's', 'Manager'),
('11000', 'Raju Ahmed', '01716327664', 'raju55@gmail.com', 'Gulshan', 'raju555', ''),
('11001', 'Mina Jahan', '01819274474', 'mina77@gmail.com', 'Baridhara', 'mina123', ''),
('11003', 'Mithu Hasan', '01619272274', 'mithu70@gmail.com', 'Niketon', 'mithu321', ''),
('zxczz', 'zxcz', 'zxczx', 'xzc', 'zxc', 'ss', 'zxc');

-- --------------------------------------------------------

--
-- Table structure for table `warehouse`
--

CREATE TABLE `warehouse` (
  `Wid` varchar(5) NOT NULL,
  `Wname` varchar(20) NOT NULL,
  `FoodName` varchar(20) NOT NULL,
  `Quantity` varchar(10) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `warehouse`
--

INSERT INTO `warehouse` (`Wid`, `Wname`, `FoodName`, `Quantity`) VALUES
('1', 'Wellmart', 'Mango', '200'),
('2', 'Foodcrate', 'Rice', '1000'),
('3', 'Redix', 'Brinjal', '100'),
('4', 'Farnville', 'Onion', '10');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `employee`
--
ALTER TABLE `employee`
  ADD PRIMARY KEY (`Eid`);

--
-- Indexes for table `fertilizer`
--
ALTER TABLE `fertilizer`
  ADD PRIMARY KEY (`Frid`);

--
-- Indexes for table `food`
--
ALTER TABLE `food`
  ADD PRIMARY KEY (`Fid`);

--
-- Indexes for table `foodtype`
--
ALTER TABLE `foodtype`
  ADD PRIMARY KEY (`FTid`);

--
-- Indexes for table `pesticide`
--
ALTER TABLE `pesticide`
  ADD PRIMARY KEY (`Pid`);

--
-- Indexes for table `presticidetype`
--
ALTER TABLE `presticidetype`
  ADD PRIMARY KEY (`PTid`);

--
-- Indexes for table `seed`
--
ALTER TABLE `seed`
  ADD PRIMARY KEY (`Sid`);

--
-- Indexes for table `transaction`
--
ALTER TABLE `transaction`
  ADD PRIMARY KEY (`TRid`);

--
-- Indexes for table `user`
--
ALTER TABLE `user`
  ADD PRIMARY KEY (`Uid`);

--
-- Indexes for table `warehouse`
--
ALTER TABLE `warehouse`
  ADD PRIMARY KEY (`Wid`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `foodtype`
--
ALTER TABLE `foodtype`
  MODIFY `FTid` int(5) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;

--
-- AUTO_INCREMENT for table `presticidetype`
--
ALTER TABLE `presticidetype`
  MODIFY `PTid` int(5) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
