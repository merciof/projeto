package br.ufrpe.boot.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.ufrpe.boot.model.Livro;

@Repository
public interface LivroRepository extends JpaRepository<Livro, Integer>{
	
}