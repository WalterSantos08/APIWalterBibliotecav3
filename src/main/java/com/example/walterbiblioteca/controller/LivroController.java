package com.example.walterbiblioteca.controller;

import com.example.walterbiblioteca.dtos.LivroDto;
import com.example.walterbiblioteca.service.LivroService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/livros")
@RequiredArgsConstructor
public class LivroController {

    private final LivroService livroService;

    @GetMapping
    public ResponseEntity<List<LivroDto>> listarTodos() {
        return ResponseEntity.ok(livroService.listarTodos());
    }

    @GetMapping("/{id}")
    public ResponseEntity<LivroDto> buscarPorId(@PathVariable Integer id) {
        return ResponseEntity.ok(livroService.buscarPorId(id));
    }

    @PostMapping
    public ResponseEntity<LivroDto> salvar(@Valid @RequestBody LivroDto dto) {
        return ResponseEntity.ok(livroService.salvar(dto));
    }

    @PutMapping("/{id}")
    public ResponseEntity<LivroDto> atualizar(@PathVariable Integer id, @Valid @RequestBody LivroDto dto) {
        return ResponseEntity.ok(livroService.atualizar(id, dto));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deletar(@PathVariable Integer id) {
        livroService.deletar(id);
        return ResponseEntity.noContent().build();
    }
}
