package com.AloBomnito.modelos;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
//import jakarta.persistence.JoinColumn;
//import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity (name = "imagenproducto")
@Table (name = "imagenproducto")
public class ImagenProducto {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_imagen", nullable = false, unique =true)
	private int id_imagen;
	
	@Column(name = "nombre_imagen", nullable = false, unique = true, length = 50)
	private String nombre_imagen;

	@Column(name = "url", unique = true, length = 500)
	private String url;

	// -------------- Relationships
	//relacion a tabla producto
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "id_producto")
	private Producto producto;


	public ImagenProducto() {
		super();
	}
	
	public ImagenProducto(int id_imagen, String nombre_imagen, String url, Producto producto) {
		super();
		this.id_imagen = id_imagen;
		this.nombre_imagen = nombre_imagen;
		this.url = url;
		this.producto = producto;
	}

	public int getId_imagen() {
		return id_imagen;
	}

	public void setId_imagen(int id_imagen) {
		this.id_imagen = id_imagen;
	}

	public String getNombre_imagen() {
		return nombre_imagen;
	}

	public void setNombre_imagen(String nombre_imagen) {
		this.nombre_imagen = nombre_imagen;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}



}