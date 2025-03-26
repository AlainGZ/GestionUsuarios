package com.pruebaSB.GestionUsuarios.service;

import com.pruebaSB.GestionUsuarios.modelo.Usuario;
import com.pruebaSB.GestionUsuarios.repository.UsuarioRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UsuarioService {
	private final UsuarioRepository usuarioRepository;

	public UsuarioService(UsuarioRepository usuarioRepository){
		this.usuarioRepository = usuarioRepository;
	}

	public List<Usuario> obtenerTodo(){
		return usuarioRepository.findAll();
	}

	public Optional<Usuario> obtenerPorId(Long id){
		return usuarioRepository.findById(id);
	}

	public Usuario crearUsuario(Usuario usuario){
		return usuarioRepository.save(usuario);
	}

	public Usuario actualizarUsuario(Long id, Usuario usuarioActualizado){
		return usuarioRepository.findById(id).map(usuario -> {
			usuario.setNombre(usuarioActualizado.getNombre());
			usuario.setEmail(usuarioActualizado.getEmail());
			return usuarioRepository.save(usuario);
		}).orElseThrow(() -> new RuntimeException("Error al actualizar el usuario"+id));
	}

	public void eliminarUsuario(Long id){
		usuarioRepository.deleteById(id);
	}
}
