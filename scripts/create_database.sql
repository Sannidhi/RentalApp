drop database if exists rentalapp_test;
drop database if exists rentalapp;

create database rentalapp_test;
create database rentalapp;

use rentalapp;

CREATE TABLE listing (
  id bigint(20) NOT NULL auto_increment,
  address varchar(255) DEFAULT NULL,
  contact varchar(255) DEFAULT NULL,
  numberOfBedrooms int(11) DEFAULT NULL,
  price bigint(20) DEFAULT NULL,
  squareFootage double DEFAULT NULL,
  PRIMARY KEY (id)
) ;