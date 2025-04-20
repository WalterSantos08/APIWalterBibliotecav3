package com.example.walterbiblioteca.dtos;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonProperty.Access;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

@JsonInclude(JsonInclude.Include.NON_NULL)
public record LivroDto(

        @JsonProperty(access = Access.READ_ONLY)
        @Schema(example = "0")
        Integer id,

        @NotBlank(message = "Título é obrigatório")
        @Schema(example = "titulo do livro")
        String titulo,

        @NotBlank(message = "Autor é obrigatório")
        @Schema(example = "nome do autor")
        String autor,

        @NotNull(message = "Ano de publicação é obrigatório")
        @Schema(example = "1899")
        Integer anoPublicacao,

        @NotBlank(message = "Gênero é obrigatório")
        @Schema(example = "genero")
        String genero,

        @Schema(example = "descricao ou sinopse")
        String descricao
) {}
