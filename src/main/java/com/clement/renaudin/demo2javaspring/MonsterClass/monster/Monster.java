package com.clement.renaudin.demo2javaspring.MonsterClass.monster;

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

}
