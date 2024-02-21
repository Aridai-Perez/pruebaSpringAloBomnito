package com.AloBomnito.modelo.copy;
import lombok.Data;
import jakarta.persistence.*;

@Data
@Entity (name = "administrador")
@Table (name = "administrador")
public class Administrador {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_administrador", unique=true)
	private Long id_administrador;
	
	@Column(name ="nombre")
	private String nombre;
	
	@Column(name ="contrasenia")
	private String contrasenia;
	
	@Column(name ="correo",unique = true)
	private String correo;
	
	@Column(unique = true)
	private String num_administrador;
	
}
