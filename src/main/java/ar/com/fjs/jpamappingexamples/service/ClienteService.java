package ar.com.fjs.jpamappingexamples.service;

import java.util.List;

import org.springframework.stereotype.Service;

import ar.com.fjs.jpamappingexamples.model.Cliente;
import ar.com.fjs.jpamappingexamples.model.TipoCliente;

@Service
public interface ClienteService {
	
	List<Cliente> getClientes();
	
	List<Cliente> getClientes(TipoCliente tipoCliente);
}
