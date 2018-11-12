package ar.com.fjs.jpamappingexamples.service.impl;

import java.io.Serializable;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ar.com.fjs.jpamappingexamples.model.Orden;
import ar.com.fjs.jpamappingexamples.repository.OrdenRepository;
import ar.com.fjs.jpamappingexamples.service.OrdenService;

@Service
public class OrdenServiceImpl implements OrdenService, Serializable {
	private static final long serialVersionUID = 1L;
	
	@Autowired
	private OrdenRepository repository;

	@Override
	public List<Orden> getOrdenes() {
		return repository.findAll();
	}

}
