package com.floricultura.demo.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.floricultura.demo.model.Adubo;
import com.floricultura.demo.repository.AduboRepository;

@RestController
@RequestMapping("/adubo")
public class AduboController{

    @Autowired
    public AduboRepository repository;

    @GetMapping("/todos")
    public List<Adubo> getTodosAdubos(){
        return repository.findAll();
    }

    @GetMapping("/{id}")
    public Adubo getAduboPeloId(@PathVariable Long id){
        Optional<Adubo> opcao = repository.findById(id);
        return opcao.isPresent() ? opcao.get() : null;
    }

    @DeleteMapping
    public void deletarAdubo(@PathVariable Long id){
        repository.deleteById(id);
    }

    @PostMapping
    public Adubo criarAdubo(@RequestBody Adubo adubo) {
        return repository.save(adubo);
    }

    @PutMapping
    public Adubo atualizarAdubo(@RequestBody Adubo adubo) {
        return repository.save(adubo);
    }
}