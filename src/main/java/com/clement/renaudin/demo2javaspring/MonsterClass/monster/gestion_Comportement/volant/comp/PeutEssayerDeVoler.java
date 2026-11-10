package com.clement.renaudin.demo2javaspring.MonsterClass.monster.gestion_Comportement.volant.comp;
import com.clement.renaudin.demo2javaspring.MonsterClass.monster.gestion_Comportement.volant.ComportementVolant;

public class PeutEssayerDeVoler  implements ComportementVolant {

    public PeutEssayerDeVoler() {
        
    }

    @Override
    public void voler() {
        System.out.println("Je peux essayer de voler");
    }
    
}
