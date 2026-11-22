package com.clement.renaudin.demo2javaspring.MonsterClass.Gestion_DB.gestionEnclots;


public  class Enclots {
     private long id_enclots;
    private long id_user;
    private long xp_total;
    private String nameEnclot;

    public Enclots(long id_enclots, long id_user, long xp_total, String nameEnclot) {
        this.id_enclots = id_enclots;
        this.id_user = id_user;
        this.xp_total = xp_total;
        this.nameEnclot = nameEnclot;
    }
    
        public long getId_enclots() {
        return id_enclots;
    }
    public void setId_enclots(long id_enclots) {
        this.id_enclots = id_enclots;
    }
    public long getId_user() {
        return id_user;
    }
    public void setId_user(long id_user) {
        this.id_user = id_user;
    }
    public long getXp_total() {
        return xp_total;
    }
    public void setXp_total(long xp_total) {
        this.xp_total = xp_total;
    }
    public String getNameEnclot() {
        return nameEnclot;
    }
    public void setNameEnclot(String nameEnclot) {
        this.nameEnclot = nameEnclot;
    }
}
