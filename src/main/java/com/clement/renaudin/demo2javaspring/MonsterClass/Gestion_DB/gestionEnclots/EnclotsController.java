package com.clement.renaudin.demo2javaspring.MonsterClass.Gestion_DB.gestionEnclots;

import org.springframework.web.bind.annotation.*;



import java.util.List;


@RestController
@RequestMapping("/enclots")
public class EnclotsController {

    private final EnclotsRepositorie enclotsRepository;

    public EnclotsController(EnclotsRepositorie EnclotsRepositorie) {
        this.enclotsRepository = EnclotsRepositorie;
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
    public Enclots getMonsterAssocier(@PathVariable Long id_enclots) {
        return enclotsRepository.findMonsterAssocier(id_enclots);
    }
    
}
