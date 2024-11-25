package com.example.demo.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.demo.Dao.IUsuarioDao;
import com.example.demo.entity.Usuario;

@Service
public class UsuarioServiceImplement implements IUsuarioServices {
 
	@Autowired
	private IUsuarioDao usuariodao;
	
	@Override
	@Transactional(readOnly = true)
	public List<Usuario> findAll() {
		return usuariodao.findAll();
	}

	@Override
	@Transactional(readOnly = true)
	public Usuario findById(Long Id) {
		return usuariodao.findById(Id).orElse(null);
	}

	@Override
	@Transactional
	public Usuario save(Usuario usuario) {
		return usuariodao.save(usuario);
	}

	@Override
	@Transactional
	public void delete(Long Id) {
		usuariodao.deleteById(Id);
		
	}

}
