package com.AloBomnito.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.AloBomnito.modelos.Producto;
import com.AloBomnito.services.ProductosService;

@RestController
@CrossOrigin(origins="*")
@RequestMapping(path = "api/v1/Productos")
public class ProductoController {

	@Autowired
	private final ProductosService productosService = new ProductosService();

	@GetMapping
	public List<Producto> getAll(){
		return productosService.getProductos();
	}

	@PostMapping
	public Producto saveOrUpdate(@RequestBody Producto producto) {
		return productosService.saveOrUpdate(producto);
	}

	@DeleteMapping("/{id_producto}")
	public void saveUpdate(@PathVariable Integer id_producto) {
		productosService.delete(id_producto);
	}

	@GetMapping("/{id_producto}")
	public Optional<Producto> getById(@PathVariable("id_producto") Integer id_producto){
		return productosService.getProducto(id_producto);
	}
}
