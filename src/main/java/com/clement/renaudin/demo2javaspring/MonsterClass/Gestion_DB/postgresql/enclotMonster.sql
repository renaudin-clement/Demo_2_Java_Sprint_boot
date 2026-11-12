CREATE TABLE enclotMonsters (
    id_enclots     SERIAL PRIMARY KEY,
    id_user    INTEGER REFERENCES users(id_user),
    xp_total INTEGER,
    nameEnclot  VARCHAR(100) NOT NULL,
);