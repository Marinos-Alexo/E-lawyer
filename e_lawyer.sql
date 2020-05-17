-- phpMyAdmin SQL Dump
-- version 4.8.5
-- https://www.phpmyadmin.net/
--
-- Φιλοξενητής: 127.0.0.1:3306
-- Χρόνος δημιουργίας: 17 Μάη 2020 στις 11:09:56
-- Έκδοση διακομιστή: 5.7.26
-- Έκδοση PHP: 7.2.18

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Βάση δεδομένων: `e_lawyer`
--

-- --------------------------------------------------------

--
-- Δομή πίνακα για τον πίνακα `dikigoriko_grafeio`
--

DROP TABLE IF EXISTS `dikigoriko_grafeio`;
CREATE TABLE IF NOT EXISTS `dikigoriko_grafeio` (
  `username_dikigoriko` char(9) NOT NULL,
  `password_dikigoriko` char(9) NOT NULL,
  `tel` bigint(16) DEFAULT NULL,
  `street` varchar(15) DEFAULT NULL,
  `num` tinyint(4) DEFAULT NULL,
  `city` varchar(15) DEFAULT NULL,
  `country` varchar(15) DEFAULT NULL,
  PRIMARY KEY (`username_dikigoriko`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Άδειασμα δεδομένων του πίνακα `dikigoriko_grafeio`
--

INSERT INTO `dikigoriko_grafeio` (`username_dikigoriko`, `password_dikigoriko`, `tel`, `street`, `num`, `city`, `country`) VALUES
('BigBoss', 'Bb12345', 2610256321, 'Maizonos', 123, 'Patra', 'Greece');

-- --------------------------------------------------------

--
-- Δομή πίνακα για τον πίνακα `dikigoros`
--

DROP TABLE IF EXISTS `dikigoros`;
CREATE TABLE IF NOT EXISTS `dikigoros` (
  `username_dikigoros` char(9) NOT NULL,
  `password_dikigoros` char(9) NOT NULL,
  `onoma_dik` varchar(15) NOT NULL,
  `epwnimo_dik` varchar(15) NOT NULL,
  `eidikotita` varchar(20) NOT NULL,
  `tel` bigint(16) DEFAULT NULL,
  `street` varchar(15) DEFAULT NULL,
  `num` tinyint(4) DEFAULT NULL,
  `city` varchar(15) DEFAULT NULL,
  `bio` text NOT NULL,
  PRIMARY KEY (`username_dikigoros`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Άδειασμα δεδομένων του πίνακα `dikigoros`
--

INSERT INTO `dikigoros` (`username_dikigoros`, `password_dikigoros`, `onoma_dik`, `epwnimo_dik`, `eidikotita`, `tel`, `street`, `num`, `city`, `bio`) VALUES
('lawyer1', 'fantomas', 'kwstas', 'alexop', 'EMPORIKO', 21516116, 'epidaurou', 8, 'Patra', 'o kaluteros dikigoros');

-- --------------------------------------------------------

--
-- Δομή πίνακα για τον πίνακα `pelatis`
--

DROP TABLE IF EXISTS `pelatis`;
CREATE TABLE IF NOT EXISTS `pelatis` (
  `username_pelatis` char(9) NOT NULL,
  `password_pelatis` char(9) NOT NULL,
  `onoma_pel` varchar(15) NOT NULL,
  `epwnimo_pel` varchar(15) NOT NULL,
  `tel` bigint(16) DEFAULT NULL,
  `street` varchar(15) DEFAULT NULL,
  `num` tinyint(4) DEFAULT NULL,
  `city` varchar(15) DEFAULT NULL,
  PRIMARY KEY (`username_pelatis`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Άδειασμα δεδομένων του πίνακα `pelatis`
--

INSERT INTO `pelatis` (`username_pelatis`, `password_pelatis`, `onoma_pel`, `epwnimo_pel`, `tel`, `street`, `num`, `city`) VALUES
('pelatis1', 'fantomas', 'Marinos', 'Alexopoulos', 56516129, 'navarinou', 21, 'Kalamata');
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
