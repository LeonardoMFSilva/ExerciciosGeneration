package org.generation.Farmacia.farmaEcomm.repository;

import java.util.List;

import org.generation.Farmacia.farmaEcomm.model.Categoria;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoriaRepository extends JpaRepository<Categoria, Long>{
	public List<Categoria> findAllByDescricaoContainingIgnoreCase (String descricao);
}
