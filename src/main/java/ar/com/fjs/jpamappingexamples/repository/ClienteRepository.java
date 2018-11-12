package ar.com.fjs.jpamappingexamples.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import ar.com.fjs.jpamappingexamples.model.Cliente;
import ar.com.fjs.jpamappingexamples.model.TipoCliente;

public interface ClienteRepository extends JpaRepository<Cliente, Integer> {

	List<Cliente> findAllByTipoCliente(TipoCliente tipoCliente);

}
