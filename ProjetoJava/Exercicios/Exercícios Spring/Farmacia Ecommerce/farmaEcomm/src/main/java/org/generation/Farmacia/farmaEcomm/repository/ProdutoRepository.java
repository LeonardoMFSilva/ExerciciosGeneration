package org.generation.Farmacia.farmaEcomm.repository;

import java.util.List;

import org.generation.Farmacia.farmaEcomm.model.Produto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProdutoRepository extends JpaRepository<Produto, Long> {
	
	public List<Produto> findAllByNomeContainingIgnoreCase (String nome);

}
