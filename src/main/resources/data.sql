DROP TABLE IF EXISTS Address;

CREATE TABLE Address
(
    id       INT AUTO_INCREMENT PRIMARY KEY,
    street_no VARCHAR(250) NOT NULL,
    street   VARCHAR(250) NOT NULL,
    city     VARCHAR(250) DEFAULT NULL,
    post     VARCHAR(250) DEFAULT NULL,
    post_no   INT          DEFAULT NULL
);