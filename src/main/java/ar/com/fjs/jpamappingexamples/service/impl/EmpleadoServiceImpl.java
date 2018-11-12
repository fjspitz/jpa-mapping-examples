package ar.com.fjs.jpamappingexamples.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ar.com.fjs.jpamappingexamples.model.Empleado;
import ar.com.fjs.jpamappingexamples.repository.EmpleadoRepository;
import ar.com.fjs.jpamappingexamples.service.EmpleadoService;

@Service
public class EmpleadoServiceImpl implements EmpleadoService {
	
	@Autowired
	private EmpleadoRepository repository;
	
	@Override
	public List<Empleado> getEmpleados() {
		return repository.findAll();
	}

}
