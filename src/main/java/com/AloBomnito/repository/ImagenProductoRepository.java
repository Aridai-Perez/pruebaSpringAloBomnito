package com.AloBomnito.repository;
import org.springframework.stereotype.Repository;

import com.AloBomnito.modelos.ImagenProducto;

import org.springframework.data.jpa.repository.JpaRepository;

@Repository
public interface ImagenProductoRepository extends JpaRepository<ImagenProducto, String>{

}
