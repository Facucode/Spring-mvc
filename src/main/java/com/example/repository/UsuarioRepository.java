package com.example.repository;

import org.springframework.data.repository.CrudRepository;

import com.example.entity.Usuario;

public interface UsuarioRepository extends CrudRepository<Usuario, Long>{

}
