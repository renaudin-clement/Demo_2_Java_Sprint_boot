INSERT INTO users (id_user, name, pword, emails, xp)

VALUES
    (1, "jack", "12345", "jack@example.com", 0),
    (2, "jill", "vivialavi", "jill@example.com", 0),
    (3, "john", "12douze", "john@example.com", 0);



INSERT INTO enclotMonsters (id_enclots, id_user,xp_total, nameEnclot)

VALUES
    (1, 1, 0, "Jackyrolling"),
    (2, 2, 0, "clubMonster"),
    (3, 3, 0, "Marcopolo");


INSERT INTO monsters (id_monsters, id_enclots, name,Etat, compteur_clique, xp)

VALUES
    (1, 1, "jef", 'et1', 0,0),
    (2, 1, "robot", 'et1', 0,0),
    (3, 1, "crocro", 'et1', 0,0),

    (4, 2, "jef", 'et1', 0,0),
    (5, 2, "robot", 'et1', 0,0),
    (6, 2, "crocro", 'et1', 0,0),

    (7, 3, "jef", 'et1', 0,0),
    (8, 3, "robot", 'et1', 0,0),
    (9, 3, "crocro", 'et1', 0,0);