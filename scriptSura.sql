-- MySQL Workbench Forward Engineering

SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='ONLY_FULL_GROUP_BY,STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_ENGINE_SUBSTITUTION';

-- -----------------------------------------------------
-- Schema mydb
-- -----------------------------------------------------
-- -----------------------------------------------------
-- Schema sura
-- -----------------------------------------------------

-- -----------------------------------------------------
-- Schema sura
-- -----------------------------------------------------
CREATE SCHEMA IF NOT EXISTS `sura` DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci ;
USE `sura` ;

-- -----------------------------------------------------
-- Table `sura`.`construcciones`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `sura`.`construcciones` (
  `idtipo` INT NOT NULL AUTO_INCREMENT COMMENT 'Identificador del tipo de construcción',
  `tipo` VARCHAR(45) NOT NULL COMMENT 'Nombre del tipo de construcción',
  PRIMARY KEY (`idtipo`))
ENGINE = InnoDB
AUTO_INCREMENT = 4
DEFAULT CHARACTER SET = utf8mb4
COLLATE = utf8mb4_0900_ai_ci;


-- -----------------------------------------------------
-- Table `sura`.`materiales`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `sura`.`materiales` (
  `idmaterial` INT NOT NULL AUTO_INCREMENT COMMENT 'Identificador del material',
  `material` VARCHAR(45) NOT NULL COMMENT 'Nombre del material',
  PRIMARY KEY (`idmaterial`))
ENGINE = InnoDB
AUTO_INCREMENT = 4
DEFAULT CHARACTER SET = utf8mb4
COLLATE = utf8mb4_0900_ai_ci
COMMENT = 'Tabla de materiales';


-- -----------------------------------------------------
-- Table `sura`.`roles`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `sura`.`roles` (
  `idrol` INT NOT NULL AUTO_INCREMENT COMMENT 'identificador del rol',
  `rol` VARCHAR(45) NOT NULL COMMENT 'Nombre del rol',
  PRIMARY KEY (`idrol`))
ENGINE = InnoDB
AUTO_INCREMENT = 5
DEFAULT CHARACTER SET = utf8mb4
COLLATE = utf8mb4_0900_ai_ci;


-- -----------------------------------------------------
-- Table `sura`.`solicitudes`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `sura`.`solicitudes` (
  `idsol` INT NOT NULL AUTO_INCREMENT,
  `idtipo` INT NOT NULL,
  `idrol` INT NOT NULL,
  `corx` INT NULL DEFAULT NULL,
  `cory` INT NULL DEFAULT NULL,
  PRIMARY KEY (`idsol`),
  INDEX `solicitudes_ibfk_1` (`idtipo` ASC) VISIBLE,
  INDEX `solicitudes_ibfk_2` (`idrol` ASC) VISIBLE,
  CONSTRAINT `solicitudes_ibfk_1`
    FOREIGN KEY (`idtipo`)
    REFERENCES `sura`.`construcciones` (`idtipo`),
  CONSTRAINT `solicitudes_ibfk_2`
    FOREIGN KEY (`idrol`)
    REFERENCES `sura`.`roles` (`idrol`))
ENGINE = InnoDB
AUTO_INCREMENT = 5
DEFAULT CHARACTER SET = utf8mb4
COLLATE = utf8mb4_0900_ai_ci;


-- -----------------------------------------------------
-- Table `sura`.`ordenes`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `sura`.`ordenes` (
  `idorden` INT NOT NULL AUTO_INCREMENT,
  `idsol` INT NOT NULL,
  `estado` VARCHAR(1) NOT NULL,
  `fechaentrega` DATE NOT NULL,
  PRIMARY KEY (`idorden`),
  INDEX `fk_solicitudes` (`idsol` ASC) VISIBLE,
  CONSTRAINT `fk_solicitudes`
    FOREIGN KEY (`idsol`)
    REFERENCES `sura`.`solicitudes` (`idsol`))
ENGINE = InnoDB
AUTO_INCREMENT = 3
DEFAULT CHARACTER SET = utf8mb4
COLLATE = utf8mb4_0900_ai_ci;


-- -----------------------------------------------------
-- Table `sura`.`parametros`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `sura`.`parametros` (
  `idparam` INT NOT NULL AUTO_INCREMENT,
  `idtipo` INT NOT NULL,
  `idmaterial` INT NOT NULL,
  `icantidad` INT NULL DEFAULT NULL,
  `idias` INT NULL DEFAULT NULL,
  PRIMARY KEY (`idparam`, `idtipo`, `idmaterial`),
  INDEX `idtipo` (`idtipo` ASC) VISIBLE,
  INDEX `idmaterial` (`idmaterial` ASC) VISIBLE,
  CONSTRAINT `parametros_ibfk_1`
    FOREIGN KEY (`idtipo`)
    REFERENCES `sura`.`construcciones` (`idtipo`),
  CONSTRAINT `parametros_ibfk_2`
    FOREIGN KEY (`idmaterial`)
    REFERENCES `sura`.`materiales` (`idmaterial`))
ENGINE = InnoDB
AUTO_INCREMENT = 2
DEFAULT CHARACTER SET = utf8mb4
COLLATE = utf8mb4_0900_ai_ci;


SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;
