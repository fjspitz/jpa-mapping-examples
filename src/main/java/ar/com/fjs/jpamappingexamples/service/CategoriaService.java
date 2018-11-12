package ar.com.fjs.jpamappingexamples.service;

import java.util.List;

import org.springframework.stereotype.Service;

import ar.com.fjs.jpamappingexamples.model.Categoria;

@Service
public interface CategoriaService {
	List<Categoria> getCategorias();
}
