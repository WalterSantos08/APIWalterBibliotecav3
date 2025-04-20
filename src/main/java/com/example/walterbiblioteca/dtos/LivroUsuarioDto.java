package com.example.walterbiblioteca.dtos;

import com.example.walterbiblioteca.enums.StatusDeLeitura;
import io.swagger.v3.oas.annotations.media.Schema;

import java.time.LocalDate;

public record LivroUsuarioDto(

        @Schema(example = "0")
        Integer id,

        @Schema(example = "Seu Nome")
        String nomeUsuario,

        @Schema(example = "Nome Livro")
        String tituloLivro,

        @Schema(example = "LENDO,LIDO,QUERO_LER")
        StatusDeLeitura statusLeitura,

        @Schema(example = "2025-04-19")
        LocalDate dataInicio,

        @Schema(example = "2025-04-25")
        LocalDate dataFim,

        @Schema(example = "0")
        Integer nota,

        @Schema(example = "Comentário sobre o livro")
        String comentarios
) {}
