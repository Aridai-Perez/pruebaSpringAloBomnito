package com.AloBomnito.modelos;

import java.util.HashSet;
import java.util.Set;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;


@Entity (name = "administrador")
@Table (name = "administrador")
public class Administrador {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_administrador", unique=true)
	private int id_administrador;

	@Column(name ="nombre", nullable = false, length = 40)
	private String nombre;

	@Column(name ="contrasenia", length = 45)
	private String contrasenia;

	@Column(name ="correo", unique = true, length = 45)
	private String correo;

	@Column(name = "num_administrador", unique = true, nullable = false, length = 10)
	private String num_administrador;


	//------Relaciones-----

	//relacion porductos many to many
	@ManyToMany(fetch = FetchType.EAGER, cascade = CascadeType.MERGE)
	@JoinTable(
			name = "modificar", joinColumns = @JoinColumn(name = "id_administrador", referencedColumnName = "id_administrador"),
			inverseJoinColumns =  @JoinColumn(name = "id_producto", referencedColumnName = "id_producto")
	)
	private Set<Producto> productos = new HashSet<>();

	//relacion producto one to many
	@OneToMany(mappedBy = "administradores")
	private Set<Producto> producto = new HashSet<>();

	//relacion con ingrediente
	@OneToMany(mappedBy = "administrador")
	private Set<Ingrediente> ingredientes = new HashSet<>();


	public Administrador(){

	}


	public Administrador(int id_administrador, String nombre, String contrasenia, String correo,
			String num_administrador, Set<Producto> productos, Set<Producto> producto, Set<Ingrediente> ingredientes) {
		super();
		this.id_administrador = id_administrador;
		this.nombre = nombre;
		this.contrasenia = contrasenia;
		this.correo = correo;
		this.num_administrador = num_administrador;
		this.productos = productos;
		this.producto = producto;
		this.ingredientes = ingredientes;
	}


	public int getId_administrador() {
		return id_administrador;
	}


	public void setId_administrador(int id_administrador) {
		this.id_administrador = id_administrador;
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


	public String getNum_administrador() {
		return num_administrador;
	}


	public void setNum_administrador(String num_administrador) {
		this.num_administrador = num_administrador;
	}

}