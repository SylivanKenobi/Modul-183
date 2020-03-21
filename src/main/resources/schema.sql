SET NAMES 'utf8';
DROP DATABASE IF EXISTS fulla;
CREATE DATABASE fulla CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci;
USE fulla;

CREATE TABLE artikel (
    id INTEGER NOT NULL AUTO_INCREMENT,
    bezeichnung VARCHAR(255) NOT NULL,
    bestand INTEGER NOT NULL,
    preis DECIMAL(10,2) NOT NULL,
    PRIMARY KEY (id)
) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci;

CREATE TABLE kunde (
    id INTEGER NOT NULL AUTO_INCREMENT,
    name VARCHAR(255) NOT NULL,
    postanschrift VARCHAR(255) NOT NULL,
    kreditkarte VARCHAR(16),
    PRIMARY KEY (id)
) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci;

CREATE TABLE kauf (
    id INTEGER NOT NULL AUTO_INCREMENT,
    id_kunde INTEGER,
    id_artikel INTEGER,
    menge INTEGER NOT NULL,
    zeitpunkt DATETIME NOT NULL,
    PRIMARY KEY (id),
    FOREIGN KEY (id_kunde) REFERENCES kunde(id) ON DELETE SET NULL,
    FOREIGN KEY (id_artikel) REFERENCES artikel(id) ON DELETE SET NULL
) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci;

CREATE TABLE user (
    id INTEGER NOT NULL AUTO_INCREMENT,
    id_kunde INTEGER NOT NULL,
    name VARCHAR(255) NOT NULL,
    berechtigung BOOLEAN NOT NULL,
    pw_algo VARCHAR(255) NOT NULL,
    algo_param INTEGER NOT NULL,
    pw_hash VARCHAR(255) NOT NULL,
    pw_salt VARCHAR(255) NOT NULL,
    PRIMARY KEY (id),
    FOREIGN KEY (id_kunde) REFERENCES kunde(id) ON DELETE CASCADE
) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci;
