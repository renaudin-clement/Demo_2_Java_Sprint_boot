package com.clement.renaudin.demo2javaspring.MonsterClass.Gestion_DB.gestionMonster;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class MonsterRepositorie {

    private final JdbcTemplate jdbcTemplate;

    public MonsterRepositorie(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    private final RowMapper<Monster> monsterRowMapper = (rs, rowNum) -> new Monster(
            rs.getLong("id_Monster"),
            rs.getString("name"),
            rs.getString("etat"),
            rs.getInt("id_enclots"),
            rs.getInt("compteur_clique"),
            rs.getInt("xp")
    );

    public List<Monster> findAll() {
        return jdbcTemplate.query("SELECT id_Monster, name, emails, xp_client FROM monsters", monsterRowMapper);
    }

    public Monster findById(Long id_Monster) {
        return jdbcTemplate.queryForObject(
                "SELECT id_Monster, name, emails, xp_client FROM monsters WHERE id_Monster = ?",
                monsterRowMapper, id_Monster);
    }
}