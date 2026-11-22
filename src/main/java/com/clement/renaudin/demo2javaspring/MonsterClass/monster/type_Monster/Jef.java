package com.clement.renaudin.demo2javaspring.MonsterClass.monster.type_Monster;
import com.clement.renaudin.demo2javaspring.MonsterClass.Gestion_DB.gestionMonster.Monster;


import com.clement.renaudin.demo2javaspring.MonsterClass.monster.gestion_Comportement.GroupementStrat;
import com.clement.renaudin.demo2javaspring.MonsterClass.monster.gestion_Comportement.bruit.comp.Jacasse;
import com.clement.renaudin.demo2javaspring.MonsterClass.monster.gestion_Comportement.bruit.comp.Silencieux;
import com.clement.renaudin.demo2javaspring.MonsterClass.monster.gestion_Comportement.marcher.comp.PeutMarcher;
import com.clement.renaudin.demo2javaspring.MonsterClass.monster.gestion_Comportement.volant.comp.NePeuxVoler;
import com.clement.renaudin.demo2javaspring.MonsterClass.monster.gestion_Comportement.volant.comp.PeutEssayerDeVoler;


public class Jef extends Monster {
    private  long id;
    private String name;
    private String etat;
    private int id_enclots;
    private int compteur_clique;
    private int xp;

    public Jef(int id) {
        super(new GroupementStrat(new Silencieux(), new PeutMarcher(), new PeutEssayerDeVoler()), "Jef", "V1", id,0, 0, 0);
        this.id = id;
    }

    public Jef( long id,String name, String etat,int id_enclots, int compteur_clique, int xp) {
        super(new GroupementStrat(new Silencieux(), new PeutMarcher(), new PeutEssayerDeVoler()), name, etat, id,id_enclots, compteur_clique, xp);
        this.id = id;
    }
    
}
