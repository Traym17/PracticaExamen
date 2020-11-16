package com.cenfotec.crudlaboratorio.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cenfotec.crudlaboratorio.domain.Antology;

public interface AntologyRepository extends JpaRepository<Antology, Long>{
	public List<Antology> findByNameContaining(String word);
}
