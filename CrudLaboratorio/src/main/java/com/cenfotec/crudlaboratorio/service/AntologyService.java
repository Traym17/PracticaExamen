package com.cenfotec.crudlaboratorio.service;

import java.util.List;
import java.util.Optional;

import com.cenfotec.crudlaboratorio.domain.Antology;

public interface AntologyService {

	public void save(Antology antology);
	public Optional<Antology> get(Long id);
	public List<Antology> getAll();
	public List<Antology> find(String name);
	
}
