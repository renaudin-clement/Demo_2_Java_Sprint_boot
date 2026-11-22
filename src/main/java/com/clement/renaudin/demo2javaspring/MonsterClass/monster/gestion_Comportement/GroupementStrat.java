package com.clement.renaudin.demo2javaspring.MonsterClass.monster.gestion_Comportement;

import com.clement.renaudin.demo2javaspring.MonsterClass.monster.gestion_Comportement.bruit.ComportementDubruit;
import com.clement.renaudin.demo2javaspring.MonsterClass.monster.gestion_Comportement.bruit.comp.Silencieux;
import com.clement.renaudin.demo2javaspring.MonsterClass.monster.gestion_Comportement.marcher.ComportementMarcher;
import com.clement.renaudin.demo2javaspring.MonsterClass.monster.gestion_Comportement.marcher.comp.NePeuxMarcher;
import com.clement.renaudin.demo2javaspring.MonsterClass.monster.gestion_Comportement.volant.ComportementVolant;
import com.clement.renaudin.demo2javaspring.MonsterClass.monster.gestion_Comportement.volant.comp.NePeuxVoler;

public class GroupementStrat {
    private ComportementDubruit compDubruit;
    private ComportementMarcher compMarcher;
    private ComportementVolant  compVolant;

    public GroupementStrat(ComportementDubruit compDubruit, ComportementMarcher compMarcher, ComportementVolant compVolant) {
        this.compDubruit = compDubruit;
        this.compMarcher = compMarcher;
        this.compVolant = compVolant;
    }

    public GroupementStrat() {
        this.compDubruit = new Silencieux();
        this.compMarcher = new NePeuxMarcher();
        this.compVolant = new NePeuxVoler();
    }
}
