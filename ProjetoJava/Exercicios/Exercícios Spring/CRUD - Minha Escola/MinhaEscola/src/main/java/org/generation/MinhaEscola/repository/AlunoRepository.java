package org.generation.MinhaEscola.repository;

import java.util.List;

import org.generation.MinhaEscola.model.Aluno;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AlunoRepository extends JpaRepository<Aluno, Long>{
	
	public List<Aluno> findAllByNomeContainingIgnoreCase (String nome);

}
