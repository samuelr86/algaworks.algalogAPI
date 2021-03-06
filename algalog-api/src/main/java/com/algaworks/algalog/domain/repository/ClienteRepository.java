package com.algaworks.algalog.domain.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.algaworks.algalog.domain.model.Cliente;


@Repository
public interface ClienteRepository extends JpaRepository<Cliente, Long>{

	//implementação do Jpa
	List<Cliente> findByNome(String nome); // busca exata por nome
	List<Cliente> findByNomeContaining(String nome); // busca por parte do nome
	
	
}
