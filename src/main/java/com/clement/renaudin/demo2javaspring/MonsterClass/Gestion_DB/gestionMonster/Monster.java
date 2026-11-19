package com.clement.renaudin.demo2javaspring.MonsterClass.Gestion_DB.gestionMonster;

import  com.clement.renaudin.demo2javaspring.MonsterClass.monster.gestion_State.State;
import com.clement.renaudin.demo2javaspring.MonsterClass.monster.gestion_Comportement.GroupementStrat;;


public abstract class Monster {

    private GroupementStrat groupementStrat;
    private State Niveau;
    
    private String nom;
    private int id;
    private int clique;
    private int xp;

    public Monster(State Niveau, GroupementStrat groupementStrat, String nom, int id, int clique, int xp) {

        this.Niveau = Niveau;
        this.groupementStrat = groupementStrat;
        this.nom = nom;
        this.id = id;
        this.clique = clique;
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
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getClique() {
        return clique;
    }

    public void setClique(int clique) {
        this.clique = clique;
    }

    public int getXp() {
        return xp;
    }

    public void setXp(int xp) {
        this.xp = xp;
    }

}
