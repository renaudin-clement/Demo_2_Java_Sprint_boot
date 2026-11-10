package com.clement.renaudin.demo2javaspring.MonsterClass.monster.type_Monster;

import com.clement.renaudin.demo2javaspring.MonsterClass.monster.Monster;
import com.clement.renaudin.demo2javaspring.MonsterClass.monster.gestion_Comportement.bruit.ComportementDubruit;
import com.clement.renaudin.demo2javaspring.MonsterClass.monster.gestion_Comportement.marcher.ComportementMarcher;
import com.clement.renaudin.demo2javaspring.MonsterClass.monster.gestion_Comportement.volant.ComportementVolant;

public class Crocro extends Monster {
    public Crocro(ComportementDubruit compDubruit, ComportementMarcher compMarcher, ComportementVolant compVolant) {
        super(compDubruit, compMarcher, compVolant);
    }
    
}
