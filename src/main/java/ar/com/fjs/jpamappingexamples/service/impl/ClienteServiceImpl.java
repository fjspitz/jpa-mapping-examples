package ar.com.fjs.jpamappingexamples.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ar.com.fjs.jpamappingexamples.model.Cliente;
import ar.com.fjs.jpamappingexamples.model.TipoCliente;
import ar.com.fjs.jpamappingexamples.repository.ClienteRepository;
import ar.com.fjs.jpamappingexamples.service.ClienteService;

@Service
public class ClienteServiceImpl implements ClienteService {
	@Autowired
	private ClienteRepository repository; 
	
	@Override
	public List<Cliente> getClientes() {
		return repository.findAll();
	}

	public List<Cliente> getClientes(TipoCliente tipoCliente) {
		return repository.findAllByTipoCliente(tipoCliente);
	}

}
