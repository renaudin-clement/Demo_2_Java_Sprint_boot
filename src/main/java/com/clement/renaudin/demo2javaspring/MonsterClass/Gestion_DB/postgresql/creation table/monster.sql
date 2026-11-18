CREATE TABLE monsters (
    id_monsters    SERIAL PRIMARY KEY,
    id_enclots INTEGER REFERENCES enclotMonsters(id_enclots),
    name  VARCHAR(100) NOT NULL,
    Etat VARCHAR(3) NOT NULL,
    compteur_clique INTEGER,
    xp INTEGER
);