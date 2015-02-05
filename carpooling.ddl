ALTER TABLE Adress DROP FOREIGN KEY lives;
DROP TABLE IF EXISTS `User`;
DROP TABLE IF EXISTS Adress;
CREATE TABLE `User` (ID int(10) NOT NULL AUTO_INCREMENT, Firstname varchar(255), Lastname varchar(255), Email varchar(255), Birthdate date, Mobile varchar(255), PRIMARY KEY (ID)) ENGINE=InnoDB;
CREATE TABLE Adress (ID int(10) NOT NULL AUTO_INCREMENT, UserID int(10) NOT NULL, Line1 varchar(255), Line2 varchar(255), Line3 varchar(255), Zipcode varchar(255), City varchar(255), Country varchar(255), PRIMARY KEY (ID)) ENGINE=InnoDB;
ALTER TABLE Adress ADD INDEX lives (UserID), ADD CONSTRAINT lives FOREIGN KEY (UserID) REFERENCES `User` (ID);
