package com.AloBomnito.modelos;

import jakarta.persistence.CascadeType;

//import com.fasterxml.jackson.annotation.JsonIgnore;

//import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
//import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
//import jakarta.persistence.JoinColumn;
//import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity (name = "comprar")
@Table (name = "comprar")
public class Compras {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_compra", nullable = false)
	private int id_compra;

	@Column(nullable = false)
	private int cantidad_producto;

	//-------------Relaciones

	// Relacion a tabla cliente
	@ManyToOne (cascade = CascadeType.ALL)
	@JoinColumn(name = "id_cliente", referencedColumnName = "id_cliente")
	private Cliente id_cliente;

	//relacion a tabla producto
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "id_producto")
	private Producto producto;

	public Compras() {
		
	}

	public Compras(int id_compra, int cantidad_producto, Cliente id_cliente, Producto producto) {
		super();
		this.id_compra = id_compra;
		this.cantidad_producto = cantidad_producto;
		this.id_cliente = id_cliente;
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

	public Cliente getCliente() {
		return id_cliente;
	}

	public void setCliente(Cliente cliente) {
		this.id_cliente = cliente;
	}

}