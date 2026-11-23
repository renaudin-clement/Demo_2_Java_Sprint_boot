package com.clement.renaudin.demo2javaspring.MonsterClass.Gestion_DB.gestionEnclots;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class EnclotsRepositorie {
    private final JdbcTemplate jdbcTemplate;

    public EnclotsRepositorie(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    private final RowMapper<Enclots> enclotsRowMapper = (rs, rowNum) -> new Enclots(
            rs.getLong("id_enclots"),
            rs.getLong("id_user"),
            rs.getLong("xp_total"),
            rs.getString("nameEnclot")
    );
    

    public List<Enclots> findAll() {
        return jdbcTemplate.query("SELECT id_enclots, id_user, xp_total, nameEnclot FROM enclotMonsters", enclotsRowMapper);
    }

    public Enclots findById(Long id_enclots) {
        return jdbcTemplate.queryForObject(
                "SELECT id_enclots, id_user, xp_total, nameEnclot FROM enclotMonsters WHERE id_enclots = ?",
                enclotsRowMapper, id_enclots);
    }

}


