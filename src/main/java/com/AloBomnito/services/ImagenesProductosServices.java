package com.AloBomnito.services;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.AloBomnito.modelos.ImagenProducto;
import com.AloBomnito.repository.ImagenProductoRepository;

@Service
public class ImagenesProductosServices {

	@Autowired
	ImagenProductoRepository imgProdRepository;

	public List<ImagenProducto> getImgs(){
		return imgProdRepository.findAll();
	}

	public Optional<ImagenProducto> getImg(Integer id_imagen){
		return imgProdRepository.findById(id_imagen);
	}

	public ImagenProducto saveOrUpdate(ImagenProducto imagenproducto) {
		return imgProdRepository.save(imagenproducto);
	}

//	public void delete(Integer id_producto) {
//		imgProdRepository.deleteById(id_producto);
//	}

}
