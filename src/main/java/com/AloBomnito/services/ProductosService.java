package com.AloBomnito.services;
import com.AloBomnito.modelos.Producto;
import com.AloBomnito.repository.ProductoRepository;

import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

@Service
public class ProductosService {
	
	@Autowired
	ProductoRepository prodRepository;
	
	public List<Producto> getProductos(){
		return prodRepository.findAll();
	}
	
	public Optional<Producto> getProducto(Integer id_producto){
		return prodRepository.findById(id_producto);
	}
	
	public Producto saveOrUpdate(Producto producto) {
		return prodRepository.save(producto);
	}
	
	public void delete(Integer id_producto) {
		prodRepository.deleteById(id_producto);
	}
}
