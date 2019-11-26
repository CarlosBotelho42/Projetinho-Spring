package com.projetinho.projetinho.resources;

import com.projetinho.projetinho.entities.User;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController //para avisar que implemnta um controlador rest
@RequestMapping(value = "/users") //nome do recurso (localhost:8080/users)

public class UserResource {

    @GetMapping
    public ResponseEntity<User> findAll(){
         User u = new User(1,"Carlos", "Carlos.c@gmail.com","69696969","12345");
         return ResponseEntity.ok().body(u);

    }

}
