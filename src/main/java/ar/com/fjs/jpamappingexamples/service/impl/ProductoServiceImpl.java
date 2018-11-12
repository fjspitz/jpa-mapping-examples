package ar.com.fjs.jpamappingexamples.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ar.com.fjs.jpamappingexamples.model.Producto;
import ar.com.fjs.jpamappingexamples.repository.ProductoRepository;
import ar.com.fjs.jpamappingexamples.service.ProductoService;

@Service
public class ProductoServiceImpl implements ProductoService {
	
	@Autowired
	private ProductoRepository repository;
	
	@Override
	public List<Producto> getProductos() {
		return repository.findAll();
	}

}
