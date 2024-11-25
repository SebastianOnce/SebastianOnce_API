package com.example.demo.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Usuario {
	 
	@Id
	private Long id_usuario;
	private String nombre;
	private String email;
	private String contrasena;
	private Boolean estado;
	public Long getId_usuario() {
		return id_usuario;
	}
	public void setId_usuario(Long id_usuario) {
		this.id_usuario = id_usuario;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getContrasena() {
		return contrasena;
	}
	public void setContrasena(String contrasena) {
		this.contrasena = contrasena;
	}
	public Boolean getEstado() {
		return estado;
	}
	public void setEstado(Boolean estado) {
		this.estado = estado;
	}
	public Usuario(Long id_usuario, String nombre, String email, String contrasena, Boolean estado) {
		this.id_usuario = id_usuario;
		this.nombre = nombre;
		this.email = email;
		this.contrasena = contrasena;
		this.estado = estado;
	}
	public Usuario() {
	}
}
