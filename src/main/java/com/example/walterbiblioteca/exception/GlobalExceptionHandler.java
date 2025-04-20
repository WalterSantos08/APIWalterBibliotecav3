package com.example.walterbiblioteca.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

@RestControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(UsuarioJaExisteException.class)
    public ResponseEntity<Map<String, Object>> handleUsuarioDuplicado(UsuarioJaExisteException ex) {
        Map<String, Object> body = new HashMap<>();
        body.put("erro", ex.getMessage());
        body.put("status", HttpStatus.CONFLICT.value());
        return ResponseEntity.status(HttpStatus.CONFLICT).body(body);
    }

    @ExceptionHandler(LivroJaExisteException.class)
    public ResponseEntity<Map<String, Object>> handleLivroDuplicado(LivroJaExisteException ex) {
        Map<String, Object> body = new HashMap<>();
        body.put("erro", ex.getMessage());
        body.put("status", HttpStatus.CONFLICT.value());
        return ResponseEntity.status(HttpStatus.CONFLICT).body(body);
    }

    @ExceptionHandler(UsuarioNaoEncontradoException.class)
    public ResponseEntity<Map<String, Object>> handleUsuarioNaoEncontrado(UsuarioNaoEncontradoException ex) {
        Map<String, Object> body = new HashMap<>();
        body.put("erro", ex.getMessage());
        body.put("status", HttpStatus.NOT_FOUND.value());
        return ResponseEntity.status(HttpStatus.NOT_FOUND).body(body);
    }

    @ExceptionHandler(LivroNaoEncontradoException.class)
    public ResponseEntity<Map<String, Object>> handleLivroNaoEncontrado(LivroNaoEncontradoException ex) {
        Map<String, Object> body = new HashMap<>();
        body.put("erro", ex.getMessage());
        body.put("status", HttpStatus.NOT_FOUND.value());
        return ResponseEntity.status(HttpStatus.NOT_FOUND).body(body);
    }

    @ExceptionHandler(RuntimeException.class)
    public ResponseEntity<Map<String, Object>> handleRuntimeException(RuntimeException ex) {
        Map<String, Object> body = new HashMap<>();
        body.put("erro", ex.getMessage());
        body.put("status", HttpStatus.BAD_REQUEST.value());
        return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(body);
    }
}
