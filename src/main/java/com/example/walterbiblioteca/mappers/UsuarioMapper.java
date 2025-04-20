package com.example.walterbiblioteca.mappers;

import com.example.walterbiblioteca.dtos.UsuarioDto;
import com.example.walterbiblioteca.models.Usuario;

public class UsuarioMapper {

    public static UsuarioDto toDto(Usuario usuario) {
        return new UsuarioDto(
                usuario.getId(),
                usuario.getNome(),
                usuario.getEmail(),
                usuario.getSenha()
        );
    }

    public static Usuario toEntity(UsuarioDto dto) {
        Usuario usuario = new Usuario();

        if (dto.id() != null) {
            usuario.setId(dto.id());
        }

        usuario.setNome(dto.nome());
        usuario.setEmail(dto.email());
        usuario.setSenha(dto.senha());

        return usuario;
    }
}
