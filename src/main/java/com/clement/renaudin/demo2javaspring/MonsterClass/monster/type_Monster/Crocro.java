package com.clement.renaudin.demo2javaspring.MonsterClass.monster.type_Monster;
import com.clement.renaudin.demo2javaspring.MonsterClass.monster.Monster;
import com.clement.renaudin.demo2javaspring.MonsterClass.monster.gestion_Comportement.GroupementStrat;
import  com.clement.renaudin.demo2javaspring.MonsterClass.monster.gestion_State.State;


import com.clement.renaudin.demo2javaspring.MonsterClass.monster.gestion_Comportement.bruit.comp.Jacasse;
import com.clement.renaudin.demo2javaspring.MonsterClass.monster.gestion_Comportement.marcher.comp.PeutMarcher;
import com.clement.renaudin.demo2javaspring.MonsterClass.monster.gestion_Comportement.volant.comp.NePeuxVoler;

public class Crocro extends Monster {
    private State Niveau;
    private  int id;

    public Crocro(State Niveau,int id) {
        super(Niveau, new GroupementStrat(new Jacasse(), new PeutMarcher(), new NePeuxVoler()), "Crocro", id, 0, 0);
        this.Niveau = Niveau;
        this.id = id;
    }
    
}
