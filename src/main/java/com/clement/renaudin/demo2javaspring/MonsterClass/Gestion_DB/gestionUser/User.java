package com.clement.renaudin.demo2javaspring.MonsterClass.Gestion_DB.gestionUser;

public class User {
    private Long id_user;
    private String name;
    private String emails;
    private Integer xp_Client;

    public User() {
    }

    public User(Long id_user, String name, String emails, Integer xp_Client) {
        this.id_user = id_user;
        this.name = name;
        this.emails = emails;
        this.xp_Client = xp_Client;
    }

    public Long getId_user() {
        return id_user;
    }

    public void setId_user(Long id_user) {
        this.id_user = id_user;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmails() {
        return emails;
    }

    public void setEmails(String emails) {
        this.emails = emails;
    }

    
    public int getxp_Client() {
        return xp_Client;
    }

    public void setxp_Client(int xp_Client) {
        this.xp_Client = xp_Client;
    }
}