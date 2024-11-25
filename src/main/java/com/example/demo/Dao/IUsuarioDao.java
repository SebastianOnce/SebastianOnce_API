package com.example.demo.Dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entity.Usuario;

public interface IUsuarioDao extends JpaRepository<Usuario, Long> {

}
