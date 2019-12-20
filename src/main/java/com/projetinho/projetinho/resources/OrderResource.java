package com.projetinho.projetinho.resources;

import com.projetinho.projetinho.entities.Order;
import com.projetinho.projetinho.services.OrderServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController //para avisar que implemnta um controlador rest
@RequestMapping(value = "/Orders") //nome do recurso (localhost:8080/Orders)

public class OrderResource {

    @Autowired
    private OrderServices services;

    @GetMapping
    public ResponseEntity<List<Order>>findAll(){
        List<Order> list = services.findAll();

         return ResponseEntity.ok().body(list);

    }

    @GetMapping(value = "/{id}")
    public ResponseEntity<Order> findById(@PathVariable Long id){
        Order obj = services.findById(id);
        return ResponseEntity.ok().body(obj);

    }

}
