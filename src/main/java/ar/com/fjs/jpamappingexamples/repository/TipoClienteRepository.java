package ar.com.fjs.jpamappingexamples.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import ar.com.fjs.jpamappingexamples.model.TipoCliente;

public interface TipoClienteRepository extends JpaRepository<TipoCliente, Integer> {

}
