package com.clement.renaudin.demo2javaspring.MonsterClass.Gestion_DB.gestionMonster;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;
import com.clement.renaudin.demo2javaspring.MonsterClass.monster.type_Monster.Crocro;
import com.clement.renaudin.demo2javaspring.MonsterClass.monster.type_Monster.Jef;
import com.clement.renaudin.demo2javaspring.MonsterClass.monster.type_Monster.Robot;

import java.util.List;

@Repository
public class MonsterRepositorie {

    private final JdbcTemplate jdbcTemplate;

    public MonsterRepositorie(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    private final RowMapper<Monster> monsterRowMapper = (rs, rowNum) ->  {
        long id = rs.getLong("id_Monster");
        String name = rs.getString("name");
        String etat = rs.getString("etat");
        int id_enclots = rs.getInt("id_enclots");
        int compteur_clique = rs.getInt("compteur_clique");
        int xp = rs.getInt("xp");

        Monster monster = switch (name.toUpperCase()) {
            case "JEF" -> new Jef(id, name, etat, id_enclots, compteur_clique, xp);
            case "CROCRO"  -> new Crocro(id, name, etat, id_enclots, compteur_clique, xp);
            case "ROBOT"     -> new Robot(id, name, etat, id_enclots, compteur_clique, xp);

            default -> throw new IllegalStateException("Type de monstre inconnu : " + name);
        };
        return monster;
    };


    public List<Monster> findAll() {
        return jdbcTemplate.query("SELECT id_Monster, name, emails, xp_client FROM monsters", monsterRowMapper);
    }

    public Monster findById(Long id_Monster) {
        return jdbcTemplate.queryForObject(
                "SELECT id_Monster, name, emails, xp_client FROM monsters WHERE id_Monster = ?",
                monsterRowMapper, id_Monster);
    }
}