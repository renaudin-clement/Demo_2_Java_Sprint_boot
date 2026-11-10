package com.clement.renaudin.demo2javaspring.MonsterClass.monster.gestion_Comportement.bruit.comp;
import com.clement.renaudin.demo2javaspring.MonsterClass.monster.gestion_Comportement.bruit.ComportementDubruit;


public class BruitRobotique  implements ComportementDubruit {
    public BruitRobotique() {
    }

    @Override
    public void faireBruit() {
        System.out.println("Je fais un bruit robotique");
    }
    
}
