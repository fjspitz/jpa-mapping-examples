package ar.com.fjs.jpamappingexamples.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ar.com.fjs.jpamappingexamples.model.Categoria;
import ar.com.fjs.jpamappingexamples.repository.CategoriaRepository;
import ar.com.fjs.jpamappingexamples.service.CategoriaService;

@Service
public class CategoriaServiceImpl implements CategoriaService {
	@Autowired
	private CategoriaRepository repository;
	
	@Override
	public List<Categoria> getCategorias() {
		return repository.findAll();
	}

}
