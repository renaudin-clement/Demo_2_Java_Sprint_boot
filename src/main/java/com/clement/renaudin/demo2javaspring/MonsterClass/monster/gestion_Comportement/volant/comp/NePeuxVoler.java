package com.clement.renaudin.demo2javaspring.MonsterClass.monster.gestion_Comportement.volant.comp;

import com.clement.renaudin.demo2javaspring.MonsterClass.monster.gestion_Comportement.volant.ComportementVolant;

public class NePeuxVoler implements ComportementVolant {

    public NePeuxVoler() {
        
    }

    @Override
    public void voler() {
        System.out.println("Je ne peux pas voler");
    }
    
}
