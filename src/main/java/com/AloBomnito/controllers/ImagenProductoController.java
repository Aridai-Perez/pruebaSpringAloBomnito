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

import com.AloBomnito.modelos.ImagenProducto;
import com.AloBomnito.services.ImagenesProductosServices;

@RestController
@CrossOrigin(origins="*")
@RequestMapping(path = "api/v1/Imagenes")
public class ImagenProductoController {

	@Autowired
	private final ImagenesProductosServices imagenesProductosServices = new ImagenesProductosServices();

	@GetMapping
	public List<ImagenProducto> getAll(){
		return imagenesProductosServices.getImgs();
	}

	@PostMapping
	public ImagenProducto saveOrUpdate(@RequestBody ImagenProducto imagenproducto) {
		return imagenesProductosServices.saveOrUpdate(imagenproducto);
	}

//	@DeleteMapping("/{id_imagen}")
//	public void saveUpdate(@PathVariable Integer id_imagen) {
//		imagenesProductosServices.delete(id_imagen);
//	}

	@GetMapping("/{id_imagen}")
	public Optional<ImagenProducto> getById(@PathVariable("id_imagen") Integer id_imagen){
		return imagenesProductosServices.getImg(id_imagen);
	}

}
