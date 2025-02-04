-- phpMyAdmin SQL Dump
-- version 4.3.11
-- http://www.phpmyadmin.net
--
-- Client :  127.0.0.1
-- Généré le :  Dim 23 Juin 2024 à 21:55
-- Version du serveur :  5.6.24
-- Version de PHP :  5.6.8

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

--
-- Base de données :  `stock`
--

-- --------------------------------------------------------

--
-- Structure de la table `tb_entrees`
--

CREATE TABLE IF NOT EXISTS `tb_entrees` (
  `num_entree` int(255) NOT NULL,
  `num_produit` int(255) DEFAULT NULL,
  `quantite_initial` int(255) NOT NULL,
  `quantite` int(255) NOT NULL,
  `pu` varchar(255) DEFAULT NULL,
  `stock` set('Stock 1','Stock 2') NOT NULL,
  `date_entree` date DEFAULT NULL
) ENGINE=InnoDB AUTO_INCREMENT=42 DEFAULT CHARSET=latin1;

--
-- Contenu de la table `tb_entrees`
--

INSERT INTO `tb_entrees` (`num_entree`, `num_produit`, `quantite_initial`, `quantite`, `pu`, `stock`, `date_entree`) VALUES
(11, 4, 1, 10, '500000', 'Stock 1', '2023-07-13'),
(13, 10, 0, 20, '500000', 'Stock 1', '2023-07-14'),
(16, 13, 0, 20, '500000', 'Stock 1', '2023-07-14'),
(18, 15, 0, 20, '200000', 'Stock 1', '2023-07-14'),
(19, 2, 0, 20, '1000', 'Stock 1', '2023-07-16'),
(20, 3, 0, 30, '50000', 'Stock 1', '2023-07-16'),
(21, 5, 0, 15, '500000', 'Stock 1', '2023-07-15'),
(22, 11, 0, 15, '800000', 'Stock 1', '2023-07-15'),
(23, 6, 0, 10, '50000', 'Stock 1', '2023-07-17'),
(24, 9, 0, 10, '25000', 'Stock 1', '2023-07-17'),
(26, 4, 8, 20, '500000', 'Stock 1', '2023-07-18'),
(27, 5, 15, 10, '400000', 'Stock 1', '2023-07-18'),
(28, 13, 20, 25, '100000', 'Stock 1', '2023-07-19'),
(29, 16, 0, 10, '500000', 'Stock 1', '2023-07-23'),
(31, 1, 19, 10, '800', 'Stock 1', '2023-07-23'),
(34, 13, 44, 6, '100000', 'Stock 1', '2023-07-30'),
(35, 6, 10, 5, '50000', 'Stock 1', '2023-08-01'),
(36, 18, 0, 10, '300000', 'Stock 1', '2023-08-01'),
(37, 6, 15, 10, '50000', 'Stock 2', '2023-08-27'),
(38, 13, 0, 5, '1000', 'Stock 1', '2023-10-17'),
(39, 25, 0, 10, '1000', 'Stock 1', '2023-10-17'),
(40, 20, 0, 10, '1200', 'Stock 1', '2023-10-17'),
(41, 22, 0, 10, '20000', 'Stock 1', '2023-10-23');

-- --------------------------------------------------------

--
-- Structure de la table `tb_produit`
--

CREATE TABLE IF NOT EXISTS `tb_produit` (
  `numero_prod` int(255) NOT NULL,
  `nom_prod` varchar(255) NOT NULL,
  `unite_de_mesure` varchar(255) NOT NULL
) ENGINE=InnoDB AUTO_INCREMENT=23 DEFAULT CHARSET=latin1;

--
-- Contenu de la table `tb_produit`
--

INSERT INTO `tb_produit` (`numero_prod`, `nom_prod`, `unite_de_mesure`) VALUES
(1, 'Coca', 'pcs'),
(2, 'Kinju', 'pcs'),
(3, 'Ventilateur', 'pcs'),
(4, 'TV', 'pcs'),
(5, 'LapTop', 'pcs'),
(6, 'Hub', 'pcs'),
(9, 'Startimes', 'pcs'),
(10, 'Tanga', 'pcs'),
(11, 'Freji', 'pcs'),
(13, 'Garde Robe', 'pcs'),
(14, 'Armoir', 'pcs'),
(15, 'Playstation', 'pcs'),
(16, 'Iphone', 'pcs'),
(18, 'Samsung', 'pcs'),
(20, 'Farine', 'Kg'),
(22, 'Apple', 'douzene');

-- --------------------------------------------------------

--
-- Structure de la table `tb_sorties`
--

CREATE TABLE IF NOT EXISTS `tb_sorties` (
  `num_sortie` int(255) NOT NULL,
  `num_produit` int(255) DEFAULT NULL,
  `qt_sortie` int(255) NOT NULL,
  `pv` int(255) NOT NULL,
  `stock` set('Stock 1','Stock 2') NOT NULL,
  `date_sortie` date DEFAULT NULL
) ENGINE=InnoDB AUTO_INCREMENT=33 DEFAULT CHARSET=latin1;

--
-- Contenu de la table `tb_sorties`
--

INSERT INTO `tb_sorties` (`num_sortie`, `num_produit`, `qt_sortie`, `pv`, `stock`, `date_sortie`) VALUES
(6, 15, 10, 100000, 'Stock 1', '2023-07-15'),
(13, 9, 5, 50000, 'Stock 1', '2023-07-19'),
(23, 5, 10, 700000, 'Stock 1', '2023-07-19'),
(24, 4, 2, 600000, 'Stock 1', '2023-07-26'),
(25, 1, 5, 1200, 'Stock 1', '2023-07-20'),
(28, 2, 3, 1000, 'Stock 1', '2023-08-20'),
(29, 13, 10, 120000, 'Stock 1', '2023-07-30'),
(30, 5, 5, 800000, 'Stock 1', '2023-08-03'),
(31, 1, 10, 1500, 'Stock 2', '2023-08-27'),
(32, 13, 5, 600000, 'Stock 1', '2023-10-16');

-- --------------------------------------------------------

--
-- Structure de la table `tb_stock1`
--

CREATE TABLE IF NOT EXISTS `tb_stock1` (
  `num_Article` int(255) NOT NULL,
  `nom` varchar(255) NOT NULL,
  `qt_initial` int(255) NOT NULL,
  `qt_entrees` int(255) NOT NULL,
  `qt_sorties` int(255) NOT NULL,
  `qt_SF` int(255) NOT NULL,
  `date` timestamp NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Contenu de la table `tb_stock1`
--

INSERT INTO `tb_stock1` (`num_Article`, `nom`, `qt_initial`, `qt_entrees`, `qt_sorties`, `qt_SF`, `date`) VALUES
(1, 'Coca', 0, 24, 5, 19, '2023-07-21 11:29:05'),
(3, 'Ventilateur', 0, 30, 0, 30, '2023-07-21 11:29:05'),
(4, 'TV', 1, 30, 1, 30, '2023-07-21 11:29:05'),
(5, 'LapTop', 0, 25, 10, 15, '2023-07-21 11:29:05'),
(6, 'Hub', 0, 10, 0, 10, '2023-07-21 11:29:05'),
(9, 'Startimes', 0, 10, 5, 5, '2023-07-21 11:29:04'),
(10, 'Tanga', 0, 20, 0, 20, '2023-07-21 11:29:05'),
(11, 'Freji', 0, 15, 0, 15, '2023-07-21 11:29:05'),
(13, 'Garde Robe', 0, 44, 0, 44, '2023-07-21 11:29:05'),
(14, 'Armoir', 0, 20, 3, 17, '2023-07-21 11:29:04'),
(15, 'Playstation', 0, 40, 15, 25, '2023-07-21 11:29:04'),
(16, 'Iphone', 0, 10, 0, 10, '2023-07-30 10:41:22');

-- --------------------------------------------------------

--
-- Structure de la table `tb_utilisateur`
--

CREATE TABLE IF NOT EXISTS `tb_utilisateur` (
  `id` int(255) NOT NULL,
  `nom_ut` varchar(255) NOT NULL,
  `motdepasse` varchar(255) NOT NULL
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=latin1;

--
-- Contenu de la table `tb_utilisateur`
--

INSERT INTO `tb_utilisateur` (`id`, `nom_ut`, `motdepasse`) VALUES
(1, 'saidi2023', '1234');

--
-- Index pour les tables exportées
--

--
-- Index pour la table `tb_entrees`
--
ALTER TABLE `tb_entrees`
  ADD PRIMARY KEY (`num_entree`), ADD KEY `num_produit` (`num_produit`);

--
-- Index pour la table `tb_produit`
--
ALTER TABLE `tb_produit`
  ADD PRIMARY KEY (`numero_prod`);

--
-- Index pour la table `tb_sorties`
--
ALTER TABLE `tb_sorties`
  ADD PRIMARY KEY (`num_sortie`), ADD KEY `num_produit` (`num_produit`);

--
-- Index pour la table `tb_stock1`
--
ALTER TABLE `tb_stock1`
  ADD PRIMARY KEY (`num_Article`);

--
-- Index pour la table `tb_utilisateur`
--
ALTER TABLE `tb_utilisateur`
  ADD PRIMARY KEY (`id`);

--
-- AUTO_INCREMENT pour les tables exportées
--

--
-- AUTO_INCREMENT pour la table `tb_entrees`
--
ALTER TABLE `tb_entrees`
  MODIFY `num_entree` int(255) NOT NULL AUTO_INCREMENT,AUTO_INCREMENT=42;
--
-- AUTO_INCREMENT pour la table `tb_produit`
--
ALTER TABLE `tb_produit`
  MODIFY `numero_prod` int(255) NOT NULL AUTO_INCREMENT,AUTO_INCREMENT=23;
--
-- AUTO_INCREMENT pour la table `tb_sorties`
--
ALTER TABLE `tb_sorties`
  MODIFY `num_sortie` int(255) NOT NULL AUTO_INCREMENT,AUTO_INCREMENT=33;
--
-- AUTO_INCREMENT pour la table `tb_utilisateur`
--
ALTER TABLE `tb_utilisateur`
  MODIFY `id` int(255) NOT NULL AUTO_INCREMENT,AUTO_INCREMENT=2;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
