package com.example.demo.Service;

import java.util.List;

import com.example.demo.entity.Usuario;

public interface IUsuarioServices {
	public List<Usuario> findAll();
	public Usuario findById(Long Id);
	public Usuario save(Usuario usuario);
	public void delete(Long Id);
	
}
