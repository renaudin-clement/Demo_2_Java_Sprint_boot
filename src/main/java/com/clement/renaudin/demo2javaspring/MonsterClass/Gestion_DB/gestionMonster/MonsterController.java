package com.clement.renaudin.demo2javaspring.MonsterClass.Gestion_DB.gestionMonster;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/monsters")
public class MonsterController {

    private final MonsterRepositorie monsterRepository;

    public MonsterController(MonsterRepositorie MonsterRepositorie) {
        this.monsterRepository = MonsterRepositorie;
    }

    @GetMapping
    public List<Monster> getAll() {
        return monsterRepository.findAll();
    }

    @GetMapping("/{id_monsters}")
    public Monster getById(@PathVariable Long id_monsters) {
        return monsterRepository.findById(id_monsters);
    }
}