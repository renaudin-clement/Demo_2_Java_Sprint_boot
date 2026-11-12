package com.clement.renaudin.demo2javaspring.MonsterClass.Gestion_DB;

public class User {
    //encours de modification pour la gestion de la base de donnée
    private Long id;
    private String name;
    private String email;
    private Integer xp_Client;

    public User() {
    }

    public User(Long id, String name, String email, Integer xp_Client) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.xp_Client = xp_Client;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}