package com.clement.renaudin.demo2javaspring.MonsterClass.monster.type_Monster;
import com.clement.renaudin.demo2javaspring.MonsterClass.Gestion_DB.gestionMonster.Monster;


import com.clement.renaudin.demo2javaspring.MonsterClass.monster.gestion_Comportement.GroupementStrat;
import com.clement.renaudin.demo2javaspring.MonsterClass.monster.gestion_Comportement.bruit.comp.BruitRobotique;
import com.clement.renaudin.demo2javaspring.MonsterClass.monster.gestion_Comportement.marcher.comp.PeutMarcher;
import com.clement.renaudin.demo2javaspring.MonsterClass.monster.gestion_Comportement.volant.comp.PeutVoler;



public class Robot extends Monster {    
    private  long id_monsters;
    private String name;
    private String etat;
    private long id_enclots;
    private int compteur_clique;
    private int xp;

    public Robot(long id_monsters) {
        super(new GroupementStrat(new BruitRobotique(), new PeutMarcher(), new PeutVoler()), "robot", "V1", id_monsters,0, 0, 0);
        this.id_monsters = id_monsters;
    }

    public Robot( long id_monsters,String name, String etat,long id_enclots, int compteur_clique, int xp) {
        super(new GroupementStrat(new BruitRobotique(), new PeutMarcher(), new PeutVoler()), name, etat, id_monsters,id_enclots, compteur_clique, xp);
        this.id_monsters = id_monsters;
    }
}