package com.clement.renaudin.demo2javaspring.MonsterClass.Gestion_DB.gestionMonster;


import org.springframework.web.bind.annotation.*;

import com.clement.renaudin.demo2javaspring.MonsterClass.Gestion_DB.gestionMonster.Monster;

import java.util.List;

@RestController
@RequestMapping("/users")
public class MonsterController {

    private final MonsterRepositorie monsterRepository;

    public MonsterController(MonsterRepositorie MonsterRepositorie) {
        this.monsterRepository = MonsterRepositorie;
    }

    @GetMapping
    public List<Monster> getAll() {
        return monsterRepository.findAll();
    }

    @GetMapping("/{id_Monster}")
    public Monster getById(@PathVariable Long id_Monster) {
        return monsterRepository.findById(id_Monster);
    }
}