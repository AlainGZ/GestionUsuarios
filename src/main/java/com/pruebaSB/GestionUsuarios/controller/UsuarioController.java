package com.pruebaSB.GestionUsuarios.controller;

import com.pruebaSB.GestionUsuarios.modelo.Usuario;
import com.pruebaSB.GestionUsuarios.service.UsuarioService;
import org.springframework.http.converter.json.GsonBuilderUtils;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;


@RestController
@RequestMapping("/usuarios")
public class UsuarioController {
	private final UsuarioService usuarioService;

	public UsuarioController(UsuarioService usuarioService){
		this.usuarioService = usuarioService;
	}

	@GetMapping
	public List<Usuario> obtenerTodos(){
		return usuarioService.obtenerTodo();
	}
	@GetMapping("{/id}")
	public Usuario buscarPorId(@PathVariable Long id){
		return usuarioService.obtenerPorId(id).orElseThrow(() -> new RuntimeException("Usuario No encontrado"));
	}
	@PostMapping
	public Usuario guardarUsuario(@RequestBody Usuario usuario){
		return usuarioService.crearUsuario(usuario);
	}
	@PutMapping("/id")
	public Usuario modificarUsuario(@PathVariable Long id, @RequestBody Usuario usuarioActualizado){
		return usuarioService.actualizarUsuario(id, usuarioActualizado);
	}

	@DeleteMapping("/{id}")
	public String eliminarUsuario(@PathVariable Long id){
		usuarioService.eliminarUsuario(id);
		return ("Usuario Eliminado");

	}
}
