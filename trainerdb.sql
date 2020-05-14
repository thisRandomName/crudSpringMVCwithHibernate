CREATE SCHEMA trainerdb;
USE trainerdb;
CREATE TABLE `trainerdb`.`trainer` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `firstName` VARCHAR(45) NOT NULL,
  `lastName` VARCHAR(45) NOT NULL,
  `trainerSubject` VARCHAR(45) NOT NULL,
  PRIMARY KEY (`id`));
  
  INSERT INTO  `trainerdb`.`trainer`(firstName,lastName,trainerSubject)
  VALUES('Albus','Dumbledore','Object Oriented Programming');
  
  INSERT INTO  `trainerdb`.`trainer`(firstName,lastName,trainerSubject)
  VALUES('Severus','Snape','Data Bases');
  
  INSERT INTO  `trainerdb`.`trainer`(firstName,lastName,trainerSubject)
  VALUES('Felix','Mendelssohn','Algorithms');
  
  INSERT INTO  `trainerdb`.`trainer`(firstName,lastName,trainerSubject)
  VALUES('Peter','Pan','Web applications');

