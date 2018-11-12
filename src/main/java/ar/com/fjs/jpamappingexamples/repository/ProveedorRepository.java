package ar.com.fjs.jpamappingexamples.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import ar.com.fjs.jpamappingexamples.model.Proveedor;

public interface ProveedorRepository extends JpaRepository<Proveedor, Integer> {

}
