-- phpMyAdmin SQL Dump
-- version 5.0.2
-- https://www.phpmyadmin.net/
--
-- Φιλοξενητής: 127.0.0.1
-- Χρόνος δημιουργίας: 09 Ιουν 2020 στις 21:42:36
-- Έκδοση διακομιστή: 10.4.11-MariaDB
-- Έκδοση PHP: 7.2.31

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
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
-- Δομή πίνακα για τον πίνακα `aitimata`
--

CREATE TABLE `aitimata` (
  `aitima_id` int(9) NOT NULL,
  `username_pel` varchar(25) COLLATE utf8_bin NOT NULL,
  `imerominia` date NOT NULL,
  `wra` varchar(25) COLLATE utf8_bin NOT NULL,
  `perigrafi` text COLLATE utf8_bin NOT NULL,
  `username_dik` varchar(25) COLLATE utf8_bin NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

-- --------------------------------------------------------

--
-- Δομή πίνακα για τον πίνακα `dikigoriko_grafeio`
--

CREATE TABLE `dikigoriko_grafeio` (
  `username_dikigoriko` char(9) COLLATE utf8_bin NOT NULL,
  `password_dikigoriko` char(9) COLLATE utf8_bin NOT NULL,
  `tel` bigint(16) DEFAULT NULL,
  `street` varchar(15) COLLATE utf8_bin DEFAULT NULL,
  `num` tinyint(4) DEFAULT NULL,
  `city` varchar(15) COLLATE utf8_bin DEFAULT NULL,
  `country` varchar(15) COLLATE utf8_bin DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

--
-- Άδειασμα δεδομένων του πίνακα `dikigoriko_grafeio`
--

INSERT INTO `dikigoriko_grafeio` (`username_dikigoriko`, `password_dikigoriko`, `tel`, `street`, `num`, `city`, `country`) VALUES
('BigBoss', 'Bb12345', 2610256321, 'Maizonos', 123, 'Patra', 'Greece');

-- --------------------------------------------------------

--
-- Δομή πίνακα για τον πίνακα `dikigoros`
--

CREATE TABLE `dikigoros` (
  `id_dik` int(9) NOT NULL,
  `username_dikigoros` char(9) COLLATE utf8_bin NOT NULL,
  `password_dikigoros` char(9) COLLATE utf8_bin NOT NULL,
  `onoma_dik` varchar(15) COLLATE utf8_bin NOT NULL,
  `epwnimo_dik` varchar(15) COLLATE utf8_bin NOT NULL,
  `eidikotita` varchar(20) COLLATE utf8_bin NOT NULL,
  `tel` bigint(16) DEFAULT NULL,
  `street` varchar(15) COLLATE utf8_bin DEFAULT NULL,
  `email` varchar(25) COLLATE utf8_bin DEFAULT NULL,
  `city` varchar(15) COLLATE utf8_bin DEFAULT NULL,
  `bio` mediumtext COLLATE utf8_bin NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

--
-- Άδειασμα δεδομένων του πίνακα `dikigoros`
--

INSERT INTO `dikigoros` (`id_dik`, `username_dikigoros`, `password_dikigoros`, `onoma_dik`, `epwnimo_dik`, `eidikotita`, `tel`, `street`, `email`, `city`, `bio`) VALUES
(1, 'fantomas', 'fantomas', 'Μαρίνος', 'Αλεξόπουλος', 'Εμπορικό', 6516165, 'ναυαρίνου', '7', 'Καλαμάτα', 'ρδγρρδργεερρρ'),
(2, 'lawyer1', 'fantomas', 'Κώστας', 'Αλεξόπουλος', 'Αστικό', 21516116, 'epidaurou', '8', 'Patra', 'o kaluteros dikigoros');

-- --------------------------------------------------------

--
-- Δομή πίνακα για τον πίνακα `ekvasi`
--

CREATE TABLE `ekvasi` (
  `ar_prwtokollou_e` bigint(25) NOT NULL,
  `ekvasi_yp` enum('Θετική','Αρνητική') COLLATE utf8_bin NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

--
-- Άδειασμα δεδομένων του πίνακα `ekvasi`
--

INSERT INTO `ekvasi` (`ar_prwtokollou_e`, `ekvasi_yp`) VALUES
(123, 'Θετική'),
(515, 'Θετική'),
(4030, 'Θετική'),
(101010, 'Θετική');

-- --------------------------------------------------------

--
-- Δομή πίνακα για τον πίνακα `event`
--

CREATE TABLE `event` (
  `id_event` int(9) NOT NULL,
  `username_dik` varchar(25) COLLATE utf8_bin NOT NULL,
  `perigrafi` text COLLATE utf8_bin NOT NULL,
  `imerominia` date NOT NULL,
  `wra` varchar(25) COLLATE utf8_bin NOT NULL,
  `username_pel` varchar(25) COLLATE utf8_bin NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

--
-- Άδειασμα δεδομένων του πίνακα `event`
--

INSERT INTO `event` (`id_event`, `username_dik`, `perigrafi`, `imerominia`, `wra`, `username_pel`) VALUES
(2, 'fantomas', 'dfrfrgdr', '2020-07-08', '09:00 AM', 'pelatis1'),
(5, 'lawyer1', 'Απορίες', '2020-06-19', '03:57 PM', 'kantwn');

-- --------------------------------------------------------

--
-- Δομή πίνακα για τον πίνακα `formes_ep`
--

CREATE TABLE `formes_ep` (
  `dikaio` varchar(25) COLLATE utf8_bin NOT NULL,
  `perigrafi` text COLLATE utf8_bin NOT NULL,
  `yp_pel` varchar(25) COLLATE utf8_bin NOT NULL,
  `antidikos` text COLLATE utf8_bin NOT NULL,
  `imerominia` date NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

--
-- Άδειασμα δεδομένων του πίνακα `formes_ep`
--

INSERT INTO `formes_ep` (`dikaio`, `perigrafi`, `yp_pel`, `antidikos`, `imerominia`) VALUES
('Αστικό', 'Περιοριστικά μέτρα λόγω διαζυγίου', 'kantwn', 'Μαρία Αντωνίου', '2020-06-07');

-- --------------------------------------------------------

--
-- Δομή πίνακα για τον πίνακα `ofeiles`
--

CREATE TABLE `ofeiles` (
  `of_username` varchar(25) COLLATE utf8_bin NOT NULL,
  `poso` int(9) NOT NULL,
  `ar_prwtokollou_o` bigint(25) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

--
-- Άδειασμα δεδομένων του πίνακα `ofeiles`
--

INSERT INTO `ofeiles` (`of_username`, `poso`, `ar_prwtokollou_o`) VALUES
('pelatis1', 500, 123),
('pelatis1', 100, 515),
('kantwn', 1000, 101010);

-- --------------------------------------------------------

--
-- Δομή πίνακα για τον πίνακα `pelatis`
--

CREATE TABLE `pelatis` (
  `id_pel` int(9) NOT NULL,
  `username_pelatis` varchar(9) COLLATE utf8_bin NOT NULL,
  `password_pelatis` varchar(9) COLLATE utf8_bin NOT NULL,
  `onoma_pel` varchar(15) COLLATE utf8_bin NOT NULL,
  `epwnimo_pel` varchar(15) COLLATE utf8_bin NOT NULL,
  `tel` bigint(16) DEFAULT NULL,
  `street` varchar(15) COLLATE utf8_bin DEFAULT NULL,
  `city` varchar(15) COLLATE utf8_bin DEFAULT NULL,
  `afm` int(9) NOT NULL,
  `email` varchar(25) COLLATE utf8_bin NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

--
-- Άδειασμα δεδομένων του πίνακα `pelatis`
--

INSERT INTO `pelatis` (`id_pel`, `username_pelatis`, `password_pelatis`, `onoma_pel`, `epwnimo_pel`, `tel`, `street`, `city`, `afm`, `email`) VALUES
(2, 'pelatis1', 'fantomas', 'Γιώργος ', 'Λώλης', 6516165, 'Καραμανλή 8', 'Αθήνα', 0, ''),
(3, 'dalexo', 'fantomas', 'Δημήτρης', 'Αλεξόπουλος', 51651651, 'Ναυαρίνου', 'Καλαμάτα', 101010, 'dalexo@gmail.com'),
(4, 'kantwn', 'fantomas', 'Κώστας', 'Αντωνίου ', 1651651161, 'Παπανδρέου 10', 'Αθήνα', 10101, 'Kant@gmail.com');

-- --------------------------------------------------------

--
-- Δομή πίνακα για τον πίνακα `timer`
--

CREATE TABLE `timer` (
  `ar_prwtokollou_t` bigint(25) NOT NULL,
  `hours` double NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

--
-- Άδειασμα δεδομένων του πίνακα `timer`
--

INSERT INTO `timer` (`ar_prwtokollou_t`, `hours`) VALUES
(123, 5.716666666666667),
(515, 1.303611111111111);

-- --------------------------------------------------------

--
-- Δομή πίνακα για τον πίνακα `uliko`
--

CREATE TABLE `uliko` (
  `ar_prwtokollou_a` bigint(25) NOT NULL,
  `arxeio` longblob NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

-- --------------------------------------------------------

--
-- Δομή πίνακα για τον πίνακα `ypothesi`
--

CREATE TABLE `ypothesi` (
  `ar_prwtokollou` bigint(25) NOT NULL,
  `yp_dik` varchar(25) COLLATE utf8_bin NOT NULL,
  `imerominia` date NOT NULL,
  `dikaio` varchar(25) COLLATE utf8_bin NOT NULL,
  `perigrafi` text COLLATE utf8_bin NOT NULL,
  `antidikos` text COLLATE utf8_bin NOT NULL,
  `katastasi` enum('Ενεργή','Ολοκληρωμένη') COLLATE utf8_bin NOT NULL,
  `pelatis_usr` varchar(25) COLLATE utf8_bin NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

--
-- Άδειασμα δεδομένων του πίνακα `ypothesi`
--

INSERT INTO `ypothesi` (`ar_prwtokollou`, `yp_dik`, `imerominia`, `dikaio`, `perigrafi`, `antidikos`, `katastasi`, `pelatis_usr`) VALUES
(123, 'fantomas', '2020-08-09', 'Εμπορικό', 'ρφρρφρρ', 'σρφρρ', 'Ενεργή', 'pelatis1'),
(515, 'fantomas', '2020-08-09', 'Εμπορικό', 'γφθυγθυγκγιυγυ', 'Παναγιώτης', 'Ενεργή', 'pelatis1'),
(4030, 'fantomas', '2020-08-09', 'Εμπορικό', 'ΚΓΓΚΘΗΚΘΗΘΚΗΚΘΚΗΘ', 'ΝΗΞΒΞΗΩΗΞ', 'Ολοκληρωμένη', ''),
(101010, 'lawyer1', '2020-09-23', 'Αστικό', 'Περιοριστικά Μέτρα', 'Μαρία αντωνίου', 'Ολοκληρωμένη', 'kantwn');

--
-- Ευρετήρια για άχρηστους πίνακες
--

--
-- Ευρετήρια για πίνακα `aitimata`
--
ALTER TABLE `aitimata`
  ADD PRIMARY KEY (`aitima_id`);

--
-- Ευρετήρια για πίνακα `dikigoriko_grafeio`
--
ALTER TABLE `dikigoriko_grafeio`
  ADD PRIMARY KEY (`username_dikigoriko`);

--
-- Ευρετήρια για πίνακα `dikigoros`
--
ALTER TABLE `dikigoros`
  ADD PRIMARY KEY (`id_dik`);

--
-- Ευρετήρια για πίνακα `ekvasi`
--
ALTER TABLE `ekvasi`
  ADD PRIMARY KEY (`ar_prwtokollou_e`);

--
-- Ευρετήρια για πίνακα `event`
--
ALTER TABLE `event`
  ADD PRIMARY KEY (`id_event`);

--
-- Ευρετήρια για πίνακα `ofeiles`
--
ALTER TABLE `ofeiles`
  ADD PRIMARY KEY (`ar_prwtokollou_o`);

--
-- Ευρετήρια για πίνακα `pelatis`
--
ALTER TABLE `pelatis`
  ADD PRIMARY KEY (`id_pel`);

--
-- Ευρετήρια για πίνακα `timer`
--
ALTER TABLE `timer`
  ADD PRIMARY KEY (`ar_prwtokollou_t`);

--
-- Ευρετήρια για πίνακα `uliko`
--
ALTER TABLE `uliko`
  ADD PRIMARY KEY (`ar_prwtokollou_a`);

--
-- Ευρετήρια για πίνακα `ypothesi`
--
ALTER TABLE `ypothesi`
  ADD PRIMARY KEY (`ar_prwtokollou`);

--
-- AUTO_INCREMENT για άχρηστους πίνακες
--

--
-- AUTO_INCREMENT για πίνακα `aitimata`
--
ALTER TABLE `aitimata`
  MODIFY `aitima_id` int(9) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;

--
-- AUTO_INCREMENT για πίνακα `dikigoros`
--
ALTER TABLE `dikigoros`
  MODIFY `id_dik` int(9) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;

--
-- AUTO_INCREMENT για πίνακα `event`
--
ALTER TABLE `event`
  MODIFY `id_event` int(9) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=6;

--
-- AUTO_INCREMENT για πίνακα `pelatis`
--
ALTER TABLE `pelatis`
  MODIFY `id_pel` int(9) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=6;

--
-- Περιορισμοί για άχρηστους πίνακες
--

--
-- Περιορισμοί για πίνακα `ekvasi`
--
ALTER TABLE `ekvasi`
  ADD CONSTRAINT `ar_ptr` FOREIGN KEY (`ar_prwtokollou_e`) REFERENCES `ypothesi` (`ar_prwtokollou`) ON DELETE CASCADE ON UPDATE CASCADE;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
