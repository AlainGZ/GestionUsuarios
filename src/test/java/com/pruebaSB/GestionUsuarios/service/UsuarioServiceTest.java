package com.pruebaSB.GestionUsuarios.service;

import com.pruebaSB.GestionUsuarios.modelo.Usuario;
import com.pruebaSB.GestionUsuarios.repository.UsuarioRepository;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;


import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
public class UsuarioServiceTest {

	@Mock  //esto es para simular el repositorio sin que se acceda a la base de datos
	private UsuarioRepository usuarioRepository;

	@InjectMocks
	private UsuarioService usuarioService;

	@Test
	void obtenerTodos(){
		when(usuarioRepository.findAll()).thenReturn(Arrays.asList(
				new Usuario(1L,"juan","juan@gmail.com"),
				new Usuario(2L,"ana","ana@gmail.com")
		));

		List<Usuario> usuarios = usuarioService.obtenerTodo();

		assertEquals(2,usuarios.size());

		verify(usuarioRepository, times(1)).findAll();
	}

}
