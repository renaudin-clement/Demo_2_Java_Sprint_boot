package com.clement.renaudin.demo2javaspring.MonsterClass.Gestion_DB.gestionMonster;

import  com.clement.renaudin.demo2javaspring.MonsterClass.monster.gestion_State.State;
import com.clement.renaudin.demo2javaspring.MonsterClass.monster.gestion_Comportement.GroupementStrat;;


public abstract class Monster {

    private GroupementStrat groupementStrat;
    private State Niveau;
    private String name;
    private String etat;
    private int id_monsters;
    private int id_enclots;
    private int compteur_clique;
    private int xp;

    public Monster(State Niveau, GroupementStrat groupementStrat, String name, String etat, int id_monsters, int id_enclots, int compteur_clique, int xp) {
        this.Niveau = Niveau;
        this.groupementStrat = groupementStrat;
        this.name = name;
        this.etat = etat;
        this.id_monsters = id_monsters;
        this.id_enclots = id_enclots;
        this.compteur_clique = compteur_clique;
        this.xp = xp;
    }

    public GroupementStrat getGroupementStrat() {
        return groupementStrat;
    }

    public void setGroupementStrat(GroupementStrat groupementStrat) {
        this.groupementStrat = groupementStrat;
    }

    public State getNiveau() {
        return Niveau;
    }

    public void setNiveau(State niveau) {
        Niveau = niveau;
    }

    public String getNom() {
        return name;
    }

    public void setNom(String name) {
        this.name = name;
    }

    public int getId() {
        return id_monsters;
    }

    public void setId(int id_monsters) {
        this.id_monsters = id_monsters;
    }

    public int getClique() {
        return compteur_clique;
    }

    public void setClique(int compteur_clique) {
        this.compteur_clique = compteur_clique;
    }

    public int getXp() {
        return xp;
    }

    public void setXp(int xp) {
        this.xp = xp;
    }

    public String getEtat() {
        return etat;
    }

    public void setEtat(String etat) {
        this.etat = etat;
    }

    public int getId_enclots() {
        return id_enclots;
    }

    public void setId_enclots(int id_enclots) {
        this.id_enclots = id_enclots;
    }
}
