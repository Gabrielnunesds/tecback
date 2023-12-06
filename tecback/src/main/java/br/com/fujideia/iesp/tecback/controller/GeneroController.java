package br.com.fujideia.iesp.tecback.controller;

import br.com.fujideia.iesp.tecback.model.Genero;
import br.com.fujideia.iesp.tecback.service.GeneroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/Genero")
public class GeneroController {

    @Autowired
    private GeneroService service;

    @PostMapping
    public ResponseEntity<Genero> salvar(@RequestBody Genero genero){
        genero = service.salvar(genero);
        return ResponseEntity.ok(genero);
    }

    @GetMapping
    public ResponseEntity<List<Genero>> listar(){
        return ResponseEntity.ok(service.listar());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Genero> consultarPorId(@PathVariable int id){
        return ResponseEntity.ok(service.consultarPorId(id));
    }
}
