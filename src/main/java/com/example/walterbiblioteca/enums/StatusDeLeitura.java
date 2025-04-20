package com.example.walterbiblioteca.enums;

import com.fasterxml.jackson.annotation.JsonCreator;

public enum StatusDeLeitura {
    QUERO_LER,
    LENDO,
    LIDO;

    @JsonCreator
    public static StatusDeLeitura fromString(String value) {
        if (value == null) return null;
        return StatusDeLeitura.valueOf(value.trim().toUpperCase());
    }
}
