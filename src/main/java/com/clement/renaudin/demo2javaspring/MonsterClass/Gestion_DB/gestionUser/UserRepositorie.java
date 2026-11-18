package com.clement.renaudin.demo2javaspring.MonsterClass.Gestion_DB.gestionUser;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class UserRepositorie {

    private final JdbcTemplate jdbcTemplate;

    public UserRepositorie(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    private final RowMapper<User> userRowMapper = (rs, rowNum) -> new User(
            rs.getLong("id_user"),
            rs.getString("name"),
            rs.getString("emails"),
            rs.getInt("xp_client")
    );

    public List<User> findAll() {
        return jdbcTemplate.query("SELECT id_user, name, emails, xp_client FROM users", userRowMapper);
    }

    public User findById(Long id_user) {
        return jdbcTemplate.queryForObject(
                "SELECT id_user, name, emails, xp_client FROM users WHERE id_user = ?",
                userRowMapper, id_user);
    }
}