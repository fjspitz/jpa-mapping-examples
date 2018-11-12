package ar.com.fjs.jpamappingexamples.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ar.com.fjs.jpamappingexamples.model.TipoCliente;
import ar.com.fjs.jpamappingexamples.repository.TipoClienteRepository;
import ar.com.fjs.jpamappingexamples.service.TipoClienteService;

@Service
public class TipoClienteServiceImpl implements TipoClienteService {
	@Autowired
	TipoClienteRepository repository;

	@Override
	public List<TipoCliente> getTipoCliente() {
		return repository.findAll();
	}

	@Override
	public TipoCliente findTipoClienteById(int id) {
		return repository.getOne(id);
	}
	
}
