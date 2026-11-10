package com.clement.renaudin.demo2javaspring.MonsterClass.monster.gestion_Comportement.bruit.comp;
import com.clement.renaudin.demo2javaspring.MonsterClass.monster.gestion_Comportement.bruit.ComportementDubruit;

public class Silencieux  implements ComportementDubruit {
    public Silencieux() {
    }

    @Override
    public void faireBruit() {
        System.out.println("Je suis silencieux");
    }
    
}
