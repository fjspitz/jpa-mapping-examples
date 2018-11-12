package ar.com.fjs.jpamappingexamples.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import ar.com.fjs.jpamappingexamples.model.Categoria;

public interface CategoriaRepository extends JpaRepository<Categoria, Integer> {

}
