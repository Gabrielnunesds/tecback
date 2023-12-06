package br.com.fujideia.iesp.tecback.controller;

import br.com.fujideia.iesp.tecback.model.Filme;
import br.com.fujideia.iesp.tecback.service.ConsultaFilmeService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/consultafilmes")
public class ConsultaFilmesController {

    private final ConsultaFilmeService consultaFilmeService;

    public ConsultaFilmesController(ConsultaFilmeService consultaFilmeService) {
        this.consultaFilmeService = consultaFilmeService;
    }

    @GetMapping("/{id}")
    public ResponseEntity<Filme> obterDetalhesFilmePorId(@PathVariable Long id) {
        Filme filme = consultaFilmeService.buscarDetalhesFilmePorId(id);
        if (filme != null) {
            return ResponseEntity.ok(filme);
        } else {
            return ResponseEntity.notFound().build();
        }
    }
}
