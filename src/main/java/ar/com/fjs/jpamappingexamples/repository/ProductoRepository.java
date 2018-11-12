package ar.com.fjs.jpamappingexamples.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import ar.com.fjs.jpamappingexamples.model.Producto;

public interface ProductoRepository extends JpaRepository<Producto, Integer> {

}
