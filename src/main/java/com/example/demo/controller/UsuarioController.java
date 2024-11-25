package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Service.IUsuarioServices;
import com.example.demo.entity.Usuario;

@RestController
@RequestMapping ("/api")
public class UsuarioController {
	
	@Autowired
	private IUsuarioServices usuarioservices;
	
	//Traer usuarios
	@GetMapping("/usuario")
	public List<Usuario> index(){
		return usuarioservices.findAll();
	}
	@GetMapping("/usuario/{id}")
	public Usuario show(@PathVariable Long id) {
		return usuarioservices.findById(id);
	}
	//Crear usuarios
	@PostMapping("/usuario")
	public Usuario create(@RequestBody Usuario usuario) {
		return usuarioservices.save(usuario);
	}
	//Eliminar usuario
	@DeleteMapping("/usuario/{id}")
	public void Delete(@PathVariable Long id) {
		usuarioservices.delete(id);
	}
	//modificar
	@PutMapping("/usuario/{id}")
	public Usuario modificar(@PathVariable Long id, @RequestBody Usuario usuario) {
		Usuario userModificar = usuarioservices.findById(id);
		userModificar.setNombre(usuario.getNombre());
		userModificar.setContrasena(usuario.getContrasena());
		userModificar.setEmail(usuario.getEmail());
		userModificar.setEstado(usuario.getEstado());
		return usuarioservices.save(userModificar);
		
	}
	
	
	
}
