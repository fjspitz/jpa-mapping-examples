package ar.com.fjs.jpamappingexamples.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import ar.com.fjs.jpamappingexamples.model.Orden;

public interface OrdenRepository extends JpaRepository<Orden, Integer> {

}
