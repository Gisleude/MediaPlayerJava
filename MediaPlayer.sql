-- phpMyAdmin SQL Dump
-- version 4.5.4.1deb2ubuntu2
-- http://www.phpmyadmin.net
--
-- Host: localhost
-- Generation Time: Nov 19, 2016 at 12:38 PM
-- Server version: 10.0.27-MariaDB-0ubuntu0.16.04.1
-- PHP Version: 7.0.8-0ubuntu0.16.04.2

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `MediaPlayer`
--

-- --------------------------------------------------------

--
-- Table structure for table `music`
--

CREATE TABLE `music` (
  `id_music` int(10) NOT NULL,
  `name_music` varchar(140) NOT NULL,
  `artist_music` varchar(140) NOT NULL,
  `album_music` varchar(140) NOT NULL,
  `ano_music` int(4) NOT NULL,
  `url_music` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Table structure for table `playlist`
--

CREATE TABLE `playlist` (
  `id_playlist` int(10) NOT NULL,
  `name_playlist` varchar(255) NOT NULL,
  `id_user_playlist` int(10) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Table structure for table `playlist_music`
--

CREATE TABLE `playlist_music` (
  `id_playlist_music` int(10) NOT NULL,
  `id_playlist` int(10) NOT NULL,
  `id_music` int(10) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Table structure for table `usuario`
--

CREATE TABLE `usuario` (
  `id_user` int(10) NOT NULL,
  `user_name` varchar(140) NOT NULL,
  `user_email` varchar(140) NOT NULL,
  `user_password` varchar(140) NOT NULL,
  `user_nivel` int(3) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `usuario`
--

INSERT INTO `usuario` (`id_user`, `user_name`, `user_email`, `user_password`, `user_nivel`) VALUES
(11, '', '', '', 2),
(12, 'Gisleude', 'gisleudenem@live.com', 'gis995511', 3),
(13, 'asdasd', '', '', 1),
(14, 'asdas', '', '', 1);

--
-- Indexes for dumped tables
--

--
-- Indexes for table `music`
--
ALTER TABLE `music`
  ADD PRIMARY KEY (`id_music`);

--
-- Indexes for table `playlist`
--
ALTER TABLE `playlist`
  ADD PRIMARY KEY (`id_playlist`);

--
-- Indexes for table `playlist_music`
--
ALTER TABLE `playlist_music`
  ADD PRIMARY KEY (`id_playlist_music`);

--
-- Indexes for table `usuario`
--
ALTER TABLE `usuario`
  ADD PRIMARY KEY (`id_user`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `music`
--
ALTER TABLE `music`
  MODIFY `id_music` int(10) NOT NULL AUTO_INCREMENT;
--
-- AUTO_INCREMENT for table `playlist`
--
ALTER TABLE `playlist`
  MODIFY `id_playlist` int(10) NOT NULL AUTO_INCREMENT;
--
-- AUTO_INCREMENT for table `playlist_music`
--
ALTER TABLE `playlist_music`
  MODIFY `id_playlist_music` int(10) NOT NULL AUTO_INCREMENT;
--
-- AUTO_INCREMENT for table `usuario`
--
ALTER TABLE `usuario`
  MODIFY `id_user` int(10) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=15;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
