package com.clement.renaudin.demo2javaspring.MonsterClass.monster;

import com.clement.renaudin.demo2javaspring.MonsterClass.monster.gestion_Comportement.bruit.ComportementDubruit;
import com.clement.renaudin.demo2javaspring.MonsterClass.monster.gestion_Comportement.marcher.ComportementMarcher;
import com.clement.renaudin.demo2javaspring.MonsterClass.monster.gestion_Comportement.volant.ComportementVolant;

public abstract class Monster {
    private ComportementDubruit compDubruit;
    private ComportementMarcher compMarcher;
    private ComportementVolant  compVolant;
    
    public Monster(ComportementDubruit compDubruit, ComportementMarcher compMarcher, ComportementVolant compVolant) {
        this.compDubruit = compDubruit;
        this.compMarcher = compMarcher;
        this.compVolant = compVolant;
    }

}
