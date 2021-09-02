DROP TABLE IF EXISTS LocationTbl;
DROP TABLE IF EXISTS ValidLocationTbl;
DROP TABLE IF EXISTS DestinationTbl;
DROP TABLE IF EXISTS TicketTbL;
DROP TABLE IF EXISTS UserLoginTbL;

CREATE TABLE LocationTbl
(
	venue TEXT PRIMARY KEY
);

CREATE TABLE ValidLocationTbl
(
	venue TEXT PRIMARY KEY
);

CREATE TABLE DestinationTbl
(
	picnic_name TEXT PRIMARY KEY,	
	venue TEXT NOT NULL,
	price REAL NOT NULL
);

CREATE TABLE TicketTbL
(
	id SERIAL PRIMARY KEY,
	username TEXT NOT NULL,
	picnic_name TEXT NOT NULL,	
	venue TEXT NOT NULL,
	price REAL NOT NULL,
	date_of_order DATE NOT NULL
);

CREATE TABLE UserLoginTbL
(	
	username TEXT PRIMARY KEY,
	fullname TEXT NOT NULL,
	age INTEGER NOT NULL,	
	current_address TEXT NOT NULL,
	pass TEXT NOT NULL
);

INSERT INTO LocationTbl(venue) VALUES ('Oyo');
INSERT INTO LocationTbl(venue) VALUES ('Lagos');
INSERT INTO LocationTbl(venue) VALUES ('Abuja');
INSERT INTO LocationTbl(venue) VALUES ('Sokoto');
INSERT INTO LocationTbl(venue) VALUES ('Kwara');