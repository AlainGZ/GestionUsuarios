package com.pruebaSB.GestionUsuarios.repository;

import com.pruebaSB.GestionUsuarios.modelo.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {


	Optional<Usuario> findById(Long id);

	;
}
