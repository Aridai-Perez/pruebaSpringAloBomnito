package com.AloBomnito.modelos;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity (name = "imagenproducto")
@Table (name = "imagenproducto")
public class ImagenProducto {

	@Id
	@Column(name = "nombre_imagen", nullable = false, unique = true, length = 50)
	private String nombre_imagen;


	@Column(name = "url", unique = true, length = 500)
	private String url;

	// -------------- Relationships
	//relacion a tabla producto
	@ManyToOne
	@JoinColumn(name = "id_producto", nullable = false)
	private Producto producto;


	public ImagenProducto() {
		super();
	}

	public ImagenProducto(String nombre_imagen, String url, Producto producto) {
		super();
		this.nombre_imagen = nombre_imagen;
		this.url = url;
		this.producto = producto;
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
