CREATE TABLE users (
    id_user    SERIAL PRIMARY KEY,
    name  VARCHAR(100) NOT NULL,
    pword VARCHAR(150) NOT NULL,
    emails VARCHAR(150) UNIQUE NOT NULL,
    xp_Client INTEGER
);