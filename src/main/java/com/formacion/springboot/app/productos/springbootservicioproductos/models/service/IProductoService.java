package com.formacion.springboot.app.productos.springbootservicioproductos.models.service;

import com.formacion.springboot.app.productos.springbootservicioproductos.models.entity.Producto;

import java.util.List;

public interface IProductoService {

    public List<Producto> findAll();
    public Producto findById(Long id);
}
