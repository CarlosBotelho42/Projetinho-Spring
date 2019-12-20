package com.projetinho.projetinho.resources;

import com.projetinho.projetinho.entities.Category;
import com.projetinho.projetinho.services.CategoryServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController //para avisar que implemnta um controlador rest
@RequestMapping(value = "/Categories") //nome do recurso (localhost:8080/Categorys)

public class CategoryResource {

    @Autowired
    private CategoryServices services;

    @GetMapping
    public ResponseEntity<List<Category>>findAll(){
        List<Category> list = services.findAll();

         return ResponseEntity.ok().body(list);

    }

    @GetMapping(value = "/{id}")
    public ResponseEntity<Category> findById(@PathVariable Long id){
        Category obj = services.findById(id);
        return ResponseEntity.ok().body(obj);

    }

}
