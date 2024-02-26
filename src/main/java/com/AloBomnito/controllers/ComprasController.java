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

import com.AloBomnito.services.ComprasService;
import com.AloBomnito.modelos.Compras;

@RestController
@CrossOrigin(origins="*")
@RequestMapping(path = "api/v1/compras")

public class ComprasController {
	
	
	@Autowired
	private ComprasService comprasService;
	
	@GetMapping
	public List<Compras> getAll(){
		return comprasService.getCompras();
	}
	
	@GetMapping("/{id_compra}")
	public Optional<Compras> getbyId(@PathVariable("id_compra") Integer id_compra){
		return comprasService.getCompra(id_compra);
	}
	
	
	@PostMapping
	public Compras saveUpdate(@RequestBody Compras compras){
		return comprasService.saveOrUpdate(compras);
	}
	
	@DeleteMapping ("/{id_compra}")
	public void saveUpdate(@PathVariable("id_compra") Integer id_compra){
		comprasService.delete(id_compra);
	}

}
