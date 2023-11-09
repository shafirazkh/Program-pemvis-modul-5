-- phpMyAdmin SQL Dump
-- version 5.0.2
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1:3307
-- Waktu pembuatan: 09 Nov 2023 pada 14.32
-- Versi server: 10.4.14-MariaDB
-- Versi PHP: 7.4.10

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `modul5pemvis`
--

-- --------------------------------------------------------

--
-- Struktur dari tabel `data_penjualan`
--

CREATE TABLE `data_penjualan` (
  `costumer` varchar(20) NOT NULL,
  `nama_barang` varchar(20) NOT NULL,
  `kode_barang` varchar(10) NOT NULL,
  `harga_barang` varchar(20) NOT NULL,
  `total_barang` int(2) NOT NULL,
  `subtotal` varchar(20) NOT NULL,
  `tunai` varchar(20) NOT NULL,
  `kembali` varchar(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data untuk tabel `data_penjualan`
--

INSERT INTO `data_penjualan` (`costumer`, `nama_barang`, `kode_barang`, `harga_barang`, `total_barang`, `subtotal`, `tunai`, `kembali`) VALUES
('cahyo', 'Vintage Jeans', 'C700', '21200000', 1, '2120000', '250000', '380000'),
('lala', 'Blazer', 'C400', '15300000', 2, '3060000', '310000', '40000'),
('shafira1', 'Wool Coat', 'C300', '22200000', 4, '8880000', '900000', '120000'),
('vivian', 'Tweed Jacket', 'C600', '12300000', 1, '1230000', '150000', '270000');

--
-- Indexes for dumped tables
--

--
-- Indeks untuk tabel `data_penjualan`
--
ALTER TABLE `data_penjualan`
  ADD PRIMARY KEY (`costumer`,`nama_barang`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
