package br.com.boot.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;

import br.com.boot.model.Livro;
import br.com.boot.repository.LivroRepository;

public class LivroService {
	
	@Autowired
	LivroRepository livroRepository;
	
	private static Map<Integer, Livro> livros = new HashMap<Integer, Livro>();
	private static Integer idIndex = 3;

	static {
		Livro a = new Livro(1, "teste", "teste", "teste", "teste", "teste");
		livros.put(1, a);
		Livro b = new Livro(2, "teste", "teste", "teste", "teste", "teste");
		livros.put(2, b);
		Livro c = new Livro(3, "teste", "teste", "teste", "teste", "teste");
		livros.put(3, c);
	}

	public List<Livro> list() {
		return new ArrayList<Livro>(livros.values());
	}

	public Livro create(Livro livro) {		
		return livroRepository.save(livro);
	}

	public Livro get(Livro livro) {
		return livroRepository.save(livro);
	}

	public Livro update(Integer id, Livro livro) {
		livros.put(id, livro);
		return livro;
	}

	public void delete(Integer id) {
		livroRepository.delete(id);
	}


}
