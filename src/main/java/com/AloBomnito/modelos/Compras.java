package com.AloBomnito.modelos;

import jakarta.persistence.*;

@Entity (name = "comprar")
@Table (name = "comprar")
public class Compras {
	
	@Id	
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_compra", unique = true, nullable = false)
	private int id_compra;
	
	@Column(nullable = false)
	private int cantidad_producto;
	
	//-------------Relaciones
	
	// Relacion a tabla cliente
	@ManyToOne
	@JoinColumn(name = "id_cliente", nullable = false)
	private Cliente cliente;
	
	//relacion a tabla producto
	@ManyToOne
	@JoinColumn(name = "id_producto", nullable = false)
	private Producto producto;

	
	public Compras() {
	}


	public Compras(int id_compra, int cantidad_producto, Cliente cliente, Producto producto) {
		super();
		this.id_compra = id_compra;
		this.cantidad_producto = cantidad_producto;
		this.cliente = cliente;
		this.producto = producto;
	}


	public int getId_compra() {
		return id_compra;
	}


	public void setId_compra(int id_compra) {
		this.id_compra = id_compra;
	}


	public int getCantidad_producto() {
		return cantidad_producto;
	}


	public void setCantidad_producto(int cantidad_producto) {
		this.cantidad_producto = cantidad_producto;
	}

}
