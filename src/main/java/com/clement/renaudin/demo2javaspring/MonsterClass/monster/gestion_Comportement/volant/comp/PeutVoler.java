package com.clement.renaudin.demo2javaspring.MonsterClass.monster.gestion_Comportement.volant.comp;
import com.clement.renaudin.demo2javaspring.MonsterClass.monster.gestion_Comportement.volant.ComportementVolant;

public class PeutVoler implements ComportementVolant {

    public PeutVoler() {
        
    }

    @Override
    public void voler() {
        System.out.println("Je peux voler");
    }
    
}
