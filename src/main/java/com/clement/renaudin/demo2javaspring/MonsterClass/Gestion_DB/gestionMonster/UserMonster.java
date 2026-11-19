package com.clement.renaudin.demo2javaspring.MonsterClass.Gestion_DB.gestionUser;


import org.springframework.web.bind.annotation.*;

import com.clement.renaudin.demo2javaspring.MonsterClass.Gestion_DB.gestionUser.UserRepositorie;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserMonster {

    private final MonsterRepositorie monsterRepository;

    public UserMonster(MonsterRepositorie MonsterRepositorie) {
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