package ar.com.fjs.jpamappingexamples.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ar.com.fjs.jpamappingexamples.model.Proveedor;
import ar.com.fjs.jpamappingexamples.repository.ProveedorRepository;
import ar.com.fjs.jpamappingexamples.service.ProveedorService;

@Service
public class ProveedorServiceImpl implements ProveedorService {
	@Autowired
	private ProveedorRepository repository;
	
	@Override
	public List<Proveedor> getProveedores() {
		return repository.findAll();
	}

}
