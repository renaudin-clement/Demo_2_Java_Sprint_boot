package com.clement.renaudin.demo2javaspring.MonsterClass.monster.gestion_Comportement.marcher.comp;

import com.clement.renaudin.demo2javaspring.MonsterClass.monster.gestion_Comportement.marcher.ComportementMarcher;

public class PeutMarcher implements ComportementMarcher {

    public PeutMarcher() {
    
    }

    @Override
    public void marcher() {
        System.out.println("Je peux marcher");
    }
    
}
