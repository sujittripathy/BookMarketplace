DROP TABLE BOOK IF EXISTS

CREATE TABLE BOOK
 (
    ISBN INTEGER PRIMARY KEY,
    TITLE VARCHAR(100),
    AUTHOR VARCHAR(100),
    GENDER VARCHAR(10),
    PUBLISHER VARCHAR(100),
    COUNTRY VARCHAR(100),
 );