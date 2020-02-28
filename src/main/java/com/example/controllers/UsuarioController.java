package com.example.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.entity.Usuario;
import com.example.repository.RolRepository;
import com.example.repository.UsuarioRepository;

@Controller
public class UsuarioController {

	@Autowired
	UsuarioRepository usuarioRepository;
	@Autowired
	RolRepository rolRepository;
	@GetMapping
	public String index (Model modelo) {
		modelo.addAttribute("usuario",new Usuario());
		modelo.addAttribute("usuarios", usuarioRepository.findAll());
		modelo.addAttribute("roles",rolRepository.findAll());
		return "index";
	}
	
	@PostMapping
	public String crearUsuario(Model modelo, Usuario usuario) {
		usuarioRepository.save(usuario);
		
		modelo.addAttribute("usuario",new Usuario());
		modelo.addAttribute("usuarios", usuarioRepository.findAll());
		return "index";

	}
}
