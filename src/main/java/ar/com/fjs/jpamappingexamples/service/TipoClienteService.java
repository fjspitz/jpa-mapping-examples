package ar.com.fjs.jpamappingexamples.service;

import java.util.List;

import org.springframework.stereotype.Service;

import ar.com.fjs.jpamappingexamples.model.TipoCliente;

@Service
public interface TipoClienteService {
	List<TipoCliente> getTipoCliente();
	
	TipoCliente findTipoClienteById(int id);
}
