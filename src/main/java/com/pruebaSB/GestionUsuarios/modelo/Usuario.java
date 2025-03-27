package com.pruebaSB.GestionUsuarios.modelo;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name="usuarios")
@Data

@NoArgsConstructor
@ToString
@Getter
@Setter
public class Usuario {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	private String nombre;

	private String email;

	public Usuario(Long id, String nombre, String email) {
		this.id = id;
		this.nombre = nombre;
		this.email = email;
	}


	public String getNombre() {
		return nombre;
	}

	// Setter
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getEmail() {
		return email;
	}

	// Setter
	public void setEmail(String nombre) {
		this.email = email;
	}

}
