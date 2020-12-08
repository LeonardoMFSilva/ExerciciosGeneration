package org.generation.MinhaEscola.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.generation.MinhaEscola.model.Turma;
import java.util.List;


public interface TurmaRepository extends JpaRepository
<Turma, Long> {
	
	public List<Turma> findAllByTurmaContainingIgnoreCase (String turma);

}