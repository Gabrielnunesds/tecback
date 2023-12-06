package br.com.fujideia.iesp.tecback.controller;

import br.com.fujideia.iesp.tecback.model.dto.SenhaDTO;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/senha")
@Validated
public class SenhaValidaController {

    @PostMapping("/validar")
    public ResponseEntity<String> validarSenha(@Valid @RequestBody SenhaDTO senhaDTO) {
        // Processamento da validação da senha

        return ResponseEntity.ok("Senha válida!");
    }
}
