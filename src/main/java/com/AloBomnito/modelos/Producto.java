package com.AloBomnito.modelos;

import java.util.HashSet;
import java.util.Set;

import jakarta.persistence.*;

@Entity (name = "producto")
@Table (name = "producto")
public class Producto {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_producto", nullable = false)
	private int id_producto;
	
	@Column(name = "nombre", unique = true, nullable = false, length = 50)
	private String nombre;
	
	@Column(name = "marca", nullable = false, length = 30)
	private String marca;
	
	@Column(name = "contenido", nullable = false, length = 10)
	private String contenido;
	
	@Column(name = "descripcion", nullable = false, length = 1000)
	private String descripcion;
	
	@Column(name = "modo_uso", nullable = false, length = 500)
	private String modo_uso;
	
	@Column(name = "tipo_piel", nullable = false, length = 10)
	private String tipo_piel;
	
	@Column(name = "cantidad_existencia", nullable = false)
	private String cantidad_existencia;
	
	@Column(name = "precio", nullable = false)
	private double precio;
	
	// -------------- Relationships
	
	//relacion a imagenes
	@OneToMany(mappedBy = "producto")
	private Set<ImagenProducto> imagenesProductos = new HashSet<>();
	
	
	//relacion a ingredientes
	@ManyToMany(fetch = FetchType.EAGER, cascade = CascadeType.MERGE)
    @JoinTable(
            name = "componer", joinColumns = @JoinColumn(name = "id_producto", referencedColumnName = "id_producto"),
            inverseJoinColumns =  @JoinColumn(name = "id_ingrediente", referencedColumnName = "id_ingrediente")
    )
	private Set<Ingrediente> ingrediente = new HashSet<>();
	
	
	//relacion a administrador many to many
	@ManyToMany(mappedBy = "productos")
    private Set<Administrador> administrador;
	
	
	//relacion  a administrador many to one
	@ManyToOne
	@JoinColumn(name = "id_administrador", nullable = false)
	private Administrador administradores;
	
	
	//relacion a tabla compras
	@OneToMany(mappedBy = "producto")
	private Set<Compras> comprar = new HashSet<>();
	
	
	public Producto() {
		super();
	}

	public Producto(int id_producto, String nombre, String marca, String contenido, String descripcion, String modo_uso,
			String tipo_piel, String cantidad_existencia, double precio, Set<ImagenProducto> imagenesProductos,
			Set<Ingrediente> ingrediente, Set<Administrador> administrador, Administrador administradores,
			Set<Compras> comprar) {
		super();
		this.id_producto = id_producto;
		this.nombre = nombre;
		this.marca = marca;
		this.contenido = contenido;
		this.descripcion = descripcion;
		this.modo_uso = modo_uso;
		this.tipo_piel = tipo_piel;
		this.cantidad_existencia = cantidad_existencia;
		this.precio = precio;
		this.imagenesProductos = imagenesProductos;
		this.ingrediente = ingrediente;
		this.administrador = administrador;
		this.administradores = administradores;
		this.comprar = comprar;
	}

	public int getId_producto() {
		return id_producto;
	}

	public void setId_producto(int id_producto) {
		this.id_producto = id_producto;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getContenido() {
		return contenido;
	}

	public void setContenido(String contenido) {
		this.contenido = contenido;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public String getModo_uso() {
		return modo_uso;
	}

	public void setModo_uso(String modo_uso) {
		this.modo_uso = modo_uso;
	}

	public String getTipo_piel() {
		return tipo_piel;
	}

	public void setTipo_piel(String tipo_piel) {
		this.tipo_piel = tipo_piel;
	}

	public String getCantidad_existencia() {
		return cantidad_existencia;
	}

	public void setCantidad_existencia(String cantidad_existencia) {
		this.cantidad_existencia = cantidad_existencia;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public Set<ImagenProducto> getImagenesProductos() {
		return imagenesProductos;
	}

	public void setImagenesProductos(Set<ImagenProducto> imagenesProductos) {
		this.imagenesProductos = imagenesProductos;
	}

	public Set<Ingrediente> getIngrediente() {
		return ingrediente;
	}

	public void setIngrediente(Set<Ingrediente> ingrediente) {
		this.ingrediente = ingrediente;
	}

}
