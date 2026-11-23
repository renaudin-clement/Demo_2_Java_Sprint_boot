package com.clement.renaudin.demo2javaspring.MonsterClass.Gestion_DB.gestionEnclots;

import org.springframework.web.bind.annotation.*;
import com.clement.renaudin.demo2javaspring.MonsterClass.Gestion_DB.gestionMonster.Monster;
import com.clement.renaudin.demo2javaspring.MonsterClass.Gestion_DB.gestionMonster.MonsterRepositorie;

import java.util.List;


@RestController
@RequestMapping("/enclots")
public class EnclotsController {

    private final EnclotsRepositorie enclotsRepository;
    private final MonsterRepositorie monsterRepositorie;

    public EnclotsController(EnclotsRepositorie EnclotsRepositorie, MonsterRepositorie MonsterRepositorie) {
        this.enclotsRepository = EnclotsRepositorie;
        this.monsterRepositorie = MonsterRepositorie;
    }

    @GetMapping
    public List<Enclots> getAll() {
        return enclotsRepository.findAll();
    }

    @GetMapping("/{id_enclots}")
    public Enclots getById(@PathVariable Long id_enclots) {
        return enclotsRepository.findById(id_enclots);
    }


    @GetMapping("/{id_enclots}/monsters")
    public List<Monster> getMonstersByEnclotId(@PathVariable Long id_enclots) {
        return monsterRepositorie.findByEnclotId(id_enclots);
    }

}
