package com.pruebaSB.GestionUsuarios.repository;

import com.pruebaSB.GestionUsuarios.modelo.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {

	List<Usuario> FindAllById(Long id);
}
