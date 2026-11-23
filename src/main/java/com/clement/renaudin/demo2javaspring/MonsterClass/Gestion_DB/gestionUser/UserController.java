package com.clement.renaudin.demo2javaspring.MonsterClass.Gestion_DB.gestionUser;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {

    private final UserRepositorie userRepository;

    public UserController(UserRepositorie UserRepositorie) {
        this.userRepository = UserRepositorie;
    }

    @GetMapping
    public List<User> getAll() {
        return userRepository.findAll();
    }

    @GetMapping("/{id_user}")
    public User getById(@PathVariable Long id_user) {
        return userRepository.findById(id_user);
    }
}