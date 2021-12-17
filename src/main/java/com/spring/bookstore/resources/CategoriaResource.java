package com.spring.bookstore.resources;

import com.spring.bookstore.domain.Categoria;
import com.spring.bookstore.services.CategoriaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/categorias")
public class CategoriaResource {

    @Autowired
    private CategoriaService service;


    @GetMapping("/{id}")
    public ResponseEntity<Categoria> findById(@PathVariable Long id){
        Categoria obj = service.findById(id);
        return ResponseEntity.ok().body(obj);

    }
}