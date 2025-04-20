package br.com.minhas_calorias.controller;

import br.com.minhas_calorias.model.User;
import br.com.minhas_calorias.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping("/usuarios")
    @ResponseStatus(HttpStatus.CREATED)
    public User gravar(@RequestBody User user) {
        return userService.saveUser(user);
    }

    @GetMapping("/usuarios")
    @ResponseStatus(HttpStatus.OK)
    public List<User> findAllUsers() {
        return userService.findAllUsers();
    }

    @GetMapping("/usuarios/{userId}")
    @ResponseStatus(HttpStatus.OK)
    public User findUserById(@PathVariable Long userId) {
        return userService.findUserById(userId);
    }

    @DeleteMapping("/usuarios/{userId}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void deleteUser(@PathVariable Long userId) {
        userService.deleteUser(userId);
    }

    @PutMapping("/usuarios")
    @ResponseStatus(HttpStatus.OK)
    public User updateUser(@RequestBody User user) {
        return userService.updateUser(user);
    }

}
