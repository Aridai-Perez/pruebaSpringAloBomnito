package com.AloBomnito.modelos;
//import lombok.Data;
import jakarta.persistence.*;

//@Data
@Entity (name = "administrador")
@Table (name = "administrador")
public class Administrador {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "idAdministrador", unique=true)
	private int idAdministrador;
	
	@Column(name ="nombre", nullable = false)
	private String nombre;
	
	@Column(name ="contrasenia", nullable = false)
	private String contrasenia;
	
	@Column(name ="correo", unique = true, nullable = false)
	private String correo;
	
	@Column(name = "numAdministrador", unique = true, nullable = false)
	private String numAdministrador;
	
	public Administrador(){
		
	}
	
	public Administrador(int idAdministrador, String nombre, String contrasenia, String correo, String numAdministrador) {
		super();
		this.idAdministrador = idAdministrador;
		this.nombre = nombre;
		this.contrasenia = contrasenia;
		this.correo = correo;
		this.numAdministrador = numAdministrador;
	}

	public int getIdAdministrador() {
		return idAdministrador;
	}

	public void setIdAdministrador(int idAdministrador) {
		this.idAdministrador = idAdministrador;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getContrasenia() {
		return contrasenia;
	}

	public void setContrasenia(String contrasenia) {
		this.contrasenia = contrasenia;
	}

	public String getCorreo() {
		return correo;
	}

	public void setCorreo(String correo) {
		this.correo = correo;
	}

	public String getNumAdministrador() {
		return numAdministrador;
	}

	public void setNumAdministrador(String numAdministrador) {
		this.numAdministrador = numAdministrador;
	}
	
	
}
