package com.AloBomnito.modelos;

import java.util.ArrayList;
import java.util.List;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity (name = "cliente")
@Table (name = "cliente")
public class Cliente {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_cliente", unique = true, nullable = false )
	private int id_cliente;

	@Column(name = "nombre", nullable = false)
	private String nombre;

	@Column(name = "correo", nullable = false, unique = true)
	private String correo;

	@Column(name = "contrasenia", nullable = false, length = 150)
	private String contrasenia;

	//--------RelacionShip
	
	//Relacion a tabla compras ManytoMany
	@OneToMany(mappedBy = "id_cliente")
	private List<Compras> comprar = new ArrayList<>();
	
	public Cliente(){

	}

	public Cliente(int id_cliente, String nombre, String correo, String contrasenia, List<Compras> comprar) {
		super();
		this.id_cliente = id_cliente;
		this.nombre = nombre;
		this.correo = correo;
		this.contrasenia = contrasenia;
		this.comprar = comprar;
	}

	public int getId_cliente() {
		return id_cliente;
	}

	public void setId_cliente(int id_cliente) {
		this.id_cliente = id_cliente;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getCorreo() {
		return correo;
	}

	public void setCorreo(String correo) {
		this.correo = correo;
	}

	public String getContrasenia() {
		return contrasenia;
	}

	public void setContrasenia(String contrasenia) {
		this.contrasenia = contrasenia;
	}

}