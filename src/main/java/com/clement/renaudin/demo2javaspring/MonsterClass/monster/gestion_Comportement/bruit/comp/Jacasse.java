package com.clement.renaudin.demo2javaspring.MonsterClass.monster.gestion_Comportement.bruit.comp;
import com.clement.renaudin.demo2javaspring.MonsterClass.monster.gestion_Comportement.bruit.ComportementDubruit;

public class Jacasse implements ComportementDubruit {
    public Jacasse() {
    }

    @Override
    public void faireBruit() {
        System.out.println("Je jacasse");
    }
    
}
