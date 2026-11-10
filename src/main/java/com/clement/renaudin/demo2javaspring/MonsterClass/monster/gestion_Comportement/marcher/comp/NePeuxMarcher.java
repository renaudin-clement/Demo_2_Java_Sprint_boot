package com.clement.renaudin.demo2javaspring.MonsterClass.monster.gestion_Comportement.marcher.comp;

import com.clement.renaudin.demo2javaspring.MonsterClass.monster.gestion_Comportement.marcher.ComportementMarcher;

public class NePeuxMarcher implements ComportementMarcher {

    public NePeuxMarcher() {
    
    }

    @Override
    public void marcher() {
        System.out.println("Je ne peux pas marcher");
    }
    
}
