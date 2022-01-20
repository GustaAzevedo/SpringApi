package com.gusta.SpringApi.resources;

import com.gusta.SpringApi.entities.User;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/users")
public class UserResources {

    @GetMapping
    public ResponseEntity<User> findAll() {
        User u = new User(1L, "Marilia", "marilia@gmail.com", "99999999", "123456");
        return ResponseEntity.ok().body(u);
    }
}
