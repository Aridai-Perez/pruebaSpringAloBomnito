package com.AloBomnito.modelos;

import java.util.Set;

//import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
//import jakarta.persistence.JoinColumn;
//import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToMany;
//import jakarta.persistence.ManyToOne;
//import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity (name = "ingrediente")
@Table (name = "ingrediente")
public class Ingrediente {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(nullable = false)
	private Integer id_ingrediente;

	@Column(nullable = false)
	private String nombre;

	@Column(nullable = false)
	private String funcion;


	//Relaciones

	//relacion a tabla componer
	@ManyToMany(mappedBy = "ingrediente")
	private Set<Producto> productos;

	//relacion con administrador
//	@ManyToOne(cascade = CascadeType.ALL)
//	@JoinColumn(name = "id_admin")
//	private Administrador admin_creador;

	public Ingrediente() {
	}

	public Ingrediente(Integer id_ingrediente, String nombre, String funcion, Set<Producto> productos,
			Administrador admin_creador) {
		super();
		this.id_ingrediente = id_ingrediente;
		this.nombre = nombre;
		this.funcion = funcion;
		this.productos = productos;
//		this.admin_creador = admin_creador;
	}

	public Integer getId_ingrediente() {
		return id_ingrediente;
	}

	public void setId_ingrediente(Integer id_ingrediente) {
		this.id_ingrediente = id_ingrediente;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getFuncion() {
		return funcion;
	}

	public void setFuncion(String funcion) {
		this.funcion = funcion;
	}

//	public Administrador getAdmin_creador() {
//		return admin_creador;
//	}
//
//	public void setAdmin_creador(Administrador admin_creador) {
//		this.admin_creador = admin_creador;
//	}

}