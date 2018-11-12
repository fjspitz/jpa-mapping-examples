package ar.com.fjs.jpamappingexamples.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import ar.com.fjs.jpamappingexamples.model.Empleado;

public interface EmpleadoRepository extends JpaRepository<Empleado, Integer> {

}
