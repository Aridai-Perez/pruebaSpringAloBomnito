package com.AloBomnito.modelo.copy;
import lombok.Data;
import jakarta.persistence.*;

@Data
@Table (name = "administrador")
public class Administrador {
	@Id
	@Column(name = "idAdministrador", unique=true)
	private int idAdministrador;
	
	@Column(name ="nombre")
	private String nombre;
	
	@Column(name ="contrasenia")
	private String contrasenia;
	
	@Column(name ="correo",unique = true)
	private String correo;
	
	@Column(unique = true)
	private String numAdministrador;
	
}
